package it.edu.iisgubbio.basiJava;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PrimaInterfaccia extends Application{
	Label eUnisci= new Label();
	Label eCopiaDx= new Label();
	Label eCopiaSx= new Label();
	Button pCopiaDx= new Button();
	Button pCopiaSx= new Button();
	Button pPulisci= new Button();
	Button pUnisci= new Button();
	TextField tDestra= new TextField();
	TextField tSinistra= new TextField();
	GridPane griglia= new GridPane();
	
	public void start (Stage finestra) {
		pCopiaDx.setText("Copia");
		pCopiaSx.setText("Copia");
		pUnisci.setText("Unisci");
		pPulisci.setText("Pulisci");
		pCopiaDx.setPrefWidth(200);
		pCopiaSx.setPrefWidth(200);
		pPulisci.setPrefWidth(200);
		pUnisci.setPrefWidth(200);
		griglia.add(pCopiaDx, 2, 1);
		griglia.add(pCopiaSx, 0, 1);
		griglia.add(pPulisci, 1, 2);
		griglia.add(pUnisci, 1, 0);
		griglia.add(tDestra, 2, 0);
		griglia.add(tSinistra, 0, 0);
		griglia.add(eUnisci, 1, 1);
		griglia.add(eCopiaDx, 2, 2);
		griglia.add(eCopiaSx, 0, 2);
		griglia.setHgap(20); 
		griglia.setVgap(40);
		griglia.setPadding(new Insets(10, 10, 10, 10));
		pCopiaDx.setOnAction(e -> eseguiDx());
		pCopiaSx.setOnAction(e -> eseguiSx());
		pPulisci.setOnAction(e -> eseguiPulisci());
		pUnisci.setOnAction(e -> eseguiUnisci());
		Scene scena = new Scene(griglia);
		finestra.setTitle("Prima Interfaccia!");
	    finestra.setScene(scena);
	    finestra.show();
		
	}
	public void eseguiDx() {
		String utente;
		utente = tDestra.getText();
		eCopiaDx.setText(utente);
	}
	public void eseguiSx() {
		String utente;
		utente = tSinistra.getText();
		eCopiaSx.setText(utente);
    }
	public void eseguiUnisci() {
		String utenteuno;
		String utentedue;
		utenteuno = tSinistra.getText();
		utentedue = tDestra.getText();
		eUnisci.setText(utenteuno + " " + utentedue);
	}
	public void eseguiPulisci() {
		eCopiaDx.setText("  ");
		eCopiaSx.setText("  ");
	}
	public static void main(String[] args) {
	    launch(args);
	}
}