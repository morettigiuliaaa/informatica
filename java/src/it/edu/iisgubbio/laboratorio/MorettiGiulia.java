package it.edu.iisgubbio.laboratorio;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MorettiGiulia extends Application {
	Label ePrimoNumero = new Label ("Primo numero:");
	Label eSecondoNumero = new Label ("Secondo numero:");
	TextField tPrimoNumero = new TextField();
	TextField tSecondoNumero = new TextField();
	Button bNaturale = new Button("Naturali");
	Button bPrimi = new Button("Primi");
	Button bFattoriali = new Button("Fattoriali");
	Label eRispostaNaturali = new Label ();
	Label eRispostaPrimi = new Label ();
	Label eRispostaFattoriali = new Label ();
	GridPane griglia = new GridPane();
	
	public void start (Stage finestra) {
		griglia.add(ePrimoNumero, 0, 0);
		griglia.add(eSecondoNumero, 0, 1);
		griglia.add(tPrimoNumero, 1, 0);
		griglia.add(tSecondoNumero, 1, 1);
		griglia.add(bNaturale, 0, 2);
		griglia.add(bPrimi, 0, 3);
		griglia.add(bFattoriali, 0, 4);
		griglia.add(eRispostaNaturali, 1, 2);
		griglia.add(eRispostaPrimi, 1, 3);
		griglia.add(eRispostaFattoriali, 1, 4);
		griglia.setHgap(20);
		griglia.setVgap(20);
		griglia.setPadding(new Insets(10, 10, 10, 10));
		
		bNaturale.setOnAction(e-> naturali());
		bPrimi.setOnAction(e-> primi());
		bFattoriali.setOnAction(e-> fattoriali());
		
		Scene scena = new Scene(griglia);
		finestra.setTitle("LABORATORIO");
	    finestra.setScene(scena);
	    finestra.show();

	}
	
	public void naturali() {
		int primonumero=Integer.parseInt(tPrimoNumero.getText());
		int secondonumero=Integer.parseInt(tSecondoNumero.getText());
		int numeropiùgrande;
		int numeropiùpiccolo;
		int sommadeinumerinaturali=0;
		if(primonumero<secondonumero) {
			numeropiùpiccolo=primonumero;
			numeropiùgrande=secondonumero;
		}else {
			numeropiùpiccolo=secondonumero;
			numeropiùgrande=primonumero;
		}
		
		
		for(int n=numeropiùpiccolo;n<=numeropiùgrande; n++) {
			sommadeinumerinaturali=sommadeinumerinaturali+n;
		}
		eRispostaNaturali.setText(" "+sommadeinumerinaturali);
	}
	
	public void primi() {
		int primonumero=Integer.parseInt(tPrimoNumero.getText());
		int secondonumero=Integer.parseInt(tSecondoNumero.getText());
		int numeropiùgrande;
		int numeropiùpiccolo;
		int quantitàdeinumeriprimi=0;
		if(primonumero<secondonumero) {
			numeropiùpiccolo=primonumero;
			numeropiùgrande=secondonumero;
		}else {
			numeropiùpiccolo=secondonumero;
			numeropiùgrande=primonumero;
		}
		for(int n=numeropiùpiccolo; n<numeropiùgrande  ;n++) {
			if (numeropiùgrande%n==0 && n%n==0) {
				quantitàdeinumeriprimi+=1;
			}
		}
		eRispostaPrimi.setText(" "+quantitàdeinumeriprimi);
	}
		
	public void fattoriali() {
		int primonumero=Integer.parseInt(tPrimoNumero.getText());
		int secondonumero=Integer.parseInt(tSecondoNumero.getText());
		int fattoriale, fattorialediN=1,fattorialeM=1;
		int fattorialedifferenza=(primonumero-secondonumero);
		for(int n=1;n<=primonumero;n++) {
			fattorialediN*=n;
		}
		for(int n=1;n<=fattorialedifferenza;n++) {
			fattorialeM*=n;
		}
		fattoriale=fattorialediN/fattorialeM;
		eRispostaFattoriali.setText(" "+fattoriale);
	}
	
	public static void main(String[] args) {
		launch(args);
	   }
}
