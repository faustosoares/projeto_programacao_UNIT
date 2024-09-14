package vetores;

import java.util.Scanner;

public class TesteVetores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i=0; i<5; i++){
            System.out.println("Informe um numero inteiro");
            numeros[i] = scanner.nextInt();
        }

        for (int i=0; i<5; i++){
            System.out.println(numeros[i]);
        }


        for(int n : numeros){
            System.out.println(n);
        }

    }
}
