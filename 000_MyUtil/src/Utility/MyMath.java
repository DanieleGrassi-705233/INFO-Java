package Utility;

/**
 * 
 * @author Daniele Grassi
 * @version 1.3
 * 
 * Raccolta di metodi relativi a funzioni matematiche.
 * 
 */

public class MyMath 
{
	/**
	 * Metodo per il calcolo della media intera di interi passando in ingresso un array di interi.
	 * Il metodo mediaArrayInt(int [] arInt) calcolerà la media tra i numeri contenuti nell'array, dal primo all'ultimo.
	 * 
	 * @param arInt Array di interi di cui fare la media
	 * @return Ritorna la media dei valori contenuti nell'array passato come parametro di ingresso
	 * 
	 */
	
	public static int mediaArrayInt(int [] arInt)
	{
		int media = 0;
		int somma = 0;
		for(int i=0; i<arInt.length; i++)
			somma += arInt[i];
		
		media = somma / arInt.length;
		
		return media;
	}
	
	/**
	 * Metodo per il calcolo della media intera di interi passando in ingresso un array di interi, un indice di inizio, un indice di fine.
	 * Il metodo mediaArrayInt(int [] arInt, int inizio, int fine) calcolerà la media tra i numeri compresi tra l'inizio e la fine.
	 * Inizio e fine si riferiscono alle posizioni nell'array partendo da 1 (è implicito il decremento del valore).
	 * 
	 * @param arInt Array di interi di cui fare la media
	 * @param inizio Indice che specifica la posizione del primo numero dell'array da cui partire per fare la media
	 * @param fine Indice che specifica la posizione dell'ultimo numero dell'array da considerare per fare la media
	 * @return Ritorna la media dei numeri presenti nell'array compresi tra l'inizio e la fine
	 * 
	 */
	
	public static int mediaArrayInt(int [] arInt, int inizio, int fine)
	{
		int media = 0;
		int somma = 0;
		for(int i=(inizio-1); i<(fine-1); i++)
			somma += arInt[i];
		
		media = somma / (fine - inizio);
		
		return media;
	}
	
	/**
	 * Metodo per il calcolo della media decimale di decimali passando in ingresso un array di decimali.
	 * Il metodo mediaArrayDouble(double [] arDouble) calcolerà la media tra i numeri contenuti nell'array, dal primo all'ultimo.
	 * 
	 * @param arDouble Array di decimali di cui fare la media
	 * @return Ritorna la media dei numeri presenti nell'array passato come parametro di ingresso
	 * 
	 */
		
	public static double mediaArrayDouble(double [] arDouble)
	{
		double media = 0;
		double somma = 0;
		for(int i=0; i<arDouble.length; i++)
			somma += arDouble[i];
		
		media = somma / arDouble.length;
		
		return media;
	}
	
	/**
	 * Metodo per il calcolo della media decimale di decimali passando in ingresso un array di decimali, un indice di inizio, un indice di fine.
	 * Il metodo mediaArrayDouble(double [] arDouble, int inizio, int fine) calcolerà la media tra i numeri compresi tra l'inizio e la fine.
	 * Inizio e fine si riferiscono alle posizioni nell'array partendo da 1 (è implicito il decremento del valore).
	 * 
	 * @param arDouble Array di decimali di cui fare la media
	 * @param inizio Indice che specifica la posizione del primo numero dell'array da cui partire per fare la media
	 * @param fine Indice che specifica la posizione dell'ultimo numero dell'array da considerare per fare la media
	 * @return Ritorna la media dei numeri presenti nell'array compresi tra l'inizio e la fine
	 * 
	 */
	
	public static double mediaArrayDouble(double [] arDouble, int inizio, int fine)
	{
		double media = 0;
		double somma = 0;
		for(int i=(inizio-1); i<(fine-1); i++)
			somma += arDouble[i];
		
		media = somma / (fine - inizio);
		
		return media;
	}
	
	/**
	 * Metodo per il calcolo della media decimale di decimali passando in ingresso un array di interi.
	 * Il metodo mediaArrayDouble(int [] arInt) calcolerà la media tra i numeri contenuti nell'array, dal primo all'ultimo.
	 * 
	 * @param arInt Array di interi di cui fare la media
	 * @return Ritorna la media dei numeri presenti nell'array passato come parametro di ingresso
	 * 
	 */
	
