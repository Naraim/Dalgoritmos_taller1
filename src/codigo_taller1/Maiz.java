package codigo_taller1;

import processing.core.PApplet;

public class Maiz extends Particula {

	public Maiz(PApplet app, float x, float y) {
		super(app, x, y);
		
	}

	
	public void pintar() {
		// TODO Auto-generated method stub
			//Pintar el grano de maiz
			app.stroke(39,74,80);
		
			
			
			//Amarillo1
			app.fill(39,74,80);
			app.triangle(posX, posY, posX-(8.18f), posY-(40.54f), posX+(40.54f), posY-(8.17f));
			app.arc(posX+(16.18f), posY-(24.36f), 58.48f, 58.48f, app.radians(213), app.radians(394));
			
			//Blanco
			app.fill(0,0,100);
			app.triangle(posX, posY, posX-(2.05f), posY-(10.13f), posX+(10.13f), posY-(2.04f));
	}


	@Override
	public boolean verificar(float mx, float my) {
		// TODO Auto-generated method stub
		if(app.dist(mx, my, posX+(16.18f), posY-(24.36f)) <= 29.24f) {
			return true;
		}
		return false;
	}
	
	
}
