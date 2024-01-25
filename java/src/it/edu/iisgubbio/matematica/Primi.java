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

public class Primi extends Application {
	Label numero = new Label("Numero: ");
	Button primi = new Button("Primi");
	TextField inserisci = new TextField();
	Label risultato = new Label();
	GridPane griglia = new GridPane();
	Image i = new Image(getClass().getResourceAsStream("social credit.png"));
    ImageView iw = new ImageView(i);
	
	public void start (Stage finestra) {
		numero.setAlignment(Pos.CENTER);
		inserisci.setAlignment(Pos.CENTER);
		risultato.setAlignment(Pos.CENTER);
		inserisci.setPromptText("inserisci un numero");
		griglia.setId("griglia");
		griglia.add(numero, 0, 0);
		griglia.add(inserisci, 1, 0);
		griglia.add(primi, 0, 1,2,1);
		griglia.add(risultato, 0, 2,2,1);
		griglia.add(iw, 0, 3,2,1);
		iw.setVisible(false);
		primi.setId("bottone");
		primi.setOnAction(e->esegui());
		primi.setMinWidth(320);
		Scene scena = new Scene(griglia);
		finestra.setTitle("Divisori!");
		scena.getStylesheets().add("it/edu/iisgubbio/matematica/Primi.css");
	    finestra.setScene(scena);
	    finestra.show();
	}
	    
	public void esegui() {
		int num= Integer.parseInt(inserisci.getText());
		int divisori=0;
		for(int n=2; n<num  ;n++) {
			if (num%n==0) {
				divisori++;
				} else {
					if(divisori!=0) {
						risultato.setText("non è primo");
					} else {
						risultato.setText("è primo");
					}
				}
			iw.setVisible(true);
		}
	}
	public static void main(String[] args) {
		launch(args);
	   }
}
