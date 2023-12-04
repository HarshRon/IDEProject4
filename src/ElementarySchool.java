//child class that extends parent class
public class ElementarySchool extends School
{
    //overrides describe level of parent class
    public void describeLevel()
    {
        System.out.println("This is an Elementary School " +
                "serving grades K through 4");
    }

}