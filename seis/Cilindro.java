package seis;

public class Cilindro {
    private Circulo radioBase;
    private double altura;

    public Cilindro(double radioBase, double altura) {
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

    public void calcularAreaTotal() {
        double areaBases = 2 * Math.PI * Math.pow(getRadioBase().getRadio(),2);
        double areaLateral = ((2 * Math.PI *getRadioBase().getRadio()) * getAltura());
        System.out.println(areaBases+areaLateral);
    }

    public void calcularVolumen(){
        double volumenCilindro = Math.PI * Math.pow(getRadioBase().getRadio(),2) * getAltura();
        System.out.println(volumenCilindro);
    }


    @Override
    public String toString() {
        return "Cilindro{" +
                "radioBase=" + radioBase +
                ", altura=" + altura +
                '}';
    }

    public static void main(String[] args) {
        Cilindro cilindro = new Cilindro(3,5);


        Cilindro cilindro1 = new Cilindro(3,5);
        Cilindro cilindro2 = new Cilindro(6,5);
        cilindro.calcularAreaTotal();
        cilindro.calcularVolumen();

        System.out.println(Circulo.compararCirculos(cilindro1.getRadioBase(),cilindro2.getRadioBase()));
    }


}
