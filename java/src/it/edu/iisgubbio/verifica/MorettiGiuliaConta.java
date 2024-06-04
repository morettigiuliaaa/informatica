package it.edu.iisgubbio.verifica;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MorettiGiuliaConta extends Application{
	Label eFrase=new Label("Inserisci frase:");
	Label eRisultato=new Label("");
	TextField cInserireFrase=new TextField();
	Button tCerca=new Button("cerca lettere");
	GridPane griglia=new GridPane();
	
	public void start(Stage finestra) {
		griglia.add(eFrase, 0, 0);
		griglia.add(tCerca, 0, 1);
		griglia.add(cInserireFrase, 1, 0);
		griglia.add(eRisultato, 1, 1);
		griglia.setHgap(10);
		griglia.setVgap(10);
		griglia.setPadding(new Insets(10, 10, 10, 10));
		tCerca.setOnAction(e-> cercaLettere());
		Scene scena =new Scene(griglia,500,300);
		finestra.setTitle("somma su stringa");
		finestra.setScene(scena);
		finestra.show();
	} 
	
	public void cercaLettere() {
		String numeri="";
		char frase[]=cInserireFrase.getText().toCharArray();
		int lettere[]=new int[frase.length];
		for(int primaPos=0;primaPos<frase.length;primaPos++) {
			for(int secondaPos=0;secondaPos<frase.length;secondaPos++) {
				if(frase[primaPos]==frase[secondaPos]) {
					lettere[primaPos]+=1;
				}
			}
		}
		for(int i=0,o=1;o<lettere.length;i++,o++) {
			if(frase[i]!=frase[o]) {
				numeri+=frase[i]+"="+lettere[i]+" ";
			}
		}
		eRisultato.setText(numeri);
	}
	public static void main(String[] args) {

		launch(args);
	}
}
