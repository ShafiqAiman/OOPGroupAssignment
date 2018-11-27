/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopgroupassignment;

import javax.swing.JOptionPane;

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
        JOptionPane.showMessageDialog(null,"Welcome to UNIMY Online Store!","Output",JOptionPane.INFORMATION_MESSAGE);
        String a = JOptionPane.showInputDialog(null,"Do you have membership card? \nA. Yes\nB. No","Membership",JOptionPane.QUESTION_MESSAGE);
        char membership = a.charAt(0);
        double discount = 0;
        if((membership == 'A')||(membership == 'a')){
            discount = 0.1;
            String membershipstatus = "Yes";
        }else{
            discount = 0;
            String membershipstatus = "No";
        }
        String b = JOptionPane.showInputDialog(null,"How many products that you want to purchase?","Membership",JOptionPane.QUESTION_MESSAGE);
        int NoProduct = Integer.parseInt(b);
        int ProductDiscount = 0;
        
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
            
            if(ProductCode == "1"){
                Product1 += (price*ProductQuantity);
            }else if(ProductCode == "3"){
                Product3 += (price*ProductQuantity);
            }else if(ProductCode == "4"){
                Product4 += (price*ProductQuantity);
            }
            
            
            
            NoProduct -= ProductQuantity;
            System.out.println(ProductQuantity);
            totalprice += (price*ProductQuantity);
            totalquantity += ProductQuantity;
        }
        
        double rebate = 0;
        if(Product1 > 200)
            rebate += 25;
        if(Product3 > 200)
            rebate += 25;
        if(Product4 > 200)
            rebate += 25;
        
        
            
        
        
        double TotalPrice = totalprice - (totalprice*discount);
        
        double discount1 = 0;
        if((TotalPrice>200)&&(TotalPrice<=500)){
            discount1 = 0.1;
        }else if((TotalPrice > 500)&&(TotalPrice<=1000)){
            discount1 = 0.2;
        }else if((TotalPrice > 1000)&&(TotalPrice<=2000)){
            discount1 = 0.3;
        }else if(TotalPrice > 2000){
            discount1 = 0.5;
        }else{
            discount1 = 0;
        }
        
        if (rebate == 0){
            TotalPrice = TotalPrice - (TotalPrice*discount1);
        }else{
            TotalPrice = TotalPrice - (TotalPrice*discount1) - rebate;
        }
        
        
        
        TotalPrice = TotalPrice + (TotalPrice*0.06);
        
        
        System.out.print("------------------------------UNIMY ONLINE STORE-----------------------------\n");
        System.out.print("Code\t\tName\t\tPrice\t\tQuantity\t\tTotal\n\n\n");
        //System.out.println("Membership status = "+membershipstatus);
        System.out.println("total price = "+totalprice);
        System.out.println("actual total price = "+TotalPrice);
        System.out.println("Total Quantity of purchased products = "+totalquantity);
        
    }
}
