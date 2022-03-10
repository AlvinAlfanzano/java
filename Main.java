import java.util.*;
public class Main{

	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);

	String name;
	String major;
	int quantity = 0;
	int price = 0;
	int discount = 0;
	int totalPrice = 0;

	System.out.println("================");
	System.out.println("Register Form");
	System.out.println("================");
	System.out.println("");
	System.out.println("");

		do{
			System.out.print("Input your name [5..30]: ");
			name = scan.nextLine();
		}while(name.length() < 5 || name.length() > 30);

		do{
			System.out.print("Choose your major [Computer Science | Information System]: ");
			major = scan.nextLine();
		}while(!major.equals("Computer Science") && !major.equals("Information System"));

		if(major.equals("Computer Science")){
			price = 200000;
		}
		else if(major.equals("Information System")){
			price = 150000;
		}

		do{
			System.out.print("Quantity of Form [1..10]: ");
			quantity = scan.nextInt();
		}while(quantity < 1 || quantity > 10);
		scan.nextLine();

		price = price * quantity;

		if(quantity >= 5){
			discount = price * 2/10;
		}
		else if(quantity >= 3){
			discount = price * 1/10;
		}
		else{
			discount = price * 0;
		}

		totalPrice = price - discount;

	System.out.println("                Registration Form");
	System.out.println("                =================");
	System.out.println("Name                            : "+name);
	System.out.println("Major                           : "+major);
	System.out.println("Quantity                        : "+quantity);
	System.out.println("Discount                        : "+discount);
	System.out.println("Total price                     : "+totalPrice);
	System.out.println("");
	System.out.println("");
	System.out.println("        - Thanks for coming -");

	}
}