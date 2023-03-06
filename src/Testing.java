import java.util.List;

public class Testing {
    public static void addingToList(List<Long> list) {
        for (long i = 0; i < 100000; i++) {
            list.add(i);
        }
    }

    public static void gettingFromList(List<Long> list) {
        for (int i = list.size() / 3; i < list.size() / 2; i++) {
            list.get(i);
        }
    }

    public static void removingFromList(List<Long> list) {
        var i = list.size() / 3;
        while (i < list.size() / 2) {
            list.remove(i);
            i++;
        }
    }
}
