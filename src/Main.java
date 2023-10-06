import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Random random = new Random();
//        ArrayList<Integer> forSure = new ArrayList<>();
//        ArrayList<Integer> arrayList1 = new ArrayList<>();
//        forSure.add(random.nextInt(1, 100));
//        for (int i = 0; i <50; i++) {
//            for (int sum : forSure) {
//                if (sum %2==0)
//                System.out.println(sum);
//            }
//        }
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> forSure = new ArrayList<>();
        ArrayList<Integer> pair = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            int sum = random.nextInt(1,100);
            arrayList.add(sum);
        }
        for (int summa : arrayList) {
            if (summa %2 == 0){
               forSure.add(summa);
            }else
                pair.add(summa);
        }
        System.out.println("forSure: "+forSure+"\n");
        System.out.println("pair: "+pair);
    }
}