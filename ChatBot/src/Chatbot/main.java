package Chatbot;

import java.util.Scanner;

public class main {
	
	/* This is a Basic ChatBot who can answer some basic question.*/
	
	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hello dear, What is your name?");
		System.out.print("-> ");
		String name = scan.nextLine();
		System.out.println("\n");
		System.out.println("Hey " +name+ ", I am Pikachu.");
		System.out.println("...");
		Thread.sleep(1000);
		System.out.println("How are you " +name+ "?");
		System.out.print("-> ");
		String say = scan.nextLine();
		System.out.println("\n");
		
		if("Not good".compareToIgnoreCase(say) ==0) {
			System.out.println(name+ ", Try to smile every time. Smile is good for the mind. ");
			System.out.println(name+ " Where are you from?");
		}
		else {
			System.out.println("Great " +name+ ". Where are you from?");
		}
		
		System.out.print("-> ");
		String address = scan.nextLine();
		System.out.println("\n");
		System.out.println("Wow.." +name+ " " +address+ " is very beautiful place.");
		Thread.sleep(1000);
		System.out.println("I am From Tangail...");
		Thread.sleep(1000);
		System.out.println("Do you want to visit my city?");
		System.out.print("-> ");
		String visit = scan.nextLine();
		System.out.println("\n");
		
		if("no".compareToIgnoreCase(visit)==0) {
			System.out.println("Ok! Not a problem. ");
			Thread.sleep(1000);
			System.out.println("I will visit your city oneday *_*");
			System.out.println("What are you doing now?");
		}
		else {
			System.out.println("I am waiting!!");
			System.out.println("I will visit your city oneday *_*");
			Thread.sleep(1000);
			System.out.println("What are you doing now?");
		}
		
		System.out.print("-> ");
		String doing = scan.nextLine();
		System.out.println("\n");
		System.out.println("I am reading. Don't you reading?");
		System.out.print("-> ");
		String read = scan.nextLine();
		System.out.println("\n");
		
		if("no".compareToIgnoreCase(read)==0) {
			System.out.println("Reading is very important. \nYou need to read carefully.");
			Thread.sleep(1000);
			System.out.println("Do you have cat?");
		}
		else {
			System.out.println("That's good. It's important");
			Thread.sleep(1000);
			System.out.println("Do you have cat?");
		}
		
		System.out.print("->");
		String cat = scan.nextLine();		
		System.out.println("\n");
		
		if("no".compareToIgnoreCase(cat)==0) {
			System.out.println("It's is very cute. You should get a cat.");
			Thread.sleep(1000);
			System.out.println("Have dinner at night?");
		}
		else {
			System.out.println("Wow great! What is the name of your cat?");
			System.out.print("->");
			String catName = scan.nextLine();
			System.out.println("\n");
			System.out.println("Have dinner at night?");
		}
		System.out.print("->");
		String dinner = scan.nextLine();
		System.out.println("\n");
		
		if("no".compareToIgnoreCase(dinner)==0) {
			System.out.println("You should have dinner now!");
			Thread.sleep(1000);
			System.out.println("Go and take dinner");
			Thread.sleep(1000);
			System.out.println("After dinner sit down to read.");
		}
		else {
			System.out.println("Great!");
			Thread.sleep(1000);
			System.out.println("Now sit down to read.");
		}
		System.out.print("->");
		String reads = scan.nextLine();
		System.out.println("\n");
		System.out.println("Ok!! Nice to talk.");
		Thread.sleep(1000);
		System.out.println("Good night!");
		System.out.print("->");
		String night = scan.nextLine();
		System.out.println("\n");
		
	}

}
