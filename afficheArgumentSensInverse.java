/**
 * \file afficheArgumentSensInverse.java
 * \brief Programme pour afficher Argument en Sens Inverse
 * \author Dean Winchester
 * \version 0.1
 * \date 13 Février 2014
 * javac afficheArgumentSensInverse.java
 * java afficheArgumentSensInverse
 */
import java.util.*;
/**
 * \class afficheArgumentSensInverse 
 * \brief Objet chaîne de caractères.
 * 
 * afficheArgumentSensInverse est une petite classe pour afficher en sens Inverse les arguments/
 */
public class afficheArgumentSensInverse
{
    public static void main (String [] Arg)
    {
        try
        {
        	int i=0;
        	String s = Arg[i];      	
            int longeur = s.length(); // longueur de la string
            for(i = longeur - 1; i>=0; i--)
            {
                System.out.println(" " + s.charAt(i));
 
            }
        }
        	catch(Exception e)
        	{
        		System.out.println("Exception : "+e.getMessage());
        	}
        }
}
