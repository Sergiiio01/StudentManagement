import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
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
                    System.out.println("Introduce the marks separated by ',': ");
                    List<String> grades = List.of(name.split(","));
                    map.put(name, grades);
                    double average = 0;
                    for (int i = 0; i < grades.size(); i++) {
                        average += Double.parseDouble(grades.get(i));
                    }
                    average /= grades.size();
                    averages.put(name, average);
                    break;
                case 2:


            }

        } while (true);
    }
}
