public class ArraySetTest {
    public static void main(String[] args){
        ArraySet<String> demo = new ArraySet<>();
        demo.add("red");
        demo.add("blue");
        System.out.println(demo.size());
        System.out.println(demo.contains("blue"));

        for(String i: demo){
            System.out.print(i + " ");
        }
        System.out.println("\n-----------");
        System.out.println(demo);
    }
}
