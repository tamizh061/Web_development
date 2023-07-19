package FundamentalJava.Abstraction;

public abstract class MyfavAnimal
{
    public abstract  void Cat();//no implement method

    public void Eat()
    {
        System.out.println("my favoriate pet is cat-Milk");
    }
}
class Cat extends MyfavAnimal
{
    @Override
    public void Cat()
    {
        System.out.println("Cat sound -Meow Meow");
    }
}
class MainPerformance
{
    public static void main(String[] args)
    {
        Cat obj=new Cat();
        obj.Cat();
        obj.Eat();

    }
}