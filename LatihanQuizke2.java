import java.util.*;
public class LatihanQuizke2{
	public static void main(String []args){

	Scanner sc = new Scanner(System.in);

	Vector<String> vName = new Vector<>();
	Vector<String> vGender = new Vector<>();
	Vector<String> vRoom = new Vector<>();
	Vector<Integer> vAge = new Vector<>();


	String name = "";
	String gender = "";
	String room = "";
	int age = 0;
	int choose = 0;
	int index = 0;


	do{
		System.out.println("=============");
		System.out.println(" BJ Hospital");
		System.out.println("=============");
		System.out.println("1. Add patient");
		System.out.println("2. View patient");
		System.out.println("3. Search data");
		System.out.println("4. Delete data");
		System.out.println("5. Update data");
		System.out.println("6. Exit");

		System.out.print("Choose>>");
		choose = sc.nextInt();
		sc.nextLine();

		if(choose == 1){

			do{

				System.out.print("Input your name [starts with 'Mr.' or 'Mrs'] : ");
				name = sc.nextLine();

			}while(!name.startsWith ("Mr.") && !name.startsWith ("Mrs."));

			do{

				System.out.print("Input your gender ['Male' or 'Female'] : ");
				gender = sc.nextLine();

			}while(!gender.equals ("Male") && !gender.equals ("Female"));

			do{

				System.out.print("Input your room type ['VIP' or 'Normal'] : ");
				room = sc.nextLine();

			}while(!room.equals ("VIP") && !room.equals ("Normal"));

			do{

				System.out.print("Input your age [> 10] : ");
				age = sc.nextInt();
				sc.nextLine();

			}while(age < 10);

			System.out.println("Patient has been added !");
			System.out.println("");

			vName.add(name);
			vGender.add(gender);
			vRoom.add(room);
			vAge.add(age);

		}
		else if(choose == 2){

			if(vName.size() == 0){
				System.out.println("No data");
				sc.nextLine();
			}

			else{
				for(int i = 0; i < vName.size(); i++){

					System.out.println((i+1)+"."+vName.get(i)+" "+vGender.get(i)+" "+vRoom.get(i)+" "+vAge.get(i));

				}
			}

		}

		else if (choose == 3){
			System.out.println("Input your name with [Mr. or Mrs.] : ");
			name = sc.nextLine();
			index = vName.indexOf(name);
			if(index == -1){
				System.out.println("No Data");
			}
			else{
				System.out.println(index);
			}
		 }

		else if (choose == 4){
			System.out.println("Input your name with [Mr. or Mrs.] : ");
			name = sc.nextLine();
			index = vName.indexOf(name);

			if(index == -1){
				System.out.println("No Data");
				sc.nextLine();
			}
			else{
				vName.remove(index);
				vGender.remove(index);
				vRoom.remove(index);
				vAge.remove(index);
			}

		}

		else if (choose == 5){

			System.out.println("Input your name with [Mr. or Mrs.] : ");
			name = sc.nextLine();
			index = vName.indexOf(name);

			if(index == -1){
				System.out.println("No Data");
			}

			else{

				do{

				System.out.print("Input your name [starts with 'Mr.' or 'Mrs'] : ");
				name = sc.nextLine();

				}while(!name.startsWith ("Mr.") && !name.startsWith ("Mrs."));

				do{

					System.out.print("Input your gender ['Male' or 'Female'] : ");
					gender = sc.nextLine();

				}while(!gender.equals ("Male") && !gender.equals ("Female"));

				do{

					System.out.print("Input your room type ['VIP' or 'Normal'] : ");
					room = sc.nextLine();

				}while(!room.equals ("VIP") && !room.equals ("Normal"));

				do{

					System.out.print("Input your age [> 10] : ");
					age = sc.nextInt();
					sc.nextLine();

				}while(age < 10);

				System.out.println("Patient has been added !");
				System.out.println("");

				vName.set(index,name);
				vGender.set(index,gender);
				vRoom.set(index,room);
				vAge.set(index,age);
			}
		}

	}while(choose != 6);






	}
}