package codigo_taller1;

import processing.core.PApplet;

public class Lluvia {
	
	private float x;
	private float y;
	private float vel;
	private boolean llenar;
	private PApplet app;
	
	
	public Lluvia(PApplet app) {
		this.app = app;
		x = app.random(app.width/(3.1f), app.width/(3.29f) + 50);
		y = app.random(-1000, 20);
		vel = app.random(2, 5);;
		llenar = false;
	}
	
	public void pintar() {
		
		
		app.fill(179,100,60);
		app.stroke(179,100,60);
		app.strokeWeight(1);
		app.ellipseMode(app.CENTER);
		app.triangle(x, y, x-(12.25f), y+(35.07f), x+(12.25f), y+(35.07f));
		app.arc(x, y+(35.07f), 24.495f, 24.495f, app.radians(0), app.radians(180));

	
		if(llenar) {
			if(y > 100) {
				y = 20;
				vel = app.random(2, 5);
			}
		}else {
			if(y > app.height) {
				y = 20;
				vel = app.random(2, 5);
			}
		}
		
//		if(llenar && y > app.height - 60){
//			
//		}else if(y > app.height) {
//			y = 20;
//			vel = app.random(2, 5);
//		}
	}
	
	public void caer() {
		y += vel;
		vel += 0.01;
	}
	
	public void setLlenar(boolean l) {
		llenar = l;
	}
	
	public boolean validar(float mx, float my) {
		if(mx >= x-(12.25f) && mx <= x+(12.25f) && my >= y && my <= y+(47.5f)) {
			return true;
		}else {
			return false;
		}
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}
}
