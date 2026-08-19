package javaprogrm;
class GrandParent
{
	void bp()
	{
		System.out.println(" understain   bp");
	}
}
class Parent extends GrandParent
{
	void cancer()
	{
		System.out.println(" understain");
	}
	
}


public class example extends Parent {
	public static void main(String[] args) {
 		example  bb= new example();
 		bb.bp();
 		bb.cancer();
	}
	

}
