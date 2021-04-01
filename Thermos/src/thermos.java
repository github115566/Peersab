
public class thermos {
	float volume = 0;
	String Brand, liquid;
	
	thermos(float volume, String Brand, String liquid )
	{
		this.volume = volume;
		this.Brand = Brand;
		this.liquid = liquid;
		
	};
	
	void addliquid(double d)
	{
		if(d <= 1 ) {
			volume = (float) (volume + d);
		}else {
			System.out.println(" The Capacity of Thermos is 1 litre\n ");
		}
	}
	void displayDetails()  {
		System.out.println("Brand: "+Brand);
		System.out.println("\nliquid: "+liquid);
		System.out.println("\nvolume: (in Litres): "+volume);
				
	}
			
	public static void main(String[] args) {
		thermos Godrej=new thermos(1, "Godrej", "Orange Juice");
		Godrej.addliquid(0.4);
		Godrej.displayDetails();

	}
	
	private static void thermos()
	{
		
	}

}
