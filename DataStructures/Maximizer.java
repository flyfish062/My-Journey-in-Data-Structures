public class Maximizer {
    public static OurComparable max(OurComparable[] items) {
        if (items == null || items.length == 0) {
            return null;
        }
        int maxDex = 0;
        for (int i = 0; i < items.length; i += 1) {
            // 这里利用了多态：运行时会自动调用 Dog 类的 compareTo
            int cmp = items[i].compareTo(items[maxDex]);
            if (cmp > 0) {
                maxDex = i;
            }
        }
        return items[maxDex];
    }
}
