/**
* \file DoubleArray.java
* \brief Programme pour gérer des tableaux de tableaux de doubles.
* \author Dean Winchester
* \version 0.1
* \date 02 Mars 2014
* javac DoubleArray.java
* java DoubleArray
*/

/**
* \class DoubleArray
* \brief Classe pour gerer des tableaux de doubles
*/
public class DoubleArray {
	/**
	* \fn DoubleArray::regular()
	* \brief Verifie si le tableau est régulier, si les lignes sont de même longueur
	* \return Retourne Vrai si les lignes sont de même longeur
	*/
	public static boolean regular(double[][] t)
	{
		int n=t[0].length;
		for (int i=1 ; i<t.length;i++)
			if (t[i].length != n)
				return false;
			return true;
	}
	/**
	* \fn DoubleArray::lineSum()
	* \brief Calcul la somme d'une ligne d'un tableaux de double
	* \return la somme de la ligne du tableaux de double
	*/
        public static double[] lineSum(double[][] t)
	{
	        int nLines=t.length; // longeur de la ligne
		double[] result=new double[nLines];
		for (int i=0; i<nLines; i++)
		{
			result[i]=0.;
			for (int j=0;j<t[i].length;j++)
				result[i]+=t[i][j];
		}
		return result;
        }
	/**
	* \fn DoubleArray::sum()
	* \brief Calcul la somme de 2 tableaux de double
	* \return la somme deux 2 tableaux de double
	*/
        public static double[][] sum(double[][] t1,double[][] t2)
	{
		// Vérifie si t1 & t2 sont régulier
		if (!regular(t1) || !regular(t2))
			return null;
		// Vérifie si t1 & t2 sont de même longeur
		if (t1.length!=t2.length)
			return null;
		if (t1[0].length!=t2[0].length)
			return null;
		int nLin=t1.length; int nRow=t1[0].length;
		
		double[][] somme=new double[nLin][nRow];
		
		for (int i=0;i<nLin;i++)
			for (int j=0;j<nRow;j++)
				somme[i][j]=t1[i][j]+t2[i][j];
		return somme;
	}
	/**
	* \fn DoubleArray::display()
	* \brief Affiche les elements des tableaux de double
	*/
	public static void display(double[][] t)
	{
		for (int i=0;i<t.length;i++)
		{
			for (int j=0;j<t[i].length;j++)
				System.out.print(t[i][j]+" ");
			System.out.println();
		}
	}
}
