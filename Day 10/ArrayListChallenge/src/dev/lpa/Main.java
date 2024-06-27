package dev.lpa;
import java.util.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();

        while (flag) {
            printAction();
            switch (Integer.parseInt(sc.nextLine())) {
                case 1 -> addItem(groceries);
                case 2 -> removeItem(groceries);

                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
    }
    private static void addItem(ArrayList<String> groceries) {
        System.out.println("Add item (s) [Separate item by comma]:");
        String[] items = sc.nextLine().split(",");
       // groceries.addAll(List.of(items));
        for (String i: items){
            String trimmed = i.trim();
            if(groceries.indexOf(trimmed)<0){
                groceries.add(trimmed);
            }
        }
    }

    private static void removeItem(ArrayList<String> groceries) {
        System.out.println("Remove item (s) [Separate item by comma]:");
        String[] items = sc.nextLine().split(",");

        for (String i: items){
            String trimmed = i.trim();
            groceries.remove(trimmed);
            }
        }




    private static void printAction(){
        String textBlock = """
                Available actions:
                                
                0 - to shutdown
                                
                1 - to add item(s) to list (comma delimited list)
                                
                2 - to remove any items (comma delimited list)
                                
                Enter a number for which action you want to do:
                """;
        System.out.println(textBlock + " ");

    }



    }
