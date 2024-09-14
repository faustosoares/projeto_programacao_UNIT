package banco;

public class CaixaEletronico {

    public static void main(String[] args) {

        Conta conta1 = new Conta(1, "Fausto Bernard", 1000.00);
        Conta conta2 = new ContaEspecial(2, "Jose Carlos", 2000.00, 100 );

        conta1.sacar(200000);
        System.out.println(conta1);

        conta1.transferir(80000, conta2);
        System.out.println(conta1);
        System.out.println(conta2);

        conta2.transferir(2050, conta1);
        System.out.println(conta1);
        System.out.println(conta2);

        conta2.transferir(2050, conta1);


    }
}
