package it.edu.iisgubbio.verifica;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MorettiGiuliaRistorante extends Application{
	Label eNumeroBistecche= new Label("Numero bistecche: ");
	Label ePrezzoBistecca= new Label("Prezzo bistecca:");
	Label eNumeroBibite= new Label("Numero bibite:");
	Label ePrezzoBibite= new Label("Prezzo bibite:");
	Label eTotale= new Label("Totale");
	Label eRisposta= new Label();
	TextField tNumeroBistecche = new TextField();
	TextField tPrezzoBistecca = new TextField();
	TextField tNumeroBibite = new TextField();
	TextField tPrezzoBibite = new TextField();
	Button bTotale= new Button("totale");
	CheckBox cContorni= new CheckBox("contorni + 1.5€");
	CheckBox cSconto= new CheckBox("sconto del 20%");
	GridPane griglia = new GridPane();
	
	public void start (Stage finestra) {
		eNumeroBistecche.setAlignment(Pos.CENTER);
		ePrezzoBistecca.setAlignment(Pos.CENTER);
		eNumeroBibite.setAlignment(Pos.CENTER);
		ePrezzoBibite.setAlignment(Pos.CENTER);
		eTotale.setAlignment(Pos.CENTER);
		eRisposta.setAlignment(Pos.CENTER);
		tNumeroBistecche.setAlignment(Pos.CENTER);
		tPrezzoBistecca.setAlignment(Pos.CENTER);
		tNumeroBibite.setAlignment(Pos.CENTER);
		tPrezzoBibite.setAlignment(Pos.CENTER);
		bTotale.setAlignment(Pos.CENTER);
		cContorni.setAlignment(Pos.CENTER);
		cSconto.setAlignment(Pos.CENTER);
		
		
		griglia.setId("griglia");
		eNumeroBistecche.setId("label1");
		eNumeroBibite.setId("label1");
		
		
		griglia.add(eNumeroBistecche, 0, 0);
		griglia.add(ePrezzoBistecca, 0, 1);
		griglia.add(eNumeroBibite, 0, 2);
		griglia.add(ePrezzoBibite, 0, 3);
		griglia.add(bTotale, 2, 0, 4,5);
		griglia.add(cContorni, 1, 5);
		griglia.add(cSconto, 1, 6);
		griglia.add(tNumeroBistecche, 1, 0);
		griglia.add(tPrezzoBistecca, 1, 1);
		griglia.add(tNumeroBibite, 1, 2);
		griglia.add(tPrezzoBibite, 1, 3);
		griglia.add(eTotale, 0, 7);
		griglia.add(eRisposta, 1,7);
		
		bTotale.setMinHeight(139);
		bTotale.setOnAction(e-> esegui());
	
		
		Scene scena = new Scene(griglia);
		finestra.setTitle("Griglia");
		scena.getStylesheets().add("it/edu/iisgubbio/verifica/MorettiGiulia.css");
		finestra.setScene(scena);
		finestra.show();
	
		}
	
	public void esegui() {
		Double prezzoBisteccheConContorno=0.00;
		Double prezzoTotaleDelleBevande=0.00;
		Double totale=0.00;
		Double sconto=0.00;
		Double totaleConSconto=0.00;
		int numeroBistecche=Integer.parseInt(tNumeroBistecche.getText());
		Double prezzoBistecca=Double.parseDouble(tPrezzoBistecca.getText());
		int numeroBibite=Integer.parseInt(tNumeroBibite.getText());
		Double prezzoBibite=Double.parseDouble(tPrezzoBibite.getText());
		if(cContorni.isSelected()) {
			for(int n=1;n<=numeroBistecche;n++) {
				prezzoBisteccheConContorno+=prezzoBistecca+1.50;
			}
		
			prezzoTotaleDelleBevande=prezzoBibite*numeroBibite;
			totale=prezzoBisteccheConContorno+prezzoTotaleDelleBevande;
			eRisposta.setText(" "+totale);
			if(cSconto.isSelected()) {
				sconto= (totale*20)/100;
				totaleConSconto=totale-sconto;
				eRisposta.setText(" "+totaleConSconto);
			}
		}else {
			if(cSconto.isSelected()) {
				totale=(prezzoBistecca*numeroBistecche)+(prezzoBibite*numeroBibite);
				sconto= (totale*20)/100;
				totaleConSconto=totale-sconto;
				eRisposta.setText(" "+totaleConSconto);
			} else {
				totale=(prezzoBistecca*numeroBistecche)+(prezzoBibite*numeroBibite);
				eRisposta.setText(" "+totale);
			}
			
		}
	
	}

public static void main(String[] args) {
	launch(args);
	}
}