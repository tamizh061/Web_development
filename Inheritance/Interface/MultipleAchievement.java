package FundamentalJava.Inheritance.Interface;

public class MultipleAchievement implements Speakable,Sleepable,Kidding
{
    public static void main(String[] args)
    {
        MultipleAchievement obj=new MultipleAchievement();
        obj.DemoKidding();
        obj.DemoSleep();
        obj.DemoSpeak();
    }

    @Override
    public void DemoKidding()
    {
        String one="Kidding";
        System.out.println(one+"\n \"Kidding\" is fun, wry and dark. It's refreshing to see this side of Jim Carrey. Cole Allen is such a talented boy. Frank Langella's stern humor is amazing.");
    }

    @Override
    public void DemoSleep()
    {
        String two="Sleep";
        System.out.println(two+"\n Sleep is a state of reduced mental and physical activity, in which consciousness is altered, and sensory activity is inhibited to a certain extent. During sleep, there is a decrease in muscle activity, and interactions with the surrounding environment are significantly reduced.");
    }

    @Override
    public void DemoSpeak()
    {
        String three="Speak";
        System.out.println(three+"\n Speak means to talk, to give a lecture or speech, or to use your voice to say something. The word speak has many other senses as a verb and is used in several ...");
    }
}