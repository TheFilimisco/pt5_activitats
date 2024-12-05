package seis;

public class Cilindro {
    private int idCilindro;
    private Circulo radioBase;
    private double altura;
    private static int numberCirculos;

    public Cilindro(double radioBase, double altura) {
        this.idCilindro = numberCirculos++;
        this.radioBase = new Circulo(radioBase);
        this.altura = altura;
    }

    public Circulo getRadioBase() {
        return radioBase;
    }

    public void setRadioBase(Circulo radioBase) {
        this.radioBase = radioBase;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularAreaTotal() {
        double areaBases = 2 * Math.PI * Math.pow(getRadioBase().getRadio(), 2);
        double areaLateral = ((2 * Math.PI * getRadioBase().getRadio()) * getAltura());
        return areaBases + areaLateral;
    }

    public double calcularVolumen() {
        return Math.PI * Math.pow(getRadioBase().getRadio(), 2) * getAltura();

    }

    public static Cilindro compararCilindro(Cilindro cilindro1, Cilindro cilindro2) {
        if (cilindro1.calcularVolumen() > cilindro2.calcularVolumen()) {
            return cilindro1;
        }
        return cilindro2;
    }

    private boolean greaterThan(Cilindro other) {
        return calcularVolumen() > other.calcularVolumen();
    }


    @Override
    public String toString() {
        return "Cilindro{" +
                "idCilindro=" + idCilindro +
                ", radioBase=" + radioBase +
                ", altura=" + altura +
                '}';
    }

    public static void main(String[] args) {
        Cilindro cilindro = new Cilindro(3, 5);


        Cilindro cilindro1 = new Cilindro(3, 5);
        Cilindro cilindro2 = new Cilindro(6, 5);
        System.out.println(cilindro.calcularAreaTotal());
        System.out.println(cilindro.calcularVolumen());

        System.out.println(compararCilindro(cilindro1, cilindro2));


    }


}
