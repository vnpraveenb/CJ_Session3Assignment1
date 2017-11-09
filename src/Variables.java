
public class Variables {

	public static int classInt = 5; // Class Variable
	
	public int instanceInt = 10; // Instance Variable
	
	 
	
	
	public static void main(String[] args) {

		System.out. println("This programs shows the difference between Instance Variable and Class Variables\n");
			
		Variables obj1 = new Variables(); // Instantiating a Variables object 
		Variables obj2 = new Variables(); // Instantiating a Variables object 
	
		System.out.println("Class Variable");
		
		//You can access a static variable with it's class Name like this
		Variables.classInt = 15 ; //Setting classInt value to 15, But you can not access instance variable like this
		
		System.out.println("Class variable\'s value in obj1: " + obj1.classInt); //Prints the value of class variable(classInt) as 15
		System.out.println("Class variable\'s value in obj2: " + obj2.classInt); //Prints the value of class variable(classInt) as 15
		System.out.println();
		
		/*In both cases output will be 15 as classInt is shared by all instances of the Variables class.
		 * There's only one copy of that variable that is shared with all instances of that class.
		 * If changes are made to that variable, all other instances will see the effect of the changes,
		* while the instance variable will each have separate copy of instanceInt (i.e.instance variable)*/
		
		System.out.println("Instance Variable");
		
		//You can only access an instance variable with it's object like this. 
		obj1.instanceInt = 20; ///Setting instanceInt value to 20 here, will not be reflected in obj2.
	 	
		System.out.println("Instance variable\'s value in obj1: " + obj1.instanceInt); // Prints the value of instance variable(instanceInt) as 20
		System.out.println("Instance variable\'s value in obj1: " + obj2.instanceInt);  // Prints the value of instance variable(instanceInt) as 10
		System.out.println();
		

	}
}