package Main;

import processing.core.PApplet;
import processing.core.PImage;

public class Submarinon {
	
	
	// variables
			PImage Submarinon;
			private int x, y;
			private PApplet app;
			private boolean isMove;
			
			
			public Submarinon(PApplet app, int x, int y) {
				
				this.app = app;
				this.x = x;
				this.y = y;
				Submarinon = app.loadImage("Submarinon.png");
				this.isMove = false;

			}

			public void show() {
			
				app.image(Submarinon, x, y);
				
			
			}
			
			public void clicked() {
				this.isMove = true;
			}
			
			public void dragged() {
				if(this.isMove) {
					x = this.app.mouseX;
					y = this.app.mouseY;
				}
			}
			
			public void realised() {
				this.isMove = false;
			}

			public int getX() {
				return x;
			}

			public void setX(int x) {
				this.x = x;
			}

			public int getY() {
				return y;
			}

			public void setY(int y) {
				this.y = y;
			}

}
