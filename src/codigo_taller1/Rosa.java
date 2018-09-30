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
		//9
		app.beginShape();
			app.vertex(posX+(14.89f), posY-(9.26f));
			app.vertex(posX+(44.31f), posY-(9.26f));
			app.vertex(posX+(43.08f), posY-(5.33f));
			app.vertex(posX+(56.46f), posY-(2.39f));
			app.vertex(posX+(43.11f), posY-(23.3f));
			app.vertex(posX+(11.84f), posY-(16.03f));
		app.endShape(app.CLOSE);
		//11
		app.beginShape();
			app.vertex(posX+(24.68f), posY+(21.97f));
			app.vertex(posX+(26.98f), posY+(22.37f));
			app.vertex(posX+(23.24f), posY+(24.11f));
			app.vertex(posX+(26.04f), posY+(41.9f));
			app.vertex(posX+(44.31f), posY+(33.04f));
			app.vertex(posX+(44.71f), posY+(5.61f));
		app.endShape(app.CLOSE);
		//13
		app.beginShape();
			app.vertex(posX+(4.03f), posY+(33.04f));
			app.vertex(posX+(9.87f), posY+(30.32f));
			app.vertex(posX+(10.11f), posY+(37.07f));
			app.vertex(posX-(26.99f), posY+(41.9f));
			app.vertex(posX-(28.17f), posY+(22.35f));
			app.vertex(posX-(9.47f), posY+(23.41f));
		app.endShape(app.CLOSE);
		//2 //3
		app.fill(0,100,60);
		app.beginShape();
			app.vertex(posX+(12.79f), posY+(5.54f));
			app.vertex(posX+(14.91f), posY+(6.05f));
			app.vertex(posX + (23.17f), posY+(2.02f));
			app.vertex(posX+(34.47f), posY+(7.27f));
			app.vertex(posX+(2.32f), posY+(18.03f));
			app.vertex(posX+(1.95f), posY+(17.96f));
		app.endShape(app.CLOSE);
		//5 14 10
		app.beginShape();
			app.vertex(posX, posY);
			app.vertex(posX + (19.02f), posY+(4.04f));
			app.vertex(posX+(20.56f), posY+(3.29f));
			app.vertex(posX+(10.07f), posY-(19.94f));
			app.vertex(posX-(29.2f), posY-(2.61f));
			app.vertex(posX-(14.31f), posY+(1.9f));
			app.vertex(posX-(16.82f), posY+(2.12f));
			app.vertex(posX-(16.36f), posY+(14.78f));
			app.vertex(posX-(23.36f), posY+(13.5f));
			app.vertex(posX+(4.03f), posY+(33.04f));
			app.vertex(posX+(26.98f), posY+(22.37f));
			app.vertex(posX-(9.19f), posY+(16));
			app.vertex(posX-(4.73f), posY+(10.42f));
			app.vertex(posX-(9.36f), posY+(9.37f));	
		app.endShape(app.CLOSE);
		//8
		app.beginShape();
			app.vertex(posX+(39.67f), posY+(5.52f));
			app.vertex(posX+(48.38f), posY+(2.61f));
			app.vertex(posX+(44.71f), posY+(5.61f));
			app.vertex(posX+(44.5f), posY+(19.98f));
			app.vertex(posX+(67.31f), posY-(0.01f));
			app.vertex(posX+(43.08f), posY-(5.33f));
		app.endShape(app.CLOSE);
		
		//4
		app.fill(0,100,80);
		app.beginShape();
			app.vertex(posX+(20.56f), posY+(3.29f));
			app.vertex(posX + (23.17f), posY+(2.02f));
			app.vertex(posX+(34.47f), posY+(7.27f));
			app.vertex(posX+(39.67f), posY+(5.52f));
			app.vertex(posX+(44.31f), posY-(9.26f));
			app.vertex(posX+(14.89f), posY-(9.26f));
		app.endShape(app.CLOSE);
		//6
		app.triangle(posX+(2.32f), posY+(18.03f), posX+(24.68f), posY+(21.97f), posX+(48.38f), posY+(2.61f));
		//7
		app.quad(posX-(4.73f), posY+(10.42f),posX+(6.35f), posY+(12.92f), posX+(1.95f), posY+(17.96f),posX-(9.19f), posY+(16));
		//12
		app.beginShape();
			app.vertex(posX+(10.11f), posY+(37.07f));
			app.vertex(posX+(9.87f), posY+(30.32f));
			app.vertex(posX+(23.24f), posY+(24.11f));
			app.vertex(posX+(26.99f), posY+(47.94f));
			app.vertex(posX-(13.3f), posY+(40.11f));
		app.endShape(app.CLOSE);
		//15
		app.beginShape();
			app.vertex(posX-(14.31f), posY+(1.9f));
			app.vertex(posX-(16.82f), posY+(2.12f));
			app.vertex(posX-(16.36f), posY+(14.78f));
			app.vertex(posX-(23.36f), posY+(13.5f));
			app.vertex(posX-(9.47f), posY+(23.41f));
			app.vertex(posX-(25.43f), posY+(22.5f));
			app.vertex(posX-(31.72f), posY+(5.34f));
			app.vertex(posX-(21.8f), posY-(0.41f));
		app.endShape(app.CLOSE);
		
		//Hojitas
		app.fill(149,100,40);
		app.beginShape();
			app.vertex(posX+(10.07f), posY-(19.94f));
			app.vertex(posX+(11.84f), posY-(16.03f));
			app.vertex(posX+(26.79f), posY-(19.53f));
			app.vertex(posX+(4.84f), posY-(31.22f));
			app.vertex(posX-(23.36f), posY-(25.58f));
			app.vertex(posX-(23.04f), posY-(5.33f));
		app.endShape();
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
