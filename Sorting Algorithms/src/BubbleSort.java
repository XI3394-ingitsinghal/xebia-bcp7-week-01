import java.util.Scanner;

public class BubbleSort {
	
	static void bubbleSort(int arr[], int n)
    {                                       
        if (n == 1)                     //passes are done
        {
            return;
        }

        for (int i=0; i<n-1; i++)       //iteration through unsorted elements
        {
            if (arr[i] > arr[i+1])      //check if the elements are in order
            {                           //if not, swap them
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
            
        bubbleSort(arr, n-1);           // iterate till the loop ends
    }

	void display(int arr[])                     //display the array
    { 
        for (int i=0; i<arr.length; i++) 
        {
            System.out.print(arr[i]+" ");
        }  
    } 
  
    public static void main(String args[]) 
    { 
        SelectionSort ob = new SelectionSort(); 
        int arr[] = new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 no.s ");
        for(int i=0;i<=4;i++) {
        	arr[i]= sc.nextInt();
        }
        bubbleSort(arr, arr.length);
        ob.display(arr);
    } 
}
