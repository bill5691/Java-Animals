// Program    : Animal Parts
// Authors    : Bill Skiles
// File       : Spider.java
// Description: This Animal subclass assigns parts for a spider.

public class Spider extends Animal
{
	public Spider()
	{
		
	}
	
	public String toString()
	{
		String result = super.toString();
		return result;
	}
	
	public void assignParts()
	{
		super.name = "Spider";
		super.numLegs = 8;
		super.numEyes = 8;
		super.sound = "Hissssss";
	}
}
