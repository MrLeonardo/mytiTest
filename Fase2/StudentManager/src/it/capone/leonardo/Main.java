package it.capone.leonardo;

public class Main {

    public static void main(String[] args) {
	    Student student = new Student("leonardo", "capone", "14/11/1989", "30 26 28 29");
        System.out.println("age: " + student.age());
	    System.out.println("avg_grade: " + student.avg_grade());
    }
}
