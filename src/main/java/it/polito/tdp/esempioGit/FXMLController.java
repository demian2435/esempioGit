package it.polito.tdp.esempioGit;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txt_nome;

    @FXML
    private TextField txt_eta;

    @FXML
    private Button btn_ok;

    @FXML
    private Label lbl_risposta;

    @FXML
    void handle_btn_ok(ActionEvent event) {
    	
    	// CONTROLLO DATI INSERITI
    	String nome = txt_nome.getText();
    	if(nome.length() == 0) {
    		lbl_risposta.setText("Inserisci un nome!");
    		return;
    	}
    	String etaString = txt_eta.getText();
    	if(nome.length() == 0) {
    		lbl_risposta.setText("Inserisci l'età!");
    		return;
    	}
    	
    	int eta;
    	try {
    		eta = Integer.parseInt(etaString);
    	} catch(Exception e) {
    		lbl_risposta.setText("Inserisci un'età valida!");
    		return;
    	}
    	
    	// ALGORITMO DI SCELTA SALUTO
    	String saluto;
    	if(eta < 18) {  		
    		saluto = "Ciao " + nome + "!";	
    	} else {		
    		saluto = "Buongiorno " + nome + "!";  		
    	}
    	
    	// AGGIONRAMENTO LABEL
    	lbl_risposta.setText(saluto);
    }

    @FXML
    void initialize() {
        assert txt_nome != null : "fx:id=\"txt_nome\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txt_eta != null : "fx:id=\"txt_eta\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btn_ok != null : "fx:id=\"btn_ok\" was not injected: check your FXML file 'Scene.fxml'.";
        assert lbl_risposta != null : "fx:id=\"lbl_risposta\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
