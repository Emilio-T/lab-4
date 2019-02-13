

public class ZooTest
{
        
    public void getTotalHeightTest() throws AssertException
    {
        Animal a = new Animal("Orange", "Garfield", 30.0, 10.0);
        Animal b = new Animal ("Tan", "Odie", 10.0, 12.0);
        Zoo zoo = new Zoo(5);
        zoo.addAnimal(a);
        zoo.addAnimal(b);
        
        double actual = zoo.getTotalHeight();
        double expected = 22;
        Assert.assertEquals(actual, expected);
    }
    public void getCapacityTest() throws AssertException
    {
        Animal a = new Animal("Orange", "Garfield", 30.0, 10.0);
        Animal b = new Animal ("Tan", "Odie", 10.0, 12.0);
        Zoo zoo = new Zoo(5);
        zoo.addAnimal(a);
        zoo.addAnimal(b);
        
        int actual = zoo.getCapacity();
        int expected = 5;
        Assert.assertEquals(expected, actual);
        
    }
    public void toStringTest() throws AssertException
    {
        Animal a = new Animal("Orange", "Garfield", 30.0, 10.0);
        Animal b = new Animal ("Tan", "Odie", 10.0, 12.0);
        Zoo zoo = new Zoo(5);
        zoo.addAnimal(a);
        zoo.addAnimal(b);
        
        String actual = zoo.toString().replaceAll("\\s", "");
        String expected = "These animals live in the zoo: Garfield, a Orange-colored animal. 30.0 pounds, 10.0 inches"
                + "Odie, a tan-colored animal. 10.0 pounds, 12.0 inches";
        Assert.assertEquals(expected, actual);
        
    }






}