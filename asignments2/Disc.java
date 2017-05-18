package test.file1;

public class Disc {
    private String title;
    private int trucks;
    private int discs;
    
    public Disc(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTrucks() {
        return trucks;
    }

    public void setTrucks(int trucks) {
        this.trucks = trucks;
    }

    public int getDiscs() {
        return discs;
    }

    public void setDiscs(int discs) {
        this.discs = discs;
    }
}
