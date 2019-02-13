/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    // TODO: test full constructor, getters, and toString
    public void animalConstructorTest() throws AssertException
    {
        Animal animal = new Animal("Orange","Garfield",30.0,10.0);
        
        Assert.assertEquals("Orange", animal.getColor());
        Assert.assertEquals("Tony",animal.getName());
        Assert.assertEquals(10, animal.getHeight(), 0.01);
        Assert.assertEquals(30, animal.getHeight(), 0.01);
        
    }
    
    public void animalToStringTest() throws AssertException
    {
        Animal animal = new Animal("Orange","Garfield",30.0,10.0);
        String actual = animal.toString().replaceAll("\\s", "");
        String expected = "Garfield, a Orange-colored animal, 30 pounds, 10 inches";
        Assert.assertEquals(expected, actual);
    }
}

