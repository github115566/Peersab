/**
 * 
 * @author RBCA-19-102
 *
 */

public class thermos {
	/**
	 * Volume: To print the amount of the Liquid in the Thermos
	 * Brand: To print the Brand of the Thermos
	 * Liquid: TO print the type of the Liquid in the Thermos
	 */
	
	float volume = 0;
	String Brand, liquid;
	/**
	 * Constructor to initialize the value
	 * @param volume: volume of the Liquid poured in the Thermos
	 * @param Brand: The Brand of the Thermos
	 * @param liquid: Type of the Liquid poured in the Thermos
	 */
	
	thermos(float volume, String Brand, String liquid )
	{
		this.volume = volume;
		this.Brand = Brand;
		this.liquid = liquid;
				
	};
	/**
	 * Method to add Liquid in the Thermos
	 * @param d: to check if the volume of Liquid is greater than Thermos
	 */
	
	void addliquid(double d)
	{
		if(d <= 1 ) {
			volume = (float) (volume + d);
		}else {
			System.out.println(" The Capacity of Thermos is 1 litre\n ");
		}
	}
	/**
	 * Method to pour Liquid from the Thermos
	 * @param p: to check if the volume of Liquid poured is greater than thermos
	 */
	
	
	void pourliquid(double p) {
		if(p <= volume)   {
			volume = (float)	(volume-p);
		}else {
			System.out.println("The thermos is empty\n ");
		}
	}
	/**
	 * Method to print all the details of the Thermos
	 */
	
	
	void displayDetails()  {
		System.out.println("Brand: "+Brand);
		System.out.println("\nliquid: "+liquid);
		System.out.println("\nvolume: (in Litres): "+volume);
				
	}
			
	public static void main(String[] args) {
		/**
		 * Godrej object is created with the value of
		 * Brand: Godrej 
		 * Liquid: Orange Juice
		 * Volume: Total volume of the Thermos
		 * Added 0.4ml of Orange Juice in the Thermos
		 * Poured 0.2ml of Orange Juice
		 * Displayed the details of the thermos
		 */
		thermos Godrej=new thermos(1, "Godrej", "Orange Juice");
		Godrej.addliquid(0.4);
		Godrej.pourliquid(0.2);
		Godrej.displayDetails();

	}
	
	private static void thermos()
	{
		
	}

}
