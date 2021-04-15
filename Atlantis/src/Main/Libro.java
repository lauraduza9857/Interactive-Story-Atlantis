package Main;

import processing.core.PApplet;
import processing.core.PImage;

public class Libro {

	// variables
				PImage Libro;
				private int x, y;
				private PApplet app;
				
				
				public Libro(PApplet app, int x, int y) {
					
					this.app = app;
					this.x = x;
					this.y = y;
					Libro = app.loadImage("Libro.png");

				}

				public void show() {
				
					app.image(Libro, x, y);
					
				
				}
	
	
}
