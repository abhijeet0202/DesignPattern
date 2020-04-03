package Singleton;

public class BillPughApproch {
	
	private BillPughApproch(){}
	
	public static BillPughApproch getInstance() {
		return SingeltonInnerClass.INSTANCE;
	}
	
	private static class SingeltonInnerClass{
		private static final BillPughApproch INSTANCE = new BillPughApproch();
	}
	

	public static void main(String[] args) {
		System.out.println(BillPughApproch.getInstance());
		System.out.println(BillPughApproch.getInstance());

	}

}
