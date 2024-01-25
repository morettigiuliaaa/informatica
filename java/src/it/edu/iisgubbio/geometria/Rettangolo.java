package it.edu.iisgubbio.geometria;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Rettangolo extends Application{
	Label base= new Label("Base");
	Label altezza= new Label("Altezza");
	TextField tbase= new TextField();
	TextField taltezza= new TextField();
	Button calcola= new Button("Calcola");
	Label risultatoArea= new Label();
	Label risultatoPerimetro= new Label();
	GridPane griglia= new GridPane();

	public void start (Stage finestra) {
		tbase.setAlignment(Pos.CENTER);
		taltezza.setAlignment(Pos.CENTER);
		tbase.setPromptText("inserisci valore");
		taltezza.setPromptText("inserisci valore");
		griglia.add(base, 0, 0);
		griglia.add(altezza, 0, 1);
		griglia.add(tbase, 1, 0);
		griglia.add(taltezza, 1, 1);
		griglia.add(calcola,0, 2, 2,1);
		griglia.add(risultatoArea, 0, 3);
		griglia.add(risultatoPerimetro, 1, 3);
		griglia.setHgap(5); 
		griglia.setVgap(40);
		calcola.setMaxWidth(500);
		risultatoArea.setMinWidth(100);
		risultatoPerimetro.setMinWidth(100);
		calcola.setOnAction(e-> eseguicalcolo());
		griglia.setPadding(new Insets(10, 10, 10, 10));
		Scene scena = new Scene(griglia);
		finestra.setTitle("Quadrato");
	    finestra.setScene(scena);
	    finestra.show();
		
	}
	
	public void eseguicalcolo() {
		double datobase, datoaltezza, area, perimetro;
		   datobase = Double.parseDouble(tbase.getText());
		   datoaltezza = Double.parseDouble(taltezza.getText());
		   perimetro = datobase *2 + datoaltezza*2;
		   String rispostaperimetro = " "+ perimetro;
		   risultatoPerimetro.setText(" Perimetro = " + rispostaperimetro);
		   area = datobase *datoaltezza;
		   String rispostarea = " "+ area;
		   risultatoArea.setText(" Area = " + rispostarea);
		}
	
    public static void main(String[] args) {
    launch(args);
      }
}