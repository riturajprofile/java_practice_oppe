import java.util.*;

class Student {
    String name;
    double[] marks;

    // constructor
    public Student( String name, double[] marks ) {
        this.name = name;
        this.marks = marks;

    }


    // getName()
    public String getName() {
        return this.name;
    }


    // findTotal()
    public double findTotal() {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return total;
    }

}

public class Test{
    // Define the method getMax() here
    public static String getMax(Student[] arr) {
        String topStudent = "";
        double maxTotal = -1;
        for (Student student : arr) {
            double total = student.findTotal();
            if (total > maxTotal) {
                maxTotal = total;
                topStudent = student.getName();
            }
        }
        return topStudent;
    }



    // Do not edit the code given below
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] arr = new Student[3];
        for(int i = 0; i < 3; i++){
            String name = sc.next();
            double[] m = {sc.nextDouble(), sc.nextDouble(), sc.nextDouble()};
            arr[i] = new Student(name, m);
        }
        System.out.println(getMax(arr));
    }
}