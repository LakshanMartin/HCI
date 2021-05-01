/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zara;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author student
 */
public class HomepageController implements Initializable 
{
    @FXML
    private AnchorPane homepage;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
    }    

    /**
     * Link to the ShoppingUI window
     * @param event
     * @throws IOException 
     */
    @FXML
    private void loadShoppingUI(MouseEvent event) throws IOException
    {
        AnchorPane shoppingUI = FXMLLoader.load(getClass().getResource("ShoppingUI.fxml"));
        homepage.getChildren().setAll(shoppingUI);
    }

    /**
     * Creates popup window with "Out of scope" message.
     * @param event
     * @throws IOException 
     */
    @FXML
    private void loadScopeNotice(MouseEvent event) throws IOException
    {
        AnchorPane scopeNotice = FXMLLoader.load(getClass().getResource("ScopeNotice.fxml"));
        
        Stage stage = new Stage();
        stage.setTitle("Out of scope notice");
        stage.setScene(new Scene(scopeNotice, 600, 300));
        stage.show();
    }
}
