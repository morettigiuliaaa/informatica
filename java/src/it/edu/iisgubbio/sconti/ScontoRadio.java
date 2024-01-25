package it.edu.iisgubbio.sconti;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ScontoRadio extends Application{
	Label panini= new Label("Prezzo panino");
	Label numero= new Label("Numeri panini");
	Label sconto= new Label("Sconto (%)");
	TextField tPanini= new TextField();
	TextField tNumero= new TextField();
	Button calcola= new Button("Calcola totale");
	GridPane griglia= new GridPane();
	Label eRisposta= new Label();
	ToggleGroup gruppo= new ToggleGroup();
	RadioButton nessuno = new RadioButton("nessuno sconto");
	RadioButton dieci = new RadioButton("10% di sconto");
	RadioButton venti = new RadioButton("20% di sconto");

		public void start (Stage finestra) {
			tPanini.setAlignment(Pos.CENTER);
			tNumero.setAlignment(Pos.CENTER);
			tPanini.setPromptText("inserisci valore");
			tNumero.setPromptText("inserisci valore");
			nessuno.setToggleGroup(gruppo);
			dieci.setToggleGroup(gruppo);
			venti.setToggleGroup(gruppo);
			griglia.add(panini, 0, 0);
			griglia.add(numero, 0, 1);
			griglia.add(tPanini, 1, 0);
			griglia.add(tNumero, 1, 1);
			griglia.add(nessuno, 0, 2);
			griglia.add(dieci, 0, 3);
			griglia.add(venti, 0, 4);
			griglia.add(calcola,0, 5, 2,1);
			griglia.add(eRisposta,0, 6, 2,1);
			griglia.setHgap(10); 
			griglia.setVgap(40);
			calcola.setMaxWidth(500);
			calcola.setOnAction(e->eseguitot());
			griglia.setPadding(new Insets(10, 10, 10, 10));
			Scene scena = new Scene(griglia);
			finestra.setTitle("ScontoRadio");
			finestra.setScene(scena);
			finestra.show();
		
			}
		public void eseguitot() {
			double prezzopanino, sconto, moltiplicazione, npanini,totale;
			prezzopanino = Double.parseDouble(tPanini.getText());
			npanini = Double.parseDouble(tNumero.getText());
			String risposta="";
			if( nessuno.isSelected() ) {
				moltiplicazione= (prezzopanino*npanini);
				risposta = " "+ moltiplicazione;
				
			} else {
				if( dieci.isSelected() ) {
					sconto = 10;
					moltiplicazione= ((prezzopanino*npanini)*sconto)/100;
					totale=prezzopanino*npanini;
					risposta = " "+ (totale-moltiplicazione);
				} else {
					if( venti.isSelected() ) {
					sconto = 20;
					moltiplicazione= ((prezzopanino*npanini)*sconto)/100;
					totale=prezzopanino*npanini;
					risposta = " "+ (totale-moltiplicazione);
					}
				}
			}
			eRisposta.setText("Il totale ammonta a € "+risposta);
		}
		public static void main(String[] args) {
			launch(args);
      }
} 