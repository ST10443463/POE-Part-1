/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ST10443463.POE.Part1;

import javax.swing.JOptionPane;

/**
 *
 * @author Yashin
 */
public class Login {
        //decalre necessary variables 
    private static String username;
    private static String password;
    private static String firstName;
    private static String lastName;

   

    public static boolean checkUserName(String username) {
        //https://stackoverflow.com/questions/65926273/how-to-set-a-character-limit-in-java
        //add the username requirements
        return username.contains("_") && username.length() <= 5;
    }

    public static boolean checkPasswordComplexity(String password) {
        //add the password requirements 
        return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[a-z].*") && password.matches(".*\\d.*") && password.matches(".*[!@#$%^&()].*");
       //*\\d.* is a meta chatracter that matches any didgit from 0-9. useful in code that requires integers
       // https://stackoverflow.com/questions/47341745/java-password-checker-with-strings
       
    }
    

    public static boolean registerUser() {
        //Ibironke, A. (2021). Java Code: Login System. [Source code]. GitHub. https://gist.github.com/oyinibosi/a7cbce720d925f2c3a3a9aa90d1bf317
        firstName = JOptionPane.showInputDialog(null, "Enter first name:");
         //user enters name
        lastName = JOptionPane.showInputDialog(null, "Enter last name:");
          //user enters lastname
        username = JOptionPane.showInputDialog(null, "Enter username:");
          //user enters username
          
        
        if (checkUserName(username)) {
            
            JOptionPane.showMessageDialog(null, "Username successfully captured");
         
        } else {
              
            JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
            
            return false;
        }
        
       password = JOptionPane.showInputDialog(null, "Enter password: ");
            
       
        if (checkPasswordComplexity(password)) {
            
            JOptionPane.showMessageDialog(null, "Password successfully captured");
          
        } else {
             
            JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a lowercase letter, a number, and a special character.");
            
           
           
        }
         return false;   
    }


    public static boolean loginUser() {
       //user re-enters username and password to confirm
        String Username1 = JOptionPane.showInputDialog(null, "Confirm username:");
        String Password1 = JOptionPane.showInputDialog(null, "Confirm password:");

        if (Username1.equals(username) && Password1.equals(password)) {
            //message to be displayed if the login has been successful
            JOptionPane.showMessageDialog(null, "Welcome to EasyKanban" + " , " + firstName + " " + lastName + " ! ");
            return true;
        } else {
            //error when first password or username is not captured properly
            JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again.");
            
            return false;
        }    
        
    }

}

