package com.softserve.project;

import java.util.Scanner;

public class Player3 extends AbstractPlayer
{
    public String[] arrayPlaylist = new String[3];
    public Player3(int price) {
        super(price);
    }

    public void playerName() {
        System.out.println("Player 3");
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

    public void playAllSongs() {
        System.out.println("Playlist: ");
        for(int i = 0; i < getPlaylist().length; i++) {
            System.out.print(getPlaylist()[i] + "\n");
        }
    }


}
