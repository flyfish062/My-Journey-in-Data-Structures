public class IntList3 {
//本类主要想实现对IntList的size的记录，同时实现对特定元素的获取
    public int first;
    public IntList3 rest;
    public IntList3(int a,IntList3 b){
        first = a;
        rest = b;
    }
    /** 实现size计数 ,利用递归方法*/
    public int size(){
        if(rest == null) return 1;

        return 1+rest.size();
    }
    /** 对size实现迭代计数 */
    public int iterativeSize(){
        IntList3 p = this;
        //这里用this/rest都可以，用this更好强调初始状态
        int size = 1;
        while(p!=null)
        {
            p = p.rest;
            size++;
        }
        return size;
    }
    /** 构建get()函数，实现对特定函数的获取 */
    public int get(int x)
    {
        if(x==0) return first;
        return rest.get(x-1);
    }

    public static void main(String[] args){
        IntList3 L = new IntList3(0,null);
        L = new IntList3(2,L);
        L = new IntList3(101,L);
        L = new IntList3(13,L);
        L = new IntList3(80,L);
        System.out.println(L.size());
        System.out.println(L.iterativeSize());
        System.out.println(L.get(0));
    }
}
//LListIntList 的这种结构被称为 naked recursive（裸递归）
// ，他的缺点是使用起来相当棘手，导致代码难以阅读和维护。于是进一步思考出SLList.
