package it.edu.iisgubbio.date;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Bisestile extends Application{
	Label anno= new Label("Inserire anno");
	Label risultato= new Label();
	TextField tAnno= new TextField();
	Button calcola= new Button("Bisestile?");
	GridPane griglia= new GridPane();
	
		public void start (Stage finestra) {
			anno.setAlignment(Pos.CENTER);
			tAnno.setAlignment(Pos.CENTER);
			tAnno.setPromptText("inserisci valore");
			griglia.add(anno, 0, 0);
			griglia.add(tAnno, 1, 0);
			griglia.add(calcola, 0, 1);
			griglia.add(risultato, 1, 1);
			griglia.setHgap(10); 
			griglia.setVgap(40);
			calcola.setOnAction(e->eseguitot());
			griglia.setPadding(new Insets(10, 10, 10, 10));
			Scene scena = new Scene(griglia,500,500);
			finestra.setTitle("Bisestile");
			finestra.setScene(scena);
			finestra.show();
		
			}
		public void eseguitot() {
			int annoB = Integer.parseInt(tAnno.getText());
			if ( annoB%4==0 && annoB%100!=0 || annoB%400==0) {
				risultato.setText("L'ANNO "+ annoB+ " E' BISESTILE");
			} else {
				risultato.setText("L'ANNO "+ annoB+ " NON E' BISESTILE");
			}
				
			}
		public static void main(String[] args) {
			launch(args);
      }
}