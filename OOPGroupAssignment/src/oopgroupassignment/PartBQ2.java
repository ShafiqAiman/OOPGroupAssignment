/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopgroupassignment;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.security.auth.Subject;
/**
 *
 * @author Dr Shafiq Aiman
 */
public class PartBQ2 {
    
    //public static float pointer;
    
    public static void main(String[]args){
        Subject Subject1 = new Subject("BIS1513","Intro to Information Systems",3);
        Subject Subject2 = new Subject("BIT1214","C++ Programming I", 4);
        Subject Subject3 = new Subject("BIT2333","Interactive Multimedia",3);
        Subject Subject4 = new Subject("BIT1312","Multimedia Technology",2);
        Subject Subject5 = new Subject("BIE2243","Interaction Design",3);
        
        
        
       ArrayList name = new ArrayList();
       ArrayList id = new ArrayList();
       ArrayList ISMarks = new ArrayList();
       ArrayList CMarks = new ArrayList();
       ArrayList IMMarks = new ArrayList();
       ArrayList IDMarks = new ArrayList();
       ArrayList MTMarks = new ArrayList();
       ArrayList ISGrade = new ArrayList();
       ArrayList CMGrade = new ArrayList();
       ArrayList IMGrade = new ArrayList();
       ArrayList IDGrade = new ArrayList();
       ArrayList MTGrade = new ArrayList();
       ArrayList ISPoints = new ArrayList();
       ArrayList CMPoints = new ArrayList();
       ArrayList IMPoints = new ArrayList();
       ArrayList IDPoints = new ArrayList();
       ArrayList MTPoints = new ArrayList();
       
        
        int marks = 0;
        String grade = "";
        double TGPoints = 0;
        double TCHours = 0;
        float points = 0;
        String status = "";
        
        int TotalIS = 0;
        int TotalCM = 0;
        int TotalIM = 0;
        int TotalMT = 0;
        int TotalID = 0;
        
        float averageIS = 0;
        float averageCM = 0;
        float averageIM = 0;
        float averageMT = 0;
        float averageID = 0;
        
        
        
        String a = JOptionPane.showInputDialog(null,"Please enter the number of students :","Students",JOptionPane.QUESTION_MESSAGE);
        int NoStudents = Integer.parseInt(a);
        
        for(int i = 0; i < NoStudents ; i++){
            String Name = JOptionPane.showInputDialog(null,"Please enter Student "+(i+1)+" name :","Marks",JOptionPane.QUESTION_MESSAGE);
            name.add(Name);
            
            String ID = JOptionPane.showInputDialog(null, "Please insert his or her student ID", "Exam Result System",JOptionPane.QUESTION_MESSAGE);
            int j= ID.length();
            Validate(j);
            id.add(ID);
            
            String StrIS= JOptionPane.showInputDialog(null, "Please key in marks for Intro to Information Systems", "Exam Result System",JOptionPane.QUESTION_MESSAGE);  
            int intIS = Integer.parseInt(StrIS);
            ISMarks.add(intIS);
            grade = grading(intIS,grade);
            ISGrade.add(grade);
            points = pointer(intIS,points);
            ISPoints.add(points);
            
            String StrCProg= JOptionPane.showInputDialog(null, "Please key in marks for C++ Programming 1", "Exam Result System",JOptionPane.QUESTION_MESSAGE);
            int intCProg = Integer.parseInt(StrCProg);  
            CMarks.add(intCProg);
            grade = grading(intCProg,grade);
            CMGrade.add(grade);
            points = pointer(intCProg,points);
            CMPoints.add(points);
            
            String StrIM= JOptionPane.showInputDialog(null, "Please key in marks for Interactive Multimedia", "Exam Result System",JOptionPane.QUESTION_MESSAGE);
            int intIM = Integer.parseInt(StrIM);   
            IMMarks.add(intIM);
            grade = grading(intIM,grade);
            IMGrade.add(grade);
            points = pointer(intIM,points);
            IMPoints.add(points);
            
            String StrMT= JOptionPane.showInputDialog(null, "Please key in marks for Multimedia Technology", "Exam Result System",JOptionPane.QUESTION_MESSAGE);
            int intMT = Integer.parseInt(StrMT);
            MTMarks.add(intMT);
            grade = grading(intMT,grade);
            MTGrade.add(grade);
            points = pointer(intMT,points);
            MTPoints.add(points);
            
            String StrIDesign= JOptionPane.showInputDialog(null, "Please key in marks for Interaction Design", "Exam Result System",JOptionPane.QUESTION_MESSAGE);
            int intIDesign = Integer.parseInt(StrIDesign);   
            IDMarks.add(intIDesign);
            grade = grading(intIDesign,grade);
            IDGrade.add(grade);
            points = pointer(intIDesign,points);
            IDPoints.add(points);
            
            float GradePoints1 = (float)ISPoints.get(i)* Subject1.credit;
            float GradePoints2 = (float)CMPoints.get(i)* Subject2.credit;
            float GradePoints3 = (float)IMPoints.get(i)* Subject3.credit;
            float GradePoints4 = (float)MTPoints.get(i)* Subject4.credit;
            float GradePoints5 = (float)IDPoints.get(i)* Subject5.credit;
            float GPA = (GradePoints1 + GradePoints2 + GradePoints3 + GradePoints4 + GradePoints5)/15;
            
            if((GPA>=2.00) && (GPA<=4.00)){
                status = "PASS";
            }else if((GPA>=0.00)&&(GPA<2.00)){
                status = "FAIL";
            }
            
            
            TotalIS += (int)ISMarks.get(i);
            TotalCM += (int)CMarks.get(i);
            TotalIM += (int)IMMarks.get(i);
            TotalMT += (int)MTMarks.get(i);
            TotalID += (int)IDMarks.get(i);
                   
            System.out.printf("Name : %s\t\tID NO : %s\n",name.get(i),id.get(i));
            System.out.println("-------------------------------------------------------------------------------------------------------------");
            System.out.println("Code\t\tCourse\t\t\t\t\tCredit\tMarks\tGrade\tPoints\tTotal Points");
            System.out.println("-------------------------------------------------------------------------------------------------------------");
            System.out.println(Subject1.code+"\t\t"+Subject1.course+"\t\t"+Subject1.credit+"\t"+ISMarks.get(i)+"\t"+ISGrade.get(i)+"\t"+ISPoints.get(i)+"\t"+ GradePoints1);
            System.out.println(Subject2.code+"\t\t"+Subject2.course+"\t\t\t"+Subject2.credit+"\t"+CMarks.get(i)+"\t"+CMGrade.get(i)+"\t"+CMPoints.get(i)+"\t"+ GradePoints2);
            System.out.println(Subject3.code+"\t\t"+Subject3.course+"\t\t\t"+Subject3.credit+"\t"+IMMarks.get(i)+"\t"+IMGrade.get(i)+"\t"+IMPoints.get(i)+"\t"+ GradePoints3);
            System.out.println(Subject4.code+"\t\t"+Subject4.course+"\t\t\t"+Subject4.credit+"\t"+MTMarks.get(i)+"\t"+MTGrade.get(i)+"\t"+MTPoints.get(i)+ "\t"+GradePoints4);
            System.out.println(Subject5.code+"\t\t"+Subject5.course+"\t\t\t"+Subject5.credit+"\t"+IDMarks.get(i)+"\t"+IDGrade.get(i)+"\t"+IDPoints.get(i)+ "\t"+GradePoints5);
            System.out.println("-------------------------------------------------------------------------------------------------------------");
            System.out.printf("Your GPA : %.2f \n",GPA);
            System.out.printf("Status : %s \n",status);
            System.out.println("-------------------------------------------------------------------------------------------------------------"); 
            
        }
        
        System.out.println("Summary\n");
        
        averageIS = TotalIS/NoStudents;
        averageCM = TotalCM/NoStudents;
        averageIM = TotalIM/NoStudents;
        averageMT = TotalMT /NoStudents;
        averageID = TotalID/NoStudents;
        
        System.out.printf("Intro to Information System :\t %.2f \n",averageIS);
        System.out.printf("C++ Programming I :\t\t %.2f \n",averageCM);
        System.out.printf("Interactive Multimedia :\t %.2f \n",averageIM); 
        System.out.printf("Multimedia Technology :\t\t %.2f \n",averageMT);
        System.out.printf("Interaction Design :\t\t %.2f \n\n",averageID);
        
        double highest=averageIS;//this if and else statement determines which is the highest by comparing each other
        if(averageCM>highest){
           highest=averageCM;
           }
         if(averageIM>highest){
           highest=averageIM;
           }
        if(averageMT>highest){
           highest=averageMT;
           }
        if(averageID>highest){
           highest=averageID;
           }
        double lowest=averageIS;//this if and else statement determines which is the lowest by comparing each other
        if(averageCM<lowest){
           lowest=averageCM;
           }
         if(averageIM<lowest){
           highest=averageIM;
           }
        if(averageMT<lowest){
           highest=averageMT;
           }
        if(averageID<lowest){
           highest=averageID;
           }
        else if(highest==averageIS)//this if statements identify the best subject
            System.out.println("Best Subject :Intro to Information System");
        else if(highest==averageCM)
            System.out.println("Best Subject :C++ Programming");
        else if(highest==averageIM)
            System.out.println("Best Subject :Interactive Multimedia");
        else if(highest==averageMT)
            System.out.println("Best Subject :Multimedia Technology");
        else if(highest==averageID)
            System.out.println("Best Subject :Interaction Design");
        
        if(lowest==averageIS)//this if statements identify the worst subjects
            System.out.println("Worst Subject :Intro to Information System");
        else if(lowest==averageCM)
            System.out.println("Worst Subject :C++ Programming");
        else if(lowest==averageIM)
            System.out.println("Worst Subject :Interactive Multimedia");
        else if(lowest==averageMT)
            System.out.println("Worst Subject :Multimedia Technology");
        else if(lowest==averageID)
            System.out.println("Worst Subject :Interaction Design");
    }
    
