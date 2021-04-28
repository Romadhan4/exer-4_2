
public class Fruit {
	  
	String name ;
	public Fruit (String name) {
		this.name = name ;
	System.out.println("Fruit constructor is invoked");
}
}
 class Apple extends Fruit {
	 String color ;
	  public Apple(String name, String color) {
		  super(name);
		  this.color=color;
	    System.out.println("Apple constructor is invoked");
	  }
	}
class main {
	public static void main (String []args) {
		Apple a = new Apple ("Red Apple","Red");
		System.out.println (a.name);
		
		Fruit b = new Fruit ("Banana");
		System.out.println (b.name);
	}
}
