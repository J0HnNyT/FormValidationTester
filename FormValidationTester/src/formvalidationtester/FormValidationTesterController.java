/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formvalidationtester;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Johnny
 */
public class FormValidationTesterController extends ValidationMethodCheckers
   implements Initializable {
   
    @FXML
    private Button submitButton;

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField idTextField;

    @FXML
    private TextField phoneNumberTextField;

    @FXML
    private TextField emailTextField;

     @FXML
    void submitButtonPressed(ActionEvent event) {
        
        boolean r1, r2, r3, r4;
        //nameTextField
        r1 = isNameValid(nameTextField.getText());
        //idTextField
        r2 = isIDValid(idTextField.getText());
        //phoneNumberTextField
        r3 = isPhoneNumberValid(phoneNumberTextField.getText());
        //emailTextField
        r4 = isEmailValid(emailTextField.getText());
           
        if (r1 && r2 && r3 && r4 == true){
            Stage submittedStage = new Stage();
            submittedStage.setTitle("Submitted Information");
            Text name = new Text("Name: " + nameTextField.getText());
            Text id = new Text("ID: " + idTextField.getText());
            Text phoneNumber = new Text
                ("Phone Number: " + phoneNumberTextField.getText());
            Text email = new Text("email: " + emailTextField.getText());
            VBox vbox = new VBox();
            vbox.setSpacing(8);
            vbox.setPadding(new Insets(15,15,15,15));            
            vbox.getChildren().addAll(name, id, phoneNumber, email);
            submittedStage.setScene(new Scene(vbox, 300, 250));
            submittedStage.showAndWait();
            
            ConfirmAlertBox();            
            System.exit(0);
        }        
    }//End submitButtonPressed ActionEvent.

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
   
}//End Controller class.
