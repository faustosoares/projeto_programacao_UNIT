package vetores;

import java.util.Objects;
import java.util.Scanner;

public class MeuAcademico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao, controle=0;
        Aluno[] turma = new Aluno[5];

        do{
            System.out.println("=============================\n" +
                    "MAGISTER - MENU\n" +
                    "-----------------------------\n" +
                    "1 - Cadastrar Aluno\n" +
                    "2 - Exibir Alunos\n" +
                    "4 - Sair\n" +
                    "=============================");
            System.out.print("Informe uma opcao: ");
            opcao = scanner.nextInt();

            switch(opcao){
                case 1:
                    cadastrarAluno(scanner, controle, turma);
                    break;
                case 2:
                    exibirTodosAlunos(turma);
                    break;

                case 4:
                    System.out.println("Saindo ...");
            }

        } while(opcao != 4);


    }

    private static void exibirTodosAlunos(Aluno[] turma) {
        System.out.println("----------------ALUNOS----------------\n");
        for(Aluno aluno : turma){

            System.out.println("\n\nALUNO\n");
            aluno.imprimir();
        }
    }

    private static void cadastrarAluno(Scanner scanner, int controle, Aluno[] turma) {
        System.out.println(controle);
        scanner.nextLine(); //limpando buffer por conta do inteiro lido anteriormente

        System.out.println("\n----------Cadastro de Aluno----------");

        System.out.println("Informe o nome");
        var nome = scanner.nextLine();
        System.out.println("Informe a matricula");
        var matricula = scanner.nextLine();
        System.out.println("Informe a nota 1");
        var n1 = scanner.nextFloat();
        System.out.println("Informe a nota 2");
        var n2 = scanner.nextFloat();

        Aluno novoAluno = new Aluno(nome, matricula, n1, n2);
        turma[controle] = novoAluno;

        controle++;
        System.out.println(controle);

    }
}
