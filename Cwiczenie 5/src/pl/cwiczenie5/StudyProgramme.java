package pl.cwiczenie5;

public class StudyProgramme {
    private String name;
    private String description;
    private int numberOfSemesters;
    private int maxITNs; // liczba niezaliczonych przedmiotów, zanim student nie może być promowany

    // Konstruktor do inicjalizacji obiektu programu studiów
    public StudyProgramme(String name, String description, int numberOfSemesters, int maxITNs) {
        this.name = name;
        this.description = description;
        this.numberOfSemesters = numberOfSemesters;
        this.maxITNs = maxITNs;
    }

    // Gettery i settery

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfSemesters() {
        return numberOfSemesters;
    }

    public void setNumberOfSemesters(int numberOfSemesters) {
        this.numberOfSemesters = numberOfSemesters;
    }

    public int getMaxITNs() {
        return maxITNs;
    }

    public void setMaxITNs(int maxITNs) {
        this.maxITNs = maxITNs;
    }
}
