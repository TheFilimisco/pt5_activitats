package primero.coche;

public class Coche {

    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
    }

    private String modelo;
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
