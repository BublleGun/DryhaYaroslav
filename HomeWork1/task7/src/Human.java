public class Human {
    private String name = "человек";
    public void SetName(String p_name){
        this.name = p_name;
    }
    public static void main(String[] args){
        Human human = new Human();
        human.SetName("Ярик");
        System.out.println(human.name);
    }
}
