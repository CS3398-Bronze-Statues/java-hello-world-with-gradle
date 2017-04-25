package hello;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestGreeter {
   private Greeter g;
   
   @Before
   public void setUp() throws Exception 
   {
      g = new Greeter();
   }

   @Test
   public void testGreeterEmpty() 
   {
      assertEquals(g.getName(),"");
      assertEquals(g.sayHello(),"Hello!");
   }
    
    //Success
    @Test
    public void newTestMCSreeterPass()
    {
        g.setName("World");
        assertEquals(g.getName(), "World");
        
    }
    
    
    //Failure
    @Test
    public void newtestMCSGreeterFail()
    {
        g.setName("failure");
        assertEquals(g.getName(), "MCSTestFailure");
    }
    
    
   @Test
    public void testGreeter()    
    {
        g.setName("World");
        assertEquals(g.getName(),"World");
        assertEquals(g.sayHello(),"Hello World!");
     }
}
