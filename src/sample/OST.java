package sample;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

/**
 * Created by ASUS on 6/7/2017.
 */
public class OST {
    String musicFile;
    OST(String musicFile){
        this.musicFile=musicFile;
    }

    public void playSountrack() {
        Media sound = new Media(getClass().getResource(musicFile).toExternalForm());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }
}
