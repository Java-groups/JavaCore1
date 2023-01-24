package com.softserve.project;

import java.util.Scanner;

public class Player5 extends AbstractPlayer
{
    public String[] arrayPlaylist = new String[3];
    public Player5(int price) {
        super(price);
    }

    public void playerName() {
        System.out.println("Player 5");
    }


    @Override
    public void playSong() {
        System.out.println("Playing: " + getPlaylist()[0]);
    }

    public void inputPlaylist() {
        System.out.println("Input playlist songs: ");
        for(int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            arrayPlaylist[i] = scanner.nextLine();
        }
        setPlaylist(arrayPlaylist);
    }

    public void playAllSongsReverse() {
        System.out.println("Playlist in reverse order: ");
        for(int i = getPlaylist().length-1; i >= 0 ; i--) {
            System.out.print(getPlaylist()[i] + "\n");
        }
    }

}
