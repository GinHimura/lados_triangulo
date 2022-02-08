import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC, pX, pY, areaX, areaY;
		
        System.out.println("Enter the measures od triangle X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        
        System.out.println("\nEnter the measures od triangle Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();
        
        pX = (xA + xB + xC) / 2;
        pY = (yA + yB + yC) / 2;
        
        areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));
        areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));
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
