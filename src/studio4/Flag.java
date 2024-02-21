package studio4;

import java.awt.Color;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String shapetype = in.next();
		int redComponent = in.nextInt();
		int blueComponent = in.nextInt();
		int greenComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double parameterOne = in.nextDouble();
		double parameterTwo = in.nextDouble();
		double parameterThree = in.nextDouble();
		double parameterFour = in.nextDouble();
		
		StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
		
		
		
		
		
		
		
		
		
		
	}
}