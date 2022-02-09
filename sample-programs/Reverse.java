import java.util.Scanner;

public class Reverse {
	public static void main(String[] args)
	   {
	      int i, j, x;
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter the Size of Array: ");
	      int size = scan.nextInt();
	      int[] arr = new int[size];
	      
	      System.out.print("Enter " +size+ " Elements for the Array: ");
	      for(i=0; i<size; i++)
	         arr[i] = scan.nextInt();
	      scan.close();
	      j = size-1;
	      for(i=0; i<j; i++, j--)
	      {
	         x = arr[i];
	         arr[i] = arr[j];
	         arr[j] = x;
	      }
	      
	      System.out.println("\nReverse of Given Array is: ");
	      for(i=0; i<size; i++)
	         System.out.print(arr[i]+ " ");
	   }

}
