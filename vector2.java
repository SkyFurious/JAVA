/**
* \file vector.java
* \brief Programme pour faire des opérations sur des vecteurs de 3 composantes
* \author Dean Winchester
* \version 0.1
* \date 03 Mars 2014
* javac vector2.java
* java vector2
*/

/**
* \class Vector
* \brief Classe pour calculs élementaire sur un vecteur
*/
class Vector {
    int x, y, z;
	/**
	* \fn Vector::Vector(int v1, int v2, int v3)
	* \brief Initialise les 3 composantes de v(1,2,3)
	*/
	public Vector(int v1,int v2,int v3)
	{
	        x=v1;
	        y=v2;
	        z=v3;
	}
	/**
	* \fn String Vector::toString()
	* \brief Converti un vecteur en une string
	* \return retourne les vecteurs (x,y,z)
	*/
	public String toString()
	{
		return "x : "+x+" , y : "+y+" , z : "+z;
	}
	/**
	* \fn void Vector::swap()
	* \brief Echange les vecteurs via un vecteur temporaire
	*/
	public static void swap(Vector v1, Vector v2)
	{
		Vector t=new Vector(v1.x,v1.y,v1.z);
		v1.x=v2.x; v1.y=v2.y; v1.z=v2.z;
		v2.x=t.x; v2.y=t.y; v2.z=t.z;
	}
}
        public static void main(String[] args) {
        	// on crée 2 vecteur
		Vector v1=new Vector(1,2,3);
		Vector v2=new Vector(4,5,6);
		// affichage
		System.out.println(v1);
		System.out.println(v2);
		// on les echange
		Vector.swap(v1,v2);
		// on raffiche
		System.out.println(v1);
		System.out.println(v2);
        }
