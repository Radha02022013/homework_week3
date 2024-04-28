package homework_week3_maninisheth;

/**
 * Write a class with the name Person. The class needs three fields (instance variables) with the names
 * firstName, lastName of type String and age of type int.
 * Write the following methods (instance methods):
 */


public class Person {

    public static void main(String[] args) {
        Person person = new Person();

        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());

        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());

        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }

    public String firstName;
   public String lastName;
    public int age;

    //method 1
    public String getFirstName() {
        return firstName;
    }

    // method 2
    public String getLastName() {
        return lastName;
    }

    //method 3
    public int getAge() {
        return age;
    }

    //method 4
    public void setFirstName(String firstName) {
       this. firstName = firstName;
    }

    //method 5
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //method 6
    public void setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    //method 7
    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    //method 8
    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }

    }
}
