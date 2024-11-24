package primero.coche;

public class CocheTest {
    public static void main(String[] args) {
        Coche coche1 = new Coche("SPARC","XX39FM");
        Coche coche2 = new Coche("LINUX","XX29FM");

        //Gett
        System.out.println(coche1.getMatricula());
        System.out.println(coche1.getModelo());
        System.out.println(coche2.getMatricula());
        System.out.println(coche2.getModelo());

        // Sett
        System.out.println(coche1);
        System.out.println(coche2);
        coche1.setModelo("SPARC2");
        coche2.setModelo("LINUX2");
        coche1.setMatricula("YYYYY");
        coche2.setMatricula("XXXXX");
        System.out.println(coche1);
        System.out.println(coche2);

    }


}
