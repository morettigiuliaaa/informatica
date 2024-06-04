package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Fibonacci extends Application {
	Label numeroInInput = new Label("Inserire Numero");
	Label fibonacci = new Label("Fibonacci");
	Button calcola = new Button("Calcola fib.");
	TextField inserisciNumero = new TextField();
	TextField risultato = new TextField();
	GridPane griglia = new GridPane();
	
	public void start (Stage finestra) {
		numeroInInput.setAlignment(Pos.CENTER);
		fibonacci.setAlignment(Pos.CENTER);
		inserisciNumero.setAlignment(Pos.CENTER);
		risultato.setAlignment(Pos.CENTER);
		inserisciNumero.setPromptText("inserisci un numero");
		griglia.add(numeroInInput, 0, 0);
		griglia.add(fibonacci, 0, 1);
		griglia.add(calcola,0,2,2,1);
		griglia.add(inserisciNumero, 1, 0);
		griglia.add(risultato, 1, 1);
		calcola.setOnAction(e->esegui());
		calcola.setMinWidth(300);
		griglia.setHgap(20);
		griglia.setVgap(20);
		griglia.setPadding(new Insets(10, 10, 10, 10));
		Scene scena = new Scene(griglia);
		finestra.setTitle("Fibonacci");
	    finestra.setScene(scena);
	    finestra.show();
	}
	
	int fib(int n) {
		int risultato;
		if (n==0) {
			risultato=0;
		}else {
			if(n==1){
				risultato=1;
				}else {
					risultato=fib(n-1)+fib(n-2);
			}
		}
		return risultato;
	}
	
	
	public void esegui() {
		int numero=Integer.parseInt(inserisciNumero.getText());
		int tot;
		tot=fib(numero);
		risultato.setText(""+tot);
		
	}
	public static void main(String[] args) {
		launch(args);
	   }
}
