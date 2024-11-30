package seis;

public class Anillo {
    private String modelo;
    private double diametroDedo;
    private double diametroSeccionAnillo;

    public Anillo(String modelo, double diametroDedo, double diametroSeccionAnillo) {
        this.modelo = modelo;
        this.diametroDedo = diametroDedo;
        this.diametroSeccionAnillo = diametroSeccionAnillo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getDiametroDedo() {
        return diametroDedo;
    }

    public void setDiametroDedo(double diametroDedo) {
        this.diametroDedo = diametroDedo;
    }

    public double getDiametroSeccionAnillo() {
        return diametroSeccionAnillo;
    }

    public void setDiametroSeccionAnillo(double diametroSeccionAnillo) {
        this.diametroSeccionAnillo = diametroSeccionAnillo;
    }





    @Override
    public String toString() {
        return "Anillo{" +
                "modelo='" + modelo + '\'' +
                ", diametroDedo=" + diametroDedo +
                ", diametroSeccionAnillo=" + diametroSeccionAnillo +
                '}';
    }

}
