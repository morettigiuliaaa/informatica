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

public class TriangoloRettangolo extends Application{
	Label Cateto1= new Label("Cateto 1");
	Label Cateto2= new Label("Cateto 2");
	Label Ipotenusa= new Label("Ipotenusa");
	TextField tCateto1= new TextField();
	TextField tCateto2= new TextField();
	TextField tIpotenusa= new TextField();
	Button calcolaC1= new Button("Calcola cateto 1");
	Button calcolaC2= new Button("Calcola cateto 2");
	Button calcolaIpo= new Button("Calcola ipotenusa");
	GridPane griglia= new GridPane();

	public void start (Stage finestra) {
		tCateto1.setAlignment(Pos.CENTER);
		tCateto2.setAlignment(Pos.CENTER);
		tIpotenusa.setAlignment(Pos.CENTER);
		tCateto1.setPromptText("inserisci valore");
		tCateto2.setPromptText("inserisci valore");
		tIpotenusa.setPromptText("inserisci valore");
		griglia.add(Cateto1, 0, 0);
		griglia.add(Cateto2, 0, 1);
		griglia.add(Ipotenusa, 0, 2);
		griglia.add(tCateto1, 1, 0);
		griglia.add(tCateto2, 1, 1);
		griglia.add(tIpotenusa, 1, 2);
		griglia.add(calcolaC1,2, 0, 2,1);
		griglia.add(calcolaC2,2, 1, 2,1);
		griglia.add(calcolaIpo, 2, 2,2,1);
		griglia.setHgap(10); 
		griglia.setVgap(40);
		calcolaC1.setMaxWidth(500);
		calcolaC2.setMaxWidth(500);
		calcolaC1.setOnAction(e->eseguicalcoloC1());
		calcolaC2.setOnAction(e->eseguicalcoloC2());
		calcolaIpo.setOnAction(e->eseguicalcoloIpo());
		griglia.setPadding(new Insets(10, 10, 10, 10));
		Scene scena = new Scene(griglia);
		finestra.setTitle("Triangolo Rettangolo");
	    finestra.setScene(scena);
	    finestra.show();
		
	}
	public void eseguicalcoloC1() {
		double datoIpo, datoC2, cateto1, radice;
		datoIpo = Double.parseDouble(tIpotenusa.getText());
		datoC2 = Double.parseDouble(tCateto2.getText());
		cateto1 = (datoIpo*datoIpo)-(datoC2*datoC2);
		radice=Math.sqrt(cateto1);
		String rispostacateto1 = " "+ radice;
		tCateto1.setText(rispostacateto1);
	}
	public void eseguicalcoloC2() {
		double datoIpo, datoC1, cateto2, radice;
		datoIpo = Double.parseDouble(tIpotenusa.getText());
		datoC1 = Double.parseDouble(tCateto1.getText());
		cateto2 = (datoIpo*datoIpo)-(datoC1*datoC1);
		radice=Math.sqrt(cateto2);
		String rispostacateto2 = " "+ radice;
		tCateto2.setText(rispostacateto2);
	}
	public void eseguicalcoloIpo() {
		double datoC1, datoC2, IPO, radice;
		datoC1 = Double.parseDouble(tCateto1.getText());
		datoC2 = Double.parseDouble(tCateto2.getText());
		IPO = (datoC2*datoC2)+(datoC1*datoC1);
		radice=Math.sqrt(IPO);
		String rispostaIpo = " "+ radice;
		tIpotenusa.setText(rispostaIpo);
	}
    public static void main(String[] args) {
    launch(args);
      }
}                                             