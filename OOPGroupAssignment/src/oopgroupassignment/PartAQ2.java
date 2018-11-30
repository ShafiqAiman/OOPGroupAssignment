/*


 @author Mr Thyaga
*/
package oopgroupassignment;



import javax.swing.JOptionPane;
public class PartAQ2 {
    
    public static void main(String[] args) {
        int total=0;
        int vowel=0;
        int consonant=0;       
     String a = JOptionPane.showInputDialog(null, "Please Enter A Name","Counter",JOptionPane.QUESTION_MESSAGE);    
        String noSpace = a.replaceAll(" ",""); //Delete the space
        total = noSpace.length();
        if (total<3)//Exeption
            JOptionPane.showMessageDialog(null,"Name must be more than 3 characters. Please try again.","COUNTER",JOptionPane.ERROR_MESSAGE);
        else{
        String caps = noSpace.toUpperCase();//Convert string to uppercase              
        for(int i=0;i<=caps.length()-1;i++){ 
            if (caps.charAt(i)=='A'||caps.charAt(i)=='E'||caps.charAt(i)=='I'||caps.charAt(i)=='O'||caps.charAt(i)=='U')
               vowel++;                 
            else
                consonant++;                 
       }   
       JOptionPane.showMessageDialog(null,"Your Name = "+a+"\nTotal Characters = "+total+"\nVowels = "+vowel+"\nConsonants = "+consonant,"COUNTER",JOptionPane.INFORMATION_MESSAGE);
    }
   }
  }