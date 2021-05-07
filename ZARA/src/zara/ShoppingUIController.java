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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

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
    private ImageView homepageCrumb;

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
        shoppingUI.getChildren().setAll(homepage);
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
    
    @FXML
    private void navCrumbClicked(MouseEvent event) throws IOException
    {
        Image crumbClicked = new Image(getClass().getResourceAsStream("/Homepage-NavPressed.png")); 
        homepageCrumb = new ImageView();
        homepageCrumb.setImage(crumbClicked);
                
        //loadHomepage(event);
    }
}
