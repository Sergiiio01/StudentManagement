import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, List<Double>> grades = new HashMap<String, List<Double>>();
        HashMap<String, Double> averages = new HashMap<String, Double>();
        do {
            System.out.println("select an option");
            System.out.println("1. Add a student");
            System.out.println("2. Display info and average mark");
            System.out.println("3. Get top student");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Introduce the name of the student: ");
                    String name = sc.nextLine();
                    System.out.println("Enter the ammount of grades you wnt to introduce: ");
                    int ammount = sc.nextInt();
                    List<Double> list = new ArrayList<Double>();
                    double average = 0;
                    for(int i=0; i< ammount; i++){
                        System.out.println("Enter a grade: ");
                        double grade = sc.nextDouble();
                        list.add(grade);
                        average += grade;
                    }
                    grades.put(name, list);
                    averages.put(name, average/ammount);
                    break;

                case 2:
                    System.out.println("Select the name of the person you want to see the data:");

                    name = sc.nextLine();
                    System.out.println("Here is the information: ");
                    System.out.println("Name: " + name);
                    System.out.println("Grades: " + grades.get(name).toString());
                    System.out.println("Average: " + averages.get(name));
                    break;

                case 3:
                    break;
                case 4:
                    return;

            }

        } while (true);
    }
}
