import java.util.*;
public class Practise {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of elements you want to add to arraylist");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the list");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list.add(num);
        }

        int max = list.get(0);

        for (int i = 0; i < n; i++) {
            if(list.get(i) > max){
                max = list.get(i);
            }
        }

        System.out.println(max);
    }
}
