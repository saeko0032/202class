package test.file1;

public class Song {
    private String songTitle;
    private String songArtist;
    private String genre;
    private double songPrice;
    private boolean isPurchase;

    public Song(String songTitle, String songArtist, String genre, double songPrice, boolean isPurchase) {
        this.songTitle = songTitle;
        this.songArtist = songArtist;
        this.genre = genre;
        this.songPrice = songPrice;
        this.isPurchase = isPurchase;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getSongPrice() {
        return songPrice;
    }

    public void setSongPrice(double songPrice) {
        this.songPrice = songPrice;
    }

    public boolean isIsPurchase() {
        return isPurchase;
    }

    public void setIsPurchase(boolean isPurchase) {
        this.isPurchase = isPurchase;
    }

}
