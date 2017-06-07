/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
* http://www.codejava.net/coding/how-to-play-back-audio-in-java-with-examples
 */
package pkg202class;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author CICCC-CIRAC
 */
public class AudioPlayer implements LineListener {
    private boolean playCompleted;
    
    private boolean isPaused;
    private boolean isStopped;
    private Clip audioClip;
    /**
     * Load audio file before playing back
     * @param audioFilePath Path for audio file
     * @throws IOException
     * @throws LineUnavailableException
     * @throws UnsupportedAudioFileException
     * 
     */
    public void load(String audioFilePath) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        File audioFile = new File(audioFilePath);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
        AudioFormat format = audioStream.getFormat();
        DataLine.Info info = new DataLine.Info(Clip.class, format);
        audioClip = (Clip) AudioSystem.getLine(info);
        audioClip.addLineListener(this);
        audioClip.open(audioStream);
    }
    
    public long getClipSecoundLength() {
        return audioClip.getMicrosecondLength() / 1_000_000;
    }
    
    public String getClipLengthString() {
        String length = "";
        long hour = 0;
        long minutes = 0;
        long secounds = audioClip.getMicrosecondLength() /  1_000_000;
        // magic code
        return length;
    
    }
    
    void play() {
        audioClip.start();
        
        playCompleted = false;
        isStopped = false;
        
        while(!playCompleted) {
            try {
                Thread.sleep(1000);
            } catch(InterruptedException ex) {
                ex.printStackTrace();
                if(isStopped) { // enum で statusにするかも
                    audioClip.stop();
                    break;
                }
                if(isStopped) {
                    audioClip.stop();
                } else {
                    audioClip.start();
                }
            }
        }
        audioClip.close();
    }
    
    void stop() {
        isStopped = true;
    }
    
    void pause() {
        isPaused = true;
    }
    
    void resume() {
        isPaused = false;
    }    

    @Override
    public void update(LineEvent le) {
        LineEvent.Type type = le.getType();
        if(type == LineEvent.Type.STOP) {
            if(isStopped || !isPaused) {
                playCompleted = true;
            }
        }
    }
    
    public Clip getAudioClip() {
        return audioClip;
    }
}
