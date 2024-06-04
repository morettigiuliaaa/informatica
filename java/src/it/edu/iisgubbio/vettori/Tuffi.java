package it.edu.iisgubbio.vettori;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Tuffi extends Application{
	TextField inserisciPunti = new TextField();
	Label giudici = new Label("Voto giudici 👍");
	Label minimo = new Label("min:");
	Label massimo = new Label("max:");
	Label punteggio = new Label("punteggio:");
	Label rispostaMinimo = new Label();
	Label rispostaMassimo = new Label();
	Label rispostaPunteggio = new Label();
	Button calcola = new Button("calcola");
	GridPane griglia = new GridPane();
	
	public void start(Stage finestra) {
		
		griglia.add(giudici, 0, 0);
		griglia.add(inserisciPunti, 1, 0, 3, 1);
		griglia.add(minimo, 0, 1);
		griglia.add(rispostaMinimo, 1, 1);
		griglia.add(massimo, 2, 1);
		griglia.add(rispostaMassimo, 3, 1);
		griglia.add(punteggio, 0, 2);
		griglia.add(rispostaPunteggio, 1, 2, 2, 1);
		griglia.add(calcola, 4, 0, 1, 3);
		
		giudici.setId("titolo");
		minimo.setId("minore");
		massimo.setId("maggiore");
		punteggio.setId("punteggio");
		
		calcola.setMinHeight(100);
		calcola.setOnAction(e-> esegui());
		
		griglia.setHgap(15);
		griglia.setVgap(10);
		griglia.setPadding(new Insets(10, 10, 10, 10));
		
		Scene scena =new Scene(griglia);
		scena.getStylesheets().add("it/edu/iisgubbio/vettori/Tuffi.css");
		finestra.setTitle("Tuffi");
		finestra.setScene(scena);
		finestra.show();
	}
	
	public void esegui() {
		
		//carico il vettore
		
		String t= inserisciPunti.getText();
		String parti[]=t.split(" ");
		double v[]=new double[parti.length];
		for (int i=0; i<parti.length;i++) {
			v[i]=Double.parseDouble(parti[i]);
		}
		
		//trovo il valore minimo
		
		double minore = v[0];
		for(int i=0; i<v.length;i++) {
			if(minore>v[i]) {
				minore=v[i];
			}
		}
		rispostaMinimo.setText(minore+"");
		
		//trovo il valore massimo
		
		double maggiore = v[0];
		for(int i=0; i<v.length;i++) {
			if(maggiore<v[i]) {
				maggiore=v[i];
			}
		}
		rispostaMassimo.setText(maggiore+"");
		
		// calcolo la media (punteggio)
		
		double somma=0.0;
		double media=0.0;
		for (int i=0; i<v.length;i++) {
			somma+=v[i];
		}
		media=(somma-(maggiore+minore))/(v.length-2);
		rispostaPunteggio.setText(media+"");
	}
	
	
	public static void main(String[] args) {

		launch(args);
	}
}
