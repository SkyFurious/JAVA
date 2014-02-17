/**
 * \file resolutionEquation.java
 * \brief Programme pour r�soudre une �quation
 * \author Dean Winchester
 * \version 0.1
 * \date 13 F�vrier 2014
 * javac resolutionEquation.java
 * java resolutionEquation
 */
import java.util.*;
/**
 * \class resolutionEquation
 * \brief resous une �quation de type ax�+bx+c
 * 
 * resolutionEquation est une petite classe pour resoudre une �quation de type ax�+bx+c
 */
class resolutionEquation {
	
	public static void main(String args[]) throws Exception {
		double root, root1, root2;
		System.out.println("Equation est ax�+bx+c");
		Integer a = new Integer(args[0]);
		Integer b = new Integer(args[1]);
		Integer c = new Integer(args[2]);
		int d = (b * b) + 4 * a * c;
		if (d > 0) {
			root1 = ((-b) + Math.sqrt(d)) / (2 * a);
			root2 = ((-b) - Math.sqrt(d)) / (2 * a);
			System.out.println("Deux Solutions a l'�quation :");
			System.out.println(root1 + " , " + root2);
		} else if (d == 0) {
			root = (-b) / (2 * a);
			System.out.println("Une Seul Solution a l'�quation :");
			System.out.println(root);
		} else if (d < 0) {
			System.out.println("La solution est imaginaire");
		}
	}
}
