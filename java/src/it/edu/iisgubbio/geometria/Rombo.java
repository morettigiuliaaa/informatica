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

public class Rombo extends Application{
	Label Diagonale1= new Label("Diagonale 1");
	Label Diagonale2= new Label("Diagonale 2");
	TextField tDiago1= new TextField();
	TextField tDiago2= new TextField();
	Button calcola= new Button("Calcola area");
	Button calcolaPerimetro= new Button("Calcola perimetro");
	Label risultatoArea= new Label();
	Label risultatoPerimetro= new Label();
	GridPane griglia= new GridPane();

	public void start (Stage finestra) {
		tDiago1.setAlignment(Pos.CENTER);
		tDiago2.setAlignment(Pos.CENTER);
		risultatoArea.setAlignment(Pos.CENTER);
		risultatoPerimetro.setAlignment(Pos.CENTER);
		tDiago1.setPromptText("inserisci valore");
		tDiago2.setPromptText("inserisci valore");
		griglia.add(Diagonale1, 0, 0);
		griglia.add(Diagonale2, 0, 1);
		griglia.add(tDiago1, 1, 0);
		griglia.add(tDiago2, 1, 1);
		griglia.add(calcola,0, 2, 2,1);
		griglia.add(calcolaPerimetro,0, 4, 2,1);
		griglia.add(risultatoArea, 0, 3,2,1);
		griglia.add(risultatoPerimetro, 0, 5,2,1);
		griglia.setHgap(5); 
		griglia.setVgap(40);
		calcola.setMaxWidth(500);
		calcolaPerimetro.setMaxWidth(500);
		risultatoArea.setMinWidth(200);
		risultatoPerimetro.setMinWidth(200);
		calcola.setOnAction(e->eseguicalcolo());
		calcolaPerimetro.setOnAction(e->eseguicalcoloP());
		griglia.setPadding(new Insets(10, 10, 10, 10));
		Scene scena = new Scene(griglia);
		finestra.setTitle("Rombo");
	    finestra.setScene(scena);
	    finestra.show();
		
	}
	public void eseguicalcolo() {
		double datoDiagonale1, datoDiagonale2, area;
		datoDiagonale1 = Double.parseDouble(tDiago1.getText());
		datoDiagonale2 = Double.parseDouble(tDiago2.getText());
		area = (datoDiagonale1 *datoDiagonale2)/2;
		String rispostarea = " "+ area;
		risultatoArea.setText(" Area = " + rispostarea);
	}
	public void eseguicalcoloP() {
		double datoDiagonale1, datoDiagonale2, datoDiagonale1M, datoDiagonale2M, perimetro;
	   datoDiagonale1 = Double.parseDouble(tDiago1.getText());
	   datoDiagonale2 = Double.parseDouble(tDiago2.getText());
	   datoDiagonale2M=datoDiagonale2/2;
	   datoDiagonale1M=datoDiagonale1/2;
	   perimetro=Math.sqrt((datoDiagonale1M*datoDiagonale1M)+(datoDiagonale2M*datoDiagonale2M))*4; 
	   risultatoPerimetro.setText(" Perimetro = " + perimetro);
	}
	
    public static void main(String[] args) {
    launch(args);
      }
}