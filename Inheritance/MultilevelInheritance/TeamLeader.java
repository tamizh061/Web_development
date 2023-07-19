package FundamentalJava.Inheritance.MultilevelInheritance;

public class TeamLeader  extends Manager
{
    public void TL()
    {
        String string_2="TeamLeader";
        System.out.println(string_2+":\n A Team Leader oversees a group of employees and motivates them to do their job efficiently. They provide daily objectives, develop reward systems for productivity that motivate new hires and seasoned workers alike and communicate any issues with upper management to reach business goals effectively.");
    }

    public static void main(String[] args) {
        TeamLeader team=new TeamLeader();
        team.TL();
        team.HeadofProject();
    }

}