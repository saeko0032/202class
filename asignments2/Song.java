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
public class Song {

    private String songTitle;
    private String songArtist;
    private String album;
    private String genre;
    private int songPrice;
    private boolean isPurchase;

    public Song(String songTitle, String songArtist) {
        this.songTitle = songTitle;
        this.songArtist = songArtist;
        this.album = "";
        this.genre = "";
        this.isPurchase = false;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getSongArtist() {
        return songArtist;
    }

    public void setSongArtist(String songArtist) {
        this.songArtist = songArtist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getSongPrice() {
        return songPrice;
    }

    public void setSongPrice(int songPrice) {
        this.songPrice = songPrice;
    }

    public boolean isIsPurchase() {
        return isPurchase;
    }

    public void setIsPurchase(boolean isPurchase) {
        this.isPurchase = isPurchase;
    }

}
