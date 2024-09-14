package banco;

public class Conta {
    private int numero;
    private String titular;
    protected double saldo;

    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public boolean sacar(double valor){
      if(this.saldo - valor < 0) {
        System.out.println("Nao foi possivel realizar o saque. Saldo insufuciente");
        //throw new RuntimeException("Saldo insuficiente");
          return false;
      }
      this.saldo = this.saldo - valor;
      return true;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public boolean transferir(double valor, Conta recebedor){
        if(this.sacar(valor)) {
            recebedor.depositar(valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
