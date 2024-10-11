//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        user user1=new user("Alex","Ahmad", "alex123","a123");
        user user2=new user("Sam", "vel", "sam321","s123");
        user1.setFirstName("Max");
        user1.setLastname("Park");
        user2.setFirstName("khan");
        user2.setEmail("m123");
        System.out.println(user1);
        System.out.println(user2);
    }
}