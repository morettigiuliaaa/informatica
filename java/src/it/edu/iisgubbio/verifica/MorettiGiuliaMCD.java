package it.edu.iisgubbio.verifica;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MorettiGiuliaMCD extends Application{
	Label ePrimoNumero=new Label("primo numero");
	Label eSecondoNumero=new Label("secondo numero");
	TextField tPrimoNumero=new TextField();
	TextField tSecondoNumero=new TextField();
	Button bCalcola=new Button("Calcola");
	Label eRisultato=new Label();
	GridPane griglia = new GridPane();
	
	public void start (Stage finestra) {
		ePrimoNumero.setAlignment(Pos.CENTER);
		eSecondoNumero.setAlignment(Pos.CENTER);
		tPrimoNumero.setAlignment(Pos.CENTER);
		tSecondoNumero.setAlignment(Pos.CENTER);
		bCalcola.setAlignment(Pos.CENTER);
		eRisultato.setAlignment(Pos.CENTER);
		
		griglia.add(ePrimoNumero, 0, 0);
		griglia.add(eSecondoNumero, 0, 1);
		griglia.add(tPrimoNumero, 1, 0);
		griglia.add(tSecondoNumero, 1, 1);
		griglia.add(bCalcola, 2, 0);
		griglia.add(eRisultato, 1, 2);
		griglia.setHgap(5); 
		griglia.setVgap(5);
		griglia.setPadding(new Insets(10, 10, 10, 10));
		
		bCalcola.setOnAction(e-> esegui());
	
		
		Scene scena = new Scene(griglia);
		finestra.setTitle("Griglia");
		finestra.setScene(scena);
		finestra.show();
	}
	
	public void esegui() {
		int primoNumero=Integer.parseInt(tPrimoNumero.getText());
		int secondoNumero=Integer.parseInt(tSecondoNumero.getText());
		int mcd=1;
		int min;
		if(primoNumero>secondoNumero) {
			min=secondoNumero;
		}else {
			min=primoNumero;
		}
		for(int n=min;(n%primoNumero==0)&&(n%secondoNumero==0);n--) {
			mcd=n;
			eRisultato.setText(""+mcd);
		}
	}
	
public static void main(String[] args) {
	launch(args);
	}
}
	
