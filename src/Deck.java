import java.util.ArrayList;
import java.util.*;

public class Deck {

    //inicializacion de variables
    ArrayList<Card> cards;


    //constructor del deck
    public Deck(){
        cards = new ArrayList<>();
        crearDeck();
    }


    //metodo para inicializar las cartas en el deck
    public void crearDeck(){
        String[] palos = {"tréboles", "corazones", "picas", "diamantes"};
        String[] colores = {"negro", "rojo"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};
        int contador = 0;
        for (String valor : valores) {
            for (String palo : palos) {
                for (String color : colores) {
                    Card card = new Card(palo, color, valor);
                    cards.add(card);
                    contador++;

                    if (contador == 52){
                        return;
                    }
                }
            }
        }
    }

    //metodo shuffle
    public void shuffle(){
        Collections.shuffle(cards);
        System.out.println("se mezclo el deck");
    }

    //metodo head
    public void head (){
        if(!cards.isEmpty()){
            Card card = cards.remove(0);
            System.out.println(card.toString());
            System.out.println("Quedan" + cards.size() + " cartas");

        } else{
            System.out.println("Ya no hay cartas");
        }
    }

    //metodo pick
    public void pick(){
        if (!cards.isEmpty()){
            int index = (int) (Math.random()* cards.size());
            Card card = cards.remove(index);
            System.out.println(card.toString());
            System.out.println("Quedan" + cards.size() + " cartas");
        } else{
            System.out.println("Ya no hay cartas");
        }
    }

    //metodo hand
    public void hand(){
        if(cards.size() >= 5){
            for (int m = 0; m < 5; m++){
                Card card = cards.remove(0);
                System.out.println(card.toString());
            }
        }
    }

}


