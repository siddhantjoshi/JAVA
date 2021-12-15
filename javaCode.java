/******************************************************************************
Q #1) How can you reverse a string?
*******************************************************************************/
import java.util. *;
import java. io.*;

public class Main
{
	public static void main(String[] args) {
	    System.out.println("Enter Size of array");
	    Scanner Scanner = new Scanner(System.in);
	    int size = Scanner.nextInt();
	    
	    int arr[] = new int[size];
	    System.out.println("Enter Number in an array ");
	    for (int i=0; i<arr.length; i++ ){
	        arr[i] = Scanner.nextInt();
	    } 
	    
	    for (int i =arr.length-1; i>=0; --i){
	        System.out.print(arr[i]);
	    } 
	}
}




/******************************************************************************
Q #2) What is a palindrome string?
*******************************************************************************/
import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
	    
	    //get size from user
	    System.out.println("Enter Size of array");
	    Scanner Scanner = new Scanner(System.in);
	    int size = Scanner.nextInt();
	    
	    //Get values in array
	    System.out.println("Enter Values in array");
	    int arr[] = new int[size];
	    for (int i=0; i< arr.length; i++ ){
	      arr[i] = Scanner.nextInt();  
	    } 
	    
	    //Check palandrom
    	    int arr1[] = new int[size]; 
    	    for(int i = arr.length-1, j=0; i>= 0; i--, j++){
    	        arr1[j] = arr[i];
    	    }
    	    //Check 
    	    if(Arrays.equals(arr1,arr)){
    	        System.out.println("Is palandrom");
    	    }else{
    	        System.out.println("Not palandrom");
    	    }
    	    
    	    
		
	}
}



/******************************************************************************
Q #3) How to get the Dublicate number in an array?
*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter Size");
		Scanner Scanner = new Scanner(System.in);
		int size = Scanner.nextInt();
		
		System.out.println("Enter values in array");
		int arr[] = new int[size];
		for (int i=0; i< arr.length; i++ ){
		    arr[i] = Scanner.nextInt();
		} 
		
		System.out.println("Dublicate valuse in array are:");
		for(int i=0; i<arr.length; i++){
		    for(int j= i+1; j<arr.length; j++){
		        if(arr[i] == arr[j]){
		            System.out.print(arr[j]);
		            break;
		        }
		    }
		}
	}
}



/******************************************************************************
Q #11) How to search a missing number in an array that contains integers from 1 to 100?
*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int arr[] = {1, 2, 4, 6, 3, 7, 8};
		int sum = 0;
		int sum1 = (arr.length+1) *((arr.length+1) +1)/2;
		
		for (int i =0; i<arr.length; i++){
		    sum = sum +arr[i];
		} 
		System.out.println(sum1-sum);
		
	}
}


/******************************************************************************
Q #13) How to delete the repeated elements in an integer array?
*******************************************************************************/
import java.util.* ;

public class Main
{
	public static void main(String[] args) {
	    int arr[] = {10,70,30,90,20,20,30,40,70,50};
	    Arrays.sort(arr);
	    int size = arr.length;
	    int temp[] = new int[size];
	    int j =0;
	    
	    for(int i=0; i<size-1; i++){
	        if(arr[i] != arr[i+1]){
	            temp[j++] = arr[i];
	        }
	    }
	    temp[j++] = arr[size-1];
	    
	    for(int i =0; i< j; i++){
	        System.out.print(temp[i]+ " ");
	    }
	    
	}
}


/******************************************************************************
Q #14) Determine the largest and the smallest element of an array which is not sorted.
*******************************************************************************/
import java.util.* ;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter size of array");
		Scanner Scanner = new Scanner(System.in);
		int size = Scanner.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter Values in array");
		for(int i=0; i<size; i++){
		    arr[i] = Scanner.nextInt();
		}
		
		//approach 1:
    		Arrays.sort(arr);
    		System.out.println("Smallest Value in array is: "+ arr[0]);
    		System.out.println("Largest Value in array is: "+ arr[size-1]);
	}
}


/******************************************************************************
Q #15) Explain the bubble sort algorithm.
*******************************************************************************/
import java.util.* ;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter size of array");
		Scanner Scanner = new Scanner(System.in);
		int size = Scanner.nextInt();
		
		System.out.println("Enter Values in array");
		int arr[] = new int[size];
		for (int i=0; i<size; i++){
		    arr[i] = Scanner.nextInt();
		} 
		
		for (int i =0; i< size; i++){
		    for(int j = 1 ;j <size; j++){
		         if(arr[j-1]> arr[j]){
		             arr[j] =  arr[j] ^ arr[j-1] ;
		             arr[j-1] =  arr[j] ^ arr[j-1] ;
		             arr[j] =  arr[j] ^ arr[j-1] ;
		         }
		    }
		}
		
		for (int i =0; i< size; i++ ){
		    System.out.print(arr[i]+" ");
		} 
	}
}
