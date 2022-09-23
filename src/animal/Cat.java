package animal;

public class Cat extends Animal{
	
	static String default_type ="domestic";
	
	
	private String type; 

	// also inherits variable define in the super class
	
	public Cat(int age)
	{
		// class constructor from superclass Animal class
		super (age);
		
		// set the type of cat to defualt value
		this.type=Cat.default_type;
	}

	
	// getter and setters
	
	/**
	 * Gets the type of cat
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the type of cat
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	
	// other methods
	
	@Override
	public void speak()
	{
		System.out.println(this.name +"Says  Meow! ");
	}
	
	
	@Override
	public String toString()
	{
		//System.out.println();
		return this.name +"is a "+ this.type;
	}
	
}
