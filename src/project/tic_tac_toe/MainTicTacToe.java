package edu.com.project.tic_tac_toe;

import java.util.Scanner;

public class MainTicTacToe {

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        Scanner coordinates = new Scanner(System.in);
        // Заполнение массива чарами space
        char[][] game = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                game[i][j] = ' ';
            }
        }
        ticTacToe.createField(game); // печать игрового поля, обращение к ф-и печати
        // заполнение игрового массива, запрашиваем координаты
        // 0, 2, 4 - парный шаг - ход Х
        // 1, 3, 5 - непарный шаг - ход 0
        // делаем цикл на 9 шагов
        boolean stoper = false;
        for (int i = 0; i < 9 && !stoper; i++) {
            ticTacToe.coordinateCheckRequest(coordinates);   // ф-я проверки введенных координат на соответствие условий
            ticTacToe.setStepGame(i); //stepGame = i;
            ticTacToe.playingFieldCheck(ticTacToe.getStepGame(), game, coordinates);  // проверка занята клетка поля game[stroka][stolbec] Х или 0, обращение к ф-и проверки
            ticTacToe.createField(game);   // печать игрового поля, обращение к ф-и печати
            ticTacToe.winningCombinationCheck(game);  // обращение к ф-и анализа игрового поля
            if (ticTacToe.getWinsO() > 0) {
                coordinates.close();
                System.out.print("O wins");
                stoper = true;
                System.exit(0);
            } else if (ticTacToe.getWinsX() > 0) {
                coordinates.close();
                System.out.print("X wins");
                stoper = true;
                System.exit(0);
            }
        }
        coordinates.close();
        System.out.print("Draw");
        System.exit(0);
    }
}
