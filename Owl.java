// Program    : Animal Parts
// Authors    : Bill Skiles
// File       : Owl.java
// Description: This Animal subclass assigns parts for an owl.

public class Owl extends Animal
{
	public Owl()
	{
		
	}
	
	public String toString()
	{
		String result = super.toString();
		return result;
	}
	
	public void assignParts()
	{
		super.name = "Owl";
		super.numLegs = 2;
		super.numEyes = 2;
		super.numWings = 2;
		super.sound = "Hooooot";
	}
}
