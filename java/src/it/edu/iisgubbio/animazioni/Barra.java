package it.edu.iisgubbio.animazioni;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.util.Duration;
import javafx.scene.control.Button;

public class Barra extends Application{
	Button bVia = new Button("via");
	GridPane griglia = new GridPane();
	TextField tSimbolo= new TextField();
	TextField tMillisecondi= new TextField();
	Label eRisultato = new Label();
	Label eSimbolo = new Label("simbolo");
	Label eMillisecondi = new Label("millisecondi");
	String parola=tSimbolo.getText();
	int n=0;
	  
	  
	  public void start(Stage primaryStage) throws Exception {
		    griglia.add(tSimbolo,  1,  0);
		    griglia.add(tMillisecondi, 1, 1);
		    griglia.add(bVia,  3,  0, 1, 2);
		    griglia.add(eSimbolo,  0, 0 );
		    griglia.add(eMillisecondi, 0, 1);
		    griglia.add(eRisultato, 0, 3, 4,1);
		    griglia.setHgap(5); 
			griglia.setVgap(5);
			griglia.setPadding(new Insets(10, 10, 10, 10));
			
			bVia.setMinHeight(52);
			bVia.setOnAction(e->vai()); 
			
			Scene scene = new Scene(griglia,300,110);
			    primaryStage.setTitle("Barra"); 
			    primaryStage.setScene(scene);
			    primaryStage.show(); 
	  }
	  
	private void vai(){
		int millisecondi=Integer.parseInt(tMillisecondi.getText());
		Timeline timeline = new Timeline(new KeyFrame(
				 Duration.millis(millisecondi),      
				 x -> aggiornaTimer()));
	    timeline.setCycleCount(50);
	    timeline.play();
		}
	private void aggiornaTimer(){
		String simbolo= tSimbolo.getText();
		parola=parola+simbolo;
		n=n+1;
		if(n<20) {
			
		}
		eRisultato.setText(parola);
		}
public static void main(String args[]){
    launch();
  }
}