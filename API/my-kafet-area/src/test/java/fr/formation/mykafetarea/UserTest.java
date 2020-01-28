package fr.formation.mykafetarea;



import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;





@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    private String id = "A353791";
    private String name = "BEAUBRUN";
    private String firstname = "Steven";
    private String email = "chineese@hotmail.fr";
    private String password = "tchoulou97";

   // User testedUser = new User(id, firstname, email, password);
    //String caspereTest = testedUser.getId(id);

    @Test 
    public void toStringTest(){
        UserTest user = new UserTest( );

        String testResult = user.toString();

        assertEquals("User",testResult);



    
    
    
   


}}