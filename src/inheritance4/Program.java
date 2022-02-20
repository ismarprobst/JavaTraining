package inheritance4;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i=1;i<=n;i++){
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced? (y/n) ");
            char ch = sc.next().charAt(0); //para fazer leitura de char
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (ch == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(name,hours,valuePerHour,additionalCharge);
                list.add(emp);

            } else {

                list.add(new Employee(name,hours,valuePerHour));
                //essa é uma segunda forma de instanciar o emp, fazendo diretamente dentro do add
            }

        }
        System.out.println();
        System.out.println("PAYMENTS: ");

        for (Employee emp : list) { // para cada funcionario "emp" na minha lista "list", fazer:
            System.out.println(emp.getName() + " - $ " + String.format("%.2f",emp.payment()));

        }
        sc.close();

    }

}
