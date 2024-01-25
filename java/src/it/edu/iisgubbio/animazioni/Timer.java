package it.edu.iisgubbio.animazioni;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.control.Button;

public class Timer extends Application{    
  Button bStop= new Button("Stop");
  Button bStart= new Button("Start");
  Label testo = new Label("finestra timer");
  int n=100;
  GridPane griglia = new GridPane();
  Timeline timeline = new Timeline(new KeyFrame(
		  //		  
	      Duration.seconds(1), 
	      //millis o 0.ecc...	      
	      x -> aggiornaTimer()));
    
  public void start(Stage primaryStage) throws Exception {
    griglia.add(bStart,  0,  0);
    griglia.add(bStop,  2,  0);
    griglia.add(testo,  1,  1);
   
    bStart.setOnAction(e->aggiornaTimer());
    bStop.setOnAction(e->fermaTimer());
    //    
    timeline.setCycleCount(100);
    //aggiungo nella parentesi (Timeline.INDEFINITE) dura all'infinito
    
    Scene scene = new Scene(griglia,300,100);
    primaryStage.setTitle("Timer!"); 
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  private void aggiornaTimer(){
	  	 testo.setText(""+(n--));
		 timeline.play();
	  }
  
  private void fermaTimer(){
	  timeline.stop();
  }
    
  public static void main(String args[]){
    launch();
  }
}