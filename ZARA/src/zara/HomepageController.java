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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 *
 * @author student
 */
public class HomepageController implements Initializable 
{
    @FXML
    private AnchorPane AnchorPane;
    
    @FXML
    private Pane topPanel, bottomPanel;
    
    @FXML
    private ImageView mainLogo;
    
    @FXML
    private void handleButtonAction(ActionEvent event) 
    {
        System.out.println("You clicked me!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        mainLogo = new ImageView();
        Image mainLogoIcon = new Image(getClass().getResourceAsStream("/BigZaraIcon.png"));
        mainLogo.setImage(mainLogoIcon);
    }    
    
}
