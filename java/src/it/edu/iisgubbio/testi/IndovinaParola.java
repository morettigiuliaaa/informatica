	package it.edu.iisgubbio.testi;
	import javafx.application.Application;
	import javafx.geometry.Insets;
	import javafx.scene.control.TextField;
	import javafx.scene.layout.GridPane;
	import javafx.stage.Stage;
	import javafx.scene.layout.Pane;
	import javafx.scene.paint.Color;
    import javafx.scene.shape.Circle;
    import javafx.scene.shape.Line;
    import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;

	public class IndovinaParola extends Application{
	Label nome=new Label ("Inserisci un nome");
	Label lettera=new Label ("Inserisci una lettera");
	Label risultato=new Label ();
	Button via=new Button ("avvia");
	Button prova=new Button ("verifica");
	TextField tNome=new TextField();
	TextField tLettera=new TextField();
	GridPane griglia=new GridPane();
	Pane pannello=new Pane();
	char frase[];
	char fraseOriginale[];
	int u=0;
	boolean gattuso=false;
	Line rettangoloS = new Line();
	Line rettangoloD = new Line();
	Line rettangoloSx = new Line();
	Line rettangoloDx = new Line();
	Line rettangoloC = new Line();
	Circle pallino = new Circle(13);

	public void start(Stage finestra) throws Exception {
	
		tNome.setPromptText("inserisci una parola");
		tLettera.setPromptText("inserisci una lettera");
		griglia.add(nome, 0, 0);
		griglia.add(lettera, 0, 1);
		griglia.add(via, 2, 0);
		griglia.add(prova, 2, 1);
		griglia.add(tNome, 1, 0);
		griglia.add(tLettera, 1, 1);
		griglia.add(pannello, 0, 2,2,1);
		griglia.setHgap(10); 
		griglia.setVgap(10);
		tNome.setMinWidth(200);
		griglia.setPadding(new Insets(10, 10, 10, 10));
		griglia.setGridLinesVisible(false);
		
		pallino.setCenterX(185);
		pallino.setCenterY(50);
		pallino.setFill(Color.BLACK);
		
		rettangoloC.setStartX(185.0); 
		rettangoloC.setStartY(51.0); 
		rettangoloC.setEndX(185.0); 
		rettangoloC.setEndY(121.0); 
		rettangoloC.setStrokeWidth(3);
		
		rettangoloD.setStartX(186.0); 
		rettangoloD.setStartY(51.0); 
		rettangoloD.setEndX(200.0); 
		rettangoloD.setEndY(100.0); 
		rettangoloD.setStrokeWidth(3);
		
		rettangoloSx.setStartX(185.0); 
		rettangoloSx.setStartY(121.0); 
		rettangoloSx.setEndX(170.0); 
		rettangoloSx.setEndY(160.0); 
		rettangoloSx.setStrokeWidth(3);
		
		rettangoloDx.setStartX(185.0); 
		rettangoloDx.setStartY(121.0); 
		rettangoloDx.setEndX(200.0); 
		rettangoloDx.setEndY(160.0); 
		rettangoloDx.setStrokeWidth(3);
		
		rettangoloS.setStartX(184.0); 
		rettangoloS.setStartY(49.0); 
		rettangoloS.setEndX(170.0); 
		rettangoloS.setEndY(96.0); 
		rettangoloS.setStrokeWidth(3);
		
		via.setOnAction(e->via());
		prova.setOnAction(e->prova());
		Scene scena = new Scene (griglia,400,400);
		finestra.setTitle("indovina parola!");
		finestra.setScene(scena);
		finestra.show();
	}

	private void via() {
		String t=tNome.getText();
		frase=t.toCharArray();
		for(int i=1; i<(frase.length-1);i++) {
			frase[i]='-';
		}
		String x=new String(frase);
		tNome.setText(x); 
		fraseOriginale=t.toCharArray();
	}
	
	private void prova() {
		char lettera=tLettera.getText().charAt(0);
		for(int i=0;i<fraseOriginale.length;i++) {
			if(fraseOriginale[i]==lettera) {
				frase[i]=lettera;
				tLettera.setText("");
			}else {
				tLettera.setText("");
				gattuso=true;
			}
			
			if(gattuso) {
				u+=1;
				switch (u) {
				case 1:
					pannello.getChildren().add(pallino);
					break;
				case 2:
					pannello.getChildren().add(rettangoloC);
					break;
				case 3:
					pannello.getChildren().add(rettangoloD);
					break;
				case 4:
					pannello.getChildren().add(rettangoloS);
					break;
				case 5:
					pannello.getChildren().add(rettangoloDx);
					break;
				case 6:
					pannello.getChildren().add(rettangoloSx);
					break;
				}
				gattuso=false;
			}
			String x=new String(frase);
			tNome.setText(x);
		}
	}
	public static void main(String args[]){
		launch();
	}
}
