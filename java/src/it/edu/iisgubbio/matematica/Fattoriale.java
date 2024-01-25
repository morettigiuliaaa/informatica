package it.edu.iisgubbio.matematica;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Fattoriale extends Application {
	Label risposta = new Label();
	Button calcola = new Button ("!");
	TextField numero = new TextField();
	GridPane griglia= new GridPane();
	
	public void start(Stage finestra) {
		numero.setAlignment(Pos.CENTER);
		calcola.setAlignment(Pos.CENTER);
		risposta.setAlignment(Pos.CENTER);
		griglia.setId("griglia");
		griglia.add(numero, 0, 0);
		griglia.add(calcola, 1, 0);
		griglia.add(risposta, 2,0);
		calcola.setId("bottone");
		calcola.setOnAction(e->esegui());
		Scene scena = new Scene(griglia);
		finestra.setTitle("Fattoriale!");
		scena.getStylesheets().add("it/edu/iisgubbio/matematica/Fattoriale.css");
	    finestra.setScene(scena);
	    finestra.show();
	}
	public void esegui() {
		int n=Integer.parseInt(numero.getText());
		int totale=1;
		for(int molt=1;molt<=n;molt++) {
			totale=totale*molt;
		}
		risposta.setText(""+totale);
	}
	public static void main(String[] args) {
		launch(args);
	   }
}

