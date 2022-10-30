package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L06StudentsVersion2 {
    static class Students {
        String firstName;
        String lastName;
        int age;
        String hometown;

        public Students(String firstName, String lastName, int age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        public String getHometown() {
            return hometown;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
        }

        public String getFirstName() {
            return firstName;
        }

        public int getAge() {
            return age;
        }

        public String getLastName() {
            return lastName;
        }

/*        public Students existingStudent(Students students) {
            return students;
        }
        */
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Students> listStudents = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");
        while (!input[0].equals("end")) {
            Students students = new Students(input[0], input[1], Integer.parseInt(input[2]), input[3]);
            //students.existingStudent(students);
            //check if the student already exist
            boolean existingStudent=false;
            for (int i = 0; i < listStudents.size(); i++) {
                Students previousStudent = listStudents.get(i);
                 if(input[0].equals(previousStudent.getFirstName())&&input[1].equals(previousStudent.getLastName())){
                     Students currentStudent = new Students(input[0], input[1], Integer.parseInt(input[2]), input[3]);
                     listStudents.set(i, currentStudent);
                     existingStudent=true;
                     break;
                 }

                }
            if(!existingStudent) {
                listStudents.add(students);
            }
            input = scanner.nextLine().split(" ");
        }
        String city = scanner.nextLine();
        for (int i = 0; i < listStudents.size(); i++) {
            Students currentStudent = listStudents.get(i);
            if(city.equals(currentStudent.getHometown())){
                System.out.printf("%s %s is %d years old%n",currentStudent.getFirstName(),currentStudent.getLastName(),
                        currentStudent.getAge());

            }

        }
    }
}
