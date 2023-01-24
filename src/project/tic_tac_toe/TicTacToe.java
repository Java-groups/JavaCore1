package edu.com.project.tic_tac_toe;

import java.util.Scanner;

public class TicTacToe {

    private int stroka;
    private int stolbec;
    private int stepGame = 0;
    private int winsX = 0;
    private int winsO = 0;


    public int getStroka() {
        return stroka;
    }

    public void setStroka(int stroka) {
        this.stroka = stroka;
    }

    public int getStolbec() {
        return stolbec;
    }

    public void setStolbec(int stolbec) {
        this.stolbec = stolbec;
    }

    public int getStepGame() {
        return stepGame;
    }

    public void setStepGame(int stepGame) {
        this.stepGame = stepGame;
    }

    public int getWinsX() {
        return winsX;
    }

    public void setWinsX(int winsX) {
        this.winsX = winsX;
    }

    public int getWinsO() {
        return winsO;
    }

    public void setWinsO(int winsO) {
        this.winsO = winsO;
    }

    public void coordinateCheckRequest(Scanner coordinates) {

        System.out.print("input stroka: ");
        while (!coordinates.hasNextInt()) {  // Проверяем чтобы введенное значение было числом
            System.out.println("You should enter numbers!");
            System.out.println("Input number only please");
            coordinates.nextLine();
        }
        stroka = coordinates.nextInt();

        System.out.print("input stolbec: ");
        while (!coordinates.hasNextInt()) {  // Проверяем чтобы введенное значение было числом
            System.out.println("You should enter numbers!");
            System.out.println("input number only please");
            coordinates.nextLine();
        }
        stolbec = coordinates.nextInt();

        if (stroka > 3 || stolbec > 3) {  // Проверка введенных координат на выход за рамки поля
            while (stroka > 3 || stolbec > 3) {
                System.out.println("Coordinates should be from 1 to 3!");
                System.out.print("input stroka: ");
                stroka = coordinates.nextInt();
                System.out.print("input stolbec: ");
                stolbec = coordinates.nextInt();
            }
        }

    }

    public void winningCombinationCheck(char[][] game) {
        int j = 0;
        for (int i = 0; i < 3; i++) {
            if (game[i][j] + game[i][j + 1] + game[i][j + 2] == 264) { // равенство по строке X
                winsX += 1;
            } else if (game[i][j] + game[i][j + 1] + game[i][j + 2] == 237) { // равенство по строке 0
                winsO += 1;
            } else if (game[j][i] + game[j + 1][i] + game[j + 2][i] == 264) { // равенство по столбцу Х
                winsX += 1;
            } else if (game[j][i] + game[j + 1][i] + game[j + 2][i] == 237) { // равенство по столбцу 0
                winsO += 1;
            } else if (game[j][j] + game[j + 1][j + 1] + game[j + 2][j + 2] == 264 ||
                    game[j][j + 2] + game[j + 1][j + 1] + game[j + 2][j] == 264) { // равенство по диагоналям X
                winsX += 1;
            } else if (game[j][j] + game[j + 1][j + 1] + game[j + 2][j + 2] == 237 ||
                    game[j][j + 2] + game[j + 1][j + 1] + game[j + 2][j] == 237) { // равенство по диагоналям 0
                winsO += 1;
            }
        }
    }

    public void createField(char[][] game) {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(game[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("---------");
    }

    // Ф-я проверки игрового поля - занята координата массива символом или нет

    public void playingFieldCheck(int stepGame, char[][] game, Scanner coordinates) {
        if (game[stroka - 1][stolbec - 1] == ' ') {
            if (stepGame % 2 == 0) {
                game[stroka - 1][stolbec - 1] = 'X';
            } else {
                game[stroka - 1][stolbec - 1] = 'O';
            }

        } else if (game[stroka - 1][stolbec - 1] == 'X' || game[stroka - 1][stolbec - 1] == 'O') {
            while (game[stroka - 1][stolbec - 1] == 'X' || game[stroka - 1][stolbec - 1] == 'O') {
                System.out.println("This cell is occupied! Choose another one!");
                coordinateCheckRequest(coordinates);
            }
            if (stepGame % 2 == 0) {
                game[stroka - 1][stolbec - 1] = 'X';
            } else {
                game[stroka - 1][stolbec - 1] = 'O';
            }

        }
    }
}