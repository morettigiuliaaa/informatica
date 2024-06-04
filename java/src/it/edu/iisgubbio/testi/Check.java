package it.edu.iisgubbio.testi;
import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Check extends Application {
	Label risultato = new Label ();
	TextField inserisciFrase = new TextField ();
	Label mettiParola = new Label("inserisci frase");
	Button verifica = new Button("CONTROLLA");
	GridPane griglia = new GridPane();
	
	public void start(Stage finestra) {
		griglia.add(mettiParola, 0, 0);
		griglia.add(inserisciFrase, 1, 0);
		griglia.add(verifica, 1, 1);
		griglia.add(risultato, 1, 2);
		griglia.setHgap(10);
		griglia.setVgap(10);
		griglia.setPadding(new Insets(10, 10, 10, 10));
		verifica.setOnAction(e -> esegui());
		Scene scena = new Scene(griglia, 300, 250);
		finestra.setTitle("Check!");
	    finestra.setScene(scena);
	    finestra.show();
	}
	private void esegui() {
	int ultimoPunto=0;
  	  int punto=0;
  	  int posizione=0;
		  String frase=inserisciFrase.getText().toLowerCase();
	      char x[]=frase.toCharArray();
	      if (x[0]>='a'&& x[0]<='z') {
	    	  x[0]=(char)(x[0]-32);
	      }
	      for(int i=0;i<x.length;i++) {
	    	  punto=frase.indexOf('.',ultimoPunto);
	    	  ultimoPunto+=punto;
		      posizione=punto+2;
		      if(x[posizione]>='a'&& x[posizione]<='z') {
		    	  x[posizione]=(char)(x[posizione]-32);
		      }
		       
		      
	      }   
	     String farse=new String(x);
	     risultato.setText(farse);
	}
	
	public static void main(String[] args) {
	    launch(args);
	  }
}