    public static class Subject{
        
        String code;
        String course;
        int credit;
        
        Subject(String code, String course, int credit){
            this.code = code;
            this.course = course;
            this.credit = credit;
        }
    }
    
    public static void Validate(int m){
    if ((m<4) || (m>4)){
    JOptionPane.showMessageDialog(null, "Student ID invalid. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static String grading(int marks, String grade){
        if((marks>=0) && (marks < 40)){
                grade = "F";
               
            }else if((marks>=40)&&(marks<45)){
                grade = "D";
                
            }else if((marks>=45)&&(marks<50)){
                grade = "C-";
                
            }else if((marks>=50)&&(marks<55)){
                grade = "C";
                
            }else if((marks>=55)&&(marks<60)){
                grade = "C+";
                
            }else if((marks>=60)&&(marks<65)){
                grade = "B-";
                
            }else if((marks>=65)&&(marks<70)){
                grade = "B";
                
            }else if((marks>=70)&&(marks<75)){
                grade = "B+";
                
            }else if((marks>=75)&&(marks<80)){
                grade = "A-";
                
            }else if((marks>=80)&&(marks<=100)){
                grade = "A";
                
            }else{
                System.out.println("Please enter a valid mark!");
            }
        return grade;
    }
    
    public static float pointer(double marks, float points){
        if((marks>=0) && (marks < 40)){
                
                points=(float) 0.00;
            }else if((marks>=40)&&(marks<45)){
                
                points=(float) 1.33;
            }else if((marks>=45)&&(marks<50)){
                
                points=(float) 1.67;
            }else if((marks>=50)&&(marks<55)){
                
                points=(float) 2.00;
            }else if((marks>=55)&&(marks<60)){
                
                points=(float) 2.33;
            }else if((marks>=60)&&(marks<65)){
                
                points=(float) 2.67;
            }else if((marks>=65)&&(marks<70)){
                
                points=(float) 3.00;
            }else if((marks>=70)&&(marks<75)){
                
                points=(float) 3.33;
            }else if((marks>=75)&&(marks<80)){
                
                points=(float) 3.67;
            }else if((marks>=80)&&(marks<=100)){
                
                points=(float) 4.00;
            }else{
                System.out.println("Please enter a valid mark!");
            }
        return points;
    }
}
