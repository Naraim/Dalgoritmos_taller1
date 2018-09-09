package codigo_taller1;

import processing.core.PApplet;

public class Main extends PApplet {
	
	private Logica log;

	public static void main(String[] args) {
		PApplet.main("codigo_taller1.Main");

	}
	
	public void settings() {
		size(600,600); 
	}
	
	public void setup() {
		
		log = new Logica(this);
		
	}
	
	public void draw() {
		
		log.pintar();
		
	}
	
	
	public void mousePressed() {
		
		
	}
	
	public void keyPressed() {
		
		
	}
	
	public void mouseReleased() {
		
	}
	
	public void mouseDragged() {
		
	}

}
