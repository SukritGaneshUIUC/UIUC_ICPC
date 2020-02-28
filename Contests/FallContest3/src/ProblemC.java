import java.util.ArrayList;
import java.util.Scanner;

public class ProblemC {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		
		double friendCount;
		ArrayList<Double> coordinates = new ArrayList<Double>();
		ArrayList<Double> speeds = new ArrayList<Double>();
		
		friendCount = myInput.nextDouble();
		
		for (int i = 0; i < friendCount; i++) {
			coordinates.add(myInput.nextDouble());
		}
		
		for (int i = 0; i < friendCount; i++) {
			speeds.add(myInput.nextDouble());
		}
		
		// calculate relative coordinates (time from south end, based on speed and location)
		ArrayList<Double> relativeCoordinates = new ArrayList<Double>();
		
		for (int i = 0; i < friendCount; i++) {
			double coord = coordinates.get(i);
			double speed = speeds.get(i);
			double timeFromSouth = coord/speed;
			relativeCoordinates.add(timeFromSouth);
		}
		
		// calculate center of mass for relative coords (average coord)
		double relativeCenterOfMass = 0;
		
		for (double d: relativeCoordinates) {
			relativeCenterOfMass += d;
		}
		
		relativeCenterOfMass = relativeCenterOfMass / friendCount;
		
		// determine whether to go north or south
		ArrayList<Integer> goNorthOrSouth = new ArrayList<Integer>();
		
		for (double d: relativeCoordinates) {
			if (d > relativeCenterOfMass) {
				goNorthOrSouth.add(-1);
			} else {
				goNorthOrSouth.add(1);
			}
		}
		
		// for relative coordinates, calculate who's farthest from COM. this will be time required to walk
		double coordinateOfFarthest = 0;
		double distanceFarthest = 0;
		
		for (double d: relativeCoordinates) {
			if (Math.abs(d - relativeCenterOfMass) > distanceFarthest) {
				distanceFarthest = Math.abs(d - relativeCenterOfMass);
				coordinateOfFarthest = d;
			}
		}
		
		// print out distance farthest - time taken for farthest man (relatively) to walk to COM
		System.out.println(distanceFarthest);
		System.out.println("com" + relativeCenterOfMass);



	}

}
