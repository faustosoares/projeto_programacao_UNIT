package cartesiano;

public class UsandoPonto {

    public static void main(String[] args) {
        Ponto2D p1 = new Ponto2D(1,1);
        Ponto2D p2 = new Ponto2D(1,1);

        System.out.println(p1);

        var p4 = new Ponto2D();

        System.out.println("Distancia: " + p1.calcularDistancia(p2));
        System.out.println("Sao iguais? " + p1.isIgual(p2));

        var p3 = new Ponto2D(p2);




    }
}
