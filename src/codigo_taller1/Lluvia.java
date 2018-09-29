package codigo_taller1;

import processing.core.PApplet;

public class Lluvia {
	
	private float x;
	private float y;
	private float vel;
	private float val;
	private boolean llenar;
	private PApplet app;
	
	
	public Lluvia(PApplet app) {
		this.app = app;
		x = app.random(app.width/(3.1f), app.width/(3.1f) + 50);
		y = 20;
		vel = app.random(2, 5);
		val = vel + 0.2f;
		llenar = false;
	}
	
	public void pintar() {
		
		app.fill(1,100,16);
		app.noStroke();
		app.rect(app.width/(3.1f), 0, 50, 70);
		app.fill(179,100,60);
		app.stroke(179,100,60);
		app.strokeWeight(1);
		app.ellipseMode(app.CENTER);
		app.triangle(x, y, x-(12.25f), y+(35.07f), x+(12.25f), y+(35.07f));
		app.arc(x, y+(35.07f), 24.495f, 24.495f, app.radians(0), app.radians(180));

	
		if(llenar) {
			if(y > app.height/(1.23f)) {
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
		vel = val;
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
	

}
