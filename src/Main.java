import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Long> arrayList = new ArrayList<>();
        LinkedList<Long> linkedList = new LinkedList<>();

        var arrayListAddingTime = Benchmark.measure(() -> { Testing.addingToList(arrayList); });
        var arrayListGettingTime = Benchmark.measure(() -> { Testing.gettingFromList(arrayList); });
        var arrayListRemovingTime = Benchmark.measure(() -> { Testing.removingFromList(arrayList); });
        var linkedListAddingTime = Benchmark.measure(() -> { Testing.addingToList(linkedList); });
        var linkedListGettingTime = Benchmark.measure(() -> { Testing.gettingFromList(linkedList); });
        var linkedListRemovingTime = Benchmark.measure(() -> { Testing.removingFromList(linkedList); });

        System.out.println("ArrayList adding: " + arrayListAddingTime + " ms");
        System.out.println("ArrayList getting: " + arrayListGettingTime + " ms");
        System.out.println("ArrayList removing: " + arrayListRemovingTime + " ms");
        System.out.println("LinkedList adding: " + linkedListAddingTime + " ms");
        System.out.println("LinkedList getting: " + linkedListGettingTime + " ms");
        System.out.println("LinkedList removing: " + linkedListRemovingTime + " ms");
    }
}