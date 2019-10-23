// Program    : Animal Parts
// Authors    : Bill Skiles
// File       : Cat.java
// Description: This Animal subclass assigns parts for a cat.

public class Cat extends Animal
{
	public Cat()
	{
		
	}
	
	public String toString()
	{
		String result = super.toString();
		return result;
	}
	
	public void assignParts()
	{
		super.name = "Cat";
		super.numLegs = 4;
		super.numEyes = 2;
		super.sound = "Meoooow";
	}

}
