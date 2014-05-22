 package Utility;
 import java.util.*;

 /**
  * 
  * @author Daniele Grassi
  * @version 1.9
  * 
  * Raccolta di metodi per l'inserimento dati in input.
  *
  */
 
public class MyScanner {
	
	private final static String MESSAGGIO_FALSO_INSERIMENTO = "Il valore inserito non è corretto!";
	private final static String MESSAGGIO_STRINGA_VUOTA = "Inserire una stringa NON vuota!";
	private final static String MESSAGGIO_CHAR_FALSO = "Il carattere inserito è errato! Inserire: ";
	
	private final static String MESSAGGIO_INSERIMENTO_MINUTI = "Inserisci i minuti (da 0 a 59): ";
	private final static String MESSAGGIO_INSERIMENTO_SECONDI = "Inserisci i secondi (da 0 a 59): ";
	
	private static Scanner scanner = scanBuild();
	
	/**
	 * Costruttore delo scanner
	 * 
	 * @return Ritorna uno scanner con la capacità di leggere gli spazi
	 * 
	 */
	
	public static Scanner scanBuild()
	{
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		return scanner;
	}
	
	private static Random random = new Random();
	
	/**
	 * Metodo che restituisce in uscita un numero intero casuale.
	 * Questo metodo sfrutta un oggetto della classe Random.
	 * 
	 * @return Ritorna un numero intero casuale
	 */
	
	public static int randomInt()
	{
		return random.nextInt();
	}
	
	/**
	 * Metodo che restituisce un numero intero casuale compreso i valori passati in ingresso, un minimo ed un massimo.
	 * I valori di ingresso, min e max, sono inclusi nei numeri possibili casuali.
	 * 
	 * @param min Valore del minimo numero intero restituibile
	 * @param max Valore del massimo numero intero restituibile
	 * @return Ritorna un numero intero casuale compreso tra gli estremi min e max
	 */
	
	public static int randomInt(int min, int max)
	{
		 int range = max + 1 - min;
		 int rand = random.nextInt(range);
		 return rand + min;
	}
	
	/**
	 * Metodo per l'inserimento di una durata (minuti-secondi) intera.
	 * Richiede l'inserimento di un valore intero "minuti" e di un valore intero "secondi".
	 * 
	 * @return Ritorna un array di interi contenente la durata in minuti e secondi
	 * 
	 */
	
	public static int [] durataMinSec()
	{
		int [] durata = new int [2];
		durata[0] = readInt(MESSAGGIO_INSERIMENTO_MINUTI, -1, MyCostant.MINUTI_ORA);
		durata[1] = readInt(MESSAGGIO_INSERIMENTO_SECONDI, -1, MyCostant.SECONDI_MINUTO);
		
		return durata;
	}
	
	/**
	 * Metodo che permette di leggere da tastiera un numero intero.
	 * Questo metodo verifica che l'imput da tastiera sia effettivamente un numero intero.
	 * Nel caso in cui l'imput non sia un numero intero restituisce come output un messaggio di errore e richiede l'inserimento.
	 * 
	 * @return Ritorna il numero intero immesso da tastiera
	 * 
	 */
	
	public static int readInt()
	{
		boolean check = false;
		int value = 0;
		   do
		    {		     
		     if (scanner.hasNextInt())
		      {
		       value = scanner.nextInt();
		       check = true;
		      }
		     else
		      {
		       System.out.println(MESSAGGIO_FALSO_INSERIMENTO);
		       @SuppressWarnings("unused")
			String wrongValue = scanner.next();
		      }
		    }
		   while (!check);
		   return value;
	}
	
	/**
	 * Metodo che permette di leggere da tastiera un numero intero con la previa visualizzazione di un messaggio (String) immesso come ingresso.
	 * Questo metodo verifica che l'imput da tastiera sia effettivamente un numero intero.
	 * Nel caso in cui l'imput non sia un numero intero restituisce come output un messaggio di errore e richiede l'inserimento.
	 * 
	 * @param message Messaggio visualizzato prima dell'immissione dati da tastiera
	 * @return Ritorna il numero intero immesso da tastiera
	 * 
	 */
	
