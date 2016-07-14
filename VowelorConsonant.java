# vowel.java
import java.util.Scanner;


public class Consonant {

	
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
	System.out.println("the given character is a vowel");
	}
else{
	System.out.println("the given character is a consonant");
}

	}

}
