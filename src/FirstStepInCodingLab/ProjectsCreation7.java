package FirstStepInCodingLab;

import java.util.Scanner;

public class ProjectsCreation7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameArch = scanner.nextLine();
        int countOfProjects = Integer.parseInt(scanner.nextLine());
//        "The architect {името на архитекта} will need {необходими часове} " +
//                "hours to complete {брой на проектите} project/s."
        System.out.printf("The architect %s will need %d hours to complete %d project/s.",nameArch,(3*countOfProjects),countOfProjects);
    }
}
