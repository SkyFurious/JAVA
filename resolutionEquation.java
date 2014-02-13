/**
 * \file resolutionEquation.java
 * \brief Programme pour résoudre une équation
 * \author Dean Winchester
 * \version 0.1
 * \date 13 Février 2014
 * javac resolutionEquation.java
 * java resolutionEquation
 */
import java.util.*;
/**
 * \class resolutionEquation
 * \brief resous une équation de type ax²+bx+c
 * 
 * resolutionEquation est une petite classe pour resoudre une équation de type ax²+bx+c
 */
class resolutionEquation {
	
	public static void main(String args[]) throws Exception {
		double root, root1, root2;
		System.out.println("Equation est ax²+bx+c");
		Integer a = new Integer(args[0]);
		Integer b = new Integer(args[1]);
		Integer c = new Integer(args[2]);
		int d = (b * b) + 4 * a * c;
		if (d > 0) {
			root1 = ((-b) + Math.sqrt(d)) / 2 * a;
			root2 = ((-b) - Math.sqrt(d)) / 2 * a;
			System.out.println("Deux Solutions a l'équation :");
			System.out.println(root1 + " , " + root2);
		} else if (d == 0) {
			root = (-b) / (2 * a);
			System.out.println("Une Seul Solution a l'équation :");
			System.out.println(root);
		} else if (d < 0) {
			System.out.println("La solution est imaginaire");
		}
	}
}