package it.edu.iisgubbio.tpsit;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class TPSIT extends Application{
	Label lato= new Label("Raggio");
	TextField testo= new TextField();
	Button area= new Button("Area");
	Label risultato= new Label();
	GridPane griglia= new GridPane();
	Button circonferenza= new Button("Circonferenza");
	Label risultatoCir= new Label();
	Label risultatoCir2= new Label();
	Label progettatore= new Label("Giulia Moretti, Giacomo lillacci, Fabio casagrande");
	
	public void start (Stage finestra) {
		lato.setAlignment(Pos.CENTER);
		testo.setAlignment(Pos.CENTER);
		area.setAlignment(Pos.CENTER);
		risultato.setAlignment(Pos.CENTER);
		circonferenza.setAlignment(Pos.CENTER);
		risultatoCir.setAlignment(Pos.CENTER);
		risultatoCir2.setAlignment(Pos.CENTER);
		testo.setPromptText("inserisci valore");
		lato.setMaxWidth(100);
		testo.setMaxWidth(100);
		area.setMaxWidth(100);
		risultato.setMaxWidth(100);
		griglia.add(lato, 0, 0);
		griglia.add(testo, 1, 0);
		griglia.add(area, 0, 1);
		griglia.add(risultato, 1, 1);
		griglia.add(circonferenza, 0, 2);
		griglia.add(risultatoCir, 1, 2);
		griglia.add(risultatoCir2, 1, 2);
		griglia.add(progettatore, 0, 3);
		griglia.setHgap(20); 
		griglia.setVgap(40);
		area.setOnAction(e -> calcolo());
		circonferenza.setOnAction(e -> calcoloCir());
		griglia.setPadding(new Insets(10, 10, 10, 10));
		Scene scena = new Scene(griglia);
		finestra.setTitle("Area");
	    finestra.setScene(scena);
	    finestra.show();
		
	}
	public void calcolo() {
		double raggio, prodotto;
		   raggio = Double.parseDouble(testo.getText());
		   prodotto = (raggio*raggio)* 3.14;
		   String risposta = "  "+ prodotto;
		   risultato.setText(risposta);
		}
	public void calcoloCir() {
		double raggio, prodotto;
		   raggio = Double.parseDouble(testo.getText());
		   prodotto = ((2*3.14* raggio)-2)*2;
		   String risposta = "  "+ prodotto;
		   risultatoCir.setText(risposta);
		   risultatoCir2.setText(risposta);
		}
	public static void main(String[] args) {
	    launch(args);
	}
}