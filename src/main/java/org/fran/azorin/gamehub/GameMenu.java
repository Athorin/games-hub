package org.fran.azorin.gamehub;

import org.fran.azorin.gamehub.menu.Menu;
import org.fran.azorin.gamehub.menu.MenuBuilder;

public class GameMenu {

    private Menu menu;

    public static void mainMenu() {

        Menu battleshipMenu = MenuBuilder.createSubMenu("Menu Battleship", 1)
                .addSimpleOption(1, "Single Player")
                .addSimpleOption(2, "Multi Player")
                .addSimpleOption(3, "Options")
                .addExitOption(0, "Exit Game")
                .build();

        Menu conway = MenuBuilder.createSubMenu("Menu Conway", 2)
                .addSimpleOption(1, "OpciónS2 1")
                .addSimpleOption(2, "OpciónS2 2")
                .addSimpleOption(3, "OpciónS2 3")
                .addSimpleOption(4, "OpciónS2 4")
                .addExitOption(0, "SalirS2")
                .build();

        Menu crucigramarius = MenuBuilder.createSubMenu("Crucigramarius", 3)
                .addSimpleOption(1, "OpciónS2 1")
                .addSimpleOption(2, "OpciónS2 2")
                .addSimpleOption(3, "OpciónS2 3")
                .addSimpleOption(4, "OpciónS2 4")
                .addExitOption(0, "SalirS2")
                .build();

        Menu duelcards = MenuBuilder.createSubMenu("Duel cards", 4)
                .addSimpleOption(1, "OpciónS2 1")
                .addSimpleOption(2, "OpciónS2 2")
                .addSimpleOption(3, "OpciónS2 3")
                .addSimpleOption(4, "OpciónS2 4")
                .addExitOption(0, "SalirS2")
                .build();

        Menu megamind = MenuBuilder.createSubMenu("Menu Megamind", 5)
                .addSimpleOption(1, "OpciónS2 1")
                .addSimpleOption(2, "OpciónS2 2")
                .addSimpleOption(3, "OpciónS2 3")
                .addSimpleOption(4, "OpciónS2 4")
                .addExitOption(0, "SalirS2")
                .build();

        Menu tetris = MenuBuilder.createSubMenu("Menu Tetris", 6)
                .addSimpleOption(1, "OpciónS2 1")
                .addSimpleOption(2, "OpciónS2 2")
                .addSimpleOption(3, "OpciónS2 3")
                .addSimpleOption(4, "OpciónS2 4")
                .addExitOption(0, "SalirS2")
                .build();


        Menu mainMenu = MenuBuilder.createMainMenu("Main menu - Choose game")
                .addSubMenuOption("Battleship", battleshipMenu)
                .addSubMenuOption("Conway", conway)
                .addSubMenuOption("Crucigramarius", crucigramarius)
                .addSubMenuOption("Duel cards", duelcards)
                .addSubMenuOption("Megamind", megamind)
                .addSubMenuOption("Tetris", tetris)
                .addExitOption(0, "Exit gamehub")
                .build();

        System.out.println(mainMenu.play());

    }
}
