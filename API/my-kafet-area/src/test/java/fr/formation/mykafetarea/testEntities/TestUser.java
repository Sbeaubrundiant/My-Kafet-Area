package fr.formation.mykafetarea.testEntities;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import fr.formation.mykafetarea.entities.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUser {

    private String id;
    private String firstname;
    private String email;
    private String password;

    User testedUser = new User(id, firstname, email, password);
    User caspereTest = testedUser.getId(id);
    
    
    
   


}