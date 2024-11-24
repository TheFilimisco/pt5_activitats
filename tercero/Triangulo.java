package tercero;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo() {
        this.lado1 = 3;
        this.lado2 = 4;
        this.lado3 = 5;
    }

    public Triangulo(float lado1 , float lado2, float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public void perimetro(){
        double perimetro =  (getLado1() + getLado2() + getLado3())/2;
        System.out.println(perimetro);
    }

    public void area(){
        double perimetro = (getLado1()+getLado2()+getLado3())/2;
        double area = Math.sqrt(perimetro * ((perimetro-getLado1()) * (perimetro-getLado2()) * (perimetro-getLado3())));
        System.out.println(area);
    }


    @Override
    public String toString() {
        return "Triangulo{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                '}';
    }

    public static void main(String[] args) {
        // Con valores Predeterminados
        Triangulo triangulo = new Triangulo();
        System.out.println(triangulo);
        triangulo.perimetro();
        triangulo.area();

        // Agregando nuevos Valores
        Triangulo triangulo1 = new Triangulo(7,3,9);
        System.out.println(triangulo1);
        triangulo1.perimetro();
        triangulo1.area();
    }

}
