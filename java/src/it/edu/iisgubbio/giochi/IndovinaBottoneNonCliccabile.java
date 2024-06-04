package it.edu.iisgubbio.giochi;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class IndovinaBottoneNonCliccabile extends Application {
	Label numero = new Label("Numero: ");
	Button prova = new Button("prova");
	Button rigeneraNum = new Button("rigenera numero");
	TextField inserisci = new TextField();
	Label risultato = new Label();
	GridPane griglia = new GridPane();
	int creaNumero=(int)(Math.random()*100)+1;
	
	public void start (Stage finestra) {
		numero.setAlignment(Pos.CENTER);
		prova.setAlignment(Pos.CENTER);
		inserisci.setAlignment(Pos.CENTER);
		risultato.setAlignment(Pos.CENTER);
		rigeneraNum.setAlignment(Pos.CENTER);
		inserisci.setPromptText("inserisci un numero");
		griglia.add(numero, 0, 0);
		griglia.add(inserisci, 1, 0);
		griglia.add(prova, 0, 1,2,1);
		griglia.add(risultato, 0, 2,2,1);
		griglia.add(rigeneraNum, 0, 3,2,1);
		rigeneraNum.setDisable(true);
		rigeneraNum.setOnAction(e->eseguirigenera());
		rigeneraNum.setMinWidth(230);
		prova.setOnAction(e->esegui());
		prova.setMinWidth(230);
		griglia.setHgap(20);
		griglia.setVgap(20);
		griglia.setPadding(new Insets(10, 10, 10, 10));
		Scene scena = new Scene(griglia,250,250);
		finestra.setTitle("Indovina!");
	    finestra.setScene(scena);
	    finestra.show();
	}
	    
	public void esegui() {
		int numeroinserito=Integer.parseInt(inserisci.getText());
		if (creaNumero<numeroinserito) {
			risultato.setText("il numero inserito è troppo grande");
		} else if (creaNumero>numeroinserito) {
			risultato.setText("il numero inserito è troppo piccolo");
		} else if (creaNumero==numeroinserito) {
			risultato.setText("Complimenti!!! Hai indovinato in numero");
			rigeneraNum.setDisable(false);
		}
		
	}
	public void eseguirigenera() {
		creaNumero=(int)(Math.random()*100)+1;
		rigeneraNum.setDisable(true);
	}
	public static void main(String[] args) {
		launch(args);
	   }
}
