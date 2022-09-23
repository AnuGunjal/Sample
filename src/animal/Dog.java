package animal;

public class Dog extends Animal {
	
	//instance variables
	// Breed for Dog
	private String breed;
	
	
	// Constructor
	
	public Dog(int age, String breed)
	{
		//calling super class  constructor from Animal class
		super(age);
		// sets the breed of Dog
		this.breed = breed;
	}

	//getters and setters

	/**
	 * Gets the breed of Dog
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}


	/**
	 * Sets the breed of Dog
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	// other methods
	
	@Override
	public void speak()
	{
		System.out.println(this.name +" says  barks");
	}
	
	@Override
	public String toString()
	{
		return this.name+" is a "+this.breed;
		
	}
	
	public boolean equals(Object obj)
	{
		Dog otherDog = (Dog) obj;
		return (this.name == (otherDog.name) && this.breed == (otherDog.breed));
		
	}
	

}
