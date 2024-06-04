package it.edu.iisgubbio.animazioni;
import javafx.animation.KeyFrame;
import javafx.animation.Animation;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PallinaRimbalzo extends Application{
	Double x=10.0;
	Double y=150.0;
	Double nRandomX;
	Double nRandomY;
	Boolean avanti=true;
	Boolean sopra=true;
	GridPane griglia = new GridPane();
	Pane pane = new Pane();
	  Timeline timeline = new Timeline(new KeyFrame(
		      Duration.millis(3),      
		      x -> aggiornaTimer()));
	  Circle pallino= new Circle(10);
	  
	  public void start(Stage primaryStage) throws Exception {
		    griglia.add(pane,  0,  1);
			pallino.setFill(Color.BLACK);
			pallino.setCenterY(150); 
			pallino.setCenterX(10);
			pane.getChildren().add(pallino);
		  
		    timeline.setCycleCount(Animation.INDEFINITE);
		    timeline.play();
		    
		    Scene scene = new Scene(griglia,400,300);
		    primaryStage.setTitle("AvantiEdIndietro!"); 
		    primaryStage.setScene(scene);
		    primaryStage.show();
	  }
	  
	  public void aggiornaTimer() {
		  if (x==400) {
			  avanti=false;
		  }
		  
		  if (x==0) {
			  avanti=true;
		  }
		  
		  if(y==0) {
			  sopra=false;
		  }
		  if(y==300) {
			  sopra=true;
		  }
		  
		  if(avanti) {
			  pallino.setCenterX(x++);
		  } else {
			  pallino.setCenterX(x--);
		  }
		  
		  if(sopra) {
			  pallino.setCenterY(y--);
		  } else {
			  pallino.setCenterY(y++);
		  }
		  
	  }
public static void main(String args[]){
    launch();
  }
}