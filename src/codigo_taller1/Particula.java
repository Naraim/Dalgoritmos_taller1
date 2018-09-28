package codigo_taller1;

import processing.core.PApplet;

public abstract class Particula {
	
	protected float posX;
	protected float posY;
	protected boolean mover;
	protected PApplet app;
	
	public Particula(PApplet app, float x, float y) {
		this.app = app;
		posX = x;
		posY = y;
		mover = false;
	}
	
	public abstract void pintar();
	
	public abstract boolean verificar(float mx, float my);
	
	

}
