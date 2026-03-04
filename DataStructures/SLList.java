public class SLList {
    /** SLList即为单向链表的缩写 */

    /**考虑公共和私密，静态上的修改*/
    //防止用户非法调用IntNode,改为私密

    /** private关键字是一个极其重要的信号，它表明某些代码片段应该被最终用户忽略（。
   * 同样地，public应该视为一种声明，表明某个方法可用，并且将永远以现在的方式运行。*/

   private IntNode first;
   //初始化SLList
   public SLList(int x){
       first = new IntNode(x,null);
   }
   //重写addfirst方法
    public void addfirst(int x)
    {
        first = new IntNode(x,first);
    }
    //重写getfirst()方法
    public int getfirst(){

       return first.item;
    }

    /**第二次重写，完善addLast(),size()方法*/

    public void addLast(int x)
    {
        IntNode p = first;
        while(p.next!=null){
            p = p.next;
        }
        p.next= new IntNode(x,null);
    }

   /* public  int size(){
        IntNode p =first;
        if(p.next==null) return 1;
        return 1+p.next.size();
        这种方法因为不是IntNode类中的方法，无法使用
    } */

    //本质上是因为IntList的size是直接通过控制IntList本身来实现的，而在SLList我们摆脱了裸递归，实现size方法时必须通过IntNode这一中间量实现控制，
   // 所以必然要创建一个size(IntNode p)来获得size(正是因为要使用IntNode来数数而不是SLList,所以要设计一个给IntNode的方法）
   // 最后同时构造一个属于SLList的成员函数获得外部接口（size())

   private int size(IntNode p){
    if(p.next==null)return 1;
    return 1+size(p.next);
   }

   public int size(){
       return size(first);
   }

//main方法
    public static void main(String[] args)
    {
        SLList L = new SLList(10);
        L.addfirst(2);
        L.addfirst(3);
        L.addfirst(8);
        L.addLast(100);
        System.out.println(L.getfirst());
        System.out.println(L.size());
    }
}
/** 利用SLList中的first永远是List中最前面的Intnode实现功能，同时摆脱了裸递归，用户只需通过Intnode实现功能，不必触碰底层结构，方便操作*/
/** 明晰static，嵌套类常见规范并实现修改*/
//如果只有A这个类使用了B类，则可以将B类直接切入A类定义中，作为嵌套类，让逻辑关系更清晰
//如果B类完全没用到A类的成员，可以加上static关键字，这意味着该类不会获取对其父类（A类）的引用，从而节省少量内存。