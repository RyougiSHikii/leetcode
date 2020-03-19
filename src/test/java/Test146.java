import org.junit.Test;
import solution.Code146;
import solution.Code146_3;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2019/12/31 0:17
 */
public class Test146 {

    @Test
    public void test1(){
        Code146 code146 = new Code146(2);
        code146.put(1, 1);
        code146.put(2, 2);
        System.out.println(code146.get(1));
        code146.put(3, 3);
        System.out.println(code146.get(2));
        code146.put(4, 4);
        System.out.println(code146.get(1));
        System.out.println(code146.get(3));
        System.out.println(code146.get(4));

    }

    @Test
    public void test2(){
        Code146 code146 = new Code146(2);
        code146.put(2, 1);
        code146.put(2, 2);
        System.out.println(code146.get(2));
        code146.put(1, 1);
        code146.put(4, 1);
        System.out.println(code146.get(2));


//        Code146 code146 = new Code146(2);
//        code146.put(1, 1);
//        code146.put(2, 2);
//        System.out.println(code146.get(1));
//        code146.put(3, 3);
//        System.out.println(code146.get(2));
//        code146.put(4, 4);
//        System.out.println(code146.get(1));
//        System.out.println(code146.get(3));
//        System.out.println(code146.get(4));


//["LRUCache","put","put","get","put","get","put","get","get","get"]
//[[2],[1,1],[2,2],[1],[3,3],[2],[4,4],[1],[3],[4]]
//        ["LRUCache","put","put","get","put","put","get"]
//[[2],[2,1],[2,2],[2],[1,1],[4,1],[2]]
    }
    @Test
    public void test3(){
        Code146_3 code146 = new Code146_3(2);
        code146.put(1, 1);
        code146.put(2, 2);
        System.out.println(code146.get(1));
        code146.put(3, 3);
        System.out.println(code146.get(2));
        code146.put(4, 4);
        System.out.println(code146.get(1));
        System.out.println(code146.get(3));
        System.out.println(code146.get(4));
        //[1,-1,-1,3,4]
    }
}
