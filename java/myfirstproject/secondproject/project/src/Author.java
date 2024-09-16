package src;

public class Author {
    public String firstName;
    public String lastName;
    Author(String authorFirstName, String authorLastName){
        firstName = authorFirstName;
        lastName = authorLastName;

    }
    public void setFirstName(String firstName) {
        firstName = "David";
    }
    public void setLastName(String lastName) {
        lastName = "Meade";
    }
    public void getFirstName() {
        System.out.println(firstName);
        
    }
    public void getLastName() {
        System.out.println(lastName);
        
    }
}
