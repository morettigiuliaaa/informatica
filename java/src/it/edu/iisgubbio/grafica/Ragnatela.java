package it.edu.iisgubbio.grafica;

import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class Ragnatela extends Application {
	
	
	public void start (Stage finestra) { 
		Pane quadro= new Pane();
		for(int y=0,x=0,y2=0,x2=0;y<=200&&x<=200&&y2<=200&&x2<=200;y=y+20,x=x+20,y2=y2-20,x2=x2-20) {
			Line linea = new Line(0,0+y,200-x,0);
			linea.setFill(Color.BLACK);
			quadro.getChildren().add(linea);
			Line linea2 = new Line(0,200-y,0+x2,0);
			linea2.setFill(Color.BLACK);
			quadro.getChildren().add(linea2);
			}
		
		Scene scena = new Scene(quadro,200,200);
		finestra.setTitle("Ragnatela!");
	    finestra.setScene(scena);
	    finestra.show();
		
}

 public static void main(String[] args) {
	launch(args);
   }
}