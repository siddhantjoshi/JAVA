/******************************************************************************
Write a program to print all odd numbers till n.
*******************************************************************************/
import java.util.* ;

public class Main
{
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter nth number");
		int n = Scanner.nextInt();
		
		System.out.println("Odd number from 0 to "+ n);
		for(int i =0; i<n; i++){
		    if(i%2 != 0){
		        System.out.print(i+"\t");
		    }
		}
	}
}


/******************************************************************************
Ques2. Write a program to check if a given number is prime or not.
*******************************************************************************/
import java.util.* ;

public class Main
{
	public static void main(String[] args) {
	    System.out.println("Enter number");
	    Scanner Scanner = new Scanner(System.in);
	    int n = Scanner.nextInt();
	    
	    int flag = 0;
	    for(int i=2; i<n; i++){
	        if(n%i == 0){
	            flag = 1;
	        }
	    }
	    
	    if(flag == 0){
	        System.out.println("Number is prime number");
	    }else{
	        System.out.println("Number is not prime number");
	    }
	}
}


/******************************************************************************
Ques3. Write a program to print all prime numbers in a given range
*******************************************************************************/
import java.util.* ;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter Range");
		Scanner Scanner = new Scanner(System.in);
		int range1 = Scanner.nextInt();
		int range2 = Scanner.nextInt();
		
		for(int i = range1; i<=range2 ; i++){
		   int j ;
		    for(j=2; j<i; j++){
		        if(i%j == 0){
		            break;
		        }
		    }
		    
		    if(j == i){
		        System.out.print(j);
		    }
		}
	}
}
