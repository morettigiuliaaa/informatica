package it.edu.iisgubbio.testi;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Lettere extends Application {
	   TextField inserireFrase = new TextField(); 
	   GridPane griglia= new GridPane();
	   Button calcola= new Button("calcola");
	   Button trattini= new Button("trattini");
	   Label frase = new Label("Inserire frase:");
	   Label risultato = new Label();
	   Label risultatoTrattini = new Label();
	   String nome;

	   public void start(Stage finestra){
	      griglia.add(frase, 0, 0);
	      griglia.add(inserireFrase, 1, 0);
	      griglia.add(calcola, 0, 1);
	      griglia.add(trattini, 0, 2);
	      griglia.add(risultato, 1, 1);
	      griglia.add(risultatoTrattini, 1, 2);
	      griglia.setHgap(10); 
	      griglia.setVgap(20);
	      calcola.setOnAction(e->contatore());
	      trattini.setOnAction(e->trattini());
	      griglia.setPadding(new Insets(10, 10, 10, 10));
	      Scene scena = new Scene (griglia);
	      finestra.setTitle("lettere!");
	      finestra.setScene(scena);
	      finestra.show();
	      
	   }
		   public void contatore() {
			  int contatore=0;
		      nome=inserireFrase.getText().toLowerCase();
		      char x[]=nome.toCharArray();
		      for (int i=0;i<x.length;i++) {
		    	  if(x[i]=='a') {
		    		  contatore+=1;
		    	  }
		    	  if(x[i]=='e') {
		    		  contatore+=1;
		    	  }
		    	  if(x[i]=='i') {
		    		  contatore+=1;
		    	  }
		    	  if(x[i]=='o') {
		    		  contatore+=1;
		    	  }
		    	  if(x[i]=='u') {
		    		  contatore+=1;
		    	  }
		      }
		      risultato.setText(""+contatore);
		   }
		   
		   public void trattini() {
			  String fine="";
		      nome=inserireFrase.getText().toLowerCase();
		      char x[]=nome.toCharArray();
		      for (int i=0;i<x.length;i++) {
		    	  if(x[i]=='a') {
		    		  x[i]='-';
		    	  }
		    	  if(x[i]=='e') {
		    		  x[i]='-';
		    	  }
		    	  if(x[i]=='i') {
		    		  x[i]='-';
		    	  }
		    	  if(x[i]=='o') {
		    		  x[i]='-';
		    	  }
		    	  if(x[i]=='u') {
		    		  x[i]='-';
		    	  }
		      }
		      fine=new String(x);
	    	  risultatoTrattini.setText(fine);
		   }
	   
	   public static void main(String[] args) {
		   launch(args);
	   }
	}