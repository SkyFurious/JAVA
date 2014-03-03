/**
* \file Index.java
* \brief Programme pour gérer des numéros de téléphone
* \author Dean Winchester
* \version 0.1
* \date 02 Mars 2014
* javac Index.java
* java Index
*/

/**
* \class Index
* \brief Classe pour gérer des numéros de téléphone
*/
public class Index {

	private int nMax,nSubsc;
	private Subscriber[] ind;
	/**
	* \fn Index()
	* \brief Ajouter un nouvel abonné
	*/
        public Index(int nMax)
	{
		this.nMax=nMax;
		ind=new Subscriber[nMax];
		nSubsc=0;
        }
	/**
	* \fn Index::addSubscriber()
	* \brief Ajouter un nouvel abonné
	* \return Faux si l'insertion échoue, vrai sinon
	*/
	public boolean addSubscriber(Subscriber a)
	{
		if (nSubsc>=nMax)
			return false;
		ind[nSubsc]=a;
		nSubsc++;
		return true;
	}
	/**
	* \fn Index::getNbSubscribers()
	* \brief getteur de NbSubscribers
	* \return le nombre de Subscribers
	*/
	public int getNbSubscribers()
	{
		return nSubsc;
	}
	/**
	* \fn Index::getNbSubscribers()
	* \brief getteur de NbSubscribers
	* \return le nombre de Subscribers
	*/
	public Subscriber getSubscriber(int i)
	{
		return ind[i];
	}
	/**
	* \fn Index::getNumber()
	* \brief Gere le Numéro via le name
	* \return le numéro ou null si il n'existe pas
	*/
	public String getNumber(String name)
	{
		for (int i=0; i<nSubsc; i++)
		        if (name.equals(ind[i].getName()))
				return ind[i].getNumber();
			return null;
	}
	/**
	* \fn Index::getSortedSubscribers()
	* \brief S'occupe d'afficher un tableau d'abonnée trié par ordre alphabétique
	* \return le tableau d'abonné trié par ordre aplhabétique
	*/
	public Subscriber[] getSortedSubscribers()
	{
		Subscriber[] sortedIndex=new Subscriber[nSubsc];
		for (int i=0; i<nSubsc; i++)
			sortedIndex[i]=ind[i];
		for (int i=0; i<nSubsc-1; i++)
			for (int j=i+1; j<nSubsc; j++)
				if ((sortedIndex[i].getName().compareTo(sortedIndex[j].getName()))>0)
				{
					Subscriber temp=sortedIndex[i];
					sortedIndex[i]=sortedIndex[j];
					sortedIndex[j]=temp;
				}
		return sortedIndex;
	}
}
