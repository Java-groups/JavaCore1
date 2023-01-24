package com.softserve.project;

import java.util.Scanner;

public class Player1 extends AbstractPlayer
{
    public Player1(int price) {
        super(price);
    }

    public void playerName() {
        System.out.println("Player 1");
    }

    @Override
    public void playSong() {
        System.out.println("Playing: " + getSong());
        System.out.println();
    }

    public void inputSongName() {
        System.out.println("Input song name to play: ");
        Scanner scanner = new Scanner(System.in);
        setSong(scanner.nextLine());
    }
}
