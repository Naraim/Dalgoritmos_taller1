package codigo_taller1;

import java.util.Iterator;
import java.util.LinkedList;

import processing.core.PApplet;

public class Logica {
		
		private PApplet app;
		private String[] texto;
		private LinkedList<Particula> figuras;
		private Reloj relojito;
		private Gallo gallito;
		private Lluvia[] gotas;
		private boolean escribir;
		private String[] palabras;
		private boolean mover;
		
		public Logica(PApplet app) {
			
			this.app = app;
			texto = app.loadStrings("coronel.txt"); //Carga del archivo
			palabras = app.splitTokens(texto[0]);
			System.out.println(texto[0]);
			for (int i = 0; i < palabras.length; i++) {
				System.out.println(palabras[i]);
			}
			
			relojito = new Reloj(app, app.width/2, app.height/2);
			gallito = new Gallo(app, app.width/(1.276f), app.height/(6.301f));
			escribir = false;
			gotas = new Lluvia[50];
			figuras = new LinkedList<Particula>(); 
			mover = false;
		}
		
		public void pintar() {
			app.background(0, 100, 22);
			gallito.pintar();
			pintarFiguras();
			
			
			Iterator<Particula> it = figuras.iterator();
			while(it.hasNext()) {
				Particula p = it.next();
				p.pintar();
			}
			
			//Mientras se arrastra el gallo
			if(mover && gallito.mover(app.mouseX, app.mouseY)) {
				app.fill(0,0,100);
				app.textAlign(app.CORNER);
				app.textSize(20);
				app.text("¿Le vas a dar de comer?", 20, app.height - 30);
			}
			
			//Verificar posición del mouse en el lienzo
			app.fill(0,0,100);
			app.textSize(20);
			app.textAlign(app.CORNER);
			app.text("X:" + app.mouseX + " Y:" + app.mouseY, app.mouseX, app.mouseY - 5);
		}
		
		public void press() {
			
			if(gallito.mover(app.mouseX, app.mouseY) && !mover) {
				mover = true;
			}
		}
		
		public void drag() {
			
			//Mover el gallo
				if(mover && gallito.mover(app.mouseX, app.mouseY)) {
					gallito.desplazar(app.mouseX, app.mouseY);
				}
				
				
				//El gallo se come el maiz O.o
				Iterator<Particula> it = figuras.iterator();
				while(it.hasNext()) {
					Particula p = it.next();
					p.pintar();
					
					if(p instanceof Maiz) {
						if(gallito.mover(app.mouseX, app.mouseY) && p.verificar(app.mouseX, app.mouseY)) {
							it.remove();
						}
					}
				}
		}
		
		public void release() {
				mover = false;
		}
		
		public void tecla(char c) {
			
			//Añadir figuras
			if(c == 'm' || c == 'M') {
				figuras.add(new Maiz(app, app.random(app.width/2, app.width-40), app.random(app.height/2,app.height - 40)));
			}
		}
		
		public void pintarFiguras() {
			
			//Maiz en pantalla
				//Pintar el grano de maiz
			
				float posX = app.width/(1.10f);
				float posY = app.height/(1.06f);
				app.stroke(39,74,80);
				//Amarillo1
				app.fill(39,74,80);
				app.triangle(posX, posY, posX-(8.18f), posY-(40.54f), posX+(40.54f), posY-(8.17f));
				app.arc(posX+(16.18f), posY-(24.36f), 58.48f, 58.48f, app.radians(213), app.radians(394));	
				//Blanco
				app.fill(0,0,100);
				app.triangle(posX, posY, posX-(2.05f), posY-(10.13f), posX+(10.13f), posY-(2.04f));
				//Texto
				app.fill(0, 100, 22);
				app.textSize(20);
				app.textAlign(app.CENTER);
				app.text('m', posX+(16.18f), posY-(24.36f));
		}
		
		
}
