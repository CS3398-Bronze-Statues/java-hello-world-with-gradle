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



   @Test

   public void testGreeter()

   {

      g.setName("World");

      assertEquals(g.getName(),"World");

      assertEquals(g.sayHello(),"Hello World! Number is Life!");

   }

    @Test

    public void newTestKRGreeterPass()
    {
        g.setName("Kevin");

        assertEquals(g.getName(), "Kevin");
        assertEquals(g.getId(), 42);
        assertEquals(g.sayHello(), "Hello Kevin! Number is Life!");

        g.setId(0);
        g.setName("Darth Vader");

        assertEquals(g.getName(), "Darth Vader");
        assertEquals(g.getId(), 0);
        assertEquals(g.sayHello(), "Hello Darth Vader! Number is Evil!");

    }

    @Test

    public void newTestKRGreeterFail()
    {
        g.setName("Giygas");

        assertEquals(g.getName(), "Giygas");
        assertEquals(g.getId(), 42);
        g.setId(0);
        assertEquals(g.sayHello(), "Hello Giygas! Number is Life!");
    }
}
