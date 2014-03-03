/**
* \file Subscriber.java
* \brief Programme qui contient le nom et le numéro d'un abonné
* \author Dean Winchester
* \version 0.1
* \date 02 Mars 2014
* javac DoubleArray.java
* java DoubleArray
*/

/**
* \class Subscriber
* \brief qui contient le nom et le numéro d'un abonné
*/
public class Subscriber {
	// Déclaration 
	private String name,number;
	
        public Subscriber(String name,String number)
	{
                this.name=name;
                this.number=number;
	}
	public String getName()
	{
		return name;
	}
	public String getNumber()
	{
		return number;
	}
}
