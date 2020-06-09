package it.capone.leonardo;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("leonardo",
                "capone",
                "14/11/1989",
                "30 26 30 26 28");
	    System.out.println("age: " + student.age());
        System.out.println("avg_grade: " + student.avg_grade());

        student = new Student("leonardo",
                "capone",
                "14-11-1989",
                "30 26 ss 26 28");
        System.out.println("age: " + student.age());
        System.out.println("avg_grade: " + student.avg_grade());
    }
}
