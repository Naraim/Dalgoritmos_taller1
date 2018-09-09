package codigo_taller1;

import processing.core.PApplet;

public class Lluvia {
	
	private int x;
	private int y;
	private PApplet app;
	
	
	public Lluvia(PApplet app) {
		this.app = app;
		x = (int)app.random(app.width);
		y = 0;
	}
	
	public void pintar() {
		
		
	}

}
