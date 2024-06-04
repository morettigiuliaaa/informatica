package it.edu.iisgubbio.testi;
import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Palindromo extends Application {
	Label risultato = new Label ();
	TextField inserisciParola = new TextField ();
	Label mettiParola = new Label("inserisci parola");
	Button verifica = new Button("verifica");
	GridPane griglia = new GridPane();
	
	public void start(Stage finestra) {
		griglia.add(mettiParola, 0, 0);
		griglia.add(inserisciParola, 1, 0);
		griglia.add(verifica, 1, 1);
		griglia.add(risultato, 1, 2);
		griglia.setHgap(10);
		griglia.setVgap(10);
		griglia.setPadding(new Insets(10, 10, 10, 10));
		verifica.setOnAction(e -> esegui());
		Scene scena = new Scene(griglia, 300, 250);
		finestra.setTitle("Palindromo!");
	    finestra.setScene(scena);
	    finestra.show();
	}
    public void esegui() {
    	 String parola;
    	 Boolean palindromo= true;
	     parola=inserisciParola.getText().toLowerCase();
	     char x[]=parola.toCharArray();
	     int lunghezza=x.length-1;
	     for(int i=0;i<lunghezza;i++,lunghezza--) {
	    	 if(x[i] != x[lunghezza]) {
	    		 palindromo=false;
	    	 }
	    if(palindromo) {
	    	risultato.setText("è palindroma");
	    }else {
	    	risultato.setText("non è palindroma");
	    	}
	    }
	}
	public static void main(String[] args) {
	    launch(args);
	  }
}