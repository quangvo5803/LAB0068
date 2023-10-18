package Controller;

import java.util.ArrayList;

import Model.Student;
import Repository.IStudentRepository;
import Repository.StudentRepository;
import View.Menu;

public class Program extends Menu<String> {
    private IStudentRepository studentRepository;
    static String[] menuChoice = {"Add new student","Sort student","Exit"};
    ArrayList<Student> students;

    public Program(){
        super("========== Collection Sort Program ==========",menuChoice);
        studentRepository = new StudentRepository();
        students = new ArrayList<>();
    }

    public void execute(int n){
        switch(n){
            case 1:{
                studentRepository.addStudent(students);
                break;
            }
            case 2:{
                studentRepository.sortStudent(students);
                break;
            }
            case 3:{
                System.exit(0);
            }
        }
    }
}
