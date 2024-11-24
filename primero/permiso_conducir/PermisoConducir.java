package primero.permiso_conducir;

public class PermisoConducir {
    private String nombre;
    private String tipoPermiso;
    private int puntos;

    public PermisoConducir(String nombre, String tipoPermiso, int puntos) {
        this.nombre = nombre;
        this.tipoPermiso = tipoPermiso;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoPermiso() {
        return tipoPermiso;
    }

    public void setTipoPermiso(String tipoPermiso) {
        this.tipoPermiso = tipoPermiso;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void imprimirPermiso(){
        System.out.println("Nombre: " + getNombre() + "\nTipo permiso: " + getTipoPermiso() + "\nPuntos: " + getPuntos());
    }

    public void restarPuntos(int numero) {
        int puntosActual = getPuntos();
        if (puntosActual <= 0) {
            System.out.println("No se puede restar mas puntos");
            return;
        } else {
            int nuevoPuntaje = puntosActual-numero;
            setPuntos(nuevoPuntaje);
        }
    }

    @Override
    public String toString() {
        return "PermisoConducir{" +
                "nombre='" + nombre + '\'' +
                ", tipoPermiso='" + tipoPermiso + '\'' +
                ", puntos=" + puntos +
                '}';
    }
}
