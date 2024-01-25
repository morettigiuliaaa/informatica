package it.edu.iisgubbio.grafica;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Triangolo extends Application {
	Label numero = new Label("Numero: ");
	Button via = new Button("Via!");
	TextField inserisci = new TextField();
	GridPane griglia=new GridPane();
	Pane quadro= new Pane();
	
	public void start (Stage finestra) { 
		griglia.add(numero, 0, 0);
		griglia.add(inserisci, 1, 0);
		griglia.add(via, 2, 0);
		griglia.add(quadro, 0, 1,3,1);
		griglia.setHgap(5); 
		griglia.setVgap(2);
		via.setOnAction(e-> esegui());
		griglia.setPadding(new Insets(10, 10, 10, 10));
		
		Scene scena = new Scene(griglia,400,400);
		finestra.setTitle("Triangolo");
	    finestra.setScene(scena);
	    finestra.show();
		
}
	public void esegui() {
		quadro.getChildren().clear();
		int num=Integer.parseInt(inserisci.getText());
		for(int y=10; 1<=num; y=y+20, num--) {
			for(int c=1,x=20;c<=num; x=x+20,c++) {
				Circle pallino= new Circle(6);
				pallino.setFill(Color.BLACK);
				pallino.setCenterX(x);
				pallino.setCenterY(y);
				quadro.getChildren().add(pallino);
				}
			}
	}

 public static void main(String[] args) {
	launch(args);
   }
}