package it.edu.iisgubbio.giochi;
import javafx.application.Application;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Prato extends Application{

	boolean fiori[][]=new boolean[8][8];
	int fiorellini=0;

	public void start(final Stage finestra){
		final GridPane griglia=new GridPane();
		griglia.setPadding(new Insets(10, 10, 10, 10));
		griglia.setHgap(5);
		griglia.setVgap(5);
		for(int colonna=0;colonna<8;colonna++) {
			for(int riga=0;riga<8;riga++) {
				double nR= Math.random();
				final Button p=new Button("    ");
				if(nR>0.5&& fiorellini<=20) {
					fiori[colonna][riga]=true;
					p.getStyleClass().add("fiore");
					fiorellini++;
				}else {
					fiori[colonna][riga]=false;
					p.getStyleClass().add("fiore");
				}
				p.setOnAction(e->trasforma(e));
				griglia.add(p, colonna, riga);
			}
		}


		final Scene scena=new Scene(griglia);
		scena.getStylesheets().add("it/edu/iisgubbio/giochi/Prato.css");
		finestra.setScene(scena);
		finestra.setTitle("Prato!");
		finestra.show();
	}


	public void trasforma(final Event e) {
		int bomba=0;
		final Button a=(Button)(e.getSource());
		int colonna = GridPane.getColumnIndex(a);
		int riga = GridPane.getRowIndex(a);
		if(fiori[colonna][riga]) {
			a.setText("💣");
		} else {
			//casella sotto
			if (riga!=fiori.length-1&&fiori[colonna][riga+1]) {
				bomba++;
			}
			//casella sotto dx
			if (colonna!=fiori.length-1&&riga!=fiori.length-1&&fiori[colonna+1][riga+1]) {
				bomba++;
			}
			//casella sotto sx
			if (colonna!=0&&riga!=fiori.length-1&&fiori[colonna-1][riga+1]) {
				bomba++;
			}
			//casella sinistra centro
			if (colonna!=0&&fiori[colonna-1][riga]) {
				bomba++;
			}
			//casella destra centro
			if (colonna!=fiori.length-1&&fiori[colonna+1][riga]) {
				bomba++;
			}
			//casella sopra 
			if (riga!=0&&fiori[colonna][riga-1]) {
				bomba++;
			}
			//casella sopra dx
			if (colonna!=fiori.length-1&&riga!=0&&fiori[colonna+1][riga-1]) {
				bomba++;
			}
			//casella sopra sx
			if (colonna!=0&&riga!=0&&fiori[colonna-1][riga-1]) {
				bomba++;
			}
			a.setText(" "+bomba+" ");
		}
	}

public static void main(final String[] args) {

	launch(args);
}
}