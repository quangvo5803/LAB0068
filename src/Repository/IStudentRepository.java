package Repository;

import java.util.ArrayList;

import Model.Student;

public interface IStudentRepository {
    void addStudent(ArrayList<Student> students);
    void sortStudent(ArrayList<Student> students);
}
