import java.util.ArrayList;


public class Card {

    //inicializacion de valores
    public String palo;
    public String color;
    public String valor;

    //constructor de card
    public Card(String palo, String color, String valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }

    //metodo que hace override a toString para imprimir los valores con el formato palo + ", " + color + ", " + valor;
    @Override
    public String toString(){
        return palo + ", " + color + ", " + valor;
    }
}
