package it.edu.iisgubbio.vettori;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Contatori extends Application{
	TextField inserisciValori = new TextField();
	TextField inserisciK = new TextField();
	Label valori = new Label("Valori 🔢 :");
	Label k = new Label("K : ");
	Label rispostaConta = new Label("         ");
	Label rispostaMedia = new Label("         ");
	Label rispostaDispari = new Label("         ");
	Button calcola = new Button("conta");
	Button sopMedia = new Button("sopra media");
	Button dispari = new Button("tutti dispari");
	GridPane griglia = new GridPane();
	
	public void start(Stage finestra) {
		
		griglia.add(valori, 0, 0);
		griglia.add(inserisciValori, 1, 0, 3, 1);
		griglia.add(k, 0, 1);
		griglia.add(inserisciK, 1, 1);
		griglia.add(rispostaConta, 3, 1);
		griglia.add(rispostaMedia, 3, 2);
		griglia.add(rispostaDispari, 3, 3);
		griglia.add(calcola, 2, 1);
		griglia.add(sopMedia, 1, 2, 2,1 );
		griglia.add(dispari, 1, 3, 2, 1);
		
		sopMedia.setMaxWidth(270);
		dispari.setMaxWidth(270);
		inserisciK.setAlignment(Pos.CENTER);
		valori.setId("titolo");
		k.setId("minore");
		 
	
		calcola.setOnAction(e-> eseguiConta());
		sopMedia.setOnAction(e-> eseguiMedia());
		dispari.setOnAction(e-> eseguiDispari());
		
		griglia.setHgap(15);
		griglia.setVgap(10);
		griglia.setPadding(new Insets(10, 10, 10, 10));
		
		Scene scena =new Scene(griglia);
		scena.getStylesheets().add("it/edu/iisgubbio/vettori/Contatori.css");
		finestra.setTitle("Contatori");
		finestra.setScene(scena);
		finestra.show();
	}
	
	public void eseguiConta() {
		String t= inserisciValori.getText();
		String parti[]=t.split(" ");
		int v[]=new int[parti.length];
		for (int i=0; i<parti.length;i++) {
			v[i]=Integer.parseInt(parti[i]);
		} 
		int contatore=0;
		int coeffi=Integer.parseInt(inserisciK.getText());
		for (int i=0; i<v.length; i++) {
			if(v[i]==coeffi) {
				contatore+=1;
			}
		}
		
		rispostaConta.setText("   "+contatore+"   ");
		
	}
	
	public void eseguiMedia() {
		String t= inserisciValori.getText();
		String parti[]=t.split(" ");
		int v[]=new int[parti.length];
		for (int i=0; i<parti.length;i++) {
			v[i]=Integer.parseInt(parti[i]);
		} 
		
		double media=0;
		int contatore=0;
		for (int i=0; i<v.length; i++) {
			media=media+v[i];
		}
		
		media=media/v.length;
		
		for (int i=0; i<v.length; i++) {
			if(v[i]>media) {
				contatore+=1;
			}
		}
		
		rispostaMedia.setText("   "+contatore+"   ");
		
	}
	
	public void eseguiDispari() {
		String t= inserisciValori.getText();
		String parti[]=t.split(" ");
		int v[]=new int[parti.length];
		for (int i=0; i<parti.length;i++) {
			v[i]=Integer.parseInt(parti[i]);
		} 
		
		int contatorePari=0;
		for (int i=0; i<v.length; i++) {
			if(v[i]%2==0) {
				contatorePari+=1;
			}
		}
		
		if(contatorePari!=0) {
			rispostaDispari.setText("NO");
			griglia.setId("bkcolor");
			}else {
			rispostaDispari.setText("SI");
			griglia.setId("bkcolorDue");
		}
		
	}
	
	
	public static void main(String[] args) {

		launch(args);
	}
}
