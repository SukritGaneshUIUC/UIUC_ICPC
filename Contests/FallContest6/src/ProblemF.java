import java.util.Scanner;

public class ProblemF {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		
		double flatRadius = (double) myInput.nextInt();
		double x1 = (double) myInput.nextInt();
		double y1 = (double) myInput.nextInt();
		double x2 = (double) myInput.nextInt();
		double y2 = (double) myInput.nextInt();
		
		
		// if fafa is outside flat, cover entire flat
		double fafaDistanceFromCenter = calculateDistance(x1, y1, x2, y2);
		if (fafaDistanceFromCenter >= flatRadius) {
			System.out.println(x1 + " " + y1 + " " + flatRadius);
			return;
		}
		
		// if fafa is located on the center, simply place reciever midway between center and edge
		if (x1 == x2 && y1 == y2) {
			System.out.println(x1 + flatRadius/2 + " " + y1 + " " + flatRadius/2);
			return;
		}
		
		// if fafa is inside flat, the reciever should be located on the vector
		// which passes through fafa's location and the circle's center
		// it should be located midway between fafa's location and the circle's radius (on the far side)
		
		// the segment connecting fafa's location and the circle's radius (far side)
		// should have following length: fafaDistanceFromCenter + radius (obviously);
		
		double fafaDistanceFromFarEdge = fafaDistanceFromCenter + flatRadius;
		
		// find vector V connecting fafa's location to center
		double vX = x1 - x2;
		double vY = y1 - y2;
		
		// find unit vector uV in direction of V
		double magnitudeV = Math.sqrt(vX * vX + vY * vY);
		double vXU = vX / magnitudeV;
		double vYU = vY / magnitudeV;
		
		// find midway point (equal to AP radius, since AP is a circle which passes through fafa's location
		// and apartment's edge)
		double APRadius = fafaDistanceFromFarEdge / 2;
		double APX = x2 + vXU * APRadius;
		double APY = y2 + vYU * APRadius;
		
		// print it all out
		System.out.println(APX + " " + APY + " " + APRadius);
		
	}
	
	public static double calculateDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

}
