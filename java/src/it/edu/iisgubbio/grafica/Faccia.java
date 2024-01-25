package it.edu.iisgubbio.grafica;

import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

public class Faccia extends Application {
	
	
	public void start (Stage finestra) { 
		Pane quadro= new Pane();
		
		Circle faccia= new Circle(250);
		faccia.setFill(Color.PINK);
		faccia.setCenterX(250);
		faccia.setCenterY(250);
		
		Circle oD= new Circle(50);
		oD.setFill(Color.BLACK);
		oD.setCenterX(150);
		oD.setCenterY(150);
		
		Circle oS= new Circle(50);
		oS.setFill(Color.BLACK);
		oS.setCenterX(350);
		oS.setCenterY(150);
		
		Line lD= new Line(250,300,250,350);
		lD.setStroke(Color.RED);
		lD.setStrokeWidth(9);
		
		Line lS= new Line(300,230,250,350);
		lS.setStroke(Color.RED);
		lS.setStrokeWidth(9);
		
		Scene scena = new Scene(quadro,500,500);
		quadro.getChildren().add(faccia);
		quadro.getChildren().add(oS);
		quadro.getChildren().add(oD);
		quadro.getChildren().add(lS);
		finestra.setTitle("Faccia!");
	    finestra.setScene(scena);
	    finestra.show();
		
}

 public static void main(String[] args) {
	launch(args);
   }
}