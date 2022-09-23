package animal;

public class Animal {

	
		
		static int defaultAge =0;
		
		int age;
		double weight;
		String name;
		
		
		public Animal(int age)
		{
			this.age = age;
		}
		
		
		public Animal()
		{
			//class first constructor with default age value
			this(Animal.defaultAge);
		}


		
		//getter and setter
		/**
		 * gets the name of the Animal
		 * @return the name
		 */
		public String getName() {
			return name;
		}


		/**
		 * sets the name of the Animal
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		
		
		// other methods
		
		public void speak()
		{
			System.out.println("Animal says hi..");
		}

		
		@Override
		public String toString()
		{
			return this.name;
		}

	

}
