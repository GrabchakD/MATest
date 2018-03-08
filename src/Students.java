import java.util.ArrayList;



public class Students {

    private String firstName;
    private String lastName;
    private int age;
    private double averageScore;

    public Students(String firstName, String lastName, int age, double averageScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.averageScore = averageScore;
    }

     @Override   //Переопределям метод toString для коректного вывода объектов.
     public String toString() {
        return (firstName + " " + lastName);
     }

    public void info() {
        System.out.println("My name is: " + firstName + " " + lastName + ".");
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

}
