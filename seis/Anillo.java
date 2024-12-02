package seis;

public class Anillo {
    private String modelo;
    private double diametroPasoDedo;
    private double diametroSeccionAnillo;
    private static final double DENSIDAD_ORO = 0.01932; //mm
    private static final double PRECIO_ORO = 10.00; //eur/gr
    private static final double COSTE_FABRICACION = 40.00; //eur/gr


    public Anillo(String modelo, double diametroPasoDedo, double diametroSeccionAnillo) {
        this.modelo = modelo;
        this.diametroPasoDedo = diametroPasoDedo;
        this.diametroSeccionAnillo = diametroSeccionAnillo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getDiametroPasoDedo() {
        return diametroPasoDedo;
    }

    public void setDiametroPasoDedoDedo(double diametroPasoDedo) {
        this.diametroPasoDedo = diametroPasoDedo;
    }

    public double getDiametroSeccionAnillo() {
        return diametroSeccionAnillo;
    }

    public void setDiametroSeccionAnillo(double diametroSeccionAnillo) {
        this.diametroSeccionAnillo = diametroSeccionAnillo;
    }

    private double calcularVolumenAnillo() {
        return Math.pow(Math.PI,2) * (Math.pow(getDiametroSeccionAnillo(),2)/4 * getDiametroPasoDedo());
    }

    public double calcularPesoAnillo(){
        return calcularVolumenAnillo() * DENSIDAD_ORO;
    }

    public double precioOroAnilloFabricado() {
        return calcularPesoAnillo() * PRECIO_ORO;
    }

    public double precioOroAnilloMayorista() {
        return precioOroAnilloFabricado()+COSTE_FABRICACION;
    }

    public double precioAnilloCliente() {
        return precioOroAnilloMayorista()*2.10;
    }



    @Override
    public String toString() {
        return "Anillo{" +
                "modelo='" + modelo + '\'' +
                ", diametroDedo=" + diametroPasoDedo +
                ", diametroSeccionAnillo=" + diametroSeccionAnillo +
                '}';
    }


    public static void main(String[] args) {

       Anillo anillo = new Anillo("C23", 20,2);
        System.out.println(anillo.calcularPesoAnillo());
        System.out.println(anillo.precioOroAnilloFabricado());
        System.out.println(anillo.precioOroAnilloMayorista());
        System.out.println(anillo.precioAnilloCliente());

    }



}
