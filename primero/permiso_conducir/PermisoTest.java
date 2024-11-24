package primero.permiso_conducir;

public class PermisoTest {
    public static void main(String[] args) {
        PermisoConducir permiso1 = new PermisoConducir("Luis", "B",9);
        permiso1.imprimirPermiso();
        permiso1.restarPuntos(9);
        permiso1.imprimirPermiso();
        permiso1.restarPuntos(1);
        permiso1.imprimirPermiso();
        permiso1.restarPuntos(1);



    }


}
