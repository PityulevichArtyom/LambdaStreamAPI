import java.util.ArrayList;

public class Lambda {

    void testStudents (ArrayList<Student> st, StudentCheck sc){
        for (Student s:st){
            if (sc.check(s)){
                System.out.println(s);
            }
        }
        System.out.println("---------------------------------------------");
    }

    ArrayList<Student> giveStudents (ArrayList<Student> st, StudentCheck sc){
        ArrayList <Student> arrayList = new ArrayList<>();
        for (Student s:st){
            if (sc.check(s)){
                arrayList.add(s);
            }
        }
        return arrayList;
    }

    public static void main (String[] args) {


        Student st1 = new Student("Ivan", 'm', 22, 3, 8.2);
        Student st2 = new Student("Sanya", 'm', 19, 2, 6.8);
        Student st3 = new Student("Pashka", 'm', 24, 3, 4.4);
        Student st4 = new Student("Anya", 'f', 18, 1, 9.4);
        Student st5 = new Student("Nastya", 'f', 28, 4, 5.3);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Lambda info = new Lambda();

        info.testStudents(students, s -> s.age<25);
        info.testStudents(students, s -> s.sex == 'f');

        ArrayList<Student> students4 = info.giveStudents(students, s -> s.sex == 'f');

        System.out.println(students4);


    }
}
@FunctionalInterface
interface StudentCheck{
    boolean check(Student s);
}
