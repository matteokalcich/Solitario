package boundary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import gioco.GiocoDiCarte;


public class ConsoleGUI extends JFrame {
	
	JPanel panel;
	private JLabel imageLabel;
	private JLabel scoreLabel;
	private JButton pescaButton;
	private boolean primaCarta = true;
	
	public ConsoleGUI(GiocoDiCarte giocoDiCarte) {
		
		super("Gioco di Carte");
		
		giocoDiCarte.nuovaMano();
		designGui(giocoDiCarte);
		
		setSize(800, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void designGui(GiocoDiCarte giocoDiCarte) {
		
		imageLabel = new JLabel(new ImageIcon(giocoDiCarte.getRetro()));
		
		scoreLabel = new JLabel("punteggio");
		Dimension fixedSize = new Dimension(140, 20);
		scoreLabel.setPreferredSize(fixedSize);
		scoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		scoreLabel.setForeground(Color.black);
		
		pescaButton = new JButton("Avanti");
		pescaButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				pescaCarta(giocoDiCarte);
				
			}
		});
		
		panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel.add(pescaButton);
		
		panel.add(scoreLabel);
		panel.add(imageLabel);
		
		getContentPane().add(panel);
		
		panel.revalidate();
		panel.repaint();
	}
	
	private void pescaCarta(GiocoDiCarte gioco) {
		
		Image cartaPescata = gioco.daiCarta();
		if(primaCarta) {
			
			primaCarta = !primaCarta;
			imageLabel.setIcon(new ImageIcon(cartaPescata));
			
		} else {
			
			imageLabel = new JLabel(new ImageIcon(cartaPescata));
			panel.add(imageLabel);
			panel.revalidate();
			panel.repaint();
		}
		
		scoreLabel.setText(gioco.daiDescrizione());
		
	}
}
