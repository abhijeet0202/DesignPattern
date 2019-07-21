package DesignProblem.ClassA;

import DesignProblem.ClassB.ClassB;
import DesignProblem.ClassC.ClassC;
/*
 * Its a design Problem (Cyclic Dependency), which need to understand in progression Below:
 * 
 * PreRequiste:
 * - Think like a project which is very very old, you can't change or modify existing calling functionalities and so on.
 * - There is a function named C1() inside ClassC i.e. DesignProblem.ClassC.ClassC::C1() 
 *   which is called from DesignProblem.ClassB.ClassB::B1() i.e. One Way is used ClassB---->ClassC.
 *   
 * - Now, A new requirement came in which we need to call any function (i.e. either create new 
 *   or used old function inside ClassB, in this i have created new named B2()) of ClassB 
 *   from ClassC (Again i.e. either create new or used old function inside Class C).
 *   Now, if we going to implement this code, it will cry for CYCLIC DEPENDENCY ERROR ClassC----> ClassB
 *   
 *   How To resolve or achieve the new requirement without making cyclic dependency
 *   
 *   Step1 : Create an Interface inside ClassC package but this Interface is actually meant to implement by ClassB
 *   I.e BInterface.java
 *   
 *   Step2: Define a/more function inside newly created Interface, which definition have to provide by ClassB or if already
 *   existing function need to be called, simply declare that in Interface, My example I created B2().
 *   
 *   Step3: Once Interface is complete, IMPLEMENT that interface by ClassB i.e. ClassB implements BInterface,
 *    If function is new Provide then define it else not required.
 *    NOTE : If you observe, till time CYCLIC DEPENDENCT Not Broken, A new  Import get added in ClassB i.e ClassB--->ClassC
 *    
 *   Step4: Now declare an instance of BInterface inside ClassC i.e. "public static BInterface objB" or "public BInterface objB"
 *   NOTE: In later Steps I will provide the reasoning behind providing "public" and "static" modifier.
 *   
 *   Step5: Introduce a new function or used earlier function to call ClassB functions which is defined in interface
 *   In my example I have created Class::C2 in which i invoked objB.B2().
 *   Till now, requirement to call a ClassB function from ClassC get resolved (PARTIALY) without creating CD error
 *   NOw, only problem left is to Instantiate "objB" inside ClassC.
 *   
 *   From main class or any other class which is kind of controller, there create a static block initialize objB 
 *   There is 2 ways to create instance both are defined below.
 *  
 */
public class MainClass {

	static {
		ClassC.objB = new ClassB();
	}
	public static void main(String[] args) {
//		ClassC obj = new ClassC();
//		obj.objB = new ClassB();
//		obj.setBInterface(obj.objB);		
//		obj.B2();
	}

}
