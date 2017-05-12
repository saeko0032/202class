/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments2;

import java.util.ArrayList;
import java.util.Scanner;

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
