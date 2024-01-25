package it.edu.iisgubbio.basiJava;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;

public class Stile extends Application{
	Label base= new Label("Base");
	Label altezza= new Label("Altezza");
	TextField tBase= new TextField();
	TextField tAltezza= new TextField();
	Label perimetro= new Label("Perimetro");
	Label area= new Label("area");
	Label rPerimetro= new Label("");
	Label rArea= new Label("");
	GridPane griglia= new GridPane();

	public void start (Stage finestra) {
		tBase.setAlignment(Pos.CENTER);
		tAltezza.setAlignment(Pos.CENTER);
		tBase.setPromptText("inserisci valore");
		tAltezza.setPromptText("inserisci valore");
		perimetro.setId("perimetro");
		griglia.setId("griglia");
		griglia.add(base, 0, 0);
		griglia.add(altezza, 0, 1);
		griglia.add(tBase, 1, 0);
		griglia.add(tAltezza, 1, 1);
		griglia.add(perimetro,1, 2);
		griglia.add(area,0, 2);
		griglia.add(rPerimetro,1, 3);
		griglia.add(rArea,0, 3);
		rArea.setMinWidth(100);
		tAltezza.setOnAction(e->calcola());
		tBase.setOnAction(e->calcola());
		Scene scena = new Scene(griglia);
		finestra.setTitle("CSS");
		scena.getStylesheets().add("it/edu/iisgubbio/basiJava/stile.css");
	    finestra.setScene(scena);
	    finestra.show();
	}
	public void calcola() {
		if(tAltezza.getText().equals("") && !tBase.getText().equals("")) {
			rPerimetro.setText("ERRORE. INSERIRE IL SECONDO NUMERO");
		} else {
		String baseStr;
		String altezzaStr;
		Double base, altezza, area, perimetro;
		baseStr=tBase.getText();
		altezzaStr=tAltezza.getText();
		base=Double.parseDouble(baseStr);
		altezza=Double.parseDouble(altezzaStr);
		area=base*altezza;
		perimetro=(base+altezza)*2;
		rPerimetro.setText("Perimetro= "+perimetro);
		rArea.setText("Area= "+area);
		}
		
	}
	
    public static void main(String[] args) {
    launch(args);
      }
}