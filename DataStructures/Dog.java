public class Dog implements OurComparable{
    private String name;
    private int size;

    public Dog(String n, int s) {
        name = n;
        size = s;
    }

    public void bark() {
        System.out.println(name + " says: bark!");
    }

    @Override
    public int compareTo(Object o) {
        // 向下转型：为了访问 Dog 特有的 size 属性
        Dog otherDog = (Dog) o;
        return this.size - otherDog.size;
    }

    @Override
    public String toString() {
        return name + " (size: " + size + ")";
    }

}
