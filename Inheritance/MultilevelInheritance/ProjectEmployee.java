package FundamentalJava.Inheritance.MultilevelInheritance;

public class ProjectEmployee extends TeamLeader
{
    public void Employee()
    {
        String string_3="Project Employee";
        System.out.println(string_3+":\n An employee is someone who gets paid to work for a person or company. Workers don't need to work full time to be considered employees—they simply need to be ..");
    }

    public static void main(String[] args)
    {
        ProjectEmployee employee=new ProjectEmployee();
        employee.Employee();//currentclass
        employee.TL();//Teamleader
        employee.HeadofProject();//Manager
    }

}