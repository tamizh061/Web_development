package FundamentalJava.Inheritance.HybridInheritance;

public class HierConnection extends Gents implements Husband,Father
{

    @Override
    public void DemoFather() {

    }

    @Override
    public void DemoHusband() {

    }

    public static void main(String[] args) {
        HierConnection connect=new HierConnection();

        connect.DemoGents();
        connect.DemoFather();
        connect.DemoHusband();
    }
}