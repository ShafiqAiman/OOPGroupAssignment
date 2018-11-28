/**
 * Lottery Machine
 * (Description
 *    )
 * @Aiman the Code King (Aiman Syakirin Basri - B04180049)
 * @version 1.0
 */

package oopgroupassignment;

import javax.swing.*;
import java.util.*;

public class PartAQ1 {
    
    public static int digit1;
    public static int digit2;
    public static int digit3;
    
    public static void Verify(int m){
        if (m!= 3){
        JOptionPane.showMessageDialog(null, "Number invalid. Please reenter a three digit number", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static class Seperator{
        
        public void Seperate(int m){
           digit1= (m/100) % 10;
           digit2= (m/10) % 10;
           digit3 = m % 10;
        }

        public Seperator() {
        }
    
    }
    
    public static void main(String[] args) {
        
        int lot = (int) (Math.random()*1000);
        System.out.printf("%3d\n",lot);

        Seperator lotnumber= new Seperator();
        lotnumber.Seperate(lot);
            {
             ArrayList lottery = new ArrayList();
             lottery.add(digit1);
             lottery.add(digit2);
             lottery.add(digit3);
             System.out.println(lottery);
            }

         String Strinput= JOptionPane.showInputDialog(null, "Please insert a three digit number", "LOTTERY",JOptionPane.QUESTION_MESSAGE);
         int Intinput = Integer.parseInt(Strinput);

         int k= Strinput.length();
         Verify(k);

        Seperator inputnumber= new Seperator();
        inputnumber.Seperate(Intinput);

            {
             ArrayList input= new ArrayList();
             input.add(digit1);
             input.add(digit2);
             input.add(digit3);
             System.out.println(input);
            }

    // if (input==lottery)
       //     JOptionPane.showMessageDialog(null,"You just won RM5000!", "Award", JOptionPane.INFORMATION_MESSAGE);
         //   JOptionPane.showMessageDialog(null,"You just won RM2000!", "Award", JOptionPane.INFORMATION_MESSAGE);    
          //  JOptionPane.showMessageDialog(null,"You just won RM500!", "Award", JOptionPane.INFORMATION_MESSAGE);
    }
}