	public static double mediaArrayDouble(int [] arInt)
	{
		double media = 0;
		double somma = 0;
		for(int i=0; i<arInt.length; i++)
			somma += arInt[i];
		
		media = somma / arInt.length;
		
		return media;
	}
	
	/**
	 * Metodo per il calcolo del massimo intero di interi passando in ingresso un array di interi.
	 * Il metodo maxArrayInt(int [] arInt) calcolerà il massimo tra tutti gli elementi dell'array, dal primo all'ultimo.
	 * 
	 * @param arInt Array di interi di cui calcolare il massimo
	 * @return Ritorna il massimo intero tra gli elementi dell'array passato in ingresso
	 * 
	 */
	
	public static int maxArrayInt(int [] arInt)
	{
		int max = arInt[0];
		
		for(int i=1; i<arInt.length; i++)
		{
			if(max < arInt[i])
				max = arInt[i]; 
		}
		
		return max;
	}
	
	/**
	 * Metodo per il calcolo del minimo intero di interi passando in ingresso un array di interi.
	 * Il metodo minArrayInt(int [] arInt) calcolerà il minimo tra tutti gli elementi dell'array, dal primo all'ultimo.
	 * 
	 * @param arInt Array di interi di cui calcolare il minimo
	 * @return Ritorna il minimo intero tra gli elementi dell'array passato in ingresso
	 * 
	 */
	
	public static int minArrayInt(int [] arInt)
	{
		int min = arInt[0];
		
		for(int i=1; i<arInt.length; i++)
		{
			if(min > arInt[i])
				min = arInt[i]; 
		}
		
		return min;
	}
	
	/**
	 * Metodo per il calcolo del massimo decimale di decimali passando in ingresso un array di decimali.
	 * Il metodo maxArrayDouble(double [] arDouble) calcolerà il massimo tra tutti gli elementi dell'array, dal primo all'ultimo.
	 * 
	 * @param arDouble Array di decimali di cui calcolare il massimo
	 * @return Ritorna il massimo decimale tra gli elementi dell'array passato in ingresso
	 * 
	 */
	
	public static double maxArrayDouble(double [] arDouble)
	{
		double max = arDouble[0];
		
		for(int i=1; i<arDouble.length; i++)
		{
			if(max < arDouble[i])
				max = arDouble[i]; 
		}
		
		return max;
	}
	
	/**
	 * Metodo per il calcolo del massimo decimale di interi passando in ingresso un array di interi.
	 * Il metodo maxArrayDouble(int [] arInt) calcolerà il massimo tra tutti gli elementi dell'array, dal primo all'ultimo.
	 * 
	 * @param arInt Array di interi di cui calcolare il massimo
	 * @return Ritorna il massimo decimale tra gli elementi dell'array passato in ingresso
	 * 
	 */
	
	public static double maxArrayDouble(int [] arInt)
	{
		double max = arInt[0];
		
		for(int i=1; i<arInt.length; i++)
		{
			if(max < arInt[i])
				max = arInt[i]; 
		}
		
		return max;
	}
	
	/**
	 * Metodo per il calcolo del minimo decimale di decimali passando in ingresso un array di decimali.
	 * Il metodo minArrayDouble(double [] arDouble) calcolerà il minimo tra tutti gli elementi dell'array, dal primo all'ultimo.
	 * 
	 * @param arDouble Array di decimali di cui calcolare il minimo
	 * @return Ritorna il minimo decimale tra gli elementi dell'array passato in ingresso
	 * 
	 */
	
	public static double minArrayDouble(double [] arDouble)
	{
		double min = arDouble[0];
		
		for(int i=1; i<arDouble.length; i++)
		{
			if(min > arDouble[i])
				min = arDouble[i]; 
		}
		
		return min;
	}
	
	/**
	 * Metodo per il calcolo del minimo decimale di interi passando in ingresso un array di interi.
	 * Il metodo minArrayDouble(int [] arInt) calcolerà il minimo tra tutti gli elementi dell'array, dal primo all'ultimo.
	 * 
	 * @param arint Array di interi di cui calcolare il minimo
	 * @return Ritorna il minimo decimale tra gli elementi dell'array passato in ingresso
	 * 
	 */
	
	public static double minArrayDouble(int [] arInt)
	{
		double min = arInt[0];
		
		for(int i=1; i<arInt.length; i++)
		{
			if(min > arInt[i])
				min = arInt[i]; 
		}
		
		return min;
	}
	
	
}
