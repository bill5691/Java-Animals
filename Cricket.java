// Program    : Animal Parts
// Authors    : Bill Skiles
// File       : Cricket.java
// Description: This Animal subclass assigns parts for a cricket.

public class Cricket extends Animal
{
	public Cricket()
	{
		
	}
	
	public String toString()
	{
		String result = super.toString();
		return result;
	}
	
	public void assignParts()
	{
		super.name = "Cricket";
		super.numLegs = 6;
		super.numEyes = 5;
		super.numWings = 4;
		super.sound = "Chiiirp";
	}
}
