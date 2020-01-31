package fr.formation.mykafetarea;



import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import fr.formation.mykafetarea.entities.LunchItem;





@RunWith(SpringRunner.class)
@SpringBootTest
public class LunchItemTest {

	
		
    private Long  itemId;
    private String type ;
    private String name ;
    private String description ;
    private String allergens ;
    private Double price ;

   // User testedUser = new User(id, firstname, email, password);
    //String caspereTest = testedUser.getId(id);

    @Test 
    public void LunchItem(){
    	LunchItem lunchItem = new LunchItem(itemId, type, name, description, allergens, price);
    

        LunchItem testResult = new LunchItem(itemId, type, name, description, allergens, price);
        	
        	
        	
                assertEquals( lunchItem ,testResult);



    
    
    
   


}}