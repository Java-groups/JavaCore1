package com.softserve.project;


public abstract class AbstractPlayer
{
    final int price;
    private String song;
    private String[] playlist = new String[3];

    protected AbstractPlayer(int price) {
        this.price = price;
    }

    public int getPrice() {
        System.out.println("Price: " + price);
        return price;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public void setPlaylist(String[] playlist) {
        this.playlist = playlist;
    }

    public String[] getPlaylist() {
        return playlist;
    }

    public String getSong() {
        return song;
    }

    protected abstract void playSong();


}


