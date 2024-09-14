package heranca;

public class Gerente extends Funcionario{
    private final double PERCENTUAL_CALCULO_PL = 0.01;

    private String setorGerenciado;

    public Gerente(String nome, String cpf, double salario,
                   String setorGerenciado) {
       super(nome, cpf, salario);
       this.setorGerenciado = setorGerenciado;
    }

   @Override
    public double calcularParticipacaoNosLucros(double lucro) {
        return (lucro * PERCENTUAL_CALCULO_PL) + (0.005 * this.salario);
    }

    @Override
    public String toString() {
        return "Gerente[" + super.toString() +
                ", Setor = " + this.setorGerenciado + "]";
    }
}
