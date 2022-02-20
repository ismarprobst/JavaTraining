package desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> weightsList = new ArrayList<>();

        System.out.println("Enter # items: ");
        int n = sc.nextInt();

        for (int i=0; i < n; i++) {
            System.out.println("Enter the weight of the item: ");
            weightsList.add(sc.nextInt());
        }

        System.out.println(weightsList);

        int trips = 0;

        for (int i=0; i < weightsList.size(); i++) {
            if (Collections.frequency(weightsList,weightsList.get(i))% 2 == 0) {
               trips += Collections.frequency(weightsList,weightsList.get(i)) / 2;

                for (int j=0; j < weightsList.size(); j++) {
                    if (weightsList.get(i) == weightsList.get(j)) {
                        weightsList.remove(j);
                    }
                }

            } else if(Collections.frequency(weightsList,weightsList.get(i))% 3 == 0){
                trips += Collections.frequency(weightsList,weightsList.get(i)) / 3;

                for (int j=0; j < weightsList.size(); j++) {
                    if (weightsList.get(i) == weightsList.get(j)) {
                        weightsList.remove(j);
                    }
                }
            } else if (Collections.frequency(weightsList,weightsList.get(i)) == 1) {
                trips = -1;
                break;
            }
        }
        System.out.println("Trips: ");

        System.out.println(trips);

        sc.close();
    }
}
