package it.edu.iisgubbio.matematica;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Equazione2 extends Application {
	Label soluzione = new Label();
	Label x2 = new Label("x^2+");
	Label x = new Label("x+");
	Label zero = new Label("=0");
	TextField ax = new TextField();
	TextField bx = new TextField();
	TextField cx = new TextField();
	Button calcola = new Button("Calcola Soluzioni");
	GridPane griglia= new GridPane();

	public void start (Stage finestra) {
		ax.setAlignment(Pos.CENTER);
		bx.setAlignment(Pos.CENTER);
		cx.setAlignment(Pos.CENTER);
		calcola.setAlignment(Pos.CENTER);
		soluzione.setAlignment(Pos.CENTER);
		ax.setPromptText("a");
		bx.setPromptText("b");
		cx.setPromptText("c");
		griglia.add(ax, 0, 0);
		griglia.add(x2, 1, 0);
		griglia.add(bx, 2, 0);
		griglia.add(x, 3, 0);
		griglia.add(cx, 4, 0);
		griglia.add(zero, 5, 0);
		griglia.add(calcola, 0,1,6,1);
		griglia.add(soluzione,2,3,6,1);
		griglia.setHgap(20); 
		griglia.setVgap(40);
		calcola.setMinWidth(600);
		calcola.setOnAction(e->esegui());
		griglia.setPadding(new Insets(10, 10, 10, 10));
		Scene scena = new Scene(griglia);
		finestra.setTitle("Equazioni di secondo grado");
	    finestra.setScene(scena);
	    finestra.show();
	}
	public void esegui() {
		double a,b,c,delta,x1,x2;
		a = Double.parseDouble(ax.getText());
		b = Double.parseDouble(bx.getText());
		c = Double.parseDouble(cx.getText());
		delta=(b*b)-4*(a)*(c);
		if(a==0) {
			x1=(c/b);
			soluzione.setText("la soluzione è "+x1);
		} else if(c==0) {
			x1=0;
			x2=((-b)/a);
			soluzione.setText("x1= "+x1+" x2= "+x2);
		} else if (b==0) {
			x1=+(Math.sqrt((c/a)));
			x2=+(Math.sqrt((c/a)));
			soluzione.setText(" "+x1+x2);
		} else if(delta<0) {
			soluzione.setText("l'equazione è impossibile perchè delta<0");
		} else if(delta>0) {
			x1=((-b+Math.sqrt(delta))/(2+a));
			x2=((+b+Math.sqrt(delta))/(2+a));
			soluzione.setText("i risultati dell'equazione sono x1= "+x1+" x2= "+x2);
		} else {
			x1=((-b+Math.sqrt(delta))/(2+a));
			x2=((+b+Math.sqrt(delta))/(2+a));
			soluzione.setText("i risultati sono coincidenti e sono x1= "+x1+" x2= "+x2);
		}
	}		
		
				
public static void main(String[] args) {
    launch(args);
	}
}
