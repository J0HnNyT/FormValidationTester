/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formvalidationtester;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ValidationMethodCheckers {
            //nameTextField
    public boolean isNameValid(String name){
Pattern p = Pattern.compile("[A-Z][a-zA-Z]*\\s[a-zA-z]+(['-][a-zA-Z]+)*");
        Matcher m = p.matcher(name);
        if (m.find() && m.group().equals(name)){
            System.out.println(name);
            return true;
        }
        else{
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Invalid User Name");
            alert.setHeaderText(null);
            alert.setContentText("Please Enter a Valid User Name");
            alert.showAndWait();
            return false;
        }
    }
           
    //idTextField
    public boolean isIDValid(String id){
        Pattern p = Pattern.compile("[z]{1}[0-9]{7}");
        Matcher m = p.matcher(id);
        if (m.find() && m.group().equals(id)){
            System.out.println(id);
            return true;
        }
        else{
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Invalid ID");
            alert.setHeaderText(null);
            alert.setContentText("Please Enter a Valid ID Number");
            alert.showAndWait();
            return false;
        }
    }
   
    //phoneNumberTextField
    public boolean isPhoneNumberValid(String PhoneNumber){   
Pattern p = Pattern.compile("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}"
   + "|" + "[1]\\s*[(]*[1-9]\\d{2}[)]*\\s*[1-9]\\d{2}-\\d{4}");
        Matcher m = p.matcher(PhoneNumber);
        if (m.find() && m.group().equals(PhoneNumber)){
            System.out.println(PhoneNumber);
            return true;
        }
        else{
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Invalid Phone Number");
            alert.setHeaderText(null);
            alert.setContentText("Please Enter a Valid PhoneNumber");
            alert.showAndWait();
            return false;
        }
    }
   
    //emailTextField
    public boolean isEmailValid(String email){   
        Pattern p = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.com");
        Matcher m = p.matcher(email);
        if (m.find() && m.group().equals(email)){
            System.out.println(email);
            return true;
        }
        else{
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Invalid Email");
            alert.setHeaderText(null);
            alert.setContentText("Please Enter a Valid Email");
            alert.showAndWait();
            return false;
        }
    }
    
    public void ConfirmAlertBox(){
        Alert confirm = new Alert(AlertType.INFORMATION);
        confirm.setTitle("Please Confirm");
        confirm.setHeaderText(null);
        confirm.setContentText("Form Submitted Successfully!");
        confirm.showAndWait();
        System.out.println("Form Submitted!");
    }
    
}//End ValidationMethodCheckers class.