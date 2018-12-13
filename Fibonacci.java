package fibonacci;

import javax.swing.JOptionPane;

/**
 *
 * @author kassy
 * April 3rd, 2018
 * the following program uses recursion to determine the Fibonacci number
 * of number the user inputs
 */

public class Fibonacci {

 
    public static void main(String[] args) {
        //create an interger for the n value being used
        int n = 0;
        
        //create a string that asks the user for the term the user wishes to see
         String number= JOptionPane.showInputDialog(
            "The first nine fibonacci numbers are listed as follows:\n"
         + "1, 1, 2, 3, 5, 8, 13, 21, 34,...\n"
         +"What fibonacci term would you like to see?");
         
         //turn the string into an interger
         n = Integer.parseInt(number);
         
         //print off the final number
        JOptionPane.showMessageDialog(null, "The " + n + "th fibonacci number is " + fact(n));
    } 
   //create method to determine Fibonacci's number
    public static int fact(int n){
       //if the number is greater than two, calculate Fibonacci's number 
     if(n > 2){
       return fact(n-1) + fact(n-2); 
     }
     //else aka one, return one
     else {
       return 1;  
      }
    } 
}
