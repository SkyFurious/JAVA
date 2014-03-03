/**
 * \file vector.java
 * \brief Programme pour faire des opérations sur des vecteurs de 3 composantes
 * \author Dean Winchester
 * \version 0.1
 * \date 14 Février 2014
 * javac vector.java
 * java vector
 */

/**
 * \class Vector
 * \brief Classe pour calculs élementaire sur un vecteur
 */
class Vector {
	int x, y, z;
	static int total = 0;
	/**
	 * \fn Vector::Vector()
	 * \brief Constructeur du vector, initialise les 3 composantes é 0
	 */
	public Vector() {
		total++;
		x = y = z = 0;
	}
	/**
	 * \fn Vector::Vector(int val)
	 * \brief Initialise les 3 composantes à la meme valeurs
	 */
	public Vector(int val) {
		total++;
		x = y = z = val;
	}
	/**
	 * \fn Vector::Vector(int v1, int v2, int v3)
	 * \brief Initialise les 3 composantes de v(1,2,3)
	 */
	public Vector(int v1, int v2, int v3) {
		total++;
		x = v1;
		y = v2;
		z = v3;
	}
	/**
	 * \fn String Vector::display() 
	 * \brief Afficher les vector
	 */
	public void display() {
		System.out.println(x + "  " + y + "  " + z);
	}
	/**
	 * \fn void Vector::multiply(int i) 
	 * \brief Multiplier les composantes par une valeur fourni en argument
	 */
	public void multiply(int i) {
		x *= i; // Equivaut à x = x*i;
		y *= i;
		z *= i;
	}
	/**
	 * \fn int Vector::multiply(Vector v) 
	 * \brief Multiplier les composantes par une valeur fourni en argument
	 * \return retourne le vector
	 */
	public int multiply(Vector v) {
		return (int) (x * v.x + y * v.y + z * v.z);
	}
	/**
	 * \fn Vector Vector::sum(Vector v) 
	 * \brief Fait la somme de deux vector
	 * \return retourne un vector
	 */
	public Vector sum(Vector v) {
		return new Vector(x + v.x, y + v.y, z + v.z);
	}
	/**
	 * \fn int Vector::nbVect() 
	 * \brief Total du nbVecteur
	 * \return retourne le total de vector
	 */
	public static int nbVect() {
		return total;
	}
	/**
	 * \fn String Vector::toString() 
	 * \brief Converti un vecteur en une string 
	 * \return retourne les vecteurs (x,y,z)
	 */
	public String toString() {
		return "x : " + x + " , y : " + y + " , z : " + z;
	}
		public static void main(String[] args) {
		Vector v = new Vector(1, 2, 3);
		v.multiply(8);
		v.sum(v).display();
		v.display();
		System.out.println(Vector.nbVect());
		System.out.println(v);
		}
}