	public static int readInt(String message)
	{
		boolean check = false;
		int value = 0;
		   do
		    {
		     System.out.print(message);
		     
		     if (scanner.hasNextInt())
		      {
		       value = scanner.nextInt();
		       check = true;
		      }
		     else
		      {
		       System.out.println(MESSAGGIO_FALSO_INSERIMENTO);
		       @SuppressWarnings("unused")
			String wrongValue = scanner.next();
		      }
		    }
		   while (!check);
		   return value;
	}
	
	/**
	 * Metodo che permette di leggere da tastiera un numero intero maggiore di un intero in ingresso (min) con la previa visualizzazione di un messaggio (String) immesso come ingresso.
	 * Il valore di ingresso min non è compreso, è possibile dunque immettere numeri da min+1 in poi.
	 * Questo metodo verifica che l'imput da tastiera sia effettivamente un numero intero.
	 * Nel caso in cui l'imput non sia un numero intero restituisce come output un messaggio di errore e richiede l'inserimento.
	 * 
	 * @param message Messaggio visualizzato prima dell'immissione dati da tastiera
	 * @param min Valore minimo immissibile da tastiera (NON compreso)
	 * @return Ritorna il numero intero immesso da tastiera
	 * 
	 */
	
	public static int readInt(String message, int min)
	{
		boolean check = false;
		int value = 0;
		   do
		    {
		     System.out.print(message);
		     
		     if (scanner.hasNextInt())
		      {
		       value = scanner.nextInt();
		      }
		     else
		      {
		       System.out.println(MESSAGGIO_FALSO_INSERIMENTO);
		       @SuppressWarnings("unused")
			String wrongValue = scanner.next();
		      }
		     if(value > min)
		    	 check = true;
		     else
		    	 System.out.println(MESSAGGIO_FALSO_INSERIMENTO);
		    }
		   while (!check);
		   return value;
	}
	
	/**
	 * Metodo che permette di leggere da tastiera un numero intero maggiore di un intero in ingresso (min), minore di un intero in ingresso (max), con la previa visualizzazione di un messaggio (String) immesso come ingresso.
	 * I valori in ingresso (min e max) non sono compresi, è possibile dunque immettere numeri da min+1 fino a max-1.
	 * Questo metodo verifica che l'imput da tastiera sia effettivamente un numero intero.
	 * Nel caso in cui l'imput non sia un numero intero restituisce come output un messaggio di errore e richiede l'inserimento.
	 * 
	 * @param message Messaggio visualizzato prima dell'immissione dati da tastiera
	 * @param min Valore minimo immissibile da tastiera (NON compreso)
	 * @param max Valore massimo immissibile da tastiera (NON compreso)
	 * @return Ritorna il numero intero immesso da tastiera
	 * 
	 */
	
	public static int readInt(String message, int min, int max)
	{
		boolean check = false;
		int value = 0;
		   do
		    {
		     System.out.print(message);
		     
		     if (scanner.hasNextInt())
		      {
		       value = scanner.nextInt();
		      }
		     else
		      {
		       System.out.println(MESSAGGIO_FALSO_INSERIMENTO);
		       @SuppressWarnings("unused")
			String wrongValue = scanner.next();
		      }
		     if(value > min && value < max)
		    	 check = true;
		     else
		    	 System.out.println(MESSAGGIO_FALSO_INSERIMENTO);
		    }
		   while (!check);
		   return value;
	}
	
	/**
	 * Metodo che permette di leggere da tastiera un numero decimale.
	 * Questo metodo verifica che l'imput da tastiera sia effettivamente un numero decimale.
	 * Nel caso in cui l'imput non sia un numero decimale restituisce come output un messaggio di errore e richiede l'inserimento.
	 * 
	 * @return Ritorna il numero decimale immesso da tastiera
	 * 
	 */
	
	public static double readDouble()
	{
		boolean check = false;
		double value = 0;
			do
			{				
				if(scanner.hasNextDouble())
				{
					value = scanner.nextDouble();
					check = true;
				}
				else
				{
					System.out.println(MESSAGGIO_FALSO_INSERIMENTO);
					@SuppressWarnings("unused")
					String wrongValue = scanner.next();
				}
			}
			while(!check);
			
			return value;				
	}
	
