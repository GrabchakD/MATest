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
}