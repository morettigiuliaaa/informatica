package it.edu.iisgubbio.vettori;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Piscina extends Application {
	   TextField tNumero = new TextField(); 
	   TextField tTempo = new TextField();
	   TextField tCoach = new TextField();
	   Label tRisultati = new Label();
	   GridPane griglia= new GridPane();
	   Button creaLista= new Button("crea lista");
	   Button tempoAllievi= new Button("Inserisci tempo allievi");
	   Button calcola= new Button("calcola");
	   Button elenca= new Button("elenca");
	   Label eNumero = new Label("Numero allievi:");
	   Label eTempo= new Label("Inserisci tempo:");
	   Label eCoach= new Label("Inserisci tempo coach:");
	   Label eCalcola = new Label();
	   Label eelenca = new Label();
	   int tempi[];
	   int numTempi;
	   int pos;

	   public void start(Stage finestra) throws Exception{
	      griglia.add(eNumero, 0, 0);
	      griglia.add(tNumero, 1, 0);
	      griglia.add(tTempo, 1, 1);
	      griglia.add(eTempo, 0, 1);
	      griglia.add(tCoach, 1, 2);
	      griglia.add(eCoach, 0, 2);
	      griglia.add(creaLista, 0, 3);
	      griglia.add(tempoAllievi, 1, 3);
	      griglia.add(calcola, 0, 5);
	      griglia.add(elenca, 0, 6);
	      griglia.add(eCalcola, 1, 5);
	      griglia.add(eelenca, 1, 6);
	      griglia.setHgap(10); 
	      griglia.setVgap(20);
	      creaLista.setOnAction(e->alloca());
	      tempoAllievi.setOnAction(e->inserisciTempo());
	      calcola.setOnAction(e->contaPessimi());
	      griglia.setPadding(new Insets(10, 10, 10, 10));
	      Scene scena = new Scene (griglia);
	      finestra.setTitle("PONG!");
	      finestra.setScene(scena);
	      finestra.show();
	      
	   }
	   
	   public void alloca() {
		      numTempi = Integer.parseInt(tNumero.getText());
		      tempi = new int[numTempi];
		      pos = 0;
		   }

		   public void inserisciTempo() {
		      if(pos < numTempi) {
		         tempi[pos++]=Integer.parseInt(tTempo.getText());
		         tTempo.setText("");
		      }
		   }

		   public void contaPessimi() {
		      int indice, contatore;
		      int coach = Integer.parseInt(tCoach.getText());
		      for(contatore = indice = 0; indice < numTempi; indice++) {
		         if(tempi[indice] > coach) {
		            contatore++;
		         }
		      }
		      eCalcola.setText("" + contatore);
		   }
	   
	   public static void main(String[] args) {
		   launch(args);
	   }
	}