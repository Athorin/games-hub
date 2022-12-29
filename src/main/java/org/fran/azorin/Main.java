package org.fran.azorin;

import org.fran.azorin.gamehub.games.battleship.Battleship;
import org.fran.azorin.gamehub.games.conway.Conway;
import org.fran.azorin.gamehub.games.duelcards.Duelcards;
import org.fran.azorin.gamehub.games.megamind.Megamind;
import org.fran.azorin.gamehub.games.tetris.Tetris;

import static org.fran.azorin.gamehub.GameMenu.mainMenu;
import static org.fran.azorin.gamehub.utils.GameUtils.chooseOption;

public class Main {

    public static void main(String[] args) {

        System.out.println("**********WELCOME to GAMES HUB**********");

        int option;

        do {
            mainMenu();
            option = chooseOption();

            switch(option) {
                case 1: Battleship.launch(); break;
                case 2: Conway.launch(); break;
                case 3: System.out.println("Crucigramarius on development"); break;
                case 4: Duelcards.launch(); break;
                case 5: Megamind.launch(); break;
                case 6: Tetris.launch(); break;
                }
            } while(option != 0);

        System.out.println("BYE");
    }


}