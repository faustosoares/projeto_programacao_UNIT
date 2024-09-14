
import academico.Aluno;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        //Entrada
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe 3 numeros inteiros");

        int a;
        a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        float media = (float)(a+b+c)/3;


        Aluno a1 = new Aluno();


        System.out.println("Media: " + media);

    }
}
