package cuatro;

public class Contador {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public Contador() {
        this.numero = 0;
    }

    public void restablecerContador(){
        this.numero = 0;
    }

    public  void incrementarContador(){
        if (numero == 9) {
            restablecerContador();
            return;
        } else {
            this.numero++;
        }
    }

    public void consultarValor() {
        System.out.println("El valor es: " + getNumero());
    }

    @Override
    public String toString() {
        return "Contador{" +
                "numero=" + numero +
                '}';
    }

    public static void main(String[] args) {
        Contador contador = new Contador();
        // Incrementando
        contador.incrementarContador();
        contador.incrementarContador();
        contador.incrementarContador();
        contador.incrementarContador();
        contador.incrementarContador();
        contador.incrementarContador();
        contador.incrementarContador();
        contador.incrementarContador();
        contador.incrementarContador();
        contador.consultarValor();
        contador.incrementarContador();
        contador.incrementarContador();
        contador.incrementarContador();
        contador.consultarValor();

        //Restablecer
        contador.restablecerContador();

        contador.consultarValor();


    }
}
