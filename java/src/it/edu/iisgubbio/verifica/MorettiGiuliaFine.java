package it.edu.iisgubbio.verifica;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MorettiGiuliaFine extends Application{
	Label eFraseUno=new Label("Inserisci frase uno:");
	Label eFraseDue=new Label("Inserisci frase due:");
	Label eRisultato=new Label("");
	TextField cInserireFraseUno=new TextField();
	TextField cInserireFraseDue=new TextField();
	Button tCerca=new Button("cerca lettere");
	GridPane griglia=new GridPane();
	
	public void start(Stage finestra) {
		griglia.add(eFraseUno, 0, 0);
		griglia.add(eFraseDue, 0, 1);
		griglia.add(cInserireFraseUno, 1, 0);
		griglia.add(cInserireFraseDue, 1, 1);
		griglia.add(eRisultato, 1, 2);
		griglia.add(tCerca, 0, 2);
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
		int lettereConRima=0;
		char frase[]=cInserireFraseUno.getText().toCharArray();
		char fraseDue[]=cInserireFraseDue.getText().toCharArray();
		for(int i=0;i<frase.length;i++) {
			if(frase[i]==fraseDue[i]) {
				lettereConRima+=1;
			}
		}
		eRisultato.setText(lettereConRima+"");
	}
	public static void main(String[] args) {

		launch(args);
	}
}
