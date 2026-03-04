public class ExtraExercise {
    public class IntList {
        public int first;
        public IntList rest;

        /**构造函数*/
        public IntList(int a, IntList b) {
            first = a;
            rest = b;
        }
    }

    /**创建并返回一个与 L 相同的 IntList，但所有值都递增 x*/
    public IntList incrList(IntList L,int x){
        if(L==null) return null;
        return new IntList(L.first + x, incrList(L.rest, x));
    }
    /** 对本身改动，使其增加x*/
    public void dincrList(IntList L,int x){
        if(L==null) return;
        L.first+=x;
        dincrList(L.rest,x);
    }
    //主函数调用
    public void main(String[] args)
    {
        IntList L = new IntList(10,null);
         L = new IntList(12,L);
         L = new IntList(13,L);
         L = new IntList(1,L);
         L = new IntList(100,L);
         IntList g = incrList(L,1);
         dincrList(L,10);
    }

}
