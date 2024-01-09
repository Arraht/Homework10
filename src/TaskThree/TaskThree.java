package TaskThree;

public class TaskThree {
    public static void main(String[] args) {
        String firstName = "Семён", middleName = "Семёнович", lastName = "Иванов", fullName;
        lastName = lastName.replace(" ", "");
        middleName = middleName.replace(" ", "");
        firstName = firstName.replace(" ", "");
        lastName = lastName.replace("ё", "е");
        middleName = middleName.replace("ё", "е");
        firstName = firstName.replace("ё", "е");
        lastName = lastName + " ";
        firstName = firstName + " ";
        fullName = lastName + firstName + middleName;
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);
    }
}