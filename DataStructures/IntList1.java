public class IntList1{
    public int first;
    public IntList1 rest;

    public static void main(String[] args){
        /** 创建一个IntList实例化变量L，初始化列表 */
        IntList1 L = new IntList1();
        L.first = 10;
        L.rest = null;

        /** 实现常规数据输入 */
        IntList1 A = new IntList1();
        A.first =100;
        A.rest = new IntList1();

        A.rest.first = 2;
        A.rest.rest = new IntList1();
        // ....
    }
}
//多次rest操作繁琐，不如封装为一个函数实现数据储存 见IntList2.java