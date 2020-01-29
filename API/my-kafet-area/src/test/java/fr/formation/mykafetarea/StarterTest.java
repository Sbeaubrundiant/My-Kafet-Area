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
	
	
	protected Starter starter(Long id, String name, String allergens, Long price) {
		return this.starter(id, name, allergens, price);
	}

	@Test
	public void starterShouldBeAStarter() {
		Starter starterTest = new Starter(); //Starter class is tested 
		
		assertEquals(starterTest, starter(null, null, null, null));
	}
	

}
