package it.edu.iisgubbio.negozio;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class AgenziaViaggi extends Application {
	Label personePerAutobus = new Label("N. persone per autobus ");
	Label partecipanti = new Label("partecipanti ");
	Label costoAutobus= new Label("costo autobus ");
	Label costoBiglietto = new Label("costo biglietto: ");
	Label risultato = new Label();
	Label risultatoAutobus = new Label();
	Button calcola = new Button("calcola costo biglietto");
	TextField inserisciPersone = new TextField();
	TextField inserisciPartecipanti = new TextField();
	TextField inserisciCosto = new TextField();
	GridPane griglia = new GridPane();
	
	public void start (Stage finestra) {
		personePerAutobus.setAlignment(Pos.CENTER);
		partecipanti.setAlignment(Pos.CENTER);
		costoAutobus.setAlignment(Pos.CENTER);
		costoBiglietto.setAlignment(Pos.CENTER);
		risultato.setAlignment(Pos.CENTER);
		risultatoAutobus.setAlignment(Pos.CENTER);
		inserisciPersone.setAlignment(Pos.CENTER);
		inserisciPartecipanti.setAlignment(Pos.CENTER);
		inserisciCosto.setAlignment(Pos.CENTER);
		risultato.setAlignment(Pos.CENTER);
		inserisciPersone.setPromptText("inserisci un numero");
		inserisciPartecipanti.setPromptText("inserisci un numero");
		inserisciCosto.setPromptText("inserisci un numero");
		griglia.add(personePerAutobus, 0, 0);
		griglia.add(partecipanti, 0, 1);
		griglia.add(costoAutobus, 0, 2);
		griglia.add(calcola,0,3,2,1);
		griglia.add(costoBiglietto, 0, 4);
		griglia.add(inserisciPersone, 1, 0);
		griglia.add(inserisciPartecipanti, 1, 1);
		griglia.add(inserisciCosto, 1, 2);
		griglia.add(risultato, 1,4);
		griglia.add(risultatoAutobus, 1,5);
		calcola.setOnAction(e->esegui());
		calcola.setMinWidth(300);
		griglia.setHgap(20);
		griglia.setVgap(20);
		griglia.setPadding(new Insets(10, 10, 10, 10));
		Scene scena = new Scene(griglia);
		finestra.setTitle("Agenzia Viaggi");
	    finestra.setScene(scena);
	    finestra.show();
	}
	
	public void esegui() {
		double prezzoBiglietto,numeroCostoAutobus;
		int numeroAutobus;
		int numeroPosti=Integer.parseInt(inserisciPersone.getText());
		int numeroPersone=Integer.parseInt(inserisciPartecipanti.getText());
		double costo=Double.parseDouble(inserisciCosto.getText());
		if(numeroPersone%numeroPosti==0) {
			 numeroAutobus=numeroPersone/numeroPosti;
			} else{
				numeroAutobus=numeroPersone/numeroPosti+1;
			}
		numeroCostoAutobus=costo*numeroAutobus;
		prezzoBiglietto=numeroCostoAutobus/numeroPersone;
		String risposta=" "+prezzoBiglietto;
		risultato.setText("il costo del biglietto è "+risposta);
		risultatoAutobus.setText("il numero di autobus è "+numeroAutobus);
		System.out.print(numeroAutobus);

	}
	public static void main(String[] args) {
		launch(args);
	   }
}
