package codigo_taller1;

import processing.core.PApplet;

public class Cafe extends Particula {

	public Cafe(PApplet app, int x, int y) {
		super(app, x, y);
		// TODO Auto-generated constructor stub
		
	}
	

	public void pintar() {
		// TODO Auto-generated method stub
		//Pintar grano de café
		app.stroke(1,100,16);
		app.strokeWeight(10);
		app.ellipse(posX, posY, 76.03f, 45.43f);
		
	}

	public void mover() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean verificar(float mx, float my) {
		// TODO Auto-generated method stub
		return false;
	}

}
