/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopgroupassignment;

import java.util.ArrayList;
import javax.swing.JTextArea;
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
        
        ArrayList product = new ArrayList();
        ArrayList code = new ArrayList();
        ArrayList Price = new ArrayList();
        ArrayList Quantity = new ArrayList();
        ArrayList Total = new ArrayList();
        
        double price =0;
        double totalprice = 0;
        int totalquantity = 0;
        double Product1 = 0;
        double Product3 = 0;
        double Product4 = 0;
        String membershipstatus = "";
        String ProductCode = "";
        double rebate = 0;
        double discount = 0;
        double discount1 = 0;
        int counter =1;
        
        JOptionPane.showMessageDialog(null,"Welcome to UNIMY Online Store!","Output",JOptionPane.INFORMATION_MESSAGE);
        
            
        //String a = JOptionPane.showInputDialog(null,"Do you have membership card? \nA. Yes\nB. No","Membership",JOptionPane.QUESTION_MESSAGE);
        //char membership = a.charAt(0);    
        
        int a = JOptionPane.showConfirmDialog(null,
            "Do you have membership card?",
            "Choose One",
            JOptionPane.YES_NO_OPTION);
            
        if(true){
            discount = 0.1;
            
            membershipstatus= "Yes";
        }else{
            JOptionPane.showMessageDialog(null,"Please enter A or B only !","Membership",JOptionPane.WARNING_MESSAGE);
            
        }
        
        //JOptionPane.showMessageDialog(null,"------------------------------UNIMY ONLINE STORE-----------------------------\n","Catalog",JOptionPane.INFORMATION_MESSAGE);
        
        String message = "------------------------------------------------UNIMY ONLINE STORE----------------------------------------------------\n"
                + "------------------------------------------------------------------------------------------------------------------------------------\n"
                + "|\tProduct Code\t|\tProduct\t|\tPrice\t|\n"
                + "------------------------------------------------------------------------------------------------------------------------------------\n"
                + "|\t1\t|\tSHOE\t|\tRM 34.55\t|\n"
                + "|\t2\t|\tSHIRT\t|\tRM 44.29\t|\n"
                + "|\t3\t|\tPANTS\t|\tRM 64.35\t|\n"
                + "|\t4\t|\tJEANS\t|\tRM 84.20\t|\n"
                + "|\t5\t|\tFAN\t|\tRM 51.59\t|\n"
                + "|\t6\t|\tIRON\t|\tRM 24.45\t|\n"
                + "|\t7\t|\tTRAY\t|\tRM 51.99\t|\n"
                + "|\t8\t|\tRICE\t|\tRM 24.76\t|\n"
                + "------------------------------------------------------------------------------------------------------------------------------------\n";

         
        
        JOptionPane.showMessageDialog(null, new JTextArea(message),"Catalog",JOptionPane.PLAIN_MESSAGE);
        
        String b = JOptionPane.showInputDialog(null,"How many products that you want to purchase?","Product Purchasing",JOptionPane.QUESTION_MESSAGE);
        int NoProduct = Integer.parseInt(b);
        //int ProductDiscount = 0;
        
        for(int i = 0; i < NoProduct ; i++){
                
            counter = 1;
            
           while(counter>0){
                ProductCode = JOptionPane.showInputDialog(null,"Please enter product code :","Product Code",JOptionPane.QUESTION_MESSAGE);
                switch(ProductCode){
                    case "1":
                        price = 34.55;
                        counter = 0;
                        code.add("1");
                        product.add("SHOE");
                        Price.add("34.55");
                        break;
                    case "2":
                        price = 44.29;
                        counter = 0;
                        code.add("2");
                        product.add("SHIRT");
                        Price.add("44.29");
                        break;
                    case "3":
                        price = 64.35;
                        counter = 0;
                        code.add("3");
                        product.add("PANTS");
                        Price.add("64.35");
                        break;
                    case "4":
                        price = 84.20;
                        counter = 0;
                        code.add("4");
                        product.add("JEANS");
                        Price.add("84.20");
                        break;
                    case "5":
                        price = 51.59;
                        counter = 0;
                        code.add("5");
                        product.add("FAN");
                        Price.add("51.59");
                        break;
                    case "6":
                        price = 24.45;
                        counter = 0;
                        code.add("6");
                        product.add("IRON");
                        Price.add("24.45");
                        break;
                    case "7":
                        price = 51.99;
                        counter = 0;
                        code.add("7");
                        product.add("TRAY");
                        Price.add("51.99");
                        break;
                    case "8":
                        price = 24.76;
                        counter = 0;
                        code.add("8");
                        product.add("RICE");
                        Price.add("24.76");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Please enter a valid product code!","Warning",JOptionPane.WARNING_MESSAGE);
                        counter++;
                }
                
            }
            
            String d = JOptionPane.showInputDialog(null,"Please enter the quantity of product that you want to purchase:","Quantity",JOptionPane.QUESTION_MESSAGE);
            int ProductQuantity = Integer.parseInt(d);
            Quantity.add(ProductQuantity);
            
            switch (ProductCode) {
                case "1":
                    Product1 = (price*ProductQuantity);
                    break;
                case "3":
                    Product3 = (price*ProductQuantity);
                    break;
                case "4":
                    Product4 = (price*ProductQuantity);
                    //System.out.println(price);
                    break;
                default:
                    break;
            }
            

            double TotalQ = price*ProductQuantity;
            
            DecimalFormat df = new DecimalFormat("#.##");
            double total = Double.parseDouble(df.format(TotalQ));
            
            Total.add(total);
            totalprice += total;
            totalquantity += ProductQuantity;
        }
        
        discounts(Product1,Product3, Product4, rebate, totalprice, discount1);
        
        if (rebate != 0)
            totalprice = totalprice - rebate;
        
        
        double TotalPrice = totalprice - (totalprice*discount);
        TotalPrice = TotalPrice - (TotalPrice*discount1);
        TotalPrice = TotalPrice + (TotalPrice*0.06);
        
        DecimalFormat df = new DecimalFormat("#.##");
        double NewTotalPrice = Double.parseDouble(df.format(TotalPrice));
        
        
        counter = 1;
        while(counter>0){
        String e = JOptionPane.showInputDialog(null,"Total Price = RM"+NewTotalPrice+"\nEnter amount of your payment :","Payment",JOptionPane.QUESTION_MESSAGE);
        double pay = Double.parseDouble(e);
        if(pay>=NewTotalPrice){
        
            double balance = pay - TotalPrice;
            display( code, product, Price, Quantity, Total, NoProduct, totalquantity, membershipstatus, totalprice, rebate, discount1, NewTotalPrice, pay, balance);
            counter = 0;
        }else{
            JOptionPane.showMessageDialog(null,"Insufficient payment!","Warning",JOptionPane.INFORMATION_MESSAGE);
            counter++;
        }
        }
    }
    
    public static void discounts(double Product1,double Product3,double Product4, double rebate,double totalprice, double discount1){
        
        
        if(Product1 > 200)
            rebate += 25;
        else if(Product3 > 200)
            rebate += 25;
        else if(Product4 > 200)
            rebate += 25;
        
        
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
    }
    
    public static void display(ArrayList code, ArrayList product, ArrayList Price, ArrayList Quantity,ArrayList Total, int NoProduct, int totalquantity, String membershipstatus, double totalprice, double rebate, double discount1,double NewTotalPrice, double pay, double balance){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("\n\nyyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now)); //2016/11/16 12:08:43
        System.out.print("------------------------------UNIMY ONLINE STORE-----------------------------\n");
        System.out.print("Code\t\tName\t\tPrice\t\tQuantity\t\tTotal\n\n");
        System.out.print("-----------------------------------------------------------------------------\n");
        for(int a = 0 ; a < NoProduct; a++){
            System.out.println(code.get(a)+"\t\t"+product.get(a)+"\t\t"+Price.get(a)+"\t\t"+Quantity.get(a)+"\t\t"+Total.get(a));
        }
        System.out.print("-----------------------------------------------------------------------------\n");
        
        System.out.println("Total items quantity = "+totalquantity);
        System.out.println("Membership status = " + membershipstatus);
        
        if(membershipstatus == "Yes"){
            System.out.println("Membership Discount = 10%");
        }else if(membershipstatus == "No"){
            System.out.println("Membership Discount = 0%");
        }
        
            System.out.printf("Total Purchased = RM %.2f \n",totalprice);
            System.out.printf("Rebate = RM %.2f \n",rebate);
            System.out.println("Discount = " + (int)(discount1*100) + "%");
            System.out.println("Government Service Tax = 6%");
            System.out.print("-----------------------------------------------------------------------------\n");
            System.out.printf("Net Purchased = RM %.2f \n",NewTotalPrice);
            System.out.printf("Amount paid (cash) = RM %.2f \n", pay);
            System.out.printf("Change = RM %.2f \n",balance);
            
        
            System.out.print("-----------------------------------------------------------------------------\n");
    }
    
    
}
