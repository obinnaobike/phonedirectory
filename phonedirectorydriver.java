package main;
import java.lang.*;
import java.util.*;
public class phonedirectorydriver {
public static void main(String[] args){
	phonedirectory phonebook;
	System.out.println("my phonebook");
	System.out.println("would like to enter the path of your file");
	Scanner input = new Scanner(System.in);
	String answer = input.nextLine();
	if(answer == "yes"){
		System.out.println("enter the path of file");
		String path = input.nextLine();
		phonebook = new phonedirectory(path);
	}
	else{phonebook = new phonedirectory();}
	
System.out.println("what would you like to do");
System.out.println("A Search a phonebook entry");
System.out.println(" B.add a contact");
System.out.println("C. delete a contact");
System.out.println("D. change an entry");
String answer2 = input.nextLine();
if (answer2 == "A")
	}
}
}
