/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments2;

import java.util.ArrayList;
import java.util.Scanner;
import com.google.gson.Gson;

/**
 *
 * @author CICCC-CIRAC
 */
public class CDPlayer {

    CD[] cdList;

    public CD[] getCDList() {
        return this.cdList;
    }

    public ArrayList<Song[]> getSongList() {
        ArrayList<Song[]> songList = new ArrayList<Song[]>();
        for (CD cd : cdList) {
            songList.add(cd.getSongList());
        }
        return songList;
    }

   public void getDataFromGson() {
    	Gson gson = new Gson();
    	Song song1 = new Song("song1title", "song1artist");
    	Song song2 = new Song("song2title", "song2artist");
    	Song song3 = new Song("song3title", "song4artist");
    	Song song4 = new Song("song3title", "song4artist");
    	Song[] songList1 = {song1, song2};
    	Song[] songList2 = {song3,song4};
    	CD cd1 = new CD("cdpara1-1", "cdpara1-2", songList1, false);
    	CD cd2 = new CD("cdpara2-1", "cdpara2-2", songList2, true);
    	CD[] cdList = {cd1,cd2};
    //	System.out.println(gson.toJson(song1));
    //	System.out.println(gson.toJson(songList1));
    	System.out.println(gson.toJson(cdList));
    }


    public void displayFirstScreen() {
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
        ; // display CD
    }

    public void selectSongs() {
        ; // display CD
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
}
