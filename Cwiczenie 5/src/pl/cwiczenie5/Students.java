package pl.cwiczenie5;

import java.util.ArrayList;
import java.util.List;

public class Students {
    private static List<Student> studentList = new ArrayList<>();

    // Metoda do dodawania studenta do listy
    public static void addStudent(Student student) {
        studentList.add(student);
    }

    // Metoda do promowania wszystkich studentów na następny semestr
    public static void promoteAllStudents() {
        for (Student student : studentList) {
            student.promoteToNextSemester();
        }
    }

    // Metoda do wyświetlania informacji o wszystkich studentach
    public static void displayInfoAboutAllStudents() {
        for (Student student : studentList) {
            System.out.println("Imię: " + student.getFirstName() + " " + student.getLastName());
            System.out.println("Numer indeksu: " + student.getIndexNumber());
            System.out.println("Bieżący semestr: " + student.getCurrentSemester());
            System.out.println("Status: " + student.getStatus());
            System.out.println("Program studiów: " + student.getStudyProgramme().getName());
            System.out.println("----------------------------------");
        }
    }
}
