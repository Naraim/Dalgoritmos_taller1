package codigo_taller1;

import processing.core.PApplet;

public class Reloj {
		private int posX;
		private int posY;
		private boolean mover;
		private float angulo1;
		private float angulo2;
		private PApplet app;
		
		public Reloj(PApplet app, int x, int y) {
			this.app = app;
			posX = x;
			posY = y;
			mover = false;
			angulo1 = PApplet.PI;
			angulo2 = PApplet.PI/2;
		}
		
		public void pintar() {
			
		}
		
		public void manecilla() {
			
		}
		
		public float getAng1() {
			
			return angulo1;
		}
		public float getAng2() {
			
			return angulo2;
		}
		
		public void setAng2(float ang) {
			
			angulo2 = ang;
		}
}
