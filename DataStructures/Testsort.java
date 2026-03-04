public class Testsort {
    /** Tests the sort method of the Sort class. */
    public static void Testsort(){
        /** 书写最基础的测试集实现测试 */
        String[] input = {"i","have","an","egg"};
        String[] expected = {"an","egg","have","i"};
        Sort.sort(input);
        for(int i = 0; i < input.length;i++){
            if(input[i]!=expected[i])
            {  //推荐使用if(!input[i].equals(expected[i]))
                System.out.println("Mismatch in position " + i + ", expected: " + expected[i] + ", but got: " + input[i] + ".");
                break;
            }
        }
        /** JUnit库中这个函数完全可以取代上述手写测试反馈函数，节省大量工作*/
        org.junit.Assert.assertArrayEquals(expected, input);
    }

    public static void main(String[] args) {
        Testsort();
    }
}
