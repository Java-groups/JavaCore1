package com.softserve.project;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Player6 extends AbstractPlayer
{
    public String[] arrayPlaylist = new String[3];
    public Player6(int price) {
        super(price);
    }

    public void playerName() {
        System.out.println("Player 6");
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

    public void shufflePlaylist()
    {
        System.out.println("Shuffled playlist: ");
        List<String> list = Arrays.asList(getPlaylist());
        int length = list.size();
        for (int i = 0; i < getPlaylist().length; i++) {
            int index = new Random().nextInt(length);
            String shuffle = list.get(index);
            System.out.println(shuffle);
        }
    }

}
