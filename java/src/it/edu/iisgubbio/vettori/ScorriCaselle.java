package it.edu.iisgubbio.vettori;
import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
public class ScorriCaselle extends Application {
	TextField t[]= new TextField[5];
	GridPane griglia=new GridPane();
	Button inserisci= new Button("inserisci");
	Button inverti= new Button("inverti");
	TextField utente= new TextField();
	int pos=0;
	
	public void start(Stage finestra) throws Exception{
		for (int i=0; i<t.length;i++, pos++) {
			t[i]=new TextField();
			griglia.add(t[i], 0, pos);
		}
		griglia.add(inserisci, 0,(pos+1));
		griglia.add(utente, 0, (pos+2));
		griglia.setHgap(10); 
	    griglia.setVgap(20);
	    inserisci.setOnAction(e->esegui());
		griglia.setPadding(new Insets(10, 10, 10, 10));
	    Scene scena = new Scene (griglia);
	    finestra.setTitle("Caselle");
	    finestra.setScene(scena);
	    finestra.show();	      
	   }
	private void esegui() {
		int numero=Integer.parseInt(utente.getText());
		int ultima=t.length-1;
		for(int i=0;i<t.length-1;i++) {
			String temp;
			temp=t[i+1].getText();
			t[i].setText(temp);
		}
		t[ultima].setText(numero+"");
	}
	public static void main(String[] args) {
	   launch(args);
	}
}