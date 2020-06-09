package it.capone.leonardo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Student {

    private String firstname;
    private String lastname;
    private String birthdate;
    private String grades;

    public Student(String firstname, String lastname, String birthdate, String grades) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.grades = grades;
    }

    public int age() {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return Period.between(LocalDate.parse(this.birthdate, formatter), LocalDate.now()).getYears();
        }
        catch(DateTimeParseException error) {
            return -1;
        }
    }

    public float avg_grade() {
        String[] grades = this.grades.split(" ");
        float sum = 0;

        try {
            for (String grade : grades) {
                sum += Float.parseFloat(grade);
            }
            return sum / grades.length;
        }
        catch(NumberFormatException error) {
            return -1;
        }
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }
}
