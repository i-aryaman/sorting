package sorting;
import java.io.*;
import java.util.Scanner;

public class NewSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Scanner sc=new Scanner(System.in);
    	int j=sc.nextInt();
    	int arr[]=new int[j];
    	for(int i=0;i<j;i++)
    	{
    		arr[i]=sc.nextInt();
    	}
                System.out.println("Input Array");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(arr);  
                 
                System.out.println("Bubble Sorted Array:");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
   

	}  
    static void bubbleSort(int[] arr) 
    {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    } 
}