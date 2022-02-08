//sample calculator(MADS)
import java.io.*;
import java.util.Scanner;

class Sample_calculator 
{
       
      public static void main(String args[])
      {
         // intialisation of variables
         int n1=0,n2=0;
         char operator = '/0';    // initialising char variable as null
         
         // creating object for scanner class
         Scanner s = new Scanner(System.in);
         
         // input for calculation
         
         System.out.println("     " + "Two Digit Calculator");
         System.out.println("\nEnter no.");
         n1 = s.nextInt();
         System.out.println("\nEnter Operator(+,-,*,/)");
         operator = s.next().charAt(0);
         System.out.println("\nEnter no.");
         n2 = s.nextInt();
         
         // creating object to access public methods of class
         Sample_calculator m = new Sample_calculator();
         
         switch(operator)
         {
            case '+':
            System.out.println("Answer= " + m.addition(n1,n2));
            break;
            
            case '-':
            System.out.println("Answer= " + m.sub(n1,n2));
            break;
            
            case '*':
            System.out.println("Answer= " + m.mul(n1,n2));
            break;
            
            case '/':
            System.out.println("Answer= " + m.div(n1,n2));
            break;
         } //end of switch case
         
      // Method for addition   
      public int addition(int n1, int n2) 
      {
      answer= n1 + n2;
      return answer;
      }
      
      // Method for substraction
      public int sub(int n1, int n2) 
      {
      answer= n1 - n2;
      return answer;
      }
      
      //Method for multiplication
      public int mul(int n1, int n2) 
      {
      answer= n1 * n2;
      return answer;
      }
      
      //Method for divison
      public int div(int n1, int n2) 
      {
      answer= n1 / n2;
      return answer;
      }
    
    } //end of main method
    
} 
