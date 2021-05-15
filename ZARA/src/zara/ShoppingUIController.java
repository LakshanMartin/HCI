/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zara;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author student
 */
public class ShoppingUIController implements Initializable
{   
    @FXML
    private AnchorPane shoppingUI;
 
    @FXML
    private Button mainLogoBtn;

    @FXML
    private Button mensTopBtn;
    
    @FXML
    private Button womensTopBtn;
    
    @FXML
    private Button kidsTopBtn;

    /**
     * Initializes the controller class with the implementation of the Fade 
     * Transition effect on the three main buttons present in the top panel.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        TranslateTransition logoTrans, mensTrans, womensTrans, kidsTrans;
        FadeTransition mensFade, womensFade, kidsFade;
        
        //Implement Main Logo animation effect
        logoTrans = new TranslateTransition();
        logoTrans.setByX(-775);
        logoTrans.setDuration(Duration.millis(3000));
        logoTrans.setNode(mainLogoBtn);
        logoTrans.play();
        
        //Implement Mens button animation effects
        mensTrans = new TranslateTransition();
        mensTrans.setByX(-395);
        mensTrans.setDuration(Duration.millis(3000));
        mensTrans.setNode(mensTopBtn);
        mensTrans.play();
        
        mensFade = new FadeTransition();
        mensFade.setDuration(Duration.millis(5000));
        mensFade.setFromValue(0.1);
        mensFade.setToValue(10);
        mensFade.setAutoReverse(false);
        mensFade.setNode(mensTopBtn);        
        mensFade.play();
        
        //Implement Womens button animation effects
        womensTrans = new TranslateTransition();
        womensTrans.setByX(-225);
        womensTrans.setDuration(Duration.millis(3000));
        womensTrans.setNode(womensTopBtn);
        womensTrans.play();
        
        womensFade = new FadeTransition();
        womensFade.setDuration(Duration.millis(5000));
        womensFade.setFromValue(0.1);
        womensFade.setToValue(10);
        womensFade.setAutoReverse(false);
        womensFade.setNode(womensTopBtn);
        womensFade.play();
        
        //Implement Kids button animation effects
        kidsTrans = new TranslateTransition();
        kidsTrans.setByX(-55);
        kidsTrans.setDuration(Duration.millis(3000));
        kidsTrans.setNode(kidsTopBtn);
        kidsTrans.play();
        
        kidsFade = new FadeTransition();
        kidsFade.setDuration(Duration.millis(5000));
        kidsFade.setFromValue(0.1);
        kidsFade.setToValue(10);
        kidsFade.setAutoReverse(false);
        kidsFade.setNode(kidsTopBtn);
        kidsFade.play();
    }    

    /**
     * Load the Homepage window
     * @param event
     * @throws IOException 
     */
    @FXML
    private void loadHomepage(MouseEvent event) throws IOException
    {
        AnchorPane homepage = FXMLLoader.load(getClass().getResource("Homepage.fxml"));
        shoppingUI.getChildren().setAll(homepage);
    }
    
    /**
     * Link to the ShoppingCart window
     * @param event
     * @throws IOException 
     */
    @FXML
    private void loadShoppingCart(MouseEvent event) throws IOException
    {
        AnchorPane shoppingCart = FXMLLoader.load(getClass().getResource("ShoppingCart.fxml"));
        shoppingUI.getChildren().setAll(shoppingCart);
    }
    
    /**
     * Reloads ShoppingUI window
     * @param event
     * @throws IOException 
     */
    @FXML
    private void loadShoppingUI(MouseEvent event) throws IOException
    {
        AnchorPane reloadUI = FXMLLoader.load(getClass().getResource("ShoppingUI.fxml"));
        shoppingUI.getChildren().setAll(reloadUI);
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
