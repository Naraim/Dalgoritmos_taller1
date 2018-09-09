package codigo_taller1;

import processing.core.PApplet;

public abstract class Particula {
	
	protected int posX;
	protected int posY;
	protected boolean mover;
	protected PApplet app;
	
	public Particula(PApplet app, int x, int y) {
		this.app = app;
		posX = x;
		posY = y;
		mover = false;
	}
	
	public abstract void pintar();
	
	public abstract void mover();

}
