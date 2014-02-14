/**
 * \file pairVect.java
 * \brief Programme pour faire des opérations sur des vecteurs à 2 dimensions
 * \author Dean Winchester
 * \version 0.1
 * \date 14 Février 2014
 * javac pairVect.java
 * java pairVect
 */

/**
 * \class Vector
 * \brief Classe pour calculs élementaire sur un vecteur
 */
class Vector {
	int x, y, z;
	}
	/**
	 * \fn Vector::Vector(int v1, int v2, int v3)
	 * \brief Initialise les 3 composantes de v(1,2,3)
	 */
	public Vector(int v1, int v2, int v3) {
		x = v1;
		y = v2;
		z = v3;
	}

	public Vector(Vector v) {
		x = v.x;
		y = v.y;
		z = v.z;
	}
	/**
	 * \fn String Vector::display() 
	 * \brief Afficher les vector
	 */
	public void display() {
		System.out.println(x + "  " + y + "  " + z);
	}
}
/**
 * \class PairVect
 * \brief Classe sur vecteur à 2 dimensios
 */
class PairVect {
	Vector vector1, vector2;
	
	public PairVect(int a, int b, int c, int d, int e, int f) {
		vector1 = new Vector(a, b, c);
		vector2 = new Vector(d, e, f);
	}

	public PairVect(Vector v1, Vector v2) {
		vector1 = new Vector(v1);
		vector2 = new Vector(v2);
	}

	public void display() {
		vector1.display();
		vector2.display();
	}

	public Vector getFirst() {
		return vector1;
	}
	
	public Vector getSecond() {
		return vector2;
	}
}
// Test de notre classe PairVect
public class exer22 {
	public static void main(String[] args) {
		PairVect pairVector = new PairVect(new Vector(1, 2, 3), new Vector(4, 5, 6));
		pairVector.display();
		pairVector.getFirst().display();
	}
}