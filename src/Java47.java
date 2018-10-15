import java.util.*;

public class Java47 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        TreeSet<Integer> numberTree = new TreeSet<>();

        inputNumbers(numbers,numberTree);

        showReversed(numbers);

        addNumber(numbers);

        System.out.println("Najmniejsza z podanych liczb to: " + numberTree.first() +
                " a największa to: " + numberTree.last());
    }

    private static void inputNumbers(List numbers,TreeSet numberTree) {
        Scanner scanner= new Scanner(System.in);
        int number = 1;
        while (number >= 0) {
            System.out.println("Podaj kolejną liczbą (lub ujemną aby zakończyć)");
            number = scanner.nextInt();
            scanner.nextLine();

            if (number >= 0) {
                numbers.add(number);
                numberTree.add(number);
            }
        }

    }

    private static void showReversed(List numbers) {
        Collections.reverse(numbers);
        System.out.println(numbers.toString());
        }


    private static void addNumber(List<Integer> numbers) {
        int sum = 0;
        String expression = "";
        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
            if (i < numbers.size() - 1) {
                expression = expression + numbers.get(i) + " +";
            } else {
                expression = expression + numbers.get(i) + " = " + sum;
            }
        }
        System.out.println("Suma podanych cyfr jest równa: "+expression);
    }
}

