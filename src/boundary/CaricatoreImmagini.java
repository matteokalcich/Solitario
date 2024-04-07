package boundary;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.imageio.ImageIO;

import gioco.Config;


public class CaricatoreImmagini {
	
	public List<Image> caricaImmagini(){
		
		List<Image> immagini = new ArrayList<>();
		
		String percorsoCarte = Config.get().getDeckPath();
		
		File cartella = new File(percorsoCarte);
		
		if(!cartella.exists() || !cartella.isDirectory()) {
			
			return null;
		}
		
		File[] files = cartella.listFiles();
		
		if(files == null) {
			
			return null;
		}
		
		Arrays.sort(files);
		
		for(File file : files) {
			
			if(file.isFile() && file.getName().toLowerCase().endsWith(".png"));
			
			try {
				
				BufferedImage img = ImageIO.read(file);
				Image image = img.getScaledInstance(100, 160, BufferedImage.SCALE_SMOOTH);
				immagini.add(image);
				
			} catch(IOException e) {
				
				e.printStackTrace();
			}
		}
		
		return immagini;
	}

}
