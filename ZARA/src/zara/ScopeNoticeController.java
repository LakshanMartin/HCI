/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zara;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author student
 */
public class ScopeNoticeController implements Initializable
{

    @FXML
    private Button closeBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    

    /**
     * Close this window on button click
     * @param event 
     */
    @FXML
    private void closeWindow(ActionEvent event)
    {
        Stage stage = (Stage)closeBtn.getScene().getWindow();
        stage.close();
    }
}
