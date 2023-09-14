package org.example.app.view;

import java.util.Scanner;

import static org.example.app.utils.Constants.MENU;

public class AppView {

    Scanner scanner = new Scanner(System.in);

    public String chooseOption() {
        getMenu();
        return scanner.nextLine();
    }

    private static void getMenu() {
        System.out.println(MENU);
    }

    public void getOutput(String output, String choice) {
        if (choice.equals("0")) System.out.println(output);
        scanner.close();
        System.exit(0);
    }
}
