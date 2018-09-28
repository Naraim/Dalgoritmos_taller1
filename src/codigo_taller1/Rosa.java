package codigo_taller1;

import processing.core.PApplet;

public class Rosa extends Particula {

	public Rosa(PApplet app, int x, int y) {
		super(app, x, y);
		// TODO Auto-generated constructor stub
	}
	

	public void pintar() {
		// TODO Auto-generated method stub
		
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
