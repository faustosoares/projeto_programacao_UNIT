package academico;

public class UsandoAluno {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("João da Silda", "2024001", 9.8f, 2.9f);
        a1.imprimir();

        Aluno a2 = new Aluno("Maria Santos", "2024002", 2.8f, 6.9f);
        a2.imprimir();

        System.out.println("A maior média pertence ao aluno");
        imprimirMaiorMedia(a1,a2);

    }

    private static void imprimirMaiorMedia(Aluno a1, Aluno a2) {
        if(a1.calcularMedia() > a2.calcularMedia())
            a1.imprimir();
        else
            a2.imprimir();
    }

}
