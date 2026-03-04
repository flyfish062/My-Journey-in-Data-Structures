public class IntList2 {
    /** 考虑构建一个含参构造函数IntList2,实现数据储存 */
    public int first;
    public IntList2 rest;
    public IntList2(int a,IntList2 b){
        first = a;
        rest = b;
    }
    public static void main(String[] args){
        /** 实例化L实现初始化,并完成正常数据储存 */
        IntList2 L = new IntList2(0,null);
       //构造函数让新L的rest指向老L，实现逻辑连续排列
        //这种为反向构建，最后构建的数据在列表最前。
        L = new IntList2(2,L);
        L = new IntList2(101,L);
        L = new IntList2(13,L);
        L = new IntList2(80,L);
    }
}
//理论上可以使用此版本实现现代列表功能，但难读且容易出错