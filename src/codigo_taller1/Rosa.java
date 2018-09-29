package codigo_taller1;

import processing.core.PApplet;

public class Rosa extends Particula {

	public Rosa(PApplet app, float x, float y) {
		super(app, x, y);
		// TODO Auto-generated constructor stub
	}
	

	public void pintar() {
		// Pintar una rosa
		
		app.fill(0,100,40);
		app.noStroke();
		//1
		app.beginShape();
			app.vertex(posX, posY);
			app.vertex(posX + (19.02f), posY+(4.04f));
			app.vertex(posX+(14.91f), posY+(6.05f));
			app.vertex(posX+(12.79f), posY+(5.54f));
			app.vertex(posX+(6.35f), posY+(12.92f));
			app.vertex(posX-(9.36f), posY+(9.37f));
		app.endShape(app.CLOSE);
		
	}


	public void mover() {
		// TODO Auto-generated method stub
		
	}
	
	public float getX() {
		return posX;
	}
	
	public void setX(int x) {
		posX = x;
	}
	
	public float getY() {
		return posY;
	}
	
	public void setY(int y) {
		posY = y;
	}


	@Override
	public boolean verificar(float mx, float my) {
		// TODO Auto-generated method stub
		return false;
	}

}
