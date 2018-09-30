package codigo_taller1;

public class Cuenco {
	
	private Main app;
	private float posx, posy;
	private boolean llenar;
	private boolean mover;

	public Cuenco(Main app, float mx, float my) {
		// TODO Auto-generated constructor stub
		this.app = app;
		posx = mx;
		posy = my;
		llenar = false;
		mover = false;
		
	}

	public void pintar() {

		if(!llenar) {
			//Pintar el cuenco vacío
			app.fill(29,100,40);
			app.noStroke();
			app.ellipseMode(app.CENTER);
			app.arc(posx, posy, 134.62f, 126, app.radians(0), app.radians(180));
			app.fill(1,100,16);
			app.ellipse(posx, posy, 134.62f, 36);
		}else {
			//Pintarlo lleno
			app.fill(29,100,40);
			app.noStroke();
			app.ellipseMode(app.CENTER);
			app.arc(posx, posy, 134.62f, 126, app.radians(0), app.radians(180));
			app.fill(1,100,16);
			app.ellipse(posx, posy, 134.62f, 36);
			app.fill(179,100,60);
			app.arc(posx, posy, 134.62f, 36, app.radians(0), app.radians(180));
		}
	}
	
	public boolean verificar(float mx, float my) {
		if(mx >= posx-(67.31f) && mx <= posx+(67.31f) && my >= posy-18 && my <= posy+63) {
			return true;
		}else {
			return false;
		}
	}
	
	public void mover(float mx) {
		posx = mx;
	}
	
	public void setLlenar(boolean l) {
		llenar = l;
	}
	
	public boolean getLlenar() {
		return llenar;
	}
	
	public boolean getMover() {
		return mover;
	}
	
	public void setMover(boolean l) {
		mover = l;
	}
	
	public float getPosx() {
		return posx;
	}
	
	public float getPosy() {
		return posy;
	}
}
