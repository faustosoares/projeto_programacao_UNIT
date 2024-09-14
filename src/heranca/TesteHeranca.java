package heranca;

public class TesteHeranca {

    public static void main(String[] args) {

        var gerente = new Gerente("Joao", "88837237", 10000.0, "DTI");
        var lucro = 100000;
        System.out.println(gerente);
        System.out.println("PL: " + gerente.calcularParticipacaoNosLucros(lucro));

    }
}
