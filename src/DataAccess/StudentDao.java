package DataAccess;

import java.util.ArrayList;
import java.util.Collections;

import Common.Validation;
import Model.Student;

public class StudentDao {
    private static StudentDao instance = null;
    public static StudentDao Instance(){
        if(instance == null){
            synchronized (StudentDao.class){
                if(instance == null){
                    instance = new StudentDao();
                }
            }
        }
        return instance;
    }

    public void addStudent(ArrayList<Student> students){
        System.out.println();
        while (true){
            System.out.println("Please input student information");
            String name = Validation.getString("Name: ");
            String classes =Validation.getString("Clases: ");
            float mark = Validation.getFloat("Mark: ",0,100);
            students.add(new Student(name, mark, classes));
            if(Validation.getYesNo("Do you want to enter more student information?(Y/N): ").equalsIgnoreCase("N")){
                System.out.println();
                break;
            }
        }
    }

    public void sortStudent(ArrayList<Student> students){
        System.out.println();
        Collections.sort(students);
        for (int i = 0;i<students.size();i++){
            System.out.println("========== Student " + (i+1) + " ==========");
            System.out.println("Name: " + students.get(i).getName());
            System.out.println("Classes: " + students.get(i).getClasses());
            System.out.printf("Mark: %.2f \n",students.get(i).getMark());
        }
        System.out.println();
    }
}
