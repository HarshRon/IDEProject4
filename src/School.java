
//abstract parent class
abstract public class School
{
    private int enrollment;
    public String name;
    //overridden abstract method
    public abstract void describeLevel();

    //abstract getters and setters
    public void setName(String name){this.name = name;}
    public String getName(){return name;}

    public void setEnrollment(int students)
    {
        enrollment = students;
    }
    public int getEnrollment()
    {
        return enrollment;
    }
}