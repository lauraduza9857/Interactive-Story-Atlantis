package Main;

import processing.core.PApplet;
import processing.core.PImage;

public class Submarinof {

	// variables
		PImage Submarinof;
		private int x, y;
		private PApplet app;
		
		
		public Submarinof(PApplet app, int x, int y) {
			
			this.app = app;
			this.x = x;
			this.y = y;
			Submarinof = app.loadImage("Submarinof.png");

		}

		public void show() {
		
			app.image(Submarinof, x, y);
			
		
		}
	
	
}
