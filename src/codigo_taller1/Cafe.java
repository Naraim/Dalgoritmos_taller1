package codigo_taller1;

import processing.core.PApplet;

public class Cafe extends Particula {

	public Cafe(PApplet app, float x, float y) {
		super(app, x, y);
		// TODO Auto-generated constructor stub
		
	}
	

	public void pintar() {
		// TODO Auto-generated method stub
		//Pintar grano de café
		app.stroke(1,100,16);
		app.strokeWeight(5);
		app.fill(29,100,40);
		app.ellipseMode(app.CORNER);
		app.ellipse(posX, posY, 76.03f, 45.43f);
		app.line(posX, posY + (22.71f), posX + 76.03f, posY + (22.71f));
		
	}

	@Override
	public boolean verificar(float mx, float my) {
		if(app.dist(mx, my, posX + 38.01f, posY + 22.71f) <= 37.29f) {
			return true;
		}else {
			return false;
		}
		
	}

}
