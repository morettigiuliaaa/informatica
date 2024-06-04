package it.edu.iisgubbio.grafica;

import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class Pallini extends Application {
	
	
	public void start (Stage finestra) { 
		Pane quadro= new Pane();
		for(int numero=20;numero<=100; numero=numero+20) {
			for(int x=20;x<=100; x=x+20) {
				Circle pallino= new Circle(8);
				pallino.setFill(Color.BLACK);
				pallino.setCenterX(x);
				pallino.setCenterY(numero);
				quadro.getChildren().add(pallino);
				}
			}
		
		Scene scena = new Scene(quadro,200,200);
		finestra.setTitle("Pallini!");
	    finestra.setScene(scena);
	    finestra.show();
		
}

 public static void main(String[] args) {
	launch(args);
   }
}