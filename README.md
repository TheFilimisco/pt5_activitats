## Parte 1.1. Ejercicios de clases

### Primero
1. **Crea una clase Coche**
La clase debe tener los atributos modelo y matrícula junto con sus métodos set y get correspondientes.
Crea otra clase llamada CocheTest con un método main que cree dos objetos de tipo Coche y pruebe sus métodos set y get.
2. **Crea una clase PermisoConducir**
Atributos: nombre, tipoPermiso y puntos.
Métodos: incluye los métodos set y get para cada atributo.
Agrega un método llamado imprimirPermiso que imprima por pantalla todos los atributos.
Agrega un método llamado restarPuntos que reste al total de puntos el número recibido como parámetro.
Crea otra clase llamada PermisoTest con un main que cree dos objetos de tipo PermisoConducir y pruebe los métodos set, imprimirPermiso y restarPuntos.
3. **Crea una clase CochePermiso**
Método main que haga lo siguiente:
Crear un objeto de la clase Coche y otro de la clase PermisoConducir.
Mostrar un menú con las opciones: 
- a) Modificar información del coche: actualiza el objeto Coche con nuevos datos (modelo y matrícula) solicitados al usuario. 
- b) Modificar información del permiso: actualiza el objeto PermisoConducir con nuevos datos (nombre, tipoPermiso, puntos) solicitados al usuario. 
- c) Mostrar información: muestra todos los valores de los atributos de los objetos Coche y PermisoConducir.

### Segundo 
```java
public class AlumnoTest {
public static void main(String[] args) {
Alumno alumno1 = null;
Alumno alumno2 = null;
Alumno alumno3 = null;

        alumno1 = new Alumno();
        alumno1.setNombre("Ramón");

        alumno2 = new Alumno();
        alumno2.setNombre("Sonia");

        alumno3 = alumno1;
        alumno3.saluda();
        alumno1.saluda();

        alumno1 = alumno2;
        alumno1.saluda();

        alumno2.setNombre("Moncho");

        alumno1.saluda();
    }
}
```
**Responde**
- **¿Cuántos objetos Alumno se crean en el programa?**

Se crean 3 variables de objeto Alumno, pero no se inicializan todas, solamente 2 nuevos objeto Alumno.
```
    alumno1 = new Alumno();
    alumno1.setNombre("Ramón");
    alumno2 = new Alumno();
    alumno2.setNombre("Sonia");
```
- **¿Las asignaciones entre variables del tipo Alumno (por ejemplo, alumno3 = alumno1) hacen una copia del objeto?**

No hacen una copia del objeto, asigna la nueva direccion del objeto que apunta, un ejemplo alumno3 = alumno1 la direccion que apuntaba alumno 3 ahora seria
a la direccion de alumno1.
- **¿Estas asignaciones hacen que ambas variables apunten al mismo objeto?**

Si estarian apuntando a la misma referencia del Objeto.

### Tercero

1. Crea y prueba una clase que modele un triángulo

* **Atributos**: lado1, lado2, lado3: longitudes de los lados del triángulo (números reales).
* **Métodos**:

**Constructor por defecto**: los lados tendrán valores 3, 4 y 5.

**Constructor que reciba los valores de los lados como parámetros**

**Método perimetro()**: calcula el perímetro del triángulo.

**Método area()**: calcula el área usando la fórmula de Herón. Referencia.




