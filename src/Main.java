import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //inicializando variables
        System.out.println("Bienvenido a tu programa de deck");
        Scanner lector = new Scanner(System.in);
        Deck deck = new Deck();
        deck.shuffle();
        String opc = "J";
        int ter = 1;

        //generacion de menu
        while(ter != 0){
            System.out.println("Por favor selecciona una opcion usando mayusculas");
            System.out.println("S: Mezcla el deck");
            System.out.println("H: muestra la primera carta del deck y quitala");
            System.out.println("P: Saca una carta al azar del deck y muestrala");
            System.out.println("M: Toma 5 cartas para tu mano");
            System.out.println("E: Salir");
            opc = lector.nextLine();
            switch (opc){
                case "S":
                    deck.shuffle();
                    break;
                case "H":
                    deck.head();
                    break;
                case "P" :
                    deck.pick();
                    break;
                case "M" :
                    deck.hand();
                    break;
                case "E":
                    System.out.println("Gracias por usar nuestro programa");
                    ter = 0;
                    break;
            }
        }
    }
}
