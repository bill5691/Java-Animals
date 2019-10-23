// Program    : Animal Parts
// Authors    : Bill Skiles
// File       : AnimalDriver.java
// Description: This program demonstrates the use of inheritance and polymorphism. Different animal objects
//              are created from a generic Animal class to show different characteristics.

public class AnimalDriver 
{

	public static void main(String[] args) 
	{
		Animal cat = new Cat();
		Animal spider = new Spider();
		Animal cricket = new Cricket();
		Animal owl = new Owl();
		
		cat.assignParts();
		spider.assignParts();
		cricket.assignParts();
		owl.assignParts();
		
		System.out.print(cat.toString());
		System.out.print(spider.toString());
		System.out.print(cricket.toString());
		System.out.print(owl.toString());
	}

}
