package pl.cwiczenie5;

import java.util.Date;

public class Student {
    private static int idCounter = 1;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phoneNumber;
    private Date dateOfBirth;
    private String indexNumber;
    private StudyProgramme studyProgramme;
    private int currentSemester;
    private String status;

    // Konstruktor do inicjalizacji obiektu studenta z automatycznie przydzielonym numerem indeksu
    public Student(String firstName, String lastName, String email, String address, String phoneNumber, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.indexNumber = "s" + idCounter++;
        this.status = "kandydat";
    }

    // Metoda do zapisywania studenta na program studiów
    public void enrollStudent(StudyProgramme programme) {
        this.studyProgramme = programme;
        this.currentSemester = 1;
        this.status = "student";
    }

    // Metoda do dodawania oceny
    public void addGrade(int grade, String subject) {
        // Implementacja dodawania ocen
    }

    // Metoda do promowania studenta na następny semestr
    public void promoteToNextSemester() {
        if (currentSemester < studyProgramme.getNumberOfSemesters()) {
            currentSemester++;
            if (currentSemester == studyProgramme.getNumberOfSemesters()) {
                status = "absolwent";
            }
        }
    }

    // Gettery i settery

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public StudyProgramme getStudyProgramme() {
        return studyProgramme;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public String getStatus() {
        return status;
    }
}
