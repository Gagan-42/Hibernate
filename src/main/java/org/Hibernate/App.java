package org.Hibernate;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InterruptedException {

//        Scanner sc = new Scanner(System.in);
//        StudentService studentService = new StudentService();
//        Student student = new Student();
//        System.out.println("Enter the name: ");
//        String name = sc.nextLine();
//        System.out.println("Enter the age: ");
//        int age = sc.nextInt();
//        sc.nextLine();
//        student.setName(name);
//        student.setAge(age);
//        studentService.saveStudent(student);
//
//        System.out.println("Enter id to retrieve: ");
//        int id = sc.nextInt();
//        Student studentGetById = studentService.getStudent(id);
//        System.out.println(studentGetById);
//        sc.nextLine();
//
//        System.out.println("Enter the id to update: ");
//        int id1 = sc.nextInt();
//        sc.nextLine();
//        Student updateStudent = studentService.getStudent(id1);
//        System.out.println("Enter the name to be updated: ");
//        String naam  = sc.nextLine();
//        System.out.println("Enter the age to be updated: ");
//        int age1 = sc.nextInt();
//        updateStudent.setName(naam);
//        updateStudent.setAge(age1);
//        studentService.updateStudent(updateStudent);
//
//        System.out.println("Enter the id to be deleted: ");
//        int id2 = sc.nextInt();
//        sc.nextLine();
//        studentService.deleteStudent(id2);
        while (true) {
            System.out.println();
            System.out.println("STUDENT MANAGEMENT SYSTEM");
            Scanner sc = new Scanner(System.in);
            System.out.println("1.Save Student");
            System.out.println("2.Get Student");
            System.out.println("3.Update Student");
            System.out.println("4.Delete Student");
            System.out.println("5.Get All Student");
            System.out.println("6.EXIT");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    StudentService service = new StudentService();
                    Student student = new Student();
                    System.out.println("Enter the name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Enter the age: ");
                    int age = sc.nextInt();
                    student.setName(name);
                    student.setAge(age);
                    service.saveStudent(student);
                    System.out.println("Student created successfully");
                    break;
                case 2:
                    StudentService studentService = new StudentService();
                    System.out.println("Enter the id to get student: ");
                    int id = sc.nextInt();
                    Student getById = studentService.getStudent(id);
                    System.out.println(getById);
                    sc.nextLine();
                    break;
                case 3:
                    StudentService service1 = new StudentService();
                    System.out.println("Enter the id to be updated: ");
                    int id1 = sc.nextInt();
                    sc.nextLine();
                    Student updateStudent = service1.getStudent(id1);
                    System.out.println("Enter the name to be updated; ");
                    String nam = sc.nextLine();
                    System.out.println("Enter the age to be updated: ");
                    int ag = sc.nextInt();
                    updateStudent.setName(nam);
                    updateStudent.setAge(ag);
                    service1.updateStudent(updateStudent);
                    System.out.println("updated successfully");
                    break;
                case 4:
                    StudentService service2 = new StudentService();
                    System.out.println("Enter the id to be deleted: ");
                    int id3 = sc.nextInt();
                    sc.nextLine();
                    service2.deleteStudent(id3);
                    System.out.println("Deleted Successfully");
                    break;
                case 5:
                    StudentService service3 = new StudentService();
                    System.out.println(service3.getAllStudents());
                    break;
                case 6:
                    StudentService service4 = new StudentService();
                    service4.exit();

            }
        }

    }
}
