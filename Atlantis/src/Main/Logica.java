package Main;


import processing.core.PApplet;
import processing.core.PImage;

public class Logica {

	// Variables
	PImage Inicio;
	PImage Pag2;
	PImage Pag3;
	PImage Pag4;
	PImage Pag5;
	PImage Interaccion;
	PImage Final;
	private PApplet app;
	private Personaje Milo;
	private Submarinof subof;
	private Submarinon subon;
	private int pantalla;
	private boolean isSub;
	private boolean isMove;
	private String [] saveTXT;

	public Logica(PApplet app) {
		this.app = app;
		// TODO Auto-generated constructor stub
		pantalla = 5;
		Milo = new Personaje(app, 570, 310);
		Inicio = app.loadImage("Inicio.png");
		Pag2 = app.loadImage("Pag2.png");
		Pag3 = app.loadImage("Pag3.png");
		Pag4 = app.loadImage("Pag4.png");
		Pag5 = app.loadImage("Pag5.png");
		Interaccion = app.loadImage("Interaccion.png");
		Final = app.loadImage("Final.png");
		
		subon = new Submarinon(app, 150, 100);
		subof = new Submarinof(app, 150, 100);
		isSub = false;
		isMove = false;
		
		saveTXT = app.loadStrings("./data/Atlantistory");
		System.out.println(saveTXT[0]);
	}

	public void show() {

		switch (pantalla) {
		case 0:
		
			app.image(Inicio, 497, 280);
			
			
			break;

		case 1:
			
			app.image(Pag2, 497, 280);
			
			break;

			
		case 2:
			
			app.image(Pag3, 497, 280);
			
			break;
			
		case 3:
			
			app.image(Pag4, 497, 280);

			break;
			
			
        case 4:
			
			app.image(Pag5, 497, 280);

			break;
			
			
        case 5:
			
        	
			app.image(Interaccion, 497, 280);
			
			if(isSub) {
				subon.show();
			} else {
				subof.show();
			}
			if(isMove) {
				Milo.show();
			}
			
			
			break;
			
			
        case 6:
			
			app.image(Final, 497, 280);
			
			

			break;

		}
	}


	public void mouseR() {
		
		switch (pantalla) {
		case 0:

			if (app.mouseX > 380 && app.mouseX < 610 && app.mouseY > 350 && app.mouseY < 450) {
				pantalla = 1;
				
			}
			
			break;
			
		case 1:
			if (app.mouseX > 780 && app.mouseX < 860 && app.mouseY > 450 && app.mouseY < 530) {
				pantalla = 2;
				
			}
			break;
			
		case 2:
			if (app.mouseX > 770 && app.mouseX < 830 && app.mouseY > 450 && app.mouseY < 530) {
				pantalla = 1;
				
			}
			if (app.mouseX > 860 && app.mouseX < 930 && app.mouseY > 450 && app.mouseY < 530) {
				pantalla = 3;
				
			}

			break;
			
		case 3:
			if (app.mouseX > 770 && app.mouseX < 830 && app.mouseY > 450 && app.mouseY < 530) {
				pantalla = 2;
				
			}
			if (app.mouseX > 860 && app.mouseX < 930 && app.mouseY > 450 && app.mouseY < 530) {
				pantalla = 4;
				
			}


			break;
			
		case 4:
			if (app.mouseX > 770 && app.mouseX < 830 && app.mouseY > 450 && app.mouseY < 530) {
				pantalla = 3;
				
			}
			if (app.mouseX > 860 && app.mouseX < 930 && app.mouseY > 450 && app.mouseY < 530) {
				pantalla = 5;
				
			}

			break;
			
		case 5:
			if (app.mouseX > 150 && app.mouseX < 300 && app.mouseY > 100 && app.mouseY < 200) {
				isSub = true;
				
			}
			 
			if(isSub && app.mouseX > subon.getX() && app.mouseX < subon.getX()+150 && app.mouseY > subon.getY() && app.mouseY < subon.getY()+100  ) {
				subon.clicked();
			}
			
			if(subon.getX()>400 && subon.getY()>220) {
				isMove = true;
			}
			
			if(isMove && app.mouseX > Milo.getX() && app.mouseX < Milo.getX()+150 && app.mouseY > Milo.getY() && app.mouseY < Milo.getY()+100  ) {
				Milo.clicked();
			}
			if(Milo.getX()>890 && Milo.getY()>430) {
				pantalla = 6;
				
				String [] newTXT = saveTXT;
				this.app.saveStrings("./newTXT.txt", newTXT);
			}

			break;
			
		case 6:
			

			break;

		default:
			break;
		}
	}
	
	public void mouseD() {
		switch (pantalla) {
		case 5:
			subon.dragged();
			Milo.dragged();
			break;

		default:
			break;
		}
	}
	
	public void mouseDrop() {
		switch (pantalla) {
		case 5:
			subon.realised();
			Milo.realised();
			
			
			System.out.println(Milo.getX() + " " + Milo.getY());
			break;

		default:
			break;
		}
	}

	
}
