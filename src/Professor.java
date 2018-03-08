import java.util.ArrayList;

public class Professor {

    private String firstName;
    private String lastName;
    private String employment;

    public Professor(String firstName, String lastName, String employment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employment = employment;
    }

    public void about() {
        System.out.println("Hi, dear students, my name is: " + firstName + " " + lastName + ", and i`m teaching " + employment + "." );
    }

    public void checkup(ArrayList<Students> groupA) {     //Метод, с помощью которого профессор проводит перекличку.
        for(int i = 0; i < groupA.size(); i++) {
            System.out.println(groupA.get(i).toString());
        }
        System.out.println("Ok, all students here");
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

    public String getEmployment() {
        return employment;
    }

    public void setEmployment(String employment) {
        this.employment = employment;
    }
}