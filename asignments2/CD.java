package test.file1;

import java.util.ArrayList;

public class CD {

    private String albumTitle;
    private String albumArtist;
    private int numberOfTrucks;
    private int numberOfDiscs;
    private String albumGenre;
    private boolean isPurchase;
    private double costOfCD;
    private ArrayList<Song> songList;

    public CD(String albumTitle, String albumArtist, String albumGenre, int numberOfTrucks, boolean isPurchase, double costOfCD, ArrayList<Song> songList) {

    	this.albumTitle = albumTitle;
        this.albumArtist = albumArtist;
    	this.numberOfTrucks = numberOfTrucks;
        this.albumGenre = albumGenre;
        this.numberOfDiscs = 1;
        this.isPurchase = isPurchase;
        this.costOfCD = costOfCD;
        this.songList = songList;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public String getAlbumArtist() {
        return albumArtist;
    }

    public void setAlbumArtist(String albumArtist) {
        this.albumArtist = albumArtist;
    }

    public int getNumberOfTrucks() {
        return numberOfTrucks;
    }

    public void setNumberOfTrucks(int numberOfTrucks) {
        this.numberOfTrucks = numberOfTrucks;
    }

    public int getNumberOfDiscs() {
        return numberOfDiscs;
    }

    public void setNumberOfDiscs(int numberOfDiscs) {
        this.numberOfDiscs = numberOfDiscs;
    }

    public String getAlbumGenre() {
        return albumGenre;
    }

    public void setAlbumGenre(String albumGenre) {
        this.albumGenre = albumGenre;
    }

    public ArrayList<Song> getSongList() {
        return songList;
    }

    public void setSongList(ArrayList<Song> songList) {
        this.songList = songList;
    }

    public boolean isIsPurchase() {
        return isPurchase;
    }

    public void setIsPurchase(boolean isPurchase) {
        this.isPurchase = isPurchase;
    }

    public double getCostOfCD() {
        return costOfCD;
    }

    public void setCostOfCD(double costOfCD) {
        this.costOfCD = costOfCD;
    }

}
