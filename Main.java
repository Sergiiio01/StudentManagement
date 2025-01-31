import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, List<Double>> grades = new HashMap<String, List<Double>>();
        HashMap<String, Double> averages = new HashMap<String, Double>();
        do {
            System.out.println("\n\n\nSelect an option");
            System.out.println("1. Add a student");
            System.out.println("2. Display info and average mark");
            System.out.println("3. Show students above an average");
            System.out.println("4. Exit");
            int option = askInt(sc);
            sc.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Introduce the name of the student: ");
                    String name = sc.nextLine();
                    if(grades.containsKey(name)){
                        System.out.println("The student is already registered");
                        break;
                    }
                    System.out.println("Enter the ammount of grades you want to introduce: ");
                    int ammount = askInt(sc);
                    List<Double> list = new ArrayList<Double>();
                    double average = 0;
                    for(int i=0; i< ammount; i++){
                        System.out.println("Enter a grade: ");
                        double grade = askDouble(sc);
                        list.add(grade);
                        average += grade;
                    }
                    grades.put(name, list);
                    averages.put(name, average/ammount);
                    break;

                case 2:
                    System.out.println("Select the name of the person you want to see the data:");

                    name = sc.nextLine();
                    try{
                        System.out.println("Here is the information: ");
                        System.out.println("Name: " + name);

                        System.out.println("Grades: " + grades.get(name).toString());
                        System.out.println("Average: " + String.format("%.2f", averages.get(name)));
                    }catch (NullPointerException e){
                        System.out.println("The student is not on the system");
                    }
                    break;

                case 3:
                    System.out.println("Select the minimun average you want to see: ");
                    double minAverage = sc.nextDouble();
                    System.out.println("Here are the students above that average: ");
                    for(String student: averages.keySet()){
                        if(averages.get(student) >= minAverage){
                            System.out.println("- " + student + " Average: " + String.format("%.2f", averages.get(student)));
                        }
                    }
                    break;

                case 4:
                    return;

            }

        } while (true);
    }

    public static double askDouble(Scanner sc){

        do {
            try {

                return sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Please, introduce a number");
                sc.next();
            }
        }while(true);
    }

    public static int askInt(Scanner sc){

        do {
            try {

                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please, introduce a number");
                sc.next();
            }
        }while(true);
    }
}
