package animal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DogTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testEqualsObject() {
		Dog d1 = new Dog(3, "Pug");
		
	    d1.setName("Tommy");
	
	    Dog d2 = new Dog(8,"Pug");
	    
	    d2.setName("Tommy");
	    
	assertEquals(d1, d2);
	}

}
