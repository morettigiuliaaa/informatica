	package it.edu.iisgubbio.testi;
	import javafx.application.Application;
	import javafx.geometry.Insets;
	import javafx.scene.control.TextField;
	import javafx.scene.layout.GridPane;
	import javafx.stage.Stage;
    import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;

	public class Anagramma extends Application{
	Label p1=new Label ("parola1: ");
	Label p2=new Label ("parola2: ");
	Label risultato=new Label ();
	Button via=new Button ("test");
	TextField t1=new TextField();
	TextField t2=new TextField();
	GridPane griglia=new GridPane();

	public void start(Stage finestra) throws Exception {
	
		t1.setPromptText("inserisci una parola");
		t2.setPromptText("inserisci una parola");
		griglia.add(p1, 0, 0);
		griglia.add(p2, 0, 1);
		griglia.add(t1, 1, 0);
		griglia.add(t2, 1, 1);
		griglia.add(via,0, 2, 2 ,1);
		griglia.add(risultato, 0, 3, 2, 1);
		via.setMinWidth(250);
		griglia.setHgap(10); 
		griglia.setVgap(10); 
		griglia.setPadding(new Insets(10, 10, 10, 10));
		griglia.setGridLinesVisible(false);
		
		via.setOnAction(e->anagramma());
		Scene scena = new Scene (griglia);
		finestra.setTitle("indovina parola!");
		finestra.setScene(scena);
		finestra.show();
	}

	private void anagramma() {
		char fraseUno[];
		char fraseDue[];
		int contaUno=0;
		int contaDue=0;
		boolean anagramma=true;
		fraseUno=t1.getText().toCharArray();
		fraseDue=t2.getText().toCharArray();
		if (fraseUno.length==fraseDue.length) { 
			for( int c=0;c<fraseDue.length && anagramma;c++,contaUno=0,contaDue=0) {
				
				for(int i1=0; i1<fraseUno.length;i1++) {
					if(fraseUno[c]==fraseUno[i1]) {
						contaUno++;
					}
				}
				for(int i2=0; i2<fraseDue.length;i2++) {
					if(fraseUno[c]==fraseDue[i2]) {
						contaDue++;
					}
				}
				if(contaUno!=contaDue) {
					anagramma=false;
				}
			}
			if(anagramma) {
				risultato.setText("anagramma");
			}else {
				risultato.setText("non anagramma");
			}
		}else {
			risultato.setText("non può essere anagramma");
		}
	}
	public static void main(String args[]){
		launch();
	}
}