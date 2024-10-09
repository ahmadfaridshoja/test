//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num=10;
    forLoop(num);
    whileLoop(num);
    doWhileLoop(num);

    }
    public static void forLoop(int n){
        for (int i=0; i<=n; i++){
            System.out.println(i);
        }
    }
    public static void whileLoop(int n){
        int i=0;
        while (i<=n){
            System.out.println(i);
            i++;
        }
    }
    public static void doWhileLoop(int n){
        int i=0;
        do{
            System.out.println(i);
            i++;
        }while (i<=n);
    }
}