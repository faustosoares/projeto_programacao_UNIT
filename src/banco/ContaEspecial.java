package banco;

public class ContaEspecial extends Conta{

    private double limite;
    private double saldoDisponivel;

    public ContaEspecial(int numero, String titular, double saldo, double limite) {
        super(numero, titular, saldo);
        this.limite = limite;
        this.saldoDisponivel = this.saldo + limite;
    }

    @Override
    public boolean sacar(double valor) {
        if(valor > this.saldoDisponivel){
            System.out.println("Saldo indisponivel - classe ContaEspecial");
            return false;
        }
        this.saldoDisponivel -= valor;
        return true;
    }

    @Override
    public String toString() {
        return "ContaEspecial[" + super.toString() + ", limite = " +
                this.limite + ", saldo disponivel = " + this.saldoDisponivel + "]";
    }
}
