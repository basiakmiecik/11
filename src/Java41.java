import java.util.*;

public class Java41 {


    public static void main(String[] args) {
        TreeSet<Integer> temp = generateNumbers();
        List<Integer>temp2=new ArrayList<>(temp);

        System.out.printf("Największa liczba w zbiorze to: %d, a najmniejsza to %d. ",temp.last(),temp.first());
        System.out.printf("\nŚrednia wszystkich liczb wynosi: %f", averageSet(temp2));
        System.out.printf("\nSuma wszytskich liczb wiekszych od sredniej wynosi: %d" ,sumAverage(temp2));

    }

    private static int sumAverage(List <Integer>temp2) {
        int sumAve=0;
        for (int i = 0; i < temp2.size(); i++) {
            if(temp2.get(i)>averageSet(temp2))
                sumAve+=temp2.get(i);
        }
    return sumAve;}

    private static double averageSet(List <Integer>temp2) {
        double sum=0;
        for (int i = 0; i < temp2.size(); i++) {
            sum=sum+temp2.get(i);
        }
        double average=sum/temp2.size();
    return average;}

    private static TreeSet<Integer>  generateNumbers() {

        Random random= new Random();
        TreeSet<Integer>numbers=new TreeSet<>();
        do{
            numbers.add(random.nextInt(20));
        }while(numbers.size()!=10);
        System.out.println(numbers.toString());
    return numbers;}
}
