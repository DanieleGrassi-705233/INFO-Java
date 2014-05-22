import Utility.MyScanner;


public class TamaMain 
{
	
	private final static String SALUTO_INIZIALE = "Benvenuto nel programma Tamagotchi!";
	
	private final static String IMMISSIONE_NOME = "Inserisci il nome del tuo Tamagotchi: ";
	private final static String IMMISSIONE_SAZIETA = "Inserisci il valore della sua sazietà: ";
	private final static String IMMISSIONE_AMORE = "Inserisci il valore della sua affettività: ";
	
	private final static String MESSAGGIO_SELEZIONE = "Scegli la prossima operazione: ";
	private final static String MESSAGGIO_SELEZIONE_BISCOTTO = "1. Dai un biscotto al tuo Tamagotchi!";
	private final static String MESSAGGIO_NUM_BISCOTTI = "Quanti biscotti vuoi dare al tuo Tamagotchi? ";
	private final static String MESSAGGIO_SELEZIONE_CAREZZA = "2. Dai una carezza al tuo Tamagotchi!";
	private final static String MESSAGGIO_NUM_CAREZZE = "Quante carezze vuoi dare al tuo Tamagotchi? ";
	private final static String MESSAGGIO_SELEZIONE_END = "3. Termina il programma!";
	
	private final static String MESSAGGIO_MORTE_TAMAGOTCHI = "Siamo spiacenti ma il suo Tamagotchi è morto..";
	
	private final static int BUTTON_1 = 1;
	private final static int BUTTON_2 = 2;
	private final static int BUTTON_3 = 3;
	
	public static void main (String args [])
	{
		salutoIniziale();
		Tamagotchi tama = creaTamagotchi();
		
		int selezione = 0;
		for(; ; )
		{
			System.out.println();
			System.out.println(MESSAGGIO_SELEZIONE);
			System.out.println();
			System.out.println(MESSAGGIO_SELEZIONE_BISCOTTO);
			System.out.println(MESSAGGIO_SELEZIONE_CAREZZA);
			System.out.println(MESSAGGIO_SELEZIONE_END);
			
			selezione = MyScanner.readInt();
			
			if(selezione == BUTTON_1)
				tama.biscotti(MyScanner.readInt(MESSAGGIO_NUM_BISCOTTI));
			else if(selezione == BUTTON_2)
				tama.carezze(MyScanner.readInt(MESSAGGIO_NUM_CAREZZE));
			else if(selezione == BUTTON_3)
				break;
			
			if(!tama.isAlive())
				{
					System.out.println();
					System.out.println(MESSAGGIO_MORTE_TAMAGOTCHI);
					break;
				}
			else
				tama.statoTamagotchi();
			
			
		}
	}
	
	private static void salutoIniziale()
	{
		System.out.println(SALUTO_INIZIALE);
		System.out.println();
	}
	
	private static Tamagotchi creaTamagotchi()
	{
		String nome = MyScanner.readString(IMMISSIONE_NOME);
		double sazieta = MyScanner.readDouble(IMMISSIONE_SAZIETA);
		double amore = MyScanner.readDouble(IMMISSIONE_AMORE);
		
		return new Tamagotchi(nome, sazieta, amore);
	}
	
}
