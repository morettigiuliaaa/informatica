package it.edu.iisgubbio.geometria;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class Quadrato extends Application{
	Label lato= new Label("Lato");
	TextField testo= new TextField();
	Button area= new Button("Area");
	Label risultato= new Label();
	GridPane griglia= new GridPane();
	Button perimetro= new Button("Perimetro");
	Label risperimetro= new Label();
	int numero1, numero2;
	
	public void start (Stage finestra) {
		lato.setAlignment(Pos.CENTER);
		testo.setAlignment(Pos.CENTER);
		area.setAlignment(Pos.CENTER);
		perimetro.setAlignment(Pos.CENTER);
		risperimetro.setAlignment(Pos.CENTER);
		risultato.setAlignment(Pos.CENTER);
		testo.setPromptText("inserisci valore");
		lato.setMaxWidth(100);
		testo.setMaxWidth(100);
		area.setMaxWidth(100);
		risultato.setMaxWidth(100);
		griglia.add(lato, 0, 0);
		griglia.add(testo, 1, 0);
		griglia.add(area, 0, 1);
		griglia.add(perimetro, 0, 2);
		griglia.add(risperimetro,1, 2);
		griglia.add(risultato, 1, 1);
		griglia.setHgap(20); 
		griglia.setVgap(40);
		area.setOnAction(e -> calcolo());
		perimetro.setOnAction(e -> perimetro());
		griglia.setPadding(new Insets(10, 10, 10, 10));
		Scene scena = new Scene(griglia);
		finestra.setTitle("Quadrato");
	    finestra.setScene(scena);
	    finestra.show();
		
	}
	public void calcolo() {
		int dato, prodotto;
		   dato = Integer.parseInt(testo.getText());
		   prodotto = dato * dato;
		   String risposta = " "+ prodotto;
		   risultato.setText(risposta);
		}
	public void perimetro() {
		int perimetro, prodottoperimetro;
		   perimetro = Integer.parseInt(testo.getText());
		   prodottoperimetro = perimetro*4;
		   String rispostaperimetro = " "+ prodottoperimetro;
		   risperimetro.setText(rispostaperimetro);
		}

	public static void main(String[] args) {
	    launch(args);
	}
}
