import java.util.*;
public class Latihan1{
	public static void main(String []args){

	Scanner sc = new Scanner(System.in);

	String cake ="";
	String name ="";
	int choose = 0;
	int quantity = 0;
	int price = 0;
	String topping;
	int index = 0;


	Vector<String> vCake = new Vector();
	Vector<Integer> vQuantity = new Vector();
	Vector<Integer> vPrice = new Vector();
	Vector<String> vTopping = new Vector();

	System.out.println("");
	System.out.println("Welcome to KS Cake Store");

	do{

	System.out.println("Input your username[5...10] :");
	name = sc.nextLine();

	}while(name.length() <5 || name.length() >10);

	for(int i = 0; i<25; i++){
		System.out.println("");
	}


	do{

		System.out.println("KSCakeStore");
		System.out.println("Welcome, "+name);
		System.out.println("===========");
		System.out.println("1. Order Cake");
		System.out.println("2. View Cake");
		System.out.println("3. Update Cake");
		System.out.println("4. Take Cake");
		System.out.println("5. Exit");
		System.out.println("Choose>> ");
		choose = sc.nextInt();
		sc.nextLine();

		if(choose == 1){

			for(int i = 0; i<25; i++){
				System.out.println("");
			}

			do{
				System.out.print("Insert new cake must start with ck [5..10]:");
				cake = sc.nextLine();

			}while(cake.length() < 5 || cake.length() > 10 || !cake.startsWith("ck"));

			do{
				System.out.print("Insert quantity cake[3..8]: ");

				try{

					quantity = sc.nextInt();
				}catch(Exception e){
					System.out.println("Input must be a number");
				}

				sc.nextLine();

			}while(quantity <3 || quantity >5);


			do{
				System.out.print("Insert Quantity Price [10000..50000] : ");

				try{

					price = sc.nextInt();


				}catch(Exception e){
					System.out.println("Input must be a number");
				}

				sc.nextLine();

			}while(price <10000 || price >50000);

			do{
				System.out.print("Insert Topping Cake [Chocolate|Strawberry|Cream]:");
				topping = sc.nextLine();

			}while(topping.equals("Chocolate") && topping.equals("Strawberry") && topping.equals("Cream"));

			vCake.add(cake);
			vQuantity.add(quantity);
			vPrice.add(price);
			vTopping.add(topping);

			System.out.print("Press enter to continue");
			sc.nextLine();
		}

		else if(choose == 2){

			for(int i = 0; i<25; i++){
				System.out.println("");
			}

			if(vCake.size()==0){
				System.out.print("There is no data!");
				System.out.print("Press enter to continue");
				sc.nextLine();
			}

			else{
				for(int i = 0; i < vCake.size(); i++){
					System.out.println((i+1)+"."+vCake.get(i)+" "+vQuantity.get(i)+" "+vPrice.get(i)+" "+vTopping.get(i));

				}
				System.out.print("Press enter to continue");
				sc.nextLine();
			}

		}

		else if(choose == 3){
			for(int i = 0; i<25; i++){
				System.out.println("");
			}

			if(vCake.size()==0){
				System.out.print("There is no data!");
				System.out.print("Press enter to continue");
				sc.nextLine();
			}

			else{
				for(int i = 0; i < vCake.size(); i++){
					System.out.println((i+1)+"."+vCake.get(i)+" "+vQuantity.get(i)+" "+vPrice.get(i)+" "+vTopping.get(i));

				}
				do{
					System.out.print("Update cake :");
					cake = sc.nextLine();
					index = vCake.indexOf(cake);
				}while(index == -1);


				do{
					System.out.print("Insert new cake must start with ck [5..10]:");
					cake = sc.nextLine();

				}while(cake.length() < 5 || cake.length() > 10 || !cake.startsWith("ck"));

				do{
					System.out.print("Insert quantity cake[3..8]: ");

					try{

						quantity = sc.nextInt();
					}catch(Exception e){
						System.out.println("Input must be a number");
					}

					sc.nextLine();

				}while(quantity <3 || quantity >5);


				do{
					System.out.print("Insert Quantity Price [10000..50000] : ");

					try{

						price = sc.nextInt();


					}catch(Exception e){
						System.out.println("Input must be a number");
					}

					sc.nextLine();

				}while(price <10000 || price >50000);

				do{
					System.out.print("Insert Topping Cake [Chocolate|Strawberry|Cream]:");
					topping = sc.nextLine();

				}while(topping.equals("Chocolate") && topping.equals("Strawberry") && topping.equals("Cream"));

				vCake.set(index, cake);
				vQuantity.set(index, quantity);
				vPrice.set(index, price);
				vTopping.set(index, topping);

				System.out.print("Press enter to continue");
				sc.nextLine();
			}

		}


	}while(choose != 5);


	}
}