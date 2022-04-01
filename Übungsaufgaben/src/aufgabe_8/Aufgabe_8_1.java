package aufgabe_8;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Aufgabe_8_1 {

		public static void main(String[] args) {
			try {
				Clip clip = AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream (new File("audio.wav")));
				clip.start();
				TimeUnit.MICROSECONDS.sleep(clip.getMicrosecondLength()+50);
				clip.close(); 
			} catch (LineUnavailableException | IOException | InterruptedException | UnsupportedAudioFileException | SecurityException e) {
				e.printStackTrace();
			}
		}
}
