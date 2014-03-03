/**
* \file exer34.java
* \brief Programme pour gérer des tableaux de tableaux de doubles.
* \author Dean Winchester
* \version 0.1
* \date 02 Mars 2014
* javac exer34.java
* java exer34
*/
public class exer34 {
        public static void main(String[] args) {
		double[][] a={ {1,2,3},{4,5,6}};
		double[][] b={ {6,5,4},{3,2,1}};
		double[][] c=DoubleArray.sum(a,b);
		System.out.println("a = "); DoubleArray.display(a);
		System.out.println("b = "); DoubleArray.display(b);
		System.out.println("c = "); DoubleArray.display(c);

		double[][] d={ {1,2},{1,2,3},{1},{1,2,3,4,5}};
		double[] sLin=DoubleArray.lineSum(d);
		System.out.println("d = "); DoubleArray.display(d);
		System.out.print("Sum of the lines of d = ");
		for (int i=0;i<sLin.length;i++)
			System.out.print(sLin[i]+" ");


        }
}
