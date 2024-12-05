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

    public Triangulo(float lado1, float lado2, float lado3) {
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

//    public double perimetro(){
//        return  (getLado1() + getLado2() + getLado3()); // lado1 + lado2 ....
//    }

    public double perimetro() {
        return lado1 + lado2 + lado3;
    }
//    public double area(){
//        return Math.sqrt(perimetro()/2 * ((perimetro()/2-getLado1()) * (perimetro()/2-getLado2()) * (perimetro()/2-getLado3())));
//    }

    public double area() {
        double s = perimetro() / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
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
        System.out.println(triangulo.perimetro());
        System.out.println(triangulo.area());


        // Agregando nuevos Valores
        Triangulo triangulo1 = new Triangulo(7, 3, 9);
        System.out.println(triangulo1);
        System.out.println(triangulo1.perimetro());
        System.out.println(triangulo1.area());

    }

}
