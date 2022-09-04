package edu.eci.cvds.tdd.registry;
import static edu.eci.cvds.tdd.registry.Gender.*;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegistryTest {
    private Registry registry = new Registry();
    @Test
    public void validateRegistryResult() {
        Person person = new Person("yeferson",1 , 22, MALE, true);
        RegisterResult result = registry.registerVoter(person);
        assertEquals(RegisterResult.VALID, result);
    }
    // TODO Complete with more test cases
    @Test
    public void validateBooleanAlive() {
        Person person = new Person("martina",2,20,FEMALE, false);
        RegisterResult result = registry.registerVoter(person);
        assertEquals(RegisterResult.DEAD, result);
    }
    @Test
    public void validateUNDERAGE() {
        Person person = new Person("daniela",3,12,FEMALE, true);
        RegisterResult result = registry.registerVoter(person);
        assertEquals(RegisterResult.UNDERAGE, result);
    }
    @Test
    public void validateINVALID_AGE() {
        Person person = new Person("valentina",4,250,FEMALE, true);
        RegisterResult result = registry.registerVoter(person);
        assertEquals(RegisterResult.INVALID_AGE, result);
    }
    @Test
    public void validateDUPLICATED() {
        Person person = new Person("andres", 5, 20, MALE, true);
        Person person1 = new Person("manuel", 5, 20, MALE, true);

        RegisterResult result = registry.registerVoter(person);
        RegisterResult result2 = registry.registerVoter(person1);

        assertEquals(RegisterResult.DUPLICATED, result2);
    }

}
