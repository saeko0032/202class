package test.file1;

public class User {
    public static void main(String[] args) {

        GSonIO gsonIO = new GSonIO();
        // read from json file, can't update the date
        CDPlayer cdPlayer = new CDPlayer(gsonIO.getDataFromJsonFile());
        cdPlayer.displayFirstScreen();
    
    }
}
