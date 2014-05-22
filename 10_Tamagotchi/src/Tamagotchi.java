
public class Tamagotchi 
{
	// Valori default
	private final static double DEFAULT_SAZIETA = 50;
	private final static double DEFAULT_AMORE = 50;
	
	// Valori generali
	private final static double MAX_CIBO = 100;
	private final static double MIN_CIBO = 0;
	private final static double MAX_AMORE = 100;
	private final static double MIN_AMORE = 0;
	private final static double VALORE_BISCOTTO_CIBO = 0.1;
	private final static double VALORE_BISCOTTO_AMORE = 0.25;
	private final static double VALORE_CAREZZA_AMORE = 1;
	private final static double VALORE_CAREZZA_CIBO = 0.5;
	
	
	// Valori limite felicità
	private final static double MAX_CIBO_HAPPY = 90;
	private final static double MIN_CIBO_HAPPY = 30;
	private final static double MIN_AMORE_HAPPY = 30;
	
	// Caratteristiche Tamagotchi
	private String nome;
	private double sazieta;
	private double amore;
	
	public Tamagotchi(String nome, double sazieta, double amore)
	{
		this.nome = nome;
		this.sazieta = sazieta;
		this.amore = amore;
	}
	
	public Tamagotchi(String nome)
	{
		this(nome, DEFAULT_SAZIETA, DEFAULT_AMORE);
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	public double getSazieta()
	{
		return this.sazieta;
	}
	
	public double getAmore()
	{
		return this.amore;
	}
	
	private String isHappy()
	{
		if(this.sazieta < MAX_CIBO_HAPPY && this.sazieta > MIN_CIBO_HAPPY && this.amore > MIN_AMORE_HAPPY)
			return "felice!";
		else
			return "infelice!";
	}
	
	private void biscotto()
	{
		
		this.sazieta *= (1 + VALORE_BISCOTTO_CIBO);
		this.amore -= VALORE_BISCOTTO_AMORE;
		
		if(this.sazieta > MAX_CIBO)
			this.sazieta = MAX_CIBO;
		if(this.amore > MAX_AMORE)
			this.amore = MAX_AMORE;
		if(this.sazieta < MIN_CIBO)
			this.sazieta = MIN_CIBO;
		if(this.amore < MIN_AMORE)
			this.amore = MIN_AMORE;
	}
	
	public void biscotti(int numBiscotti)
	{
		int i = 0;
		for(i=0; i < numBiscotti; i++)
		{
			this.biscotto();
		}
	}
	
	public void carezza()
	{
		this.amore += VALORE_CAREZZA_AMORE;
		this.sazieta -= VALORE_CAREZZA_CIBO;
		
		if(this.sazieta > MAX_CIBO)
			this.sazieta = MAX_CIBO;
		if(this.amore > MAX_AMORE)
			this.amore = MAX_AMORE;
		if(this.sazieta < MIN_CIBO)
			this.sazieta = MIN_CIBO;
		if(this.amore < MIN_AMORE)
			this.amore = MIN_AMORE;
	}
	
	public void carezze(int numCarezze)
	{
		int i = 0;
		for(i=0; i < numCarezze; i++)
		{
			this.carezza();
		}
	}
	
	public boolean isAlive()
	{
		if(this.sazieta == MAX_CIBO || this.sazieta == MIN_CIBO || this.amore == MIN_AMORE)
			return false;
		else
			return true;
	}
	
	public void statoTamagotchi()
	{
			System.out.printf("%s \nPercentuale sazietà: %1.2f %c\nPercentuale affettività: %1.2f %c\n\n%s è %s\n", this.nome, this.sazieta, '%', this.amore, '%', this.nome, this.isHappy());
	}
	
}
