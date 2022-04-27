package aufgabe_12;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class morePanels extends JFrame {
	
	public morePanels() {
		super("Ü11A2");
		setSize(360,430);
		setLocation(100,100);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ArrayList<JPanel> panels = new ArrayList<JPanel>();
		
		//Alle Panels generieren und MouseListener hinzufügen
		for(int i = 0; i < 7; i++) {//Zeile
			for (int j = 0; j < 7; j++) { //Reihe
				JPanel panel = new JPanel();
				panel.setSize(50,50);
				panel.setLocation(50*i, 50*j);
				panel.setBackground(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
				panel.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						panel.setBackground(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
					}
				});
				panels.add(panel);
				add(panel);
			}
		}
		
		JButton button = new JButton("Neue Farben");
		button.setSize(200,40);
		button.setLocation(70,350);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Für jedes Panel in der Liste..
				for(JPanel p : panels) {
					p.setBackground(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
				}
			}
		});
		add(button);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new morePanels();
	}

}
