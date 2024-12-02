package cinco;

public class Player {
    private  String nombre;
    private Position position;
    private final int RIGHT=1;
    private final int LEFT=1;
    private final int UP=1;
    private final int DOWN=1;

    public Player(String nombre, Position position) {
        this.nombre = nombre;
        this.position = position;
    }

    public Player() {
        this.nombre = "Anonimo";
        this.position = new Position();
    }



    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void moveRight(){
        this.getPosition().incX(RIGHT);
    }

    public void moveLeft(){
        this.getPosition().decX(LEFT);
    }

    public void jump(){
        this.getPosition().incY(UP);
    }

    public void fall(){
        this.getPosition().decY(DOWN);
    }


    @Override
    public String toString() {
        return "Player{" +
                "nombre='" + nombre + '\''+ ", "+  position +
                '}';
    }


    public static void main(String[] args) {
        Player player = new Player("Joaquin", new Position());
        Player anonimo = new Player();
        System.out.println(anonimo);
        System.out.println(player);
        player.moveRight();
        System.out.println(player);
        player.moveLeft();
        System.out.println(player);
        player.jump();
        System.out.println(player);
        player.jump();
        System.out.println(player);
        player.fall();
        System.out.println(player);

    }
}
