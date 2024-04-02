import java.util.Scanner;
class StudentGrade
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The First Subject Mark :");
		int m1 = input.nextInt();
		System.out.println("Enter The Second Subject Mark :");
		int m2 = input.nextInt();
		System.out.println("Enter The Third Subject Mark:");
		int m3 = input.nextInt();
		System.out.println("Enter The Forth Subject Mark:");
		int m4 = input.nextInt();
		System.out.println("Enter The Fifth Subject Mark:");
		int m5 = input.nextInt();
		int tot = m1+m2+m3+m4+m5;
		float per = tot/5;
		System.out.println("Total :"+tot);
		System.out.println("Percentage :"+per);	
		if(per>=90)
			System.out.println("Grade O");
		else if(per>=80)
			System.out.println("Grade A+");
		else if(per>=70)
			System.out.println("Grade A");
		else if(per>=60)
			System.out.println("Grade B+");
		else if(per>=40)
			System.out.println("Grade B");
		else
			System.out.println("SORRY you have failed");
	}
}