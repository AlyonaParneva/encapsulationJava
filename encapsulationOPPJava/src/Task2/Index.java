package Task2;

public class Index {
    public static void main(String[] args) {
        Student student = new Student("Алёна", 4, 5);
        student.addGrade(3);
        student.addGrade(2);

        System.out.println(student);

        try {
            student.addGrade(6);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при добавлении оценки: " + e.getMessage());
        }

        System.out.println("Оценки: " + student.getGrades());
    }
}
