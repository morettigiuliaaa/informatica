package it.edu.iisgubbio.vivaio;

import it.edu.iisgubbio.vivaio.Bonsai;
import it.edu.iisgubbio.vivaio.Commestibile;
import it.edu.iisgubbio.vivaio.Fiore;
import it.edu.iisgubbio.vivaio.Pianta;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class NegozioPiante extends Application {
	GridPane griglia = new GridPane();
	ListView<Pianta> scelta = new ListView<>();
	ListView<Pianta> carrello = new ListView<>();
	TextField risultato = new TextField();

	public void start(Stage finestra) {
		griglia.add(scelta, 0, 0, 1,15);
		griglia.add(carrello, 1, 0,1,15);
		griglia.add(risultato, 1, 16);

		scelta.addEventHandler(MouseEvent.MOUSE_CLICKED, e->scelta());
		carrello.addEventHandler(MouseEvent.MOUSE_CLICKED, e->delete(e));

		griglia.setPadding(new Insets(10, 10, 10, 10));
		griglia.setHgap(15);
		griglia.setVgap(10);
		
		Fiore margherita = new Fiore("Margherita", 5, "Bianco", "Estate");
		scelta.getItems().add(margherita);
		
		Fiore rosa = new Fiore("Rosa", 20, "Rosa", "Primavera");
		scelta.getItems().add(rosa);
		
		Bonsai acero = new Bonsai("Acero", 19, 15);
		scelta.getItems().add(acero);
		
		Bonsai pino = new Bonsai("Pino", 6, 20);
		scelta.getItems().add(pino);

		Scene scena = new Scene(griglia);
		finestra.setTitle("Negozio Piante");
		finestra.setScene(scena);
		finestra.show();
	}

	public void scelta() {
		Pianta appoggioNome=scelta.getSelectionModel().getSelectedItem();
		carrello.getItems().add(appoggioNome);
		risultato.setText(totale()+"");
	}
	
	public double totale() {
		double somma=0.0;
		
		for (int i=0; i<carrello.getItems().size();i++) {
			somma+=carrello.getItems().get(i).getCosto();
		}
		
		
//		for each: riscrive la variablie x e ogni volta ne prende il costo. 
		
//		for (Pianta x : carrello.getItems()) {
//			somma+=x.getCosto();
//		}
		
		return somma;
	}
	
	public void delete(MouseEvent e) {
		if (e.getClickCount()==2) {
			int indexNome=carrello.getSelectionModel().getSelectedIndex();
			carrello.getItems().remove(indexNome);
			System.out.println(indexNome);
			risultato.setText(totale()+"");
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
