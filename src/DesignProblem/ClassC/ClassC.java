package DesignProblem.ClassC;

public class ClassC {
	
	public static BInterface objB;
	
	public void C1(){
		System.out.println("Inside C:C1");
	}
	
	public void B2(){
		System.out.println("Inside C:C2");
		objB.B2();
		
	}

}
