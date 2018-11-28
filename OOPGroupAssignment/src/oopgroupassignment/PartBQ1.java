/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopgroupassignment;

import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.*;

/**
 *
 * @author Dr Shafiq Aiman
 */
public class PartBQ1 {
    public static void main(String[] args){
        double totalprice = 0;
        int totalquantity = 0;
        double Product1 = 0;
        double Product3 = 0;
        double Product4 = 0;
        String membershipstatus = "";   
        double rebate = 0;
        JOptionPane.showMessageDialog(null,"Welcome to UNIMY Online Store!","Output",JOptionPane.INFORMATION_MESSAGE);
        
        double discount = 0;
        
        int counter =1;
        
        while(counter > 0){
            
        String a = JOptionPane.showInputDialog(null,"Do you have membership card? \nA. Yes\nB. No","Membership",JOptionPane.QUESTION_MESSAGE);
        char membership = a.charAt(0);    
        
            
        if((membership == 'A')||(membership == 'a')){
            discount = 0.1;
            counter = 0;
            membershipstatus= "Yes";
        }else if((membership == 'B') || (membership == 'b')){
            discount = 0;
            counter = 0;
            membershipstatus = "No";
        }else{
            JOptionPane.showMessageDialog(null,"Please enter A or B only !","Membership",JOptionPane.WARNING_MESSAGE);
            counter++;
        }
        }
        String b = JOptionPane.showInputDialog(null,"How many products that you want to purchase?","Membership",JOptionPane.QUESTION_MESSAGE);
        int NoProduct = Integer.parseInt(b);
        //int ProductDiscount = 0;
        
        while(NoProduct>0){
            String ProductCode = JOptionPane.showInputDialog(null,"Please enter product code :","Product Code",JOptionPane.QUESTION_MESSAGE);
            
            //int counter = 1;
            
           // while(counter>0){
                double price =0;
                switch(ProductCode){
                    case "1":
                        price = 34.55;
                        //counter = 0;
                        break;
                    case "2":
                        price = 44.29;
                        //counter = 0;
                        break;
                    case "3":
                        price = 64.35;
                        //counter = 0;
                        break;
                    case "4":
                        price = 84.20;
                        //counter = 0;
                        break;
                    case "5":
                        price = 51.59;
                        //counter = 0;
                        break;
                    case "6":
                        price = 24.45;
                        //counter = 0;
                        break;
                    case "7":
                        price = 51.99;
                        //counter = 0;
                        break;
                    case "8":
                        price = 24.76;
                        //counter = 0;
                        break;
                    default:
                        System.out.println("Please enter a valid product code!");
                        //counter++;
                }
            //}
            System.out.print("price = "+price+" ");
            String d = JOptionPane.showInputDialog(null,"Please enter the quantity of product that you want to purchase:","Membership",JOptionPane.QUESTION_MESSAGE);
            int ProductQuantity = Integer.parseInt(d);
            
            /*
            if(ProductCode == "1"){
                Product1 = (price*ProductQuantity);
            }else if(ProductCode == "3"){
                Product3 = (price*ProductQuantity);
            }else if(ProductCode == "4"){
                Product4 = (price*ProductQuantity);
                System.out.println(Product4);
            }
//          */
            
            
            NoProduct -= ProductQuantity;
            System.out.println(ProductQuantity);
            totalprice += (price*ProductQuantity);
            totalquantity += ProductQuantity;
        }
        
        
        if(Product1 > 200)
            rebate += 25;
        if(Product3 > 200)
            rebate += 25;
        if(Product4 > 200)
            rebate += 25;
        
        
            
        
        
        //double TotalPrice = totalprice - (totalprice*discount);
        
        double discount1 = 0;
        if((totalprice>200)&&(totalprice<=500)){
            discount1 = 0.1;
        }else if((totalprice > 500)&&(totalprice<=1000)){
            discount1 = 0.2;
        }else if((totalprice > 1000)&&(totalprice<=2000)){
            discount1 = 0.3;
        }else if(totalprice > 2000){
            discount1 = 0.5;
        }else{
            discount1 = 0;
        }
        
        
        //System.out.println("discount1 = " + discount1);
        /*
        if (rebate == 0){
            TotalPrice = TotalPrice - 0;
        }else{
            TotalPrice = TotalPrice - rebate;
        }
        */
        
        double TotalPrice = totalprice - (totalprice*discount);
        //System.out.println("TotalPrice = "+TotalPrice);
        TotalPrice = TotalPrice - (TotalPrice*discount1);
        //System.out.println("TotalPrice = "+TotalPrice);
        TotalPrice = TotalPrice + (TotalPrice*0.06);
        
        DecimalFormat df = new DecimalFormat("#.##");
        double NewTotalPrice = Double.parseDouble(df.format(TotalPrice));
        String e = JOptionPane.showInputDialog(null,"Total Price = RM"+NewTotalPrice+"\nEnter amount of your payment :","Payment",JOptionPane.QUESTION_MESSAGE);
        double pay = Double.parseDouble(e);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("\n\nyyyy/MM/dd HH:mm:ss");
	LocalDateTime now = LocalDateTime.now();
	System.out.println(dtf.format(now)); //2016/11/16 12:08:43
        System.out.print("------------------------------UNIMY ONLINE STORE-----------------------------\n");
        System.out.print("Code\t\tName\t\tPrice\t\tQuantity\t\tTotal\n\n\n");
        System.out.print("-----------------------------------------------------------------------------\n");
        
        System.out.println("Total items quantity = "+totalquantity);
        System.out.println("Membership status = " + membershipstatus);
        
        if(membershipstatus == "Yes"){
            System.out.println("Membership Discount = 10%");
        }else if(membershipstatus == "No"){
            System.out.println("Membership Discount = 0%");
        }
        
        System.out.printf("Total Purchased = RM %.2f \n",totalprice);
        //System.out.println("Rebate = RM "+rebate);
        System.out.println("Discount = " + discount1*100 + "%");
        System.out.println("Government Service Tax = 6%");
        System.out.print("-----------------------------------------------------------------------------\n");
        System.out.printf("Net Purchased = RM %.2f \n",TotalPrice);
        //amount paid
        //balance
        
        System.out.print("-----------------------------------------------------------------------------\n");
    }
}
