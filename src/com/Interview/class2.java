package com.Interview;

public class class2 {

	public static void main(String[] args) {
		
		//Question 11
		
		String a = "hello"; //This is string literal 
		String c = "hello";
		//When strings are immutable it means that new objects are being created of that string, the initial value does not get deleted. 
		c = "bye";
		//System.out.print(c);
		String b = new String("Hello");
		
		a.concat(" John");  //cannot attatch value to immutable string.
		System.out.println(a);
		
		//string is immutable and string buffer is mutable. once you declare a string that immutable you can't change it but
		//you can change a string that is mutable by creating a stringbuffer object and appending it. 
		StringBuffer sb = new StringBuffer("Hello"); //can attatch value to mutable string to change it.
		sb.append(" John");
		System.out.println(sb);

		//stringbuffer takes longer to sync than stringbuilder
		StringBuilder sbld = new StringBuilder("Hello");
		sbld.append(" John");
		System.out.println(sbld);
		
		//Question 13+14
		//Declare variable static outside the constructor, method, etc but inside the class
		//static variables are also called global and class
		//Accesible from anywhere, even a different class
		//instance is created within the class but you need to create an object to access it from the class or another class
		//changing the instance variable doesn't effect the master instance variable. 
		//local variable variable is inside method/constructor/block and can only be used in there. 
		//Used the utilities package, the commonmethods class allowing us to use it globally.Ex: click, sendkeys, etc.
		
		//
		
		//Question 15
		//Constructor is a block of code used to intialize the variable
		//construct can't be abstract, final, static
		//Constructor has to be same name as class, have no return type, and have parameters or don't have parameters
		//don't have to make a constructor cause a default constructor is always created when an object of the class is created.
		//constructor is used to initialize variables, 
		//example: using page factory to initalize variables of the constructor.
		//constructor has to be same name as class but method doesn't,method has return type and constructor doesn't
		//constructor can't be static but method can, etc.
		
		//Question 17
		//exceptions can be handled by using try and catch
		//When we don't want to handle it, we have to throw it away.
		//runtime exception = checked during running.
		//check and uncheck exception = compile time exception,
		//java and webdriver exceptions are different, specify which!
		//you have 1 try and multiple catches
		//you can use finally to catch the try without having any catches.
		//the try and catch allows the code to continue to run when you have errors. 
		
		https://www.linkedin.com/jobs/view/1028432408/?eBP=CwEAAAFoHsprgAGnsFcZO5iMQ81Hn_kVnv4OD6tQcAgxWZKSTeloN3upIYTdtbCuTqQ17BdSn4c5_o8pDFPfDJrbKboXZ77d8QFX-XTKrbtyy67LftmsjxfvK0P-iBnj6a2SemnK_KX08lAhgqAqFjuuxTHscToLApOU4ov8lyXNHCNupTx267rOKMwIrY1XPB4uIT-uQmfnP4r_-94aYMgeMyy6YvC3Mk-m7J7UN-c508uiUStitHwIfWu64K7aPWojEDlHJTmRiH8H76IGfXFxePw9EXON18Nq_VtZ91RG9o6sI6O7EpOu1U24UHCyCOm4HHIAOHXHa7DX4VvNDf5hMrUVOXlt4pjbdSI&refId=c195774e-ad10-4105-ae7a-f03c42ca3fa2&trk=d_flagship3_job_details
		//Question 18
		//
		
		
		//Question 19
		
		//Question 24
		/*Abstract class = declared using abstract keyword, concrete methods and abstract methods,
		 * can have constructor, can use any access modifiers
		 * Interface = only abstract methods, cannot have constructor,every method is public (cannot overwrite staic methods)
		 * 
		 * Use the interface class for
		 * We usually just use the default interfaces (webdriver, screenshot, etc)
		 * 
		 * We do abstraction to hide the implemenation to the user, all we want to show is the functionality of 
		 * class or object. not behind the scenes. Ex: POM, wwe write locators(id, name, xpath) in page class
		 * We titilize these locators in test but we can't see these locators in the tests. We hide the locators from the tests
		 * 
		 * Question 25
		 * OOPS concepts: inhertance, polymorphism, abstraction, 
		 *  Inheritance = parent and child relationship, parent class(super, base, parent [all the same]) 
		 *  Polymorphism = Method overloading and overriding, one task can be done in multiple ways
		 *  Abstraction = Hiding the implementation details, and only showing the test
		 *  Encapsulation = Trying to achieve security so no one can access it and change data. 
		 *  
		 *  Java is not 100% object oriented because of primitive data types
		 *  
		 *  Question 26
		 *  Thru class = Types of inheritance: Single, multilevel(child, parent, grandparent), and hierchal
		 *  Inheritance = multilevel inheritance(two parents), hybrid inheritance
		 *  Base class in cucmber, used to initialize webdriver and properties file. 
		 *  
		 *  
		 *   method overloading in framework, created methods to switch fraes
		 */
		
		
		
		
		
	}
}
