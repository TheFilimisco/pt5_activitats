package cinco;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        ArrayList<Player> listPlayer = new ArrayList<>();
        Game game = new Game();
        Scanner input = new Scanner(System.in);
        boolean runing = true;
        int topeVectores = 10;
        game.initMenuGame(runing,input,listPlayer,topeVectores);
    }

    public  void initMenuGame(boolean runing, Scanner input, ArrayList<Player> listPlayer, int topeVectores) {
        while (runing) {
            imprimirMenuString();
            int option = input.nextInt();
            input.nextLine();
            switch (option){
                case 1:
                    addNuevoJugador(input,listPlayer,topeVectores);
                    break;
                case 2:
                    deleteJugador(listPlayer);
                    break;
                case 3:
                    reiniciarPartida(listPlayer);
                    break;
                case 4:
                    mostrarTodosJugadores(listPlayer);
                    break;
                case 5:
                    runing = false;
                    break;
            }
        }
    }

    public void imprimirMenuString(){
        System.out.println("""
                    ========Menu de Opciones======
                    1. Añadir nuevo jugador
                    2. Eliminar jugador
                    3. Reiniciar partida
                    4. Mostrar Jugadores
                    5. Salir
                    """);
    }

    public void addNuevoJugador(Scanner input, ArrayList<Player> listPlayer, int numeroMaximo) {
        System.out.println("======Añadir Nuevo Jugador===");
        System.out.print("Añadir el nombre:");
        String nombre = input.nextLine();
        if (listPlayer.size() == numeroMaximo) {
            System.out.println("No se puede agregar mas Jugadores");
            return;
        }
        if (nombre.isBlank() || nombre.isEmpty()){
            listPlayer.add( new Player());
        } else {
            listPlayer.add( new Player(nombre,new Position()));
        }
        System.out.println("Jugador creado correctamente");
    }

    public void deleteJugador(ArrayList<Player> listPlayer) {
        System.out.println("=======Eliminar Jugador=========");
        listPlayer.removeLast();
        System.out.println("Jugador ultimo eliminado correctamente");
    }

    public void reiniciarPartida(ArrayList<Player> listPlayer) {
        System.out.println("========Reiniciar Partida=========");
        listPlayer.clear();
        System.out.println("Partida reiniciada correctamente");
    }

    public void mostrarTodosJugadores(ArrayList<Player> listPlayer) {
        System.out.println("=========Mostrar Jugadores========");
        for (Player player : listPlayer){
            System.out.println(player);
        }
    }





}



