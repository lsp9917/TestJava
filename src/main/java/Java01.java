/**
 * @ClassName Java01
 * @Description TODO
 * @Author laishaopeng_zz
 * @Date 2022/8/3 8:48
 **/
public class Java01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0) {
                continue;
            }
            if (i % 4 != 0) {
                continue;
            }
            if (i % 5 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}



