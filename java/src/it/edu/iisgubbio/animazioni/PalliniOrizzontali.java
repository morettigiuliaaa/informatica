package it.edu.iisgubbio.animazioni;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PalliniOrizzontali extends Application {
	private static final int SPAZIO_PALLINE = 30;
	private static final int NUMERO_PALLINE = 30;
	private static final int LARGHEZZA_SCHERMO = 600;
	private static final int ALTEZZA_SCHERMO = SPAZIO_PALLINE * NUMERO_PALLINE;
	private static final int RAGGIO_PALLINA = 7;
	
	Pane pane = new Pane();
	Timeline timeline = new Timeline(new KeyFrame(Duration.millis(8), x -> aggiornaTimer()));
	
	Circle pallini[] = new Circle[NUMERO_PALLINE];
	int inizio =RAGGIO_PALLINA;
	int fine =LARGHEZZA_SCHERMO-RAGGIO_PALLINA;
	boolean avanti[]=new boolean[pallini.length];
	double velocita[] = new double[pallini.length];

	public void start(Stage primaryStage) throws Exception {

		for (int i = 0, y = 10; i < pallini.length; i++, y = y + SPAZIO_PALLINE ) {
			pallini[i] = new Circle(RAGGIO_PALLINA);
			pallini[i].setCenterY(y);
			pallini[i].setCenterX(Math.random() * ((LARGHEZZA_SCHERMO - 100) / 2));
			pallini[i].setFill(Color.BLACK);
			pane.getChildren().add(pallini[i]);
			// imposto ogni pallino per andare avanti
			avanti[i]=true;
			// ognuno al suo passo
			velocita[i] = Math.random()*7;
		}
		timeline.setCycleCount(Animation.INDEFINITE);
		timeline.play();

		pane.setPrefSize(LARGHEZZA_SCHERMO, ALTEZZA_SCHERMO);
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Palline orizzontali!");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void aggiornaTimer() {
		for (int i=0;i<pallini.length;i++ ) {
			double x=pallini[i].getCenterX();
			// incfremento posizione della palline
			if(avanti[i]==true) {
				x=x+velocita[i];
			}else {
				x=x-velocita[i];
			}
			
			// controllo se ogni pallina esc e a destra o sinistra
			if(x<=inizio) {
				avanti[i]=true;
			}
			if (x>LARGHEZZA_SCHERMO) {
				avanti[i]=false;
			}
			pallini[i].setCenterX(x);
			
			
			
		}
	  }
	
	public static void main(String args[]) {
		launch();
	}
}