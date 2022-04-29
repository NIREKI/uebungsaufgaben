package aufgabe_11;

import java.awt.FlowLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Datum extends JFrame{

	public Datum() {
		super("Datum");
		setSize(250, 100);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		JLabel label = new JLabel();
		label.setText("Testing");
		add(label);
		
		//Hier: https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
		
		SimpleDateFormat format = new SimpleDateFormat("EEE MMM dd HH:mm:ss zz yyyy");
		
		
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Date currentTime = new Date();
				label.setText(format.format(currentTime));
			}
		};
		//Jede Sekunde aktualisieren
		timer.schedule(task, 0, 1000);

		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Datum();
	}

}
