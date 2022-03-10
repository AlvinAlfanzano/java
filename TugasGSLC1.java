import java.util.Scanner;
public class TugasGSLC1{
	public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			double side;
			double length;
			double width;

		System.out.println("Geometry Area Counter");
		System.out.println("=====================");
		System.out.println("1. Square");
		System.out.println("2. Rectangle");
		System.out.print("Option: ");

		int option = scan.nextInt();
		if (option == 1)
		{
			System.out.print("Input side: ");
			 side = scan.nextDouble();
			System.out.println("Area: " + side * side);
		}
		else if (option == 2)
		{
			System.out.print("Input width: ");
			 width = scan.nextDouble();
			System.out.print("Input length: ");
			 length = scan.nextDouble();
			System.out.println("Area: " + width * length);

		}
	}
}