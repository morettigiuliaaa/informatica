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
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Avanti extends Application{
	int x=10;
	int y=10;
	Button via = new Button("via!");
	GridPane griglia = new GridPane();
	Button ferma = new Button("STOP!");
	Pane pane = new Pane();
	Label testo = new Label("finestra timer");
	  Timeline timeline = new Timeline(new KeyFrame(
		      Duration.millis(10),      
		      x -> aggiornaTimer()));
	  Circle pallino= new Circle(8);
	  
	  public void start(Stage primaryStage) throws Exception {
		    griglia.add(via,  0,  0);
		    griglia.add(pane,  0,  1);
		    griglia.add(ferma, 1, 0);
			pallino.setFill(Color.BLACK);
			pallino.setCenterY(10);
			pallino.setCenterX(10);
			pane.getChildren().add(pallino);
		  
		    via.setOnAction(e->aggiornaTimer()); 
		    ferma.setOnAction(e->stopTimer());
		    timeline.setCycleCount(Animation.INDEFINITE);
		    
		    Scene scene = new Scene(griglia,300,110);
		    primaryStage.setTitle("Timer!"); 
		    primaryStage.setScene(scene);
		    primaryStage.show();
		  }
	  private void aggiornaTimer(){
		  pallino.setCenterY(y);
		  pallino.setCenterX(x++);
		  timeline.play();
		  if(x>300) {
			  x=10;
			  y=y+20;
		  }
	  }
	  private void stopTimer(){
		  timeline.stop();
	  }
	  
public static void main(String args[]){
    launch();
  }
}