package seis;

public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void calcularArea() {
        double area = 3.14 * Math.pow(getRadio(),2);
        System.out.println(area);
    }

    public void calcularPerimetro() {
        double perimetro = 2 * Math.PI * getRadio();
        System.out.println(perimetro);
    }

    public static Circulo compararCirculos(Circulo circulo1, Circulo circulo2) {
        if (circulo1.getRadio() > circulo2.getRadio()) {
            return  circulo1;
        }
        return circulo2;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo(6);
        circulo.calcularArea();
        circulo.calcularPerimetro();
        Circulo circulo1 = new Circulo(8);
        Circulo circulo2 = new Circulo(5);

        System.out.println(compararCirculos(circulo1,circulo2));
    }


}
