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


		
    private String id = "353791";
    private String type = "Starter";
    private String name = "oeuf";
    private String description = "Steven";
    private String email = "chineese@hotmail.fr";
    private String password = "tchoulou97";

   // User testedUser = new User(id, firstname, email, password);
    //String caspereTest = testedUser.getId(id);

    @Test 
    public void LunchItem(){
    	LunchItem lunchItem = new LunchItem();

        String testResult = lunchItem.toString();

        assertEquals("LunchItem",testResult);



    
    
    
   


}}