/**
 * Lottery Machine
 * (Description. Machine generate a three digit number. User will guess the number and try to key in the number. 
 * Different outcomes will arise based on the accuracy of the input compared to the generated number.)
 * @Aiman the Code King (Aiman Syakirin Basri - B04180049)
 * @version 1.0
 */

package oopgroupassignment;

import javax.swing.*;
import java.util.*;
import java.util.ArrayList;

public class PartAQ1 {
    
    public static int digit1;
    public static int digit2;
    public static int digit3;
    
    public static void Verify(int m){
        if (m!= 3){
        JOptionPane.showMessageDialog(null, "Number invalid. Please re-enter a three digit number", "ERROR", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
        }
    }
    
    public static class Seperator{
        
        public void Seperate(int m){ //to extract a digit from an integer
           digit1= (m/100) % 10;
           digit2= (m/10) % 10;
           digit3 = m % 10;
        }

        public Seperator() { //default constructor
        }
    }
    
    public static void main(String[] args) {
        
        int lot = (int) (Math.random()*1000); //to generate a  random number

        Seperator lotnumber= new Seperator(); 
        lotnumber.Seperate(lot);
            
             ArrayList lottery = new ArrayList(); //holds the digits of the generated number 
             lottery.add(digit1);
             lottery.add(digit2);
             lottery.add(digit3);

         String Strinput= JOptionPane.showInputDialog(null, "Please insert a three digit number", "LOTTERY",JOptionPane.QUESTION_MESSAGE);
         int Intinput = Integer.parseInt(Strinput);

         int k= Strinput.length();
         Verify(k);

        Seperator inputnumber= new Seperator();
        inputnumber.Seperate(Intinput);

             ArrayList input= new ArrayList();  //holds the digits of the input 
             input.add(digit1);
             input.add(digit2);
             input.add(digit3);
             
            boolean retval= input.containsAll(lottery); // returns a true value when input has the same elements as lottery
            
            if (Objects.equals(input, lottery)){
                JOptionPane.showMessageDialog(null,"Congrats, you just won RM5000!\nLottery number: "+lot, "Award", JOptionPane.INFORMATION_MESSAGE);
            }else if (retval == true){
                JOptionPane.showMessageDialog(null,"You just won RM2000. Not bad!\nLottery number: "+lot, "Award", JOptionPane.INFORMATION_MESSAGE); 
            }else if (input.get(0)==(lottery.get(0))||input.get(1)==(lottery.get(1))|| input.get(2)==(lottery.get(2)))     {
                  JOptionPane.showMessageDialog(null,"You just won RM500.\nLottery number: "+lot, "Award", JOptionPane.INFORMATION_MESSAGE); 
            }else{
                JOptionPane.showMessageDialog(null,"Not your lucky day "+":("+" Try again.\nLottery number: "+lot, "Award", JOptionPane.INFORMATION_MESSAGE); 
            }
    }
}