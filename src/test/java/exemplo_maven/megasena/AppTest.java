package exemplo_maven.megasena;

import static org.junit.Assert.assertTrue;
import junit.framework.TestSuite;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    
    public static TestSuite suite(){
    	return new TestSuite(AppTest.class);
    }
    
    public void testApp(){
    	assertTrue(App.getNumero() <=60);
    }
    
    public void testJogo(){
    	assertTrue(App.getJogo().length==6);
    	
    }
    
    
    
}
