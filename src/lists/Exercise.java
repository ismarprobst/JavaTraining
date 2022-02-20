package lists;

import entities.ListEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many employees will be registered? ");
        int n = sc.nextInt();

        List<ListEmployee> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #"+ i + ":");

            System.out.println("Id: ");
            int id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.println("ID already taken. Try other: ");
                id = sc.nextInt();
            }

            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Salary: ");
            double salary = sc.nextDouble();

            list.add(new ListEmployee(id,name,salary));

        }
        // Increasing salary
        System.out.println();
        System.out.println("Enter the employee id that will have a salary increase: ");
        int id = sc.nextInt();
        ListEmployee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This id doesn't exist!");
        }
        else {
            System.out.println("Enter the percentage increase: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        // Printing

        System.out.println();
        System.out.println("List of Employees: ");
        for ( ListEmployee x : list ){
            System.out.println(x);
        }
        sc.close();
    }

    public static boolean hasId(List<ListEmployee> list, int id) {
        ListEmployee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }


}
