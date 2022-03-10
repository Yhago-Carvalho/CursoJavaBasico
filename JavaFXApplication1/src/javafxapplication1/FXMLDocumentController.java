/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package javafxapplication1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Computer
 * SEMPRE QUE HOUVER implements É PQ ESTÁ FAZENDO UMA INTERFACE
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    /**
     * COMANDOS PARA ADIÇÃO DE CONTROLES
     */
    private Label lblMensagem;
    private Button btnClick;
    
    /**
     * UTILIZA FXML PARA CRIAR O CÓDIGO DO EVENTO
     * @param event 
     */
    @FXML
    private void clicouBotao(ActionEvent event) {
        lblMensagem.setText("Olá Mundo");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
