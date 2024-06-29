package pl.cwiczenie5;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Tworzenie nowego studenta
        Student s = new Student("John", "Doe", "doe@wp.pl", "Warsaw, Zlota 12", "333-322-222", new Date(1980 - 1900, 1 - 1, 1));
        Students.addStudent(s);

        // Tworzenie nowego programu studiów
        StudyProgramme it = new StudyProgramme("IT", "AAA", 7, 5);
        s.enrollStudent(it);

        // Dodawanie ocen dla studenta
        s.addGrade(5, "PGO");
        s.addGrade(2, "APBD");

        // Promowanie wszystkich studentów
        Students.promoteAllStudents();

        // Wyświetlanie informacji o wszystkich studentach
        Students.displayInfoAboutAllStudents();
    }
}
