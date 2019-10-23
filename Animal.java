// Program    : Animal Parts
// Authors    : Bill Skiles
// File       : Animal.java
// Description: This abstract class sets up the different animal parts for each subclass.

abstract public class Animal 
{
	protected String name;
	protected int numLegs;
	protected int numEyes;
	protected int numWings;
	protected String sound;
	
	public Animal()
	{
		name = "";
		numLegs = 0;
		numEyes = 0;
		numWings = 0;
		sound = "";
	}
	
	public String toString()
	{
		String result = "\n\n Animal name: " + name + "\n Number of legs: " 
						+ numLegs + "\n Number of eyes: " + numEyes + 
						"\n Number of wings: " + numWings + "\n Sound: " + sound;
		
		return result;
	}
	
	abstract void assignParts();
}
