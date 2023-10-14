import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pasport p1 = new Pasport("3424", "1456");
        Pasport p2 = new Pasport("3421", "1456");
        Pasport p3 = new Pasport("3421", "1446");
        Pasport p4 = new Pasport("3484", "1456");
        Pasport p5 = p1;
        System.out.println(p1==p2);
        System.out.println(p1==p3);
        System.out.println(p1==p5);
        System.out.println(p1.equals(p5));
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p4));
        System.out.println("1__________");
        System.out.println(p1.hashCode()==p2.hashCode());
        System.out.println(p1.hashCode()==p3.hashCode());
        System.out.println("2__________");
        StudentChange vasya = new StudentChange(1, "Vasya", List.of(2, 3, 3, 4));
        StudentChange vasya2 = new StudentChange(1, "Vasya", List.of(2, 3, 3, 4));
        System.out.println(vasya2.equals(vasya));
        System.out.println(vasya2 == vasya);
        System.out.println(vasya2.hashCode() == vasya.hashCode());
        System.out.println("3__________");
        StudentWithPasport vasya1 = new StudentWithPasport(new Pasport("34214", "1456"), 1);
        StudentWithPasport vasya12 = new StudentWithPasport(new Pasport("34214", "1456"), 1);
        System.out.println(vasya12.equals(vasya1));
        System.out.println(vasya12 == vasya1);
        System.out.println(vasya12.hashCode() == vasya2.hashCode());
        System.out.println("__________");
        StudentSimple stud1 = new StudentSimple(1, "stud1");
        StudentSimple stud2 = new StudentSimple(2, "stud1");
        System.out.println(stud1.equals(stud2));
        System.out.println(stud1 == stud2);
        System.out.println(stud1.hashCode() == stud2.hashCode());
    }
}