public class SLList1 {
 //在SLList基础上实现对size的改进，改良缓存问题
    /** 这种直接在类中保存重要数据以加快检索速度的做法有时被称为缓存。*/
        private IntNode first;
        private int size ;

        //创建空列表

        public  SLList1(){
           first =null;
           size = 0;
        }

        public SLList1(int x){
            first = new IntNode(x,null);
            size=1;
        }

        public void addfirst(int x)
        {
            first = new IntNode(x,first);
            size++;
        }
        public int getfirst(){

            return first.item;
        }

        /** 如果在空列表后直接调用addLast,出现错误，p本来就是null,p.next不可访问*/
        public void addLast(int x)
        {
            //打补丁解决空列表问题
            IntNode p = first;
            if(first==null)
            {
                first = new IntNode(x,null);
                return;
            }
            /** 这种打补丁处理特定情况的方式并不推荐，而使用Sentinel Nodes(哨兵结点)可以解决这个问题
             * 可以将SLList所有初始化的情况给统一起来*/

            //  其实就是在找添加位置的前驱节点
            //操作底层思路 定位 -> 修改 next 指针
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
            SLList1 L = new SLList1();
            L.addLast(2);
            L.addfirst(3);
            L.addfirst(8);
            L.addLast(100);
            System.out.println(L.getfirst());
            System.out.println(L.size());
        }

}