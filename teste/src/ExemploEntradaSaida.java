import java.util.Scanner;

public class ExemploEntradaSaida {

    //Ler notas do aluno e calcular a media FIAP
    public static void main(String[] args) {
        //Variavel utilizada para ler os dados do teclado
        Scanner leitor = new Scanner(System.in);
    
    
        //Declarar as variáveis nescessárias

        System.out.println("Digite o nome do aluno");
        String nome = leitor.next() + leitor.nextLine(); //Le mais palavras


        System.out.println("Digite a nota da CP1");
        double cp1 = leitor.nextDouble(); //Le um valor do tipo double do teclado

        System.out.println("Digite a nota da sua CP2");
        double cp2 = leitor.nextDouble();

        System.out.println("Digite a nota da sua GS");
        double gs = leitor.nextDouble();

        System.out.println("Digite a nota do seu primeiro challenge");
        double challenge1 = leitor.nextDouble();

        System.out.println("Digite a nota do seu segundo challenge");
        double challenge2 = leitor.nextDouble();

        //Calcular a media
        double mediaCp = (cp1 + cp2) / 2;
        double mediaChallenge = (challenge1 + challenge2) / 2;
        double mediaSemestre = mediaCp * 0.2 + mediaChallenge * 0.2 + gs * 0.6;

        System.out.println("Aluno: " + nome);
        System.out.println("A média do Semestre é: " + mediaSemestre);

    }
}
