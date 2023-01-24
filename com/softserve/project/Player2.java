package com.softserve.project;

import java.util.Scanner;

public class Player2 extends AbstractPlayer {

    public Player2(int price) {
        super(price);
    }

    public void playerName() {
        System.out.println("Player 2");
    }

    @Override
    public void playSong() {
        if (getSong() != null) {
            System.out.println("Error");
            System.out.println();
        }
    }

    public void inputSongName() {
        System.out.println("Input song name to play: ");
        Scanner scanner = new Scanner(System.in);
        setSong(scanner.nextLine());
    }

}
