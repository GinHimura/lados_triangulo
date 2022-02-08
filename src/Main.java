import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	    Triangulo x, y;
	    x = new Triangulo();
	    y = new Triangulo();
	    
	    System.out.println("Enter the measures od triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        
        System.out.println("\nEnter the measures od triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        
        double areaX = x.area();
        double areaY = y.area();
        
        System.out.println("\nTriangle X area: " + String.format("%.4f", areaX));
        System.out.println("Triangle Y area: " + String.format("%.4f", areaY));
        
        if(areaX > areaY) {
        	System.out.println("Larger area: X");
        } else {
        	System.out.println("Larger area: Y");
        }
        
        sc.close();
	}
}
