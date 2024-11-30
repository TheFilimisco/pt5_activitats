package cuatro;

public class ContadorDos {
    private Contador contador1;
    private Contador contador2;


    public ContadorDos() {
        this.contador1 = new Contador();
        this.contador2 = new Contador();
    }

    public Contador getContador1() {
        return contador1;
    }

    public void setContador1(Contador contador1) {
        this.contador1 = contador1;
    }

    public Contador getContador2() {
        return contador2;
    }

    public void setContador2(Contador contador2) {
        this.contador2 = contador2;
    }

    @Override
    public String toString() {
        return "ContadorDos{" + contador1 + contador2 +
                '}';
    }

    public static void main(String[] args) {
        ContadorDos contadorDosNumbers = new ContadorDos();
        contadorDosNumbers.contador1.incrementarContador();
        contadorDosNumbers.contador2.incrementarContador();
        System.out.println(contadorDosNumbers);

    }

}
