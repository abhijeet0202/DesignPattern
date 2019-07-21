package Builder;

public class BuilderDemo {

	public static void main(String[] args) {
		//Creating object using Builder pattern in java
        Cake whiteCake = 
       new Cake.CakeBuilder().sugar(1).butter(0.5).eggs(2)
       .vanilla(2).flour(1.5). bakingpowder(0.75).milk(0.5).build();
     
        //Cake is ready to eat :)
        System.out.println(whiteCake);
	}

}

class Cake{
	
	private final double sugar;
	private final double butter;
	private final int eggs;
	private final int vanilla;
	private final double flour;
	private final double bakingpowder;
	private final double milk;
	private final int cherry;
	
	private Cake(CakeBuilder builder){
		this.sugar = builder.sugar;
		this.butter = builder.butter;
		this.eggs = builder.eggs;
		this.vanilla = builder.vanilla;
		this.flour = builder.flour;
		this.bakingpowder = builder.bakingpowder;
		this.milk = builder.milk;
		this.cherry = builder.cherry;
	}
	
	@Override
    public String toString() {
        return "Cake{" + "sugar=" + sugar + ", butter=" + butter + ", eggs=" + eggs + ", vanila=" + vanilla + ", flour=" + flour + ", bakingpowder=" + bakingpowder + ", milk=" + milk + ", cherry=" + cherry + '}';

    }
	//Nested Builder Class
	public static class CakeBuilder{
		private  double sugar;
		private  double butter;
		private  int eggs;
		private  int vanilla;
		private  double flour;
		private  double bakingpowder;
		private  double milk;
		private  int cherry;
		
		// bUilder methods
		public CakeBuilder sugar(double cup){
			//checks
			this.sugar = cup;
			return this;
		}
		public CakeBuilder butter(double cup){
			this.butter = cup;
			return this;
		}
		public CakeBuilder eggs(int cup){
			this.eggs = cup;
			return this;
		}
		public CakeBuilder vanilla(int cup){
			this.vanilla = cup;
			return this;
		}
		public CakeBuilder flour(double cup){
			this.flour = cup;
			return this;
		}
		public CakeBuilder bakingpowder(double cup){
			this.bakingpowder = cup;
			return this;
		}
		public CakeBuilder milk(double cup){
			this.milk = cup;
			return this;
		}
		public CakeBuilder cherry(int cup){
			this.cherry = cup;
			return this;
		}
		public Cake build(){
			return new Cake(this);
		}
	}
	
	
}