package it.edu.iisgubbio.matematica;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Interessi extends Application {
	Label capitaleiniziale = new Label("Capitale iniziale: ");
	Label percentuale = new Label("Percentuale: ");
	Label anno = new Label("Anni: ");
	Label calcolare = new Label("Calcolo degli interessi: ");
	Button calcola = new Button("calcola");
	TextField inseriscicapitale = new TextField();
	TextField inseriscipercentuale = new TextField();
	TextField inseriscianno = new TextField();
	Label risultato = new Label();
	GridPane griglia = new GridPane();
	Image i = new Image(getClass().getResourceAsStream("social credit.png"));
    ImageView iw = new ImageView(i);
	
	public void start (Stage finestra) {
		capitaleiniziale.setAlignment(Pos.CENTER);
		inseriscicapitale.setAlignment(Pos.CENTER);
		inseriscipercentuale.setAlignment(Pos.CENTER);
		inseriscianno.setAlignment(Pos.CENTER);
		risultato.setAlignment(Pos.CENTER);
		inseriscicapitale.setPromptText("inserisci un numero");
		inseriscipercentuale.setPromptText("inserisci un numero");
		inseriscianno.setPromptText("inserisci un numero");
		griglia.setId("griglia");
		griglia.add(calcolare, 0, 0);
		griglia.add(capitaleiniziale, 0, 1);
		griglia.add(percentuale, 0, 2);
		griglia.add(anno, 0, 3);
		griglia.add(inseriscicapitale, 1, 1);
		griglia.add(inseriscipercentuale, 1, 2);
		griglia.add(inseriscianno, 1, 3);
		griglia.add(calcola, 0, 4,2,1);
		griglia.add(risultato, 0, 5,2,1);
		griglia.add(iw, 0, 6,2,1);
		iw.setVisible(false);
		calcola.setId("bottone");
		calcola.setOnAction(e->esegui());
		calcola.setMinWidth(320);
		Scene scena = new Scene(griglia);
		finestra.setTitle("Tabellina!");
		scena.getStylesheets().add("it/edu/iisgubbio/matematica/Interessi.css");
	    finestra.setScene(scena);
	    finestra.show();
	}
	
	public void esegui() {
		Double interesse, calcolo;
		Double capitale=Double.parseDouble(inseriscicapitale.getText());
		Double percent=Double.parseDouble(inseriscipercentuale.getText());
		int anni=Integer.parseInt(inseriscianno.getText());
		Double totale;
		for(int n=1; n<=anni ;n++) {
			interesse=(capitale*percent)/100;
			calcolo=capitale+interesse;
			capitale=calcolo;
		}
		totale=capitale;
		String soldi=" "+totale;
		risultato.setText(soldi);
		iw.setVisible(true);
	}
	public static void main(String[] args) {
		launch(args);
	   }
}