	/**
	 * Metodo che permette di leggere da tastiera un numero decimale con la previa visualizzazione di un messaggio (String) immesso come ingresso.
	 * Questo metodo verifica che l'imput da tastiera sia effettivamente un numero decimale.
	 * Nel caso in cui l'imput non sia un numero decimale restituisce come output un messaggio di errore e richiede l'inserimento.
	 * 
	 * @param message Messaggio visualizzato prima dell'immissione dati da tastiera
	 * @return Ritorna il numero decimale immesso da tastiera
	 * 
	 */
	
	public static double readDouble(String message)
	{
		boolean check = false;
		double value = 0;
			do
			{
				System.out.print(message);
				
				if(scanner.hasNextDouble())
				{
					value = scanner.nextDouble();
					check = true;
				}
				else
				{
					System.out.println(MESSAGGIO_FALSO_INSERIMENTO);
					@SuppressWarnings("unused")
					String wrongValue = scanner.next();
				}
			}
			while(!check);
			
			return value;				
	}
	
	/**
	 * Metodo che permette di leggere da tastiera un numero decimale maggiore di un intero in ingresso (min) con la previa visualizzazione di un messaggio (String) immesso come ingresso.
	 * Il valore in ingresso min è compreso, è possibile dunque immettere numeri da min in poi.
	 * Questo metodo verifica che l'imput da tastiera sia effettivamente un numero decimale.
	 * Nel caso in cui l'imput non sia un numero decimale restituisce come output un messaggio di errore e richiede l'inserimento.
	 * 
	 * @param message Messaggio visualizzato prima dell'immissione dati da tastiera
	 * @param min Valore minimo immissibile da tastiera (COMPRESO)
	 * @return Ritorna il numero decimale immesso da tastiera
	 * 
	 */
	
	public static double readDouble(String message, int min)
	{
		boolean check = false;
		double value = 0;
			do
			{
				System.out.print(message);
				
				if(scanner.hasNextDouble())
				{
					value = scanner.nextDouble();
				}
				else
				{
					System.out.println(MESSAGGIO_FALSO_INSERIMENTO);
					@SuppressWarnings("unused")
					String wrongValue = scanner.next();
				}
				if(value >= min)
			    	 check = true;
			     else
			    	 System.out.println(MESSAGGIO_FALSO_INSERIMENTO);
			}
			while(!check);
			
			return value;				
	}
	
	/**
	 * Metodo che permette di leggere da tastiera un numero decimale maggiore di un intero in ingresso (min), minore di un intero in ingresso (max), con la previa visualizzazione di un messaggio (String) immesso come ingresso.
	 * I valori in ingresso (min e max) SONO compresi, è possibile dunque immettere numeri da min fino a max.
	 * Questo metodo verifica che l'imput da tastiera sia effettivamente un numero decimale.
	 * Nel caso in cui l'imput non sia un numero decimale restituisce come output un messaggio di errore e richiede l'inserimento.
	 * 
	 * @param message Messaggio visualizzato prima dell'immissione dati da tastiera
	 * @param min Valore minimo immissibile da tastiera (COMPRESO)
	 * @param max Valore massimo immissibile da tastiera (COMPRESO)
	 * @return Ritorna il numero decimale immesso da tastiera
	 * 
	 */
	
	public static double readDouble(String message, int min, int max)
	{
		boolean check = false;
		double value = 0;
			do
			{
				System.out.print(message);
				
				if(scanner.hasNextDouble())
				{
					value = scanner.nextDouble();
				}
				else
				{
					System.out.println(MESSAGGIO_FALSO_INSERIMENTO);
					@SuppressWarnings("unused")
					String wrongValue = scanner.next();
				}
				if(value >= min && value <= max)
			    	 check = true;
			     else
			    	 System.out.println(MESSAGGIO_FALSO_INSERIMENTO);
			}
			while(!check);
			
			return value;				
	}
	
	/**
	 * Metodo che permette di leggere da tastiera una stringa di testo.
	 * 
	 * @return Ritorna la stringa inserita da tastiera
	 * 
	 */
	
	public static String readString()
	{		
		return scanner.next();		
	}
	
