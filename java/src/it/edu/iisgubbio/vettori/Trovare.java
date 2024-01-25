package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Trovare extends Application{
	Label uno = new Label();
	Label due = new Label();
	TextField unouno = new TextField();
	TextField duedue = new TextField();
	Label risposta = new Label();
	Button calcola = new Button();
	GridPane griglia = new GridPane();
	
	public void start(Stage finestra) throws Exception{
	      griglia.add(uno, 0, 0);
	      griglia.add(due, 0, 1);
	      griglia.add(unouno, 1, 1);
	      griglia.add(duedue, 0, 1);
	      griglia.add(risposta, 1, 2);
	      griglia.add(calcola, 0, 2);
	      griglia.setHgap(10); 
	      griglia.setVgap(20);
	      calcola.setOnAction(e->fine());
	      griglia.setPadding(new Insets(10, 10, 10, 10));
	      Scene scena = new Scene (griglia);
	      finestra.setTitle("Trovare");
	      finestra.setScene(scena);
	      finestra.show();
}
	public static void main(String[] args) {
		   launch(args);
	   }
	}
