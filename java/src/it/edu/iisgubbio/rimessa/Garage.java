package it.edu.iisgubbio.rimessa;

import it.edu.iisgubbio.mobilita.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Garage extends Application {
	GridPane griglia = new GridPane();
	ListView<MezzoDiTrasporto> lista = new ListView<>();
	ComboBox<String> combo = new ComboBox<>();
	Label lParametro1 = new Label("             ");
	Label lParametro2 = new Label("             ");
	Label lParametro3 = new Label("             ");
	Label lParametro4 = new Label("             ");
	Label lParametro5 = new Label("             ");
	Label lParametro6 = new Label("             ");
	Label lParametro7 = new Label("             ");
	Label scegliOpzione = new Label("Scegli l'opzione      ");
	TextField tParametro1 = new TextField();
	TextField tParametro2 = new TextField();
	TextField tParametro3 = new TextField();
	TextField tParametro4 = new TextField();
	TextField tParametro5 = new TextField();
	TextField tParametro6 = new TextField();
	TextField tParametro7 = new TextField();
	Button aggiungi = new Button("Aggiungi");

	public void start(Stage finestra) {
		combo.getItems().add("Automobile");
		combo.getItems().add("Motocicletta");
		combo.getItems().add("Barca");
		combo.getItems().add("Skateboard");
		combo.getItems().add("Bicicletta");
		combo.getItems().add("Motoslitta");
		combo.getItems().add("Deltaplano");
		combo.getItems().add("Aereo");

		griglia.add(lista, 0, 0, 1,15);
		griglia.add(scegliOpzione, 1, 0);
		griglia.add(lParametro1, 1, 1);
		griglia.add(lParametro2, 1, 2);
		griglia.add(lParametro3, 1, 3);
		griglia.add(lParametro4, 1, 4);
		griglia.add(lParametro5, 1, 5);
		griglia.add(lParametro6, 1, 6);
		griglia.add(lParametro7, 1, 7);
		griglia.add(combo, 3, 0);
		griglia.add(tParametro1, 3, 1);
		griglia.add(tParametro2, 3, 2);
		griglia.add(tParametro3, 3, 3);
		griglia.add(tParametro4, 3, 4);
		griglia.add(tParametro5, 3, 5);
		griglia.add(tParametro6, 3, 6);
		griglia.add(tParametro7, 3, 7);
		griglia.add(aggiungi, 3, 8);

		aggiungi.setPrefWidth(170);
		combo.setOnAction(e->scelta());
		aggiungi.setOnAction(e->aggiunta());

		griglia.setPadding(new Insets(10, 10, 10, 10));
		griglia.setHgap(15);
		griglia.setVgap(10);

		Scene scena = new Scene(griglia);
		finestra.setTitle("Garage");
		finestra.setScene(scena);
		finestra.show();
	}

	public void scelta() {
		String valore = combo.getValue();

		switch (valore) {
		case "Automobile":
			lParametro1.setText("Nome");
			lParametro2.setText("Costo");
			lParametro3.setText("Numero porte");
			lParametro4.setText("Rumorosità");
			lParametro5.setText("Targa");
			lParametro6.setText("Carburante");
			lParametro7.setText("Velocità");
			tParametro1.clear();
			tParametro2.clear();
			tParametro3.clear();
			tParametro4.clear();
			tParametro5.clear();
			tParametro6.clear();
			tParametro7.clear();
			tParametro5.setDisable(false);
			tParametro6.setDisable(false);
			tParametro7.setDisable(false);
			break;

		case "Motocicletta":
			lParametro1.setText("Nome");
			lParametro2.setText("Costo");
			lParametro3.setText("Cilindrata");
			lParametro4.setText("Numero posti");
			lParametro5.setText("Velocità");
			lParametro6.setText("Carburante");
			lParametro7.setText("Rumorosità");
			tParametro1.clear();
			tParametro2.clear();
			tParametro3.clear();
			tParametro4.clear();
			tParametro5.clear();
			tParametro6.clear();
			tParametro7.clear();
			tParametro5.setDisable(false);
			tParametro6.setDisable(false);
			tParametro7.setDisable(false);
			break;

		case "Barca":
			lParametro1.setText("Nome");
			lParametro2.setText("Costo");
			lParametro3.setText("Numero remi");
			lParametro4.setText("Singolo remo?");
			lParametro5.setText("Muscoli coinvolti");
			lParametro6.setText("");
			lParametro7.setText("");
			tParametro1.clear();
			tParametro2.clear();
			tParametro3.clear();
			tParametro4.clear();
			tParametro5.clear();
			tParametro6.clear();
			tParametro7.clear();
			tParametro6.setDisable(true);
			tParametro7.setDisable(true);
			break;

		case "Skateboard":
			lParametro1.setText("Nome");
			lParametro2.setText("Costo");
			lParametro3.setText("Muscoli coinvolti");
			lParametro4.setText("Lunghezza");
			lParametro5.setText("");
			lParametro6.setText("");
			lParametro7.setText("");
			tParametro1.clear();
			tParametro2.clear();
			tParametro3.clear();
			tParametro4.clear();
			tParametro5.clear();
			tParametro6.clear();
			tParametro7.clear();
			tParametro5.setDisable(true);
			tParametro6.setDisable(true);
			tParametro7.setDisable(true);
			
			break;

		case "Bicicletta":
			lParametro1.setText("Nome");
			lParametro2.setText("Costo");
			lParametro3.setText("Muscoli coinvolti");
			lParametro4.setText("Peso");
			lParametro5.setText("Rapporti");
			lParametro6.setText("");
			lParametro7.setText("");
			tParametro1.clear();
			tParametro2.clear();
			tParametro3.clear();
			tParametro4.clear();
			tParametro5.clear();
			tParametro6.clear();
			tParametro7.clear();
			tParametro6.setDisable(true);
			tParametro7.setDisable(true);
			break;
			
		case "Motoslitta":
			lParametro1.setText("Nome");
			lParametro2.setText("Costo");
			lParametro3.setText("Velocità");
			lParametro4.setText("Temp minima");
			lParametro5.setText("Carburante");
			lParametro6.setText("");
			lParametro7.setText("");
			tParametro1.clear();
			tParametro2.clear();
			tParametro3.clear();
			tParametro4.clear();
			tParametro5.clear();
			tParametro6.clear();
			tParametro7.clear();
			tParametro6.setDisable(true);
			tParametro7.setDisable(true);
			break;
			
		case "Deltaplano":
			lParametro1.setText("Nome");
			lParametro2.setText("Costo");
			lParametro3.setText("Numero posti");
			lParametro4.setText("Quota massima");
			lParametro5.setText("");
			lParametro6.setText("");
			lParametro7.setText("");
			tParametro1.clear();
			tParametro2.clear();
			tParametro3.clear();
			tParametro4.clear();
			tParametro5.clear();
			tParametro6.clear();
			tParametro7.clear();
			tParametro5.setDisable(true);
			tParametro6.setDisable(true);
			tParametro7.setDisable(true);
			break;
		}
	}

	public void aggiunta() {
		String muscoli;
		String valoreScelta = combo.getValue();
		switch(valoreScelta) {
		
		case "Automobile":
			Automobile fiat = new Automobile(tParametro1.getText(), Integer.parseInt(tParametro2.getText()), Integer.parseInt(tParametro3.getText()));
			fiat.setCarburante(tParametro6.getText());
			fiat.setVelocita(Double.parseDouble(tParametro7.getText()));
			fiat.setRumorosita(Double.parseDouble(tParametro4.getText()));
			fiat.setTarga(tParametro5.getText());
			lista.getItems().add(fiat);
			
			break;
		
		case "Motocicletta":
			Motocicletta Motoguzzi = new Motocicletta(tParametro1.getText(), Integer.parseInt(tParametro3.getText()), Integer.parseInt(tParametro4.getText()));
			Motoguzzi.setCarburante(tParametro6.getText());
			Motoguzzi.setVelocita(Double.parseDouble(tParametro5.getText()));
			Motoguzzi.setCosto(Double.parseDouble(tParametro2.getText()));
			Motoguzzi.setRumorosita(Double.parseDouble(tParametro7.getText()));
			lista.getItems().add(Motoguzzi);
			break;
		
		
		case "Barca":
			muscoli = tParametro5.getText();
			Barca yotch = new Barca(tParametro1.getText(), Double.parseDouble(tParametro2.getText()), Integer.parseInt(tParametro3.getText()),tParametro4.getText().equals("true"));
			yotch.setMuscoliCoinvolti(muscoli);
			lista.getItems().add(yotch);
			break;


		case "Skateboard":
			muscoli = tParametro3.getText();
			Skateboard skateboard = new Skateboard(tParametro1.getText(), Integer.parseInt(tParametro2.getText()), Integer.parseInt(tParametro4.getText()));
			skateboard.setMuscoliCoinvolti(muscoli);
			lista.getItems().add(skateboard);
			break;
		
		
		case "Bicicletta":
			muscoli = tParametro3.getText();
			Bicicletta graziella = new Bicicletta(Integer.parseInt(tParametro2.getText()), Integer.parseInt(tParametro4.getText()));
			graziella.setNome(tParametro1.getText());
			graziella.setMuscoliCoinvolti(muscoli);
			graziella.setNumeroDiRapporti(Integer.parseInt(tParametro5.getText()));
			lista.getItems().add(graziella);
			break;
			
		case "Motoslitta":
			Motoslitta motoslitta = new Motoslitta(tParametro1.getText(), Double.parseDouble(tParametro2.getText()), Double.parseDouble(tParametro3.getText()));
			motoslitta.setTemperaturaMinima(Integer.parseInt(tParametro4.getText()));
			motoslitta.setCarburante(tParametro5.getText());
			lista.getItems().add(motoslitta);
			break;
			
		case "Deltaplano":
			Deltaplano deltaplano = new Deltaplano(tParametro1.getText(), Double.parseDouble(tParametro2.getText()), Integer.parseInt(tParametro3.getText()));
			deltaplano.setQuotaMassima(120);
			lista.getItems().add(deltaplano);
			break;
			
		case "Aereo":
			Aereo boeing = new Aereo(tParametro1.getText());
			boeing.setQuotaMassima(120);
			lista.getItems().add(boeing);
			break;
		
		}
}

public static void main(String[] args) {
	launch(args);
}
}
