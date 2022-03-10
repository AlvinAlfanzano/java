import java.util.*;
public class Latihan3{
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);

		int choose = 0;
		String name = "";
		String gender = "";
		String room = "";
		int age = 0;
		int index = 0;

		Vector<String> vName = new Vector<>();
		Vector<String> vGender = new Vector<>();
		Vector<String> vRoom = new Vector<>();
		Vector<Integer> vAge = 	new Vector<>();

		do{
			System.out.println("1. Add Patient.");
			System.out.println("2. View Patient.");
			System.out.println("3. Update Patient.");
			System.out.println("4. Delete Patient.");
			System.out.println("5. Exit..");
			System.out.println("Choose >> ");
			choose = sc.nextInt();
			sc.nextLine();

			if(choose == 1){

				do{
					System.out.println("Input your name starts with[Mr. or Mrs.] : ");
					name = sc.nextLine();
				}while(name.startsWith ("Mr.") && name.startsWith ("Mrs."));

				do{
					System.out.println("Input your gender [Male or Female] : ");
					gender = sc.nextLine();
				}while(gender.equals ("Male") && gender.equals ("Female"));

				do{
					System.out.println("Input your room type [VIP or Normal] : ");
					room = sc.nextLine();
				}while(room.equals ("VIP") && room.equals ("Normal"));

				do{
					System.out.println("Input your Age > 10 : ");
					age = sc.nextInt();
					sc.nextLine();
				}while(age > 10 );

				vName.add(name);
				vGender.add(gender);
				vRoom.add(room);
				vAge.add(age);

			}

			else if(choose == 2){

				if(vName.size() == 0){
					System.out.println("There is no data");
					System.out.println("Press enter to continue..");
				}

				else{
					for(int i = 0; i < vName.size() ; i++){
						System.out.println((i+1)+". "+vName.get(i)+" "+vGender.get(i)+" "+ vRoom.get(i)+" "+vAge.get(i));

					}
				}

				System.out.println("Press enter to continue..");
				sc.nextLine();

			}

			else if(choose == 3){

				if(vName.size() == 0){
					System.out.println("There is no data");
					System.out.println("Press enter to continue..");
				}

				else{
					for(int i = 0; i < vName.size() ; i++){
						System.out.println((i+1)+". "+vName.get(i)+" "+vGender.get(i)+" "+ vRoom.get(i)+" "+vAge.get(i));

					}

						do{
							System.out.println("Insert update name : ");
							name = sc.nextLine();
							index = vName.indexOf(name);
						}while(index == -1);

						do{
							System.out.println("Input your name starts with[Mr. or Mrs.] : ");
							name = sc.nextLine();
						}while(name.startsWith ("Mr.") && name.startsWith ("Mrs."));

						do{
							System.out.println("Input your gender [Male or Female] : ");
							gender = sc.nextLine();
						}while(gender.equals ("Male") && gender.equals ("Female"));

						do{
							System.out.println("Input your room type [VIP or Normal] : ");
							room = sc.nextLine();
						}while(room.equals ("VIP") && room.equals ("Normal"));

						do{
							System.out.println("Input your Age > 10 : ");
							age = sc.nextInt();
							sc.nextLine();
						}while(age > 10 );

					vName.set(index, name);
					vGender.set(index, gender);
					vRoom.set(index, room);
					vAge.set(index, age);

				}

				System.out.println("Update data sucses");
				System.out.println("Press enter to continue..");
				sc.nextLine();
			}

			else if(choose == 4){

				if(vName.size() == 0){
					System.out.println("There is no data");
					System.out.println("Press enter to continue..");
				}

				else{
					for(int i = 0; i < vName.size() ; i++){
						System.out.println((i+1)+". "+vName.get(i)+" "+vGender.get(i)+" "+ vRoom.get(i)+" "+vAge.get(i));
						do{
							System.out.println("Insert name want to unregister : ");
							name = sc.nextLine();
							index = vName.indexOf(name);
						}while(index == -1);

						vName.remove(index);
						vGender.remove(index);
						vRoom.remove(index);
						vAge.remove(index);

					}
				}

				System.out.println("Press enter to continue..");
				sc.nextLine();

			}



		}while(choose != 5);


	}




}