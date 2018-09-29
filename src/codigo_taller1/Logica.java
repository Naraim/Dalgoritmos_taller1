package codigo_taller1;

import java.util.Iterator;
import java.util.LinkedList;

public class Logica {
		
		private Main app;
		private String[] texto;
		private String[] palabras;
		private LinkedList<Particula> figuras;
		private Reloj relojito;
		private Gallo gallito;
		private Lluvia[] gotas;
		private Cuenco cuenco;
		private boolean caerAgua;
		private boolean mover;
		private boolean escribir;
		
	
		
		public Logica(Main app) {
			
			this.app = app;
			texto = app.loadStrings("coronel.txt"); //Carga del archivo
			palabras = app.splitTokens(texto[0], " ");
			System.out.println(texto[0]);
			for (int i = 0; i < palabras.length; i++) {
				System.out.println(palabras[i]);
			}

			//Añadir gotas de lluvia
			if(palabras[173].contains("agua")) {
				gotas = new Lluvia[30];
			}
			
			for (int i = 0; i < gotas.length; i++) {
				gotas[i] = new Lluvia(app);
			}
			
			//Añadir relojito
			if(palabras[76].contains("reloj")) {
				relojito = new Reloj(app, app.width/2, app.height/2);
			}
			
			
			//Añadir gallo
			if (palabras[48].contains("gallo")) {
				gallito = new Gallo(app, app.width/(1.276f), app.height/(6.301f));
			}
			
			
			cuenco = new Cuenco(app, app.width/(1.20f), app.height/(1.19f));
			escribir = false;
			caerAgua = true;
			figuras = new LinkedList<Particula>(); 
			mover = false;
		}
		
		public void pintar() {
			app.background(0, 100, 22);
			pintarFiguras();
			
			//Pintar el gallo
				gallito.pintar();
			
			
			
			//Pintar el cuenco
			cuenco.pintar();
			
			for (int i = 0; i < gotas.length; i++) {
				if(caerAgua) {
					gotas[i].pintar();
					gotas[i].caer();
				}
			}

			Iterator<Particula> it = figuras.iterator();
			while(it.hasNext()) {
				Particula p = it.next();
				p.pintar();
				
				//El gallo no come café
				if(p instanceof Cafe) {
					if(mover && gallito.mover(app.mouseX, app.mouseY) && p.verificar(app.mouseX, app.mouseY)) {
						app.fill(0,0,100);
						app.textAlign(app.CORNER);
						app.textSize(20);
						app.text("El no come café", 20, app.height - 60);
					}
				}
			}
			//Mientras se arrastra el gallo
			if(mover && gallito.mover(app.mouseX, app.mouseY)) {
				app.fill(0,0,100);
				app.textAlign(app.CORNER);
				app.textSize(20);
				app.text("¿Le vas a dar de comer? Dale maiz", 20, app.height - 30);
			}
			
			if(caerAgua) {
				app.fill(0,0,100);
				app.textAlign(app.CORNER);
				app.textSize(20);
				app.text("Click derecho para la lluvia", app.width/(2.58f), 30);
			}
			
			if(cuenco.verificar(app.mouseX, app.mouseY) && mover) {
				app.fill(0,0,100);
				app.textAlign(app.CORNER);
				app.textSize(20);
				app.text("Ve a llenarlo", app.mouseX - 50, app.mouseY + 70);
			}
			
	
			//Verificar posición del mouse en el lienzo
			app.fill(0,0,100);
			app.textSize(20);
			app.textAlign(app.CORNER);
			app.text("X:" + app.mouseX + " Y:" + app.mouseY, app.mouseX, app.mouseY - 5);
		}
		
		public void press() {
			
			//Seleccionar el gallo
			if(gallito.mover(app.mouseX, app.mouseY) && !mover && !gallito.getMover()) {
				mover = true;
				gallito.setMover(true);
			}
			//Seleccionar el cuenco
			if(cuenco.verificar(app.mouseX, app.mouseY) && !mover && !cuenco.getMover()) {
				mover = true;
				cuenco.setMover(true);
			}
			//CIERRA LA LLAVE
			if(app.mouseButton == app.RIGHT) {
				caerAgua = !caerAgua;
			}
		
		}
		
		public void drag() {
			
			//Mover el gallo
				if(mover && gallito.mover(app.mouseX, app.mouseY) && gallito.getMover()) {
					gallito.desplazar(app.mouseX, app.mouseY);
				}
			//Mover el cuenco
				if(mover && cuenco.verificar(app.mouseX, app.mouseY) && cuenco.getMover()) {
					cuenco.mover(app.mouseX);	
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
			if(mover && gallito.mover(app.mouseX, app.mouseY)) {
				mover = false;
				gallito.setMover(false);
			}
			if(mover && cuenco.verificar(app.mouseX, app.mouseY)) {
				mover = false;
				cuenco.setMover(false);
			}
		}
		
		public void tecla(char c) {
			
			//Añadir figuras
			if(c == 'm' || c == 'M') {
				figuras.add(new Maiz(app, app.random(app.width/2, app.width-40), app.random(app.height/2,app.height - 40)));
			}
			
			if(c == 'c' || c == 'C') {
				figuras.add(new Cafe(app, app.random(10, app.width/4), app.random(40,app.height/2)));
			}
			
			if(c == 'r' || c == 'R') {
				figuras.add(new Rosa(app, app.random(10, app.width/4), app.random(40,app.height/2)));
			}
		}
		
		public void pintarFiguras() {
			
			//Maiz en pantalla
				float posX = app.width/(1.07f);
				float posY = app.height/(1.06f);
				app.stroke(39,74,80);
				app.strokeWeight(1);
				app.ellipseMode(app.CENTER);
				//Amarillo1
				app.fill(39,74,80);
				app.triangle(posX, posY, posX-(8.18f), posY-(40.54f), posX+(40.54f), posY-(8.17f));
				app.arc(posX+(16.18f), posY-(24.36f), 58.48f, 58.48f, app.radians(213), app.radians(394));	
				//Blanco
				app.fill(0,0,100);
				app.triangle(posX, posY, posX-(2.05f), posY-(10.13f), posX+(10.13f), posY-(2.04f));
				//Texto
				app.fill(0, 100, 22);
				app.textSize(30);
				app.textAlign(app.CENTER);
				app.text('m', posX+(16.18f), posY-(20f));
				
			//Pintar café en pantalla
				float posx = app.width/(13.23f);
				float posy = app.height/(9.62f);
				app.stroke(1,100,16);
				app.strokeWeight(5);
				app.fill(29,100,40);
				app.ellipse(posx, posy, 76.03f, 45.43f);
				//Texto
				app.fill(0, 100, 22);
				app.textSize(30);
				app.textAlign(app.CENTER);
				app.text('c', posx, posy + 5);
		}
		
		
}
