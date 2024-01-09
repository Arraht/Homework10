package TaskTwo;

public class TaskTwo {
    public static void main(String[] args) {
        String firstName = "Ivan", middleName = "Ivanovich", lastName = "Ivanov", fullName;
        lastName = lastName.replace(" ", "");
        middleName = middleName.replace(" ", "");
        firstName = firstName.replace(" ", "");
        lastName = lastName + " ";
        firstName = firstName + " ";
        fullName = lastName + firstName + middleName;
        fullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета —  " + fullName);
    }
}