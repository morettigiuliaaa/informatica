package it.edu.iisgubbio.negozio;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class KebabComboBox extends Application{
	GridPane pannello = new GridPane();
	ComboBox<String> cCarne = new ComboBox<>();
	ComboBox<String> cVerdure = new ComboBox<>();
	ComboBox<String> cSalse = new ComboBox<>();
	Button bCalcola= new Button("Totale");
	Label eRisultato= new Label();
	Label eCarne= new Label("seleziona carne");
	Label eVerdure= new Label("seleziona verdura");
	Label eSalse= new Label("seleziona salsa");
	Label eTotale= new Label("Totale conto");
	Label ePrezzoCarne= new Label();
	Label ePrezzoVerdure= new Label();
	Label ePrezzoSalse= new Label();
	
	 public void start(Stage finestra){
		    bCalcola.setAlignment(Pos.CENTER);
			eRisultato.setAlignment(Pos.CENTER);
			
			pannello.add(eCarne, 0, 0);
		    pannello.add(eVerdure,0,1);
		    pannello.add(eSalse, 0, 2);
	        pannello.add(cCarne, 1, 0);
	        pannello.add(cVerdure,1,1);
	        pannello.add(cSalse, 1, 2);
	        pannello.add(bCalcola,1,4);
	        pannello.add(eRisultato,1,5);
	        pannello.add(eTotale,0,5);
	        pannello.add(ePrezzoCarne, 3, 0);
		    pannello.add(ePrezzoVerdure,3,1);
		    pannello.add(ePrezzoSalse, 3, 2);
	        cCarne.getItems().add("pollo");
	        cCarne.getItems().add("maiale");
	        cCarne.getItems().add("vitello");
	        cCarne.getItems().add("tofu");
	        cVerdure.getItems().add("insalata");
	        cVerdure.getItems().add("cipolla");
	        cVerdure.getItems().add("pomodoro");
	        cVerdure.getItems().add("carota");
	        cSalse.getItems().add("mayonese");
	        cSalse.getItems().add("piccante");
	        cSalse.getItems().add("yogurt");
	        cSalse.getItems().add("tzatziki");
	        cCarne.setPrefWidth(100);
	        cVerdure.setPrefWidth(100);
	        cSalse.setPrefWidth(100);
	        cCarne.setOnAction(e-> prezzocarne());
	        cVerdure.setOnAction(e-> prezzoverdure());
	        cSalse.setOnAction(e-> prezzosalse());
	        bCalcola.setOnAction(e-> azione());
	        pannello.setHgap(10); 
			pannello.setVgap(10);
			bCalcola.setMaxWidth(200);
			pannello.setPadding(new Insets(10, 10, 10, 10));
	        
	        Scene scena = new Scene(pannello, 290,290);
	        finestra.setScene(scena);
	        finestra.setTitle("KebabComboBoX!!!");
	        finestra.show();
	    }
	 
	 public void prezzocarne() {
		 String carne = cCarne.getValue();
	        switch(carne) {
	        case "pollo":
	        	ePrezzoCarne.setText("3€");
	        	break;
	        case "maiale":
	        	ePrezzoCarne.setText("2.5€");
	        	break;
	        case "vitello":
	        	ePrezzoCarne.setText("4€");
	        	break;
	        case "tofu":
	        	ePrezzoCarne.setText("3€");
	        	break;
	        
	        }
	 }
	 
	 public void prezzoverdure() {
		 String verdure = cVerdure.getValue();
		 switch(verdure) {
	        case "insalata":
	        	ePrezzoVerdure.setText("0.5€");
	        	break;
	        case "cipolla":
	        	ePrezzoVerdure.setText("0.5€");
	        	break;
	        case "pomodoro":
	        	ePrezzoVerdure.setText("1€");
	        	break;
	        case "carota":
	        	ePrezzoVerdure.setText("1€");
	        	break;
	        
	        }
	 }
	 
	 public void prezzosalse() {
		 String salsa = cSalse.getValue();
		 switch(salsa) {
	        case "mayonese":
	        	ePrezzoSalse.setText("0.5€");
	        	break;
	        case "piccante":
	        	ePrezzoSalse.setText("1€");
	        	break;
	        case "yogurt":
	        	ePrezzoSalse.setText("0.5€");
	        	break;
	        case "tzatziki":
	        	ePrezzoSalse.setText("0.5€");
	        	break;
	        
	        }
	 }
	 
	 public void azione() {
	        String carne = cCarne.getValue();
	        String verdure = cVerdure.getValue();
	        String salsa = cSalse.getValue();
	        double totale=0;
	        switch(carne) {
	        case "pollo":
	        	totale+=3.0;
	        	break;
	        case "maiale":
	        	totale+=2.5;
	        	break;
	        case "vitello":
	        	totale+=4.0;
	        	break;
	        case "tofu":
	        	totale+=3.0;
	        	break;
	        
	        }
	        
	        switch(verdure) {
	        case "insalata":
	        	totale+=0.5;
	        	break;
	        case "cipolla":
	        	totale+=0.5;
	        	break;
	        case "pomodoro":
	        	totale+=1.0;
	        	break;
	        case "carota":
	        	totale+=1.0;
	        	break;
	        
	        }
	        
	        switch(salsa) {
	        case "mayonese":
	        	totale+=0.5;
	        	break;
	        case "piccante":
	        	totale+=1.0;
	        	break;
	        case "yogurt":
	        	totale+=0.5;
	        	break;
	        case "tzatziki":
	        	totale+=0.5;
	        	break;
	        
	        }
	        
	        eRisultato.setText(" "+totale+"€");
	    }
	 
	public static void main(String[] args) {
		launch(args);
		}
	}