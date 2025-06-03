package Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
    private final String name;
    private final List<Integer> grades;

    public Student(String name, int... initialGrades) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
        this.name = name;
        this.grades = new ArrayList<>();
        for (int grade : initialGrades) {
            addGrade(grade);
        }
    }

    public void addGrade(int grade) {
        if (grade < 2 || grade > 5) {
            throw new IllegalArgumentException("Оценка должна быть от 2 до 5");
        }
        grades.add(grade);
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return Collections.unmodifiableList(grades);
    }

    @Override
    public String toString() {
        return name + ": " + grades.toString();
    }
}