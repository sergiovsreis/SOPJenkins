/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fhict
 */
public class UserTest {
    
    public UserTest() {
    }

    @Test
    public void createUser() {
        User tempUser = new User("Sergio");
        
       assertEquals(tempUser.getName(),"Segio");
        
    }
    
}
