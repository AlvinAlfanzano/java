import java.util.*;
public class Quiz2{
	public static void main(String[] args){

		int choose = 0;
		Scanner scan = new Scanner(System.in);
		String type = "";
		String name = "";
		float calorie;
		int price = 0;
		int index = 0;

		Vector<String> vType = new Vector<>();
		Vector<String> vName = new Vector<>();
		Vector<Float> vCalorie = new Vector<>();
		Vector<Integer> vPrice = new Vector<>();

		do{
			System.out.println("Food Order");
			System.out.println("==========");
			System.out.println("1. Insert new food");
			System.out.println("2. List of food");
			System.out.println("3. Search food");
			System.out.println("4. Delete food");
			System.out.println("5. Update Food");
			System.out.println("6. Exit");
			System.out.println("Choose : ");
			choose = scan.nextInt();
			scan.nextLine();

			if(choose == 1){
				System.out.println("Input food's type[Appetizer | Main Course | Dessert]: ");
				type = scan.nextLine();
				System.out.println("Input food's name[3-20]: ");
				name = scan.nextLine();
				System.out.println("Input food's calories[1.0..4.0]:");
				calorie = scan.nextFloat();
				scan.nextLine();
				System.out.println("Input food's price[10000..50000]:");
				price = scan.nextInt();
				scan.nextLine();
				System.out.println("Data hasbeen success insert");
				scan.nextLine();

				vType.add(type);
				vName.add(name);
				vCalorie.add(calorie);
				vPrice.add(price);

			}
			else if(choose == 2){
				int totalPrice = 0;
				if(vType.size() == 0){
					System.out.println("No data");
					scan.nextLine();
				}
				else{
					for(int i = 0; i<vType.size(); i++){
						System.out.println(vType.get(i)+" "+vName.get(i)+" "+vCalorie.get(i)+" "+vPrice.get(i));
						totalPrice = totalPrice + vPrice.get(i);
					}
					System.out.println("Total Price = "+totalPrice);
				}
			}
			else if(choose == 3){

				System.out.println("Input food's name[3-20]: ");
				name = scan.nextLine();
				index = vName.indexOf(name);

				if(index == -1){
					System.out.println("Data is not found");
					scan.nextLine();
				}
				else{
					System.out.println(index);
				}

			}
			else if(choose == 4){

				System.out.println("Input food's name[3-20]: ");
				name = scan.nextLine();
				index = vName.indexOf(name);

				if(index == -1){
					System.out.println("Data is not found");
					scan.nextLine();
				}
				else{
					vType.remove(index);
					vName.remove(index);
					vPrice.remove(index);
					vCalorie.remove(index);
				}

			}
			else if(choose == 5){

				System.out.println("Input food's name[3-20]: ");
				name = scan.nextLine();
				index = vName.indexOf(name);

				if(index == -1){
					System.out.println("Data is not found");
					scan.nextLine();
				}
				else{
					System.out.println("Input food's type[Appetizer | Main Course | Dessert]: ");
					type = scan.nextLine();
					System.out.println("Input food's name[3-20]: ");
					name = scan.nextLine();
					System.out.println("Input food's calories[1.0..4.0]:");
					calorie = scan.nextFloat();
					scan.nextLine();
					System.out.println("Input food's price[10000..50000]:");
					price = scan.nextInt();
					scan.nextLine();

					vType.set(index,type);
					vName.set(index,name);
					vPrice.set(index,price);
					vCalorie.set(index,calorie);
					System.out.println("Data has been update");
					scan.nextLine();
				}
			}
		}while(choose!=6);

	}
}