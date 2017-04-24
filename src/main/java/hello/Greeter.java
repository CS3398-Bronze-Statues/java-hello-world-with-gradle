package hello;



public class Greeter {



  private String name = "";
  private String message = " Number is Life!";
  private int id = 42;


  public String getName()

  {

    return name;

  }

  public int getId()
  {
      return id;
  }


  public void setName(String name)

  {

      this.name = name;

  }

  public void setId(int id)
  {
      this.id = id;
  }


  public String sayHello()

  {

  	if (name == "")

    {

       return "Hello!";

    }

    else

    {
       if(id != 42)
       {
         message = " Number is Evil!";
       }

       return "Hello " + name + "!" + message;

    }

  }

}
