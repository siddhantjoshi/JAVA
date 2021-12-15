/******************************************************************************
Ques1. Write a program to write a simple calculator.
*******************************************************************************/
import java.util.* ;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter Two numbers");
		Scanner Scanner = new Scanner(System.in);
		int num1 = Scanner.nextInt();
		int num2 = Scanner.nextInt();
		
		System.out.println("Enter Operaion to perform");
		System.out.println("+ \t- \t* \t/");
		char oprator = Scanner.next().charAt(0);
		switch(oprator){
		    case '+': System.out.print( num1+num2);break;
		    case '-': System.out.print( num1-num2);break;
		    case '*': System.out.print( num1*num2);break;
		    case '/': System.out.print( num1/num2);break;
		        
		}
	}
}

/******************************************************************************
Ques2. Write a program to find whether an alphabet is a vowel or a consonant.
*******************************************************************************/
import java.util.* ;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter alphabets");
		Scanner Scanner = new Scanner(System.in);
		char apl = Scanner.next().charAt(0);
		
		if(apl == 'a' || apl == 'e' || apl == 'i' || apl == 'o' || apl == 'u' || apl == 'A' || apl == 'E' || apl == 'I' || apl == 'O' || apl == 'U'){
		    System.out.println("Enterd alphabet is vowel");
		}else{
		    System.out.println("Enterd alphabet is consonant");
		}
	}
}
