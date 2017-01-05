/**
 * 
 */
package DesignProblem.ClassB;

import DesignProblem.ClassC.BInterface;
import DesignProblem.ClassC.ClassC;

/**
 * @author abhibane
 *
 */
public class ClassB implements BInterface {
	
	public void B1(){
		System.out.println("Inside B:B1");
		ClassC objC = new ClassC();
		objC.C1();
	}
	
	@Override
	public void B2(){
		System.out.println("Inside B:B2");
	}

}
