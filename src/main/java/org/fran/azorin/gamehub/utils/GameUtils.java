package org.fran.azorin.gamehub.utils;

import java.util.Scanner;

public class GameUtils {

    public static int chooseOption() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}
