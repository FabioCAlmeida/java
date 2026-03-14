public class ExemploAluno {

    public static void main(String[] args) {
        //Criar um objeto do tipo aluno
        Aluno estudante = new Aluno();
        Aluno estudante2 = new Aluno();

        estudante.id = 123;
        estudante.matriculado = true;
        estudante.idade = 22;
        estudante.nomeCurso = "ADS";
        estudante.nome ="Astrogildo";
        estudante.turma = 'V';
        estudante.valorMensalidade = 300;
        //Exibir os valores dos atributos do objeto aluno

        
        System.out.println("O nome do aluno é: " + estudante.nome);
        System.out.println("O nome do curso: " + estudante.nomeCurso);
        System.out.println("A turma do aluno é: " + estudante.turma);
        System.out.println("O id do estudante é: " + estudante.id);
        System.out.println("Matriculado: " + estudante.matriculado);
        System.out.println("A idade do estudante é: " + estudante.idade);


        System.out.println("O valor da mensalidade é: " + estudante.valorMensalidade);

        //Criar um outro objeto aluno, atribuir valores para 2 propriedades e exibir os valores
        estudante2.nome = "Ricardilson";
        estudante2.id = 242;
        estudante2.nomeCurso = "Engenharia da computação";
        estudante2.turma = 'G';
        estudante2.matriculado = true;
        estudante2.valorMensalidade = 500;
        estudante2.idade = 19;


        System.out.println("");


        System.out.println("O nome do aluno é: " + estudante2.nome);
        System.out.println("O curso do aluno é: " + estudante2.nomeCurso);
        System.out.println("A turma do aluno é: " + estudante2.turma);
        System.out.println("O id do aluno é: " + estudante2.id);
        System.out.println("Matriculado: " + estudante2.matriculado);
        System.out.println("A idade do aluno é: " + estudante2.idade);
        System.out.println("O valor da mensalidade é: " + estudante2.valorMensalidade);



    }
}
