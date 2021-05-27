class Man
{
    public  Woman wife;
}
class Woman
{
    public Man husband;
}
public class Prog {

    public static void main(String args[])
    {
        Man man = new Man();
        Woman woman = new Woman();
        man.wife = woman;
        woman.husband = man;
    }

}
