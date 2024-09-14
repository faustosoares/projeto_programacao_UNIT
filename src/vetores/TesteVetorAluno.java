package vetores;

public class TesteVetorAluno {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Fausto Bernard", "202401001", 10, 5.9f);
        Aluno aluno2 = new Aluno("Jose Silva", "202401002", 9, 7.8f);

        Aluno[] turma = new Aluno[2];

        turma[0] = aluno1;
        turma[1] = aluno2;

        for(Aluno aluno : turma){
            System.out.println("\n-----------------Aluno-----------------");
            aluno.imprimir();
        }


    }
}
