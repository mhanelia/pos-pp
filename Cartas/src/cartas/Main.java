package cartas;

public class Main {

    public int converteCartaParaInt(String carta) {

        String[] cartas = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        int[] valorCarta = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int valor = -1;
        
        for (int i = 0; i < cartas.length; i++) {
            valor = cartas[i].equalsIgnoreCase(carta) ? valorCarta[i] : valor;
            }

        return valor;
    }
}