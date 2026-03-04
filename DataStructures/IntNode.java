public class IntNode {
    /**为改善LntList数据结构存在的裸递归问题，将其重塑，删除相关方法，转变为一个中间类*/
    public int item;
    public IntNode next;
    public IntNode(int x, IntNode y){
        item =x;
        next =y;
    }
}
