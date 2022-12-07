public class Demo {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.getBirthYear(1990);
        p1.getFirstName("Michael");
        p1.getLastName("Pupkin");
        System.out.println(p1);

        Person p2 = new Person();
        p2.getBirthYear(1982);
        p2.getFirstName("Vasja");
        p2.getLastName("Masutkin");
        System.out.println(p2);

        Person p3 = new Person();
        p3.getBirthYear(1995);
        p3.getFirstName("Andrij");
        p3.getLastName("Karpenko");
        System.out.println(p3);

        Person p4 = new Person();
        p4.getBirthYear(2002);
        p4.getFirstName("Maksym");
        p4.getLastName("Antonov");
        System.out.println(p4);

        Person p5 = new Person();
        p5.getBirthYear(1985);
        p5.getFirstName("Mykolaj");
        p5.getLastName("Dunajev");
        System.out.println(p5);
    }
}
