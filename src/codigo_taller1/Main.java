package codigo_taller1;

import processing.core.PApplet;

public class Main extends PApplet {
	
	private Logica log;
	
	public static void main(String[] args) {
		PApplet.main("codigo_taller1.Main");
	}
	
	public void settings() {
		size(1200,700); 
		//fullScreen();
	}
	
	public void setup() {
		log = new Logica(this);
		colorMode(HSB, 360, 100, 100);
		
	}
	
	public void draw() {
		log.pintar();
	}
	
	public void mousePressed() {
		log.press();
	}
	
	public void keyPressed() {
		log.tecla(key);
	}
	
	public void mouseReleased() {
		log.release();
	}
	
	public void mouseDragged() {
		log.drag();
	}

}