	/**
	 * Metodo che permette di leggere da tastiera una stringa di testo con la previa visualizzazione di un messaggio (String) immesso come ingresso.
	 * 
	 * @param message Messaggio visualizzato prima dell'immissione dati da tastiera
	 * @return Ritorna la stringa inserita da tastiera
	 * 
	 */
	
	public static String readString(String message)
	{
		System.out.print(message);
		
		return scanner.next();		
	}
	
	/**
	 * Metodo che permette di leggere da tastiera una stringa di testo non vuota.
	 * Questo metodo verifica che la stringai inserita da tastiera non sia vuota.
	 * In caso contrario il metodo visualizza un messaggio di errore e in seguito richiede l'immissione della stringa.
	 * 
	 * @return Ritorna la stringa inserita da tastiera
	 * 
	 */
	
	public static String readStringNotEmpty()
	{
		boolean check = false;
		String str = null;
		
		do		
		{
			str = readString();
			str = str.trim();
			
			if(str.length() > 0)
				check = true;
			else
				System.out.println(MESSAGGIO_STRINGA_VUOTA);
		}
		while(!check);
		
		return str;
	}
	
	/**
	 * Metodo che permette di leggere da tastiera una stringa di testo non vuota con la previa visualizzazione di un messaggio (String) immesso come ingresso.
	 * Questo metodo verifica che la stringai inserita da tastiera non sia vuota.
	 * In caso contrario il metodo visualizza un messaggio di errore e in seguito richiede l'immissione della stringa.
	 * 
	 * @param message Messaggio visualizzato prima dell'immissione dati da tastiera
	 * @return Ritorna la stringa inserita da tastiera
	 * 
	 */
	
	public static String readStringNotEmpty(String message)
	{
		boolean check = false;
		String str = null;
		
		do		
		{
			str = readString(message);
			str = str.trim();
			
			if(str.length() > 0)
				check = true;
			else
				System.out.println(MESSAGGIO_STRINGA_VUOTA);
		}
		while(!check);
		
		return str;
	}
	
	/**
	 * Metodo per l'inserimento di un booleano (si, no).
	 * Questo metodo ritornerà un boolean equivalente alla scelta effettuata, TRUE se si è scelto il primo parametro di ingresso, FALSE per il secondo.
	 * 
	 * @param messaggio String contenente il messaggio visualizzato prima dell'inserimento
	 * @param si String contenente il primo valore ammissibile
	 * @param no String contenente il secondo valore ammissibile
	 * @return Ritorna un boolean contenete la scelta effettuata (true = primoValore, false = secondoValore)
	 * 
	 */
	
	public static boolean readBoolean(String messaggio, String si, String no)
	{
		Boolean result = null;
		
		while(result == null) 
		{
			String input = readStringNotEmpty(messaggio);
			
			if(si.equalsIgnoreCase(input))
			{
				result = Boolean.TRUE;
			} 
			else if(no.equalsIgnoreCase(input)) 
			{
				result = Boolean.FALSE;
			}
			else
				System.out.println(MESSAGGIO_FALSO_INSERIMENTO);
		}
		System.out.println();
		
		return result;
	}
	
	/**
	 * Metodo che permette di leggere da tastiera un carattere.
	 * 
	 * @return Ritorna il carattere inserito da tastiera
	 * 
	 */
	
	public static char readChar()
	{
		String tmp = readStringNotEmpty();
		char ch = tmp.charAt(0);
		
		return ch;
	}
	
	/**
	 * Metodo che permette di leggere da tastiera un carattere con la previa visualizzazione di un messaggio (String) immesso come ingresso.
	 * 
	 * @param message Messaggio visualizzato prima dell'immissione dati da tastiera
	 * @return Ritorna il carattere inserito da tastiera
	 * 
	 */
	
	public static char readChar(String message)
	{
		String tmp = readStringNotEmpty(message);
		char ch = tmp.charAt(0);
		
		return ch;
	}
	
