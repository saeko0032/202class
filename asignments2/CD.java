/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments2;

/**
 *
 * @author CICCC-CIRAC
 */
public class CD {

    private String albumTitle;
    private String albumArtist;
    private int numberOfTrucks;
    private int numberOfDiscs;
    private String albumGenre;
    private Song[] songList;
    private boolean isPurchase;
    private int costOfCD;

    public CD(String albumTitle, String albumArtist, Song[] songList, boolean isPurchase) {
        this.albumTitle = albumTitle;
        this.albumArtist = albumArtist;
        this.numberOfTrucks = 1;
        this.numberOfDiscs = 1;
        this.songList = songList;
        this.isPurchase = false;
        this.costOfCD = 0;
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

    public Song[] getSongList() {
        return songList;
    }

    public void setSongList(Song[] songList) {
        this.songList = songList;
    }

    public boolean isIsPurchase() {
        return isPurchase;
    }

    public void setIsPurchase(boolean isPurchase) {
        this.isPurchase = isPurchase;
    }

    public int getCostOfCD() {
        return costOfCD;
    }

    public void setCostOfCD(int costOfCD) {
        this.costOfCD = costOfCD;
    }

}
