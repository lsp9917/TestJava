import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName StreamTest
 * @Description TODO
 * @Author laishaopeng_zz
 * @Date 2022/8/2 15:25
 **/
public class StreamTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        list.stream().filter(a -> a % 2 == 1).forEach(a -> System.out.print(" " + a));
        System.out.println();
        list.stream().filter(b -> b % 2 == 0).forEach(b -> System.out.print(" " + b));
    }
}
