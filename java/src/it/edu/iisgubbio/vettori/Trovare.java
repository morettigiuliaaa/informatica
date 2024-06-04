package it.edu.iisgubbio.vettori;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class Trovare extends Application{

	Label ePos=new Label();
	Label eRipetuti=new Label();
	Label eRisultato=new Label();
	TextField cNumeri=new TextField();
	TextField cTrovare=new TextField();
	public void start(Stage finestra) {
		GridPane griglia=new GridPane();
		Button bTrovare=new Button("Trovare ");
		Button bRipetuti=new Button("Ripetuti");
		Label eNumeri=new Label("Numeri");
		Button bPos=new Button ("Pos");
		
		Label eCercare=new Label("Numero Da cercare");
		griglia.add(eRisultato, 1, 3);
		griglia.add(cNumeri, 1, 0);
		griglia.add(eNumeri, 0, 0);
		griglia.add(eCercare, 0, 1);
		griglia.add(cTrovare, 1, 1);
		griglia.add(bTrovare, 0, 3);
		griglia.add(bRipetuti,0,4);
		griglia.add(eRipetuti,1, 4);
		griglia.add(ePos, 1, 5);
		griglia.add(bPos, 0, 5);
		griglia.setHgap(10);
		griglia.setVgap(10);
		griglia.setPadding(new Insets(10, 10, 10, 10));
		bTrovare.setOnAction(e->ricerca());
		bRipetuti.setOnAction(e->ripetuti());
		bPos.setOnAction(e-> pos());
		Scene scena =new Scene(griglia,500,300);
		finestra.setTitle("somma su stringa");
		finestra.setScene(scena);
		finestra.show();
	}
	public void pos() {
		boolean trovato=false;
		int trovare=Integer.parseInt(cTrovare.getText());
		String t=cNumeri.getText();
		String parti[]=t.split(" ");
		int numeri[]=new int[parti.length];
		for(int i=0;i<parti.length;i++) {
			numeri[i]=Integer.parseInt(parti[i]);
		}
		int pos=0;
		for(int i=0;i<numeri.length && !trovato;i++) {
			if(numeri[i]==trovare) {
				pos=i;
				trovato=true;
			}
		}
		if(trovato) {
			ePos.setText("si trova nella posizione "+pos);
		}else {
			ePos.setText("non si trova ");
		}
		
	}
	
	//public void ripetuti() {
		//int numeroRipetuto = 0;
		//String t=cNumeri.getText();
		//String parti[]=t.split(" ");
		//int numeri[]=new int[parti.length];
		//for(int i=0;i<parti.length;i++) {
			//numeri[i]=Integer.parseInt(parti[i]);
		//}
		//for(int i=1;i<numeri.length  ;i++) {
			//if(numeri[i-1]==numeri[i]) {
				//numeroRipetuto=numeri[i];
			//}
		//}
		//eRipetuti.setText("il numero che si ripete è "+numeroRipetuto+" in fila ");
	//}
	
	public void ripetuti() {  
		int ripetuti=0;
		Boolean duplicati=false;
		String t=cNumeri.getText();
		String parti[]=t.split(" ");
		int numeri[]=new int[parti.length];
		for(int i=0;i<parti.length;i++) {
			numeri[i]=Integer.parseInt(parti[i]);
		}
		
		for(int pos=0;pos<numeri.length ;pos++) {
			for(int i=pos+1;i<numeri.length;i++) {
				if(numeri[pos]==numeri[i]) {
					duplicati=true;
				}
			}
			if(duplicati) {
				ripetuti++;
				duplicati=false;
				
			}
		}
		eRipetuti.setText(" il numeri che si ripetono sono "+ripetuti);
	}

	public void ricerca() {
		int cercare=Integer.parseInt(cTrovare.getText());
		boolean trovato=false;
		String t=cNumeri.getText();
		String parti[]=t.split(" ");
		int numeri[]=new int[parti.length];
		for(int i=0;i<parti.length;i++) {
			numeri[i]=Integer.parseInt(parti[i]);
		}
		
		 for(int i=0;i<numeri.length && !trovato;i++) {
			if(numeri[i]==cercare) {
				trovato=true;	
			}
			if(trovato) {
				eRisultato.setText("Trovato");
			}else {
				eRisultato.setText("non Trovato");
			}
		}

	}

	public static void main(String[] args) {

		launch(args);
	}
}