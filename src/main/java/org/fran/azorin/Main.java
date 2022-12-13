package org.fran.azorin;

import org.fran.azorin.gamehub.battleship.Battleship;
import org.fran.azorin.gamehub.conway.Conway;
import org.fran.azorin.gamehub.battleship.table.duelcards.Duelcards;
import org.fran.azorin.gamehub.megamind.Megamind;
import org.fran.azorin.gamehub.tetris.Tetris;

import static org.fran.azorin.gamehub.utils.GameUtils.chooseOption;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello to GAMES HUB!");

        int option;

        do {
            menu();
            option = chooseOption();

            switch(chooseGame()) {
                case 1: Battleship.launch();
                    break;
                case 2: Conway.launch();
                    break;
                case 3: System.out.println("Crucigramarius on development");
                    break;
                case 4: Duelcards.launch();
                    break;
                case 5: Megamind.launch();
                    break;
                case 6: Tetris.launch();
                    break;
                }
            } while(option != 7);

        System.out.println("BYE");
    }

    private static void menu() {

        System.out.println("       MENU - Choose game");
        System.out.println("--------------------------------");
        System.out.println("1. Battleship");
        System.out.println("2. Conway");
        System.out.println("3. Crucigramarius");
        System.out.println("4. Duel cards");
        System.out.println("5. Megamind");
        System.out.println("6. Tetris");
        System.out.println("7. Exit game hub");
    }

    private static int chooseGame() {
        return chooseOption();
    }


}