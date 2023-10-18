package Repository;

import java.util.ArrayList;

import DataAccess.StudentDao;
import Model.Student;

public class StudentRepository implements IStudentRepository {

    @Override
    public void addStudent(ArrayList<Student> students) {
        StudentDao.Instance().addStudent(students);
    }

    @Override
    public void sortStudent(ArrayList<Student> students) {
        StudentDao.Instance().sortStudent(students);
    }
    
}
