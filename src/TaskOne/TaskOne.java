package TaskOne;

public class TaskOne {
    public static void main(String[] args) {
        String firstName = "Ivan", middleName = "Ivanovich", lastName = "Ivanov", fullName;
        lastName = lastName.replace(" ", "");
        middleName = middleName.replace(" ", "");
        firstName = firstName.replace(" ", "");
        lastName = lastName + " ";
        firstName = firstName + " ";
        fullName = lastName + firstName + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
    }
}