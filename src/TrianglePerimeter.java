import java.util.Scanner;

public class TrianglePerimeter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int edge1, edge2, edge3;
		System.out.print("Give the 3 edges (inches): ");
		edge1 = scan.nextInt();
		edge2 = scan.nextInt();
		edge3 = scan.nextInt();
		
		int perimeter = edge1 + edge2 + edge3;
		
		if ((edge1 + edge2 <= edge3) || (edge2 + edge3 <= edge1) 
				|| (edge1 + edge3 <= edge2)) {
			System.out.print("The perimeter is " + perimeter + " inches.");
		} else {
			System.out.print("Not a triangle.");
		}
	}

}
