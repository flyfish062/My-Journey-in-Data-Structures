public class SLList2 {
//实现哨兵结点优化
    //第一个真正的列表元素在sentinel.next.
 private IntNode sentinel;
 private int size ;



public  SLList2(){
    sentinel = new IntNode(91,null);
    size = 0;
}

public SLList2(int x){
    sentinel = new IntNode(91,null);
    sentinel.next = new IntNode(x,null);
    size=1;
}

public void addfirst(int x)
{
    sentinel.next = new IntNode(x,sentinel.next);
    size++;
}
public int getfirst(){

    return sentinel.next.item;
}

public void addLast(int x)
{
    //打补丁解决空列表问题
    IntNode p = sentinel;

    while(p.next!=null){
        p = p.next;
    }
    p.next= new IntNode(x,null);
    size++;
}

public int size(){
    return size;
}

//main方法
public static void main(String[] args)
{
    SLList2 L = new SLList2();
    L.addfirst(2);
    L.addfirst(3);
    L.addfirst(8);
    L.addLast(100);
    System.out.println(L.getfirst());
    System.out.println(L.size());
}
}
/**具有哨兵结点的列表的不变式，
 * 不变量使代码更容易理解，也为提供了确保代码正常运行的具体目标*/
//引用sentinel始终指向哨兵节点。
//最前面的项（如果存在）始终位于sentinel.next.item。
//该size变量始终表示已添加项目的总数。