package fr.formation.mykafetarea;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import fr.formation.mykafetarea.entities.Starter;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StarterTest {
	
	
	protected Starter starter(String id, String name, String allergens, int price) {
		return this.starter(id, name, allergens, price);
	}

	@Test
	public void starterShouldBeAStarter() {
		Starter starterTest = new Starter(); //Starter class is tested 
		starterTest.setName("jack"); 
		starterTest.setDescription("description");
		starterTest.setAllergens("allergens");
		starterTest.setPrice(3.00);		
		
		assertEquals(starterTest, starter("jack", "Description", "allergens", 3));
	}
	

}
