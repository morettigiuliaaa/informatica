	package it.edu.iisgubbio.vettori;
	import javafx.application.Application;
	import javafx.geometry.Insets;
	import javafx.scene.control.TextField;
	import javafx.scene.layout.GridPane;
	import javafx.stage.Stage;
    import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;

	public class MinMax extends Application{
	Label risultato=new Label();
	Button bMin=new Button ("min");
	Button bMax=new Button ("max");
	TextField t1=new TextField();
	GridPane griglia=new GridPane();

	public void start(Stage finestra) throws Exception {
	
		t1.setPromptText("inserisci una parola");
		griglia.add(t1, 0, 0);
		griglia.add(bMin, 0, 1);
		griglia.add(risultato, 1, 1);
		griglia.add(bMax, 2, 1);
		griglia.setHgap(10); 
		griglia.setVgap(10); 
		griglia.setPadding(new Insets(10, 10, 10, 10));
		griglia.setGridLinesVisible(false);
		
		bMin.setOnAction(e->minore());
		bMax.setOnAction(e->maggiore());
		Scene scena = new Scene (griglia);
		finestra.setTitle("indovina parola!");
		finestra.setScene(scena);
		finestra.show();
	}

	private void minore() {
		int numeroMinore=0;
		String t=t1.getText();
		String parti[]=t.split(" ");
		int numeri[]=new int[parti.length];
		for(int i=0;i<parti.length;i++) {
			numeri[i]=Integer.parseInt(parti[i]);
		}
		for (int i=0,pos=1; i<numeri.length;i++,pos++) {
			if(numeri[i]<numeri[pos]) {
				numeroMinore=numeri[i];
			}
		}
		risultato.setText(numeroMinore+"");
	}
	
	private void maggiore() {
		
	}
	public static void main(String args[]){
		launch();
	}
}