import java.util.Scanner;
public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Person p1 = new Person();
        p1.input();
        p1.output();
        p1.changeName("Vasja", "Hooligan");
        p1.output();
        p1.changeName("Nadja", null);
        p1.output();
        p1.changeName(null, "Nosko");
        p1.output();
        System.out.println(p1.getAge());


    }
}
