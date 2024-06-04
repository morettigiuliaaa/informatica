package it.edu.iisgubbio.animazioni;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class AvantiEdIndietro extends Application{
	int x=10;
	int y=10;
	Boolean avanti=true;
	GridPane griglia = new GridPane();
	Pane pane = new Pane();
	Label testo = new Label("finestra timer");
	  Timeline timeline = new Timeline(new KeyFrame(
		      Duration.millis(5),      
		      x -> aggiornaTimer()));
	  Circle pallino= new Circle(8);
	  
	  public void start(Stage primaryStage) throws Exception {
		    griglia.add(pane,  0,  1);
			pallino.setFill(Color.BLACK);
			pallino.setCenterY(10); 
			pallino.setCenterX(10);
			pallino.setCenterX(x++);
			pane.getChildren().add(pallino);
		  
		    timeline.setCycleCount(Animation.INDEFINITE);
		    timeline.play();
		    
		    Scene scene = new Scene(griglia,300,200);
		    primaryStage.setTitle("AvantiEdIndietro!"); 
		    primaryStage.setScene(scene);
		    primaryStage.show();
		  }
	  private void aggiornaTimer(){
		  
		  if(x==300) {
			  avanti=false;
		  } else if(x==10){
			  avanti=true;
		  }
		  
		  if(avanti) {
			  pallino.setCenterX(x++);
		  } else {
			  pallino.setCenterX(x--);
		  }
	  }
	  
public static void main(String args[]){
    launch();
  }
}