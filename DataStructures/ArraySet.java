import java.util.Iterator;

public class ArraySet<T> implements Iterable<T>{
    private T[] myArray;
    private int size;

    ArraySet(){
        //调用父类Object构造函数
        myArray = (T[]) new Object[100];
        size = 0;

    }

   //先写contain方法，add方法里要使用
    //包含时返回true
    public Boolean contains(T value) {
        for(int i = 0; i < size; i++ ){
            if((myArray[i]).equals(value)){
                return true;
            }
        }
        return false;
    }

    public int size(){
        return size;
    }

    public void add(T value){
        if(!contains(value)){
            myArray[size] = value;
            size++;
        }else return;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    @Override
    public String toString() {
        // 1. 处理空集情况
        if (size == 0) {
            return "{}";
        }
        StringBuilder returnSB = new StringBuilder("{");
        for (int i = 0; i < size - 1; i += 1) {
            returnSB.append(myArray[i].toString());
            returnSB.append(", ");
        }
        returnSB.append(myArray[size - 1]);
        returnSB.append("}");
        return returnSB.toString();
    }
    @Override
    public boolean equals(Object other){
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (other.getClass() != this.getClass()) {
            return false;
        }
        ArraySet<T> o = (ArraySet<T>) other;
        if (o.size() != this.size()) {
            return false;
        }
        for (T item : this) {
            if (!o.contains(item)) {
                return false;
            }
        }
        return true;
    }


    private class MyIterator implements Iterator<T>{
        private int num;

        public MyIterator(){
            num = 0;
        }

//`hasnext()`：判定这一位有无可用元素。
        @Override
        public boolean hasNext() {
            return num < size;
        }


//`next()`：它返回列表的这一个元素，并在此处将其打印出来。同时，它还将迭代器向前移动一位。
        @Override
        public T next() {
            T temp = myArray[num];
            num++;
            return temp;
        }


    }
}
