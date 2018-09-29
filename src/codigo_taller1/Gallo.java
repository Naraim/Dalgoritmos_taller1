package codigo_taller1;

import processing.core.PApplet;

public class Gallo {
	
	private float x;
	private float y;
	private boolean mover;
	private PApplet app;
	
	public Gallo(PApplet app, float d, float e){
		
		x = d;
		y = e;
		this.app = app;
		
	}
	
	public void pintar() {
		
		//Métodos para pintar el gallo
		app.noStroke();
		
		
		//Amarillo1
		app.fill(39,74,80);
		app.quad(x, y, x+(87.34f), y+(16.42f), x+(42.74f), y+(65.01f), x-(26.1f), y+(48.59f));
		app.quad(x, y, x-(42.52f),y+(16.19f), x-(26.32f), y-(48.59f), x-(9.9f), y-(64.57f));
		
		//RojoClaro
		app.fill(0,100,60);
		app.triangle(x+(22.28f), y+(4.19f), x+(38.46f), y-(9.9f), x+(87.28f), y+(16.42f));
		app.triangle(x-(26.1f), y+(48.59f),  x+(42.74f), y+(65.01f), x+(20.47f), y+(79.18f));
		app.triangle(x-(26.32f), y-(48.59f),  x-(34.44f), y-(16.13f), x-(50.39f), y-(22.05f));
		app.triangle(x-(32.24f), y-(64.61f), x-(26.32f), y-(78.74f), x-(23.4f), y-(74.68f));
		app.quad(x-(26.26f), y-(64.64f), x-(16.18f), y-(64.6f), x-(8.37f), y-(71.45f), x-(4.05f), y-(90.89f));
		
		//RojoOscuro
		app.fill(0,100,40);
		app.triangle(x+(42.74f), y+(65.01f), x+(20.47f), y+(79.18f), x+(32.39f), y+(131.82f));
		app.quad(x-(32.24f), y-(64.61f),x-(26.26f), y-(64.64f), x-(16.86f), y-(75.75f), x-(14.18f), y-(84.81f));
		app.quad(x-(16.18f), y-(64.6f), x-(9.9f), y-(64.57f), x-(8.36f), y-(54.48f), x+(2.25f), y-(80.76f));
		
		//Amarillo2
		app.fill(29,66,60);
		app.triangle(x+(28.28f), y+(113.7f),  x+(32.39f), y+(131.82f), x+(5.98f), y+(131.82f));
		app.triangle(x+(34.29f), y+(119.56f),  x+(52.54f), y+(131.82f), x+(32.39f), y+(131.82f));
		app.triangle(x-(26.32f), y-(48.59f), x-(9.9f), y-(64.57f), x-(58.72f), y-(64.79f));
		app.triangle(x, y, x-(26.1f), y+(48.59f), x-(42.52f),y+(16.19f));
		
		//Azul
		app.fill(208,100,40);
		app.quad(x+(38.46f), y-(9.9f), x+(87.28f), y+(16.42f), x+(76.91f), y-(46.62f), x+(54.66f), y-(64.57f));
		app.triangle(x+(70.86f), y-(78.74f), x+(129.57f), y+(12.37f), x+(119.45f), y-(46.34f));
		app.triangle(x+(107.3f), y-(78.74f), x+(145.77f), y-(13.95f), x+(139.7f), y-(62.54f));
		
		//Verde
		app.fill(149,100,40);
		app.triangle(x+(54.66f), y-(64.57f), x+(107.39f), y-(22.05f), x+(70.86f), y-(78.74f));
		app.triangle(x+(70.86f), y-(78.74f), x+(131.18f), y-(38.52f), x+(107.3f), y-(78.74f));
		
		
	}
	
	public boolean mover(float mx, float my){
		if(mx >= x-59.23f && mx <= x+ 141.77f && my >= y-91.08f && my <= y+131.92f) {
			return true;
		}else{
			return false;
		}
		
	}
	
	public void desplazar(float mx, float my) {
		x = mx;
		y = my;
	}
	
	public boolean getMover() {
		return mover;
	}
	
	public void setMover(boolean l) {
		mover = l;
	}
	
	
}
