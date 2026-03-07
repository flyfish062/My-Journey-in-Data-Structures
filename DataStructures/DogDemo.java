public class DogDemo {
    public static void main(String[] args) {
        Dog[] dogs = {
                new Dog("Tiny", 3),
                new Dog("Biggy", 100),
                new Dog("Medium", 50)
        };

        // 调用泛化的 max 函数
        // 注意：max 返回的是 OurComparable 类型
        OurComparable result = Maximizer.max(dogs);

        // 如果想调用 Dog 特有的方法（如 bark），需要强制转换
        Dog maxDog = (Dog) result;

        System.out.println("最大的狗是: " + maxDog);
        maxDog.bark();

        /*
           优雅之处体现：
           如果你以后写了一个 Cat 类也实现了 OurComparable，
           你可以直接把 Cat[] 传给 Maximizer.max(cats)，而不需要改动 Maximizer。
        */
    }

}
