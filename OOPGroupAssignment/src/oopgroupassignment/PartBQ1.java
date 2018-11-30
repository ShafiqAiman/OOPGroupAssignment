/*UNIMY Transaction System
 * This program is a program to calculate the bill for purchasing products. The program has eight products which are shoe, shirt, pants, jeans, fan, iron, tray and rice.
 * The program also will calculate total discounts and deduct them from the total price.
 * 
 * @author (Mr Shafiq Aiman - B04180002)
 * @version 1.0
 */
package oopgroupassignment;

import java.util.ArrayList;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.*;


public class PartBQ1 {
    public static void main(String[] args){
        //ArrayList is used to store data of products,codes,prices,quantities and total
        ArrayList product = new ArrayList();
        ArrayList code = new ArrayList();
        ArrayList Price = new ArrayList();
        ArrayList Quantity = new ArrayList();
        ArrayList Total = new ArrayList();
        //Product is a class which consists SHOE,SHIRT,PANTS,JEANS,FAN,IRON,TRAY,RICE for object oriented programming technique
        Product SHOE = new Product("1", "SHOE", 34.55);
        Product SHIRT = new Product("2","SHIRT",44.29);
        Product PANTS = new Product("3","PANTS",64.35);
        Product JEANS = new Product("4","JEANS",84.20);
        Product FAN = new Product("5","FAN",51.59);
        Product IRON = new Product("6","IRON",24.25);
        Product TRAY = new Product("7","TRAY",51.99);
        Product RICE = new Product("8","RICE",24.76);
        //The objects consist code,product and price which are fixed values
        
        
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
        //welcoming window
        JOptionPane.showMessageDialog(null,"Welcome to UNIMY Supermarket!","Output",JOptionPane.INFORMATION_MESSAGE);
         
        //window for asking the membership
        int a = JOptionPane.showConfirmDialog(null,
            "Do you have membership card?",
            "Choose One",
            JOptionPane.YES_NO_OPTION);
            
        if(a == JOptionPane.YES_OPTION ){
            discount = 0.1;
            
            membershipstatus= "Yes";
        }else{
            discount = 0;
            membershipstatus = "No";
            
        }
        
        //displaying menu
        
        String message = "------------------------------------------------UNIMY Supermarket--------------------------------------------------------\n"
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
        //number of purchased products
        String b = JOptionPane.showInputDialog(null,"How many products that you want to purchase?","Product Purchasing",JOptionPane.QUESTION_MESSAGE);
        int NoProduct = Integer.parseInt(b);
       
        
        for(int i = 0; i < NoProduct ; i++){
                
            counter = 1;
            
           while(counter>0){
               //asking product code
                ProductCode = JOptionPane.showInputDialog(null,"Please enter product code :","Product Code",JOptionPane.QUESTION_MESSAGE);
                switch(ProductCode){
                    case "1":
                        price = 34.55;
                        counter = 0;
                        code.add(SHOE.code1);//code1 is the data stored in SHOE object
                        product.add(SHOE.product1);//product1 is the data stored in SHOE object
                        Price.add(SHOE.price1);//price1 is the data stored in SHOE object
                        break;
                    case "2":
                        price = 44.29;
                        counter = 0;
                        code.add(SHIRT.code1);
                        product.add(SHIRT.product1);
                        Price.add(SHIRT.price1);
                        break;
                    case "3":
                        price = 64.35;
                        counter = 0;
                        code.add(PANTS.code1);
                        product.add(PANTS.product1);
                        Price.add(PANTS.price1);
                        break;
                    case "4":
                        price = 84.20;
                        counter = 0;
                        code.add(JEANS.code1);
                        product.add(JEANS.product1);
                        Price.add(JEANS.price1);
                        break;
                    case "5":
                        price = 51.59;
                        counter = 0;
                        code.add(JEANS.code1);
                        product.add(JEANS.product1);
                        Price.add(JEANS.price1);
                        break;
                    case "6":
                        price = 24.45;
                        counter = 0;
                        code.add(IRON.code1);
                        product.add(IRON.product1);
                        Price.add(IRON.price1);
                        break;
                    case "7":
                        price = 51.99;
                        counter = 0;
                        code.add(TRAY.code1);
                        product.add(TRAY.product1);
                        Price.add(TRAY.price1);
                        break;
                    case "8":
                        price = 24.76;
                        counter = 0;
                        code.add(RICE.code1);
                        product.add(RICE.product1);
                        Price.add(RICE.price1);
                        break;
                    default:
                        //unexpected error
                        JOptionPane.showMessageDialog(null,"Please enter a valid product code!","Warning",JOptionPane.WARNING_MESSAGE);
                        counter++;
                }
                
            }
            //asking quantity
            String d = JOptionPane.showInputDialog(null,"Please enter the quantity of product that you want to purchase:","Quantity",JOptionPane.QUESTION_MESSAGE);
            int ProductQuantity = Integer.parseInt(d);
            //quantity will be stored in arraylist
            Quantity.add(ProductQuantity);
            //to find the total of products that can get rebate
            switch (ProductCode) {
                case "1":
                    Product1 = (price*ProductQuantity);
                    break;
                case "3":
                    Product3 = (price*ProductQuantity);
                    break;
                case "4":
                    Product4 = (price*ProductQuantity);
                    
                    break;
                
            }
            

            double TotalQ = price*ProductQuantity;
            //converting totalQ to 2 decimal points
            DecimalFormat df = new DecimalFormat("#.##");
            double total = Double.parseDouble(df.format(TotalQ));
            
            Total.add(total);
            totalprice += total;
            totalquantity += ProductQuantity;
        }
        
        
        //calculation for rebate
        rebate = discounts(Product1,Product3, Product4, rebate);
        
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
        
        
        //if rebate available, total price will deduct rebate
        if (rebate != 0)
            totalprice = totalprice - rebate;
        
        
        double TotalPrice = totalprice - (totalprice*discount);
        TotalPrice = TotalPrice - (TotalPrice*discount1);
        TotalPrice = TotalPrice + (TotalPrice*0.06);
        //converting totalprice to 2 decimal points
        DecimalFormat df = new DecimalFormat("#.##");
        double NewTotalPrice = Double.parseDouble(df.format(TotalPrice));
        
        
        counter = 1;
        while(counter>0){
        String e = JOptionPane.showInputDialog(null,"Total Price = RM"+NewTotalPrice+"\nEnter amount of your payment :","Payment",JOptionPane.QUESTION_MESSAGE);
        double pay = Double.parseDouble(e);
        //making sure payment is enough to pay the bill
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
    
    public static class Product{
        String code1;
        String product1;
        double price1;
       
        //constructor
        Product(String code1, String product1, double price1){
            this.code1 = code1;
            this.product1 = product1;
            this.price1 = price1;
            
        }
    }
    public static double discounts(double Product1,double Product3,double Product4, double rebate){
        
        
        if(Product1 > 200)
            rebate += 25;
        else if(Product3 > 200)
            rebate += 25;
        else if(Product4 > 200)
            rebate += 25;
        
        //rebate if more than RM 200
        
        
        return rebate;
    }
    
    public static void display(ArrayList code, ArrayList product, ArrayList Price, ArrayList Quantity,ArrayList Total, int NoProduct,
            int totalquantity, String membershipstatus, double totalprice, double rebate, double discount1,double NewTotalPrice, double pay, double balance){
        Date now = new Date(); // date and time of purchase
        System.out.println(now); //2016/11/16 12:08:43
        System.out.print("------------------------------UNIMY Supermarket-----------------------------\n");//display output
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