	/**
	 * Metodo che permette di leggere da tastiera un carattere specificato in ingresso con la previa visualizzazione di un messaggio (String) immesso come ingresso.
	 * Questo metodo permette di controllare il carattere immesso da tastiera e in caso negativo visualizza un messaggio di errore e richiede l'immissione del carattere.
	 * 
	 * @param message Messaggio visualizzato prima dell'immissione dati da tastiera
	 * @param ch1 Unico carattere permesso
	 * @return Ritorna il carattere inserito da tastiera
	 * 
	 */
	
	public static char readCharDefined(String message, char ch1)
	{
		boolean check = false;
		char ch = 'a';
		
		do
		{
			ch = readChar(message);
			
			if(ch == ch1)
				check = true;
			else
				System.out.println(MESSAGGIO_CHAR_FALSO + ch1);
		}
		while(!check);
		
		return ch;
	}
	
	/**
	 * Metodo che permette di leggere da tastiera un carattere specificato in ingresso (ch1 oppure ch2) con la previa visualizzazione di un messaggio (String) immesso come ingresso.
	 * Questo metodo permette di controllare il carattere immesso da tastiera e in caso negativo visualizza un messaggio di errore e richiede l'immissione del carattere.
	 * 
	 * @param message Messaggio visualizzato prima dell'immissione dati da tastiera
	 * @param ch1 Primo carattere permesso
	 * @param ch2 Secondo carattere permesso
	 * @return Ritorna il carattere inserito da tastiera
	 * 
	 */
	
	public static char readCharDefined(String message, char ch1, char ch2)
	{
		boolean check = false;
		char ch = 'a';
		
		do
		{
			ch = readChar(message);
			
			if(ch == ch1 || ch == ch2)
				check = true;
			else
				System.out.println(MESSAGGIO_CHAR_FALSO + ch1 + "oppure " + ch2);
		}
		while(!check);
		
		return ch;
	}
	
	/**
	 * Metodo che permette di leggere da tastiera un carattere MAIUSCOLO specificato in ingresso (ch1 oppure ch2) con la previa visualizzazione di un messaggio (String) immesso come ingresso.
	 * Questo metodo permette di controllare il carattere immesso da tastiera e in caso negativo visualizza un messaggio di errore e richiede l'immissione del carattere.
	 * 
	 * @param message Messaggio visualizzato prima dell'immissione dati da tastiera
	 * @param ch1 Primo carattere permesso (DEVE ESSERE MAIUSCOLO)
	 * @param ch2 Secondo carattere permesso (DEVE ESSERE MAIUSCOLO)
	 * @return Ritorna il carattere inserito da tastiera
	 * 
	 */
	
	public static char readUpperCharDefined(String message, char ch1, char ch2)
	{
		boolean check = false;
		char ch = 'a';
		
		do
		{
			ch = readChar(message);
			ch = Character.toUpperCase(ch);
			
			if(ch == ch1 || ch == ch2)
				check = true;
			else
				System.out.println(MESSAGGIO_CHAR_FALSO + ch1 + "oppure " + ch2);
		}
		while(!check);
		
		return ch;
	}
	
	/**
	 * Metodo che permette di leggere da tastiera un carattere specificato in ingresso (ch1 oppure ch2) con la previa visualizzazione di un messaggio (String) immesso come ingresso.
	 * Questo metodo permette di controllare il carattere immesso da tastiera e in caso negativo visualizza un messaggio di errore e richiede l'immissione del carattere.
	 * Questo metodo NON è case sensitive, dunque è possibile immettere il carattere permesso sia maiuscolo che minuscolo senza riscontrare problemi di immissione.
	 * 
	 * @param message Messaggio visualizzato prima dell'immissione dati da tastiera
	 * @param ch1 Primo carattere permesso
	 * @param ch2 Secondo carattere permesso
	 * @return Ritorna il carattere inserito da tastiera
	 * 
	 */
	
	public static char readCharDefinedNotCaseSensitive(String message, char ch1, char ch2)
	{
		boolean check = false;
		char ch = 'a';
		
		do
		{
			ch = readChar(message);
			char tmp = Character.toUpperCase(ch);
			
			if(tmp == Character.toUpperCase(ch1) || tmp == Character.toUpperCase(ch2))
				check = true;
			else
				System.out.println(MESSAGGIO_CHAR_FALSO + ch1 + "oppure " + ch2);
		}
		while(!check);
		
		return ch;
	}

}
