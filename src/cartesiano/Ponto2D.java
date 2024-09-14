package cartesiano;

public class Ponto2D {

    private double x;
    private double y;

    public Ponto2D(){}
    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ponto2D(Ponto2D ponto){
        this.x = ponto.getX();
        this.y = ponto.getY();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")" ;
    }

    public double calcularDistancia(Ponto2D ponto){
        var delta_x = this.x - ponto.getX();
        var delta_y = this.y - ponto.getY();

        return Math.sqrt(Math.pow(delta_x,2) + Math.pow(delta_y,2));
    }

    public boolean isIgual(Ponto2D ponto){
        //return this.equals(ponto);
        return this.x == ponto.getX() && this.y == ponto.getY();
    }
}
