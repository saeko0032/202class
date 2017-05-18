package test.file1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;

public class CDPlayer extends Player {
    ArrayList<CD> cdList;

    public ArrayList<CD> getCDList() {
        return this.cdList;
    }

    public ArrayList<Song[]> getSongList() {
        ArrayList<Song[]> songList = new ArrayList<Song[]>();
        //
        for (CD cd : cdList) {
//            songList.add(cd.getSongList());
        }
        return songList;
    }
    
    public void getDataFromGson() {
    	Gson gson = new Gson();
    	Song song1 = new Song("Beyond the cuntury", "Maka Makara", "Classical", 3.12, true);
    	Song song2 = new Song("Kamigami no uta", "Himekami", "Healthy",2.5, true);
    	Song song3 = new Song("Prayer", "Secret Garden", "Relax",3.12, true);
    	Song song4 = new Song("Return To Innocence", "Enigma", "Relax",2.5, true);
    	Song song5 = new Song("Eyes on me", "Faye Wong", "Relax", 3.12,true);
    	Song song6 = new Song("Time to say goodbye", "Andrea boceli","Relax",2.5, true);
    	Song song7 = new Song("Yeha - Noha", "Sacred Sprit", "Relax", 2.5,true);
    	Song song8 = new Song("Busindre Reel", "Hevia", "Relax", 3.12,true);
    	ArrayList<Song> songList1 = new ArrayList<Song>();
    	songList1.add(song1);
    	songList1.add(song2);
    	songList1.add(song3);
    	songList1.add(song4);
    	songList1.add(song5);
    	songList1.add(song6);
    	songList1.add(song7);
    	songList1.add(song8);
    	
    	CD cd1 = new CD("Feel","Various", "Healing", songList1, songList1.size(), true , calculateCost(songList1));
    	
    	Song song9 =  new Song("Two of US", "The Beatles", "Rock",2.0, true);
    	Song song10 =  new Song("Dig a pony", "The Beatles", "Rock",2.0, false);
    	Song song11 =  new Song("Across the Universe", "The Beatles", "Rock",2.0, false);
    	Song song12 =  new Song("I Me Mine", "The Beatles", "Rock",2.0, true);
    	Song song13 =  new Song("Let it be", "The Beatles", "Rock",2.0, true);    	
    	ArrayList<Song> songList2 = new ArrayList<Song>();
    	songList2.add(song9);
    	songList2.add(song10);
    	songList2.add(song11);
    	songList2.add(song12);
    	songList2.add(song13);
    	CD cd2 = new CD("Let it be","The Beatles", "Rock", songList2,songList2.size(), false, calculateCost(songList2));
    	
    	this.cdList = new ArrayList<CD>();
    	
    	this.cdList.add(cd1);
    	this.cdList.add(cd2);
    	System.out.println(gson.toJson(this.cdList));
    }

    public void displayFirstScreen() {
    	//getDataFromGson();
        System.out.println("===============================");
        System.out.println("1. Display CD");
        System.out.println("2. Display All Songs");
        System.out.println("3. Edit Playlist");
        System.out.println("===============================");
        Scanner sc = new Scanner(System.in);

        try {
            int code = sc.nextInt();
            switch (code) {
                case 1:
                    selectCD();
                    break;
                case 2:
                    selectSongs();
                    break;
                case 3:
                    editPlayList();
                    break;
                case 4:
                    showPurchaseHistory();
                    break;
            }
        } catch (Exception ex) {
        }
    }

    public void selectCD() {
        for(CD cd:cdList) {
            System.out.println(cd.getAlbumTitle());
        }
    }

    public void selectSongs() {
        for(CD cd:cdList) {
            for(Song song: cd.getSongList()) {
                System.out.println(song);
            }
        }
    }

    public void editPlayList() {
        System.out.println("===============================");
        System.out.println("1. Add Song for playlist");
        System.out.println("2. Delete Song for playlist");
        System.out.println("===============================");

    }
    public void showPurchaseHistory() {
        ;
    }
    
    public void play() {
    	System.out.println("playing the song...");
    }
    
    public double calculateCost(ArrayList<Song> songList) {
    	double tempCost = 0;
    	for(Song song: songList) {
    		tempCost += song.getSongPrice();
    	}
    	return tempCost;
    

    	
    	
    }
}
