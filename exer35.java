/**
* \file exer35.java
* \brief Programme pour gérer des tableaux de tableaux de doubles.
* \author Dean Winchester
* \version 0.1
* \date 02 Mars 2014
* javac exer35.java
* java exer35
*/
public class exer35 {
        public static void main(String[] args)
	{
		Index ind=new Index(10);
		System.out.println("Il y a "+ind.getNbSubscribers()+" abonnées");
		Subscriber a=new Subscriber("Steve","114");
		Subscriber b=new Subscriber("Yoan","1123");
		ind.addSubscriber(a);
		ind.addSubscriber(b);
		ind.addSubscriber(new Subscriber("Valentin","3211"));
		ind.addSubscriber(new Subscriber("Michael","3114"));
		System.out.println("Il y a "+ind.getNbSubscribers()+" abonnées");
		System.out.println("Vous etes :");
		for (int i=0; i<ind.getNbSubscribers(); i++)
			System.out.println(ind.getSubscriber(i).getName()+" "+
			                   ind.getSubscriber(i).getNumber());
	}
}
