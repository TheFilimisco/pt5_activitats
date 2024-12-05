package seis;

public class Circulo {
    private int idCirculo;
    private double radio;
    private static int numberCirculos;

    public Circulo(double radio) {
        this.idCirculo = numberCirculos++;
        this.radio = radio;
    }


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return 3.14 * Math.pow(getRadio(), 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * getRadio();
    }

    public static Circulo compararCirculos(Circulo circulo1, Circulo circulo2) {
        if (circulo1.getRadio() > circulo2.getRadio()) { //gerRadio()
            return circulo1;
        }
        return circulo2;
    }

    public Circulo compararCirculos(Circulo circulo) {
        if (this.getRadio() < circulo.getRadio()) { //gerRadio()
            return circulo;
        }
        return this;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "idCirculo=" + idCirculo +
                ", radio=" + radio +
                '}';
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo(6);
        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularPerimetro());
        Circulo circulo1 = new Circulo(8);
        Circulo circulo2 = new Circulo(5);

        System.out.println(compararCirculos(circulo1, circulo2));

        System.out.println(circulo1.compararCirculos(circulo2));

    }


}
