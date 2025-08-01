import java.util.Scanner;
public class perimeter_rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the perimeter length:");
		int l=sc.nextInt();
		System.out.println("enter the perimeter breadth:");
		int b=sc.nextInt();
		int perimeter=2*(l+b);
		System.out.println(" perimeter of rectangle is:"+perimeter);

	}

}
