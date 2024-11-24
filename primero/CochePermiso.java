package primero;

import primero.coche.Coche;
import primero.permiso_conducir.PermisoConducir;

import java.util.Scanner;

public class CochePermiso {
    public static void main(String[] args) {
        Coche coche = new Coche("TOYOTA", "XXX1");
        PermisoConducir permiso = new PermisoConducir("Julio","B",9);

        Scanner input = new Scanner(System.in);
        boolean option = true;

        System.out.println("=============Menu===========");
        System.out.println("""
                1.Modificar informacion del Coche
                2.Modificar informacion del Permiso
                3.Mostrar informacion del Coche y Permiso
                4.Salir
                """);


        while (option){
            System.out.println("Ingrese una opcion: ");
            int numberOption = input.nextInt();
            switch (numberOption){
                case 1:
                    input.nextLine();
                    System.out.println("Inrese modelo nuevo: " );
                    String modelo = input.nextLine();
                    coche.setModelo(modelo);
                    System.out.println("Inrese matricula nueva: " );
                    String matricula = input.nextLine();
                    coche.setMatricula(matricula);
                    break;
                case 2:
                    System.out.println("Inrese nombre nuevo: " );
                    String nombre = input.nextLine();
                    permiso.setNombre(nombre);
                    System.out.println("Inrese Tipo de Permiso nuevo: " );
                    String tipoPermiso = input.nextLine();
                    permiso.setTipoPermiso(tipoPermiso);
                    System.out.println("Inrese puntos nuevos: " );
                    int puntos = input.nextInt();
                    permiso.setPuntos(puntos);
                    break;
                case 3:
                    System.out.println(coche);
                    System.out.println(permiso);
                    break;
                case 4:
                    option = false;
                    break;
            }
            System.out.println("=============Menu===========");
            System.out.println("""
                1.Modificar informacion del Coche
                2.Modificar informacion del Permiso
                3.Mostrar informacion del Coche y Permiso
                4.Salir
                """);
        }
    }
}
