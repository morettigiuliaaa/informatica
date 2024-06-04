package it.edu.iisgubbio.testi;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class Spazi extends Application{
	Label testo= new Label("Testo");
	Label spazi= new Label("spazi");
	Label eRisposta= new Label();
	TextField tTesto= new TextField();
	TextField tSpazi= new TextField();
	Button trasforma= new Button("trasforma");
	Font f = new Font("Courier New",14);
	char caratteri[];
	
	GridPane griglia= new GridPane();

	public void start (Stage finestra) {
		tTesto.setAlignment(Pos.CENTER);
		tSpazi.setAlignment(Pos.CENTER);
		griglia.setId("griglia");
		griglia.add(testo, 0, 0);
		griglia.add(spazi, 0, 1);
		griglia.add(tTesto, 1, 0);
		griglia.add(tSpazi, 1, 1);
		griglia.add(trasforma,2, 0,2,2);
		griglia.add(eRisposta, 0, 2, 3,1);
		griglia.setHgap(10); 
		griglia.setVgap(10);
		tTesto.setFont(f);
		tSpazi.setFont(f);
		trasforma.setOnAction(e->spazi());
		trasforma.setMinWidth(100);
		trasforma.setMinHeight(70);;
		griglia.setPadding(new Insets(10, 10, 10, 10));
		Scene scena = new Scene(griglia);
		finestra.setTitle("Spazi");
	    finestra.setScene(scena);
	    finestra.show();
	}
	public void spazi() {
		int lettere=0;
		int spazi=0;
		caratteri=tTesto.getText().toCharArray();
		for (int i=0; i<caratteri.length;i++) {
			if(caratteri[i]!=' ') {
				lettere+=1;
			}else {
				spazi+=1;
			}
		}
		if((lettere+spazi)>20) {
			eRisposta.setText("la frase è già a 20 caratteri o più");
		}
		int spaziDaMettereXOgniCasella=(20-(lettere+spazi))/spazi;
		int spaziInseriti=0;
		char prova[]= new char[20];
		for (int iProva=0, iCaratteri=0; iProva<prova.length;iProva++,iCaratteri++) {
			if(iCaratteri<=caratteri.length-1) {
				if(caratteri[iCaratteri]==' ') {
					prova[iProva]=caratteri[iCaratteri];
					for(int iCiclo=0;iCiclo<spaziDaMettereXOgniCasella;iCiclo++) {
						iProva+=1;
						spaziInseriti++;
						prova[iProva]=' ';
					}
				}else {
					prova[iProva]=caratteri[iCaratteri];
				}
			}else {
				String finale="";
				for (int i=0; i<caratteri.length+spaziInseriti;i++) {
					finale+=prova[i];
				}
				tSpazi.setText(finale);
			}
		}
	}
	
    public static void main(String[] args) {
    launch(args);
      }
}