package it.edu.iisgubbio.negozio;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Kebab extends Application{
	Label eRisposta= new Label();
	Button calcola= new Button("Calcola totale");
	CheckBox carne= new CheckBox("Aggiungi carne [ 4,00€ ]");
	CheckBox formaggio= new CheckBox("Aggiungi formaggio [ 1,00€ ]");
	CheckBox pomodoro= new CheckBox("Aggiungi pomodoro [ 1,00€ ]");
	CheckBox salsa= new CheckBox("Aggiungi salsa [ 0,50€ ]");
	CheckBox cipolla= new CheckBox("Aggiungi cipolla [ 0,50€ ]");
	GridPane griglia= new GridPane();

	public void start (Stage finestra) {
		carne.setAlignment(Pos.CENTER);
		formaggio.setAlignment(Pos.CENTER);
		pomodoro.setAlignment(Pos.CENTER);
		salsa.setAlignment(Pos.CENTER);
		cipolla.setAlignment(Pos.CENTER);
		eRisposta.setAlignment(Pos.CENTER);
		calcola.setAlignment(Pos.CENTER);
		
		griglia.add(carne, 0, 0);
		griglia.add(formaggio, 0, 1);
		griglia.add(pomodoro, 0, 2);
		griglia.add(salsa, 0, 3);
		griglia.add(cipolla, 0, 4);
		griglia.add(calcola, 0, 5);
		griglia.add(eRisposta, 1, 5);
		
		griglia.setHgap(10); 
		griglia.setVgap(40);
		calcola.setMaxWidth(200);
		calcola.setOnAction(e-> esegui());
		griglia.setPadding(new Insets(10, 10, 10, 10));
		
		Scene scena = new Scene(griglia,400,350);
		finestra.setTitle("Kebab ");
		finestra.setScene(scena);
		finestra.show();
	
		}
	
	public void esegui() {
		double conto;
		conto=0;
		String totale;
		if(carne.isSelected()) {
			conto=conto+4.0;
		}
		
		if(formaggio.isSelected()) {
			conto=conto+1.0;
		}
		
		if(pomodoro.isSelected()) {
			conto=conto+1.0;
		}
		
		if(salsa.isSelected()) {
			conto=conto+0.5;
		}
		
		if(cipolla.isSelected()) {
			conto=conto+0.5;
		}
		totale=" "+conto;
		eRisposta.setText("il costo del tuo kebab sarà di "+totale+"€");
	}

public static void main(String[] args) {
	launch(args);
	}
}