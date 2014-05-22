package Utility;
import java.util.*;

/**
 * 
 * @author Daniele Grassi
 * @version 1.1
 * 
 * Classe per la creazione di menu con interfaccia testuale.
 *
 */

public class MyMenu 
{	
	private final static String CORNICE = "***********************************************************";
	private final static String SCELTA_ZERO = "0 - Esci";
	
	private final static String MESSAGGIO_BASE = "Seleziona una delle voci: ";
	
	private String titolo;
	private Vector<String> menu;
	
	/**
	 * Costruttore della classe MyMenu, il quale istanzia l'oggetto di tipo MyMenu ricevendo in ingresso 2 parametri: una stringa, un boolean.
	 * Permette la creazione di un menu testuale con la presenza di una scelta standard di uscita a seconda delle preferenze.
	 * Le altre righe del menu dovranno esser aggiunte successivamente tramite il metodo public void addLine(String line).
	 * 
	 * @param titolo Titolo del menu
	 * @param scelta0 Boolean che si riferisce alla scelta di utilizzare o meno la riga standard "0 - Esci" (true = PRESENTE, false = ASSENTE)
	 * 
	 */
	
	public MyMenu(String titolo, boolean scelta0)
	{
		this.titolo = new String(titolo);
		this.menu = new Vector<String>();
		if(scelta0)
			this.menu.add(SCELTA_ZERO);
	}
	
	/**
	 * Costruttore della classe MyMenu, il quale istanzia l'oggetto di tipo MyMenu ricevendo in ingresso 3 parametri: una stringa, un boolean, una array di stringhe.
	 * Permette la creazione di un menu testuale con la presenza di una scelta standard di uscita a seconda delle preferenze.
	 * Le altre righe del menu sono contenute nell'array in ingresso, esse verranno numerate a seconda della posizione nell'array (da 1 in avanti).
	 * 
	 * @param titolo Titolo del menu
	 * @param scelta0 Boolean che si riferisce alla scelta di utilizzare o meno la riga standard "0 - Esci" (true = PRESENTE, false = ASSENTE)
	 * @param scelte Array contenente le righe del menu
	 * 
	 */
	
	public MyMenu(String titolo, boolean scelta0, String [] scelte)
	{
		this.titolo = new String(titolo);
		this.menu = new Vector<String>();
		
		if(scelta0)
			this.menu.add(SCELTA_ZERO);
		
		for(int i=0; i<scelte.length; i++)
		{
			this.addLine(scelte[i]);
		}
	}
	
	/**
	 * Metodo che permette di aggiungere una linea di selezione nel menu attraverso la stringa passata come parametro di ingresso.
	 * 
	 * @param line Stringa che identifica ciò che verrà scritto nella nuova linea del menu
	 * 
	 */
	
	public void addLine(String line)
	{
		StringBuffer newLine = new StringBuffer();
		
		newLine.append(this.menu.size() + " - " + line);
		
		this.menu.add(newLine.toString());
	}
	
	/**
	 * Metodo per la restituzione di una stringa contenente la visualizzazione testuale del menu.
	 * Questo metodo contiene un'intestazione con cornice compresa e la lista delle righe numerate con la scelta base 0 in fondo.
	 * 
	 * @return Ritorna la stringa di formattazione del menu
	 */
	
	public String toString()
	{
		StringBuffer menuStr = new StringBuffer();
		
		menuStr.append("\n\n" + CORNICE + "\n" + this.titolo + "\n" + CORNICE + "\n\n");
		
		for(int i=1; i<menu.size(); i++)
			menuStr.append(menu.get(i) + "\n");
		
		menuStr.append(menu.get(0) + "\n\n");
		
		return menuStr.toString();
	}
	
	/**
	 * Metodo che permette di selezionare una determinata riga del menu.
	 * Questo metodo sfrutta il metodo public static int readInt(String message, int min, int max) della classe MyScanner.
	 * 
	 * @return Ritorna il numero immesso da tastiera corrispondente alla riga del menu selezionata
	 */
	
	public int selezione()
	{
		return MyScanner.readInt(MESSAGGIO_BASE, -1, this.menu.size());
	}
	
}
