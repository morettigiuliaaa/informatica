package it.edu.iisgubbio.sconti;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Sconto extends Application{
	Label panini= new Label("Prezzo panino");
	Label numero= new Label("Numeri panini");
	Label sconto= new Label("Sconto (%)");
	TextField tPanini= new TextField();
	TextField tNumero= new TextField();
	TextField tSconto= new TextField();
	Button calcola= new Button("Calcola totale");
	GridPane griglia= new GridPane();
	Label eRisposta= new Label();
	CheckBox spunta = new CheckBox("Applica sconto del 20%");

		public void start (Stage finestra) {
			tPanini.setAlignment(Pos.CENTER);
			tNumero.setAlignment(Pos.CENTER);
			tSconto.setAlignment(Pos.CENTER);
			tPanini.setPromptText("inserisci valore");
			tNumero.setPromptText("inserisci valore");
			tSconto.setPromptText("inserisci valore");
			griglia.add(panini, 0, 0);
			griglia.add(numero, 0, 1);
			griglia.add(sconto, 0, 2);
			griglia.add(tPanini, 1, 0);
			griglia.add(tNumero, 1, 1);
			griglia.add(tSconto, 1, 2);
			griglia.add(calcola,0, 4, 2,1);
			griglia.add(eRisposta,0, 5, 2,1);
			griglia.add(spunta,0, 3, 2,1);
			griglia.setHgap(10); 
			griglia.setVgap(40);
			calcola.setMaxWidth(500);
			calcola.setOnAction(e->eseguitot());
			griglia.setPadding(new Insets(10, 10, 10, 10));
			Scene scena = new Scene(griglia);
			finestra.setTitle("Sconto");
			finestra.setScene(scena);
			finestra.show();
		
			}
		public void eseguitot() {
			double prezzopanino, sconto, moltiplicazione, npanini,totale;
			prezzopanino = Double.parseDouble(tPanini.getText());
			npanini = Double.parseDouble(tNumero.getText());
			String risposta;
			if( spunta.isSelected() ) {
				sconto = Double.parseDouble(tSconto.getText());
				moltiplicazione= ((prezzopanino*npanini)*sconto)/100;
				totale=prezzopanino*npanini;
				risposta = " "+ (totale-moltiplicazione);
				
			} else {
				moltiplicazione= (prezzopanino*npanini);
				risposta = " "+ moltiplicazione;
			}	
			eRisposta.setText("Il totale con lo sconto ammonta a € "+risposta);
		}
		public static void main(String[] args) {
			launch(args);
      }
}      