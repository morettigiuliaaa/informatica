package it.edu.iisgubbio.basiJava;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.geometry.Insets;

public class Pulsanti extends Application {
	Button bCiao= new Button();
	Button bColonne= new Button();
	Button bA= new Button();
	Button bB= new Button();
	GridPane griglia= new GridPane();


    public void start (Stage finestra) {
	   bCiao.setText("Ciao");
	   bColonne.setText("2 Colonne");
	   bA.setText("A");
	   bB.setText("B");
	   griglia.add(bA, 1, 1);
	   griglia.add(bB, 2, 1);
	   griglia.add(bColonne, 1, 0, 2, 1);
	   griglia.add(bCiao, 0, 0, 1, 2);
	   griglia.setPadding(new Insets(10, 10, 10, 10));
	   griglia.setHgap(5); 
	   griglia.setVgap(5);
	   bCiao.setMaxHeight(200);
	   Scene scena = new Scene(griglia);
		finestra.setTitle("Span");
	    finestra.setScene(scena);
	    finestra.show();
	   
    }
    public static void main(String[] args) {
	    launch(args);
	}
}
	