//sample calculator(MADS)

import java.util.Scanner;

class Calculator 
{
       
      public static void main(String args[])
      {
         // Initialization of variables
         int n1=0,n2=0,answer;
         char operator;    //Initializing char variable as null
         
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
         Calculator m = new Calculator();
         
         switch(operator)
         {
            case '+':
            System.out.println("Answer= " + (n1+n2));
            break;
            
            case '-':
            System.out.println("Answer= " + (n1-n2));
            break;
            
            case '*':
            System.out.println("Answer= " + (n1*n2));
            break;
            
            case '/':
            System.out.println("Answer= " + (n1/n2));
            break;
            
            default:
            	System.out.println("Wrong Operator");
            	break;
         } //end of switch case
         
    
    
    } //end of main method
    
} 
