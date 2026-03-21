package br.com.fiap.loja.view;

import br.com.fiap.loja.model.Categoria;
import br.com.fiap.loja.model.Produto;

import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // ler os dados do produto
        System.out.println("Digite o nome do produto:");
        String nome = entrada.nextLine();

        System.out.println("Digite o preço do produto:");
        double valor = entrada.nextDouble();

        System.out.println("Digite a quantidade do produto:");
        int quantidade = entrada.nextInt();

        System.out.println("O produto possui garantia? (true/false)");
        boolean garantia = entrada.nextBoolean();
        entrada.nextLine(); // limpar buffer

        // categoria
        System.out.println("Digite o nome da categoria:");
        String nomeCategoria = entrada.nextLine();

        System.out.println("Digite a descrição da categoria:");
        String descricaoCategoria = entrada.nextLine();

        // criar objeto produto
        Produto produto = new Produto();
        produto.nome = nome;
        produto.preco = valor;
        produto.quantidade = quantidade;
        produto.garantia = garantia;


        Categoria categoria = new Categoria();
        categoria.nome = nomeCategoria;
        categoria.descricao = descricaoCategoria;


        produto.categoria = categoria;

        // exibir dados
        System.out.println("\nProduto cadastrado:");
        System.out.println("Nome: " + produto.nome);
        System.out.println("Preço: " + produto.preco);
        System.out.println("Quantidade: " + produto.quantidade);
        System.out.println("Garantia: " + produto.garantia);
        System.out.println("Categoria: " + produto.categoria.nome);
        System.out.println("Descrição: " + produto.categoria.descricao);

        entrada.close();
    }
}