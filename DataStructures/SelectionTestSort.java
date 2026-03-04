import org.junit.Test;
import static org.junit.Assert.*;
public class SelectionTestSort {
    @Test
    public  void TestSort(){
        int[] input = new int[]{1,5,10,2,4,6,3};
        int[] expected = new int[]{1,2,3,4,5,6,10};
        SelectionSort.sort(input,0);
        assertArrayEquals(expected, input);
    }
    @Test
    public void Testfindsmallest(){
        int[] input = new int[]{1,5,10,2,4,6,3};
        int expected = 0;
        int actual = SelectionSort.findSmallest(input,0);
       assertEquals(expected, actual);

        //添加多个测试
        int[] input1 = new int[]{9,5,10,2,4,6,3};
        int expected1 = 3;
        int actual1 = SelectionSort.findSmallest(input1,0);
        assertEquals(expected1, actual1);
    }
    @Test
    public  void Testswap(){
        int[] input = new int[]{7,5,10,2,4,6,3};
        int[] expected = new int[]{2,5,10,7,4,6,3};
        SelectionSort.swap(input,0,3);
        org.junit.Assert.assertArrayEquals(expected, input);
    }



}
