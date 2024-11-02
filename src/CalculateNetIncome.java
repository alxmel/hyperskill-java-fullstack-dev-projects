import java.util.Scanner;

public class CalculateNetIncome {
    public static void main(String[] args) {
        // Importing Scanner Object
        Scanner sc = new Scanner(System.in);

        // Adding menu item incomes
        int bubbleGum = 202;
        int toffee = 118;
        int iceCream = 2250;
        int milkChocolate = 1680;
        int doughnut = 1075;
        int pancake = 80;
        int income = bubbleGum + toffee + iceCream + milkChocolate + doughnut + pancake;

        // Printing earned amounts
        System.out.println("Earned amount:");
        System.out.printf("Bubblegum: $%d%n", bubbleGum);
        System.out.printf("Toffee: $%d%n", toffee);
        System.out.printf("Ice Cream: $%d%n", iceCream);
        System.out.printf("Milk Chocolate: $%d%n", milkChocolate);
        System.out.printf("Doughnut: $%d%n", doughnut);
        System.out.printf("Pancake: $%d%n", pancake);
        System.out.printf("%nIncome: $%d%n", income);

        System.out.println("Staff expenses:");
        int staffExpenses = sc.nextInt();
        System.out.println("Other expenses:");
        int otherExpenses = sc.nextInt();

        int totalExpenses = staffExpenses + otherExpenses;

        int netIncome = income - totalExpenses;
        System.out.printf("Net Income: $%d", netIncome);

    }
}
