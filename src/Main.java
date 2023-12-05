// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        El objetivo de este ejercicio es practicar la creación de clases y métodos
        en Java mediante la implementación de una clase que modele un juego de mesa.

        Crea una clase llamada JuegoDeMesa con los siguientes atributos privados el
        nombre del juego de mesa, cantidad máxima de jugadores permitidos en el juego,
        estado actual del juego ("En curso", "Finalizado", etc.), inicializado en "En curso".

        Implementa un constructor por defecto, con todos los parámetros, y uno copia
        que permita inicializar los atributos de la clase JuegoDeMesa.

        Implementa los siguientes métodos en la clase JuegoDeMesa:
        •	iniciarJuego(): Inicia el juego y establece el estado como "En curso".
        •	finalizarJuego(): Finaliza el juego y establece el estado como "Finalizado".
        •	agregarJugador(): Agrega un jugador al juego. Si el número de jugadores alcanza
        el límite, imprime un mensaje indicando que no se pueden agregar más jugadores.
        •	realizarJugada(): Simula una jugada en el juego imprime un mensaje indicando que
        se ha realizado una jugada.

        Crea una clase Main:
        •	En el método main, crea una instancia de la clase JuegoDeMesa.
        •	Realiza llamadas a los métodos agregarJugador, iniciarJuego, realizarJugada y
        finalizarJuego para demostrar el funcionamiento de la clase.

         */
        //TableGame(String name, int currentPlayers, State gameState)
        TableGame game = new TableGame("Adventure Game", 7, State.IN_Progress);
        game.addPlayer();
        game.addPlayer();
        game.addPlayer();
        game.startGame();
        game.makeAPlay();
        game.finishGame();
    }
}