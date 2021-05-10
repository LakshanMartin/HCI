/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zara;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author student
 */
public class ShoppingCartController implements Initializable
{
    @FXML
    private AnchorPane shoppingCart;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }   
    
    @FXML
    private void loadHomepage(MouseEvent event) throws IOException
    {
        AnchorPane homepage = FXMLLoader.load(getClass().getResource("Homepage.fxml"));
        shoppingCart.getChildren().setAll(homepage);
    }
    
    /**
     * Reloads ShoppingUI window
     * @param event
     * @throws IOException 
     */
    @FXML
    private void loadShoppingUI(MouseEvent event) throws IOException
    {
        AnchorPane shoppingUI = FXMLLoader.load(getClass().getResource("ShoppingUI.fxml"));
        shoppingCart.getChildren().setAll(shoppingUI);
    }
    
    @FXML
    private void loadShoppingCart(MouseEvent event) throws IOException
    {
        AnchorPane reloadUI = FXMLLoader.load(getClass().getResource("ShoppingCart.fxml"));
        shoppingCart.getChildren().setAll(reloadUI);
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