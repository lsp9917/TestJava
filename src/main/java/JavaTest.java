import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.*;

/**
 * @ClassName JavaTest
 * @Description TODO
 * @Author laishaopeng_zz
 * @Date 2022/8/1 10:48
 **/
public class JavaTest {
    public static void main(String[] args) {
        System.out.println("请输入三个数，以空格分格：");
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        String[] str = nextLine.trim().split(" ");
        System.out.println(Arrays.toString(str));
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);
        int max = Math.max(a, b);
        max = Math.max(max, c);
        System.out.println("最大数" + max);
    }

    @Test
    void test1() {
        //'\t'制表符 8
        //System.out.println("name" + '\t' + "age");

        int number = 0;
        number = number + 1;
        number = number + 2 - 1;
        number = number + 2 - 1;
        number = number - 1;
        number = number + 1;
        System.out.println("number=" + number);
    }

    @Test
    void test2() {
        System.out.println("海绵宝宝");
        System.out.println(3);
        System.out.println("海底");
        System.out.println(true);
        System.out.println(10.99);
    }

    @Test
    void test3() {
        String name = "赖少鹏";
        int year = 3;
        double salary = 7000.0;
        System.out.println(name + "学习Java" + year + "个月，现在薪资是" + salary);
    }

    @Test
    void test4() {
        int number1 = 1;
        int number2 = 2;
        System.out.println(number1 + number2);
    }

    @Test
    void test5() {
        double fatherHeight = 175;
        double motherHeight = 155;
        double sonHeight = (fatherHeight + motherHeight) * 1.08 / 2;
        double daughterHeight = (fatherHeight * 0.923 + motherHeight) / 2;
        System.out.println("儿子预计身高" + sonHeight + "厘米");
        System.out.println("女儿预计身高" + daughterHeight + "里面");

    }

    @Test
    void test6() {
        int red = 25;
        int blue = 30;
        red = red * 2 + 10;
        blue = blue * 2;
        System.out.println(red == blue);
    }

    @Test
    void test7() {
        double money1 = 24 + 8 + 3;
        money1 = (money1 <= 30 ? money1 : money1 * 0.8);
        double money2 = 16 + 8 + 3;
        double money = money1 < money2 ? money1 : money2;
        System.out.println(money);
    }

    @Test
    void test8() {
        int[] arr = {3, 9, -1, 10, -2};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    @Test
    void test9() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            list.add(i);
        }
        //增强for
        for (Integer i : list) {
            System.out.println(i);
        }
        //迭代器
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    @Test
    void copy(Object source, Object target) {
        try {
            //获取class对象
            Class sourceClass = source.getClass();
            Class targetclass = target.getClass();
            //获取运行时类的所有属性<包括私有属性>
            Field[] sourceFields = sourceClass.getDeclaredFields();
            Field[] targetFields = targetclass.getDeclaredFields();
            for (Field sField : sourceFields) {
                //放开私有属性访问权限
                sField.setAccessible(true);
                String[] sType = sField.getType().toString().split(" ");
                for (Field tField : targetFields) {
                    tField.setAccessible(true);
                    String[] tType = tField.getType().toString().split(" ");
                    if (tType[1].equals(sType[1]) && tField.getName().equals(sField.getName())) {
                        Object sValue = sField.get(source);
                        tField.set(target, sValue);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void fizzBuzz() {
        int n = 30;
        List<String> arr = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 5 != 0 && i % 3 != 0) {
                arr.add(String.valueOf(i));
            }
            if (i % 3 == 0) {
                arr.add("Fizz");
            }
            if (i % 5 == 0) {
                arr.add("Buzz");
            }
            if (i % 5 == 0 && i % 3 == 0) {
                arr.add("FizzBuzz");
            }
        }
        for (String arr1 : arr) {
            System.out.print(arr1);
        }
    }

    @Test
    void canConstruct() {
        String ransomNote = "aa";
        String magazine = "ab";

        if(ransomNote.length()>magazine.length()){
            System.out.println("false");
        }
        int count= 0;
        for(char c : ransomNote.toCharArray()){
            for(char d : magazine.toCharArray()){
                if(c==d){
                    count++;
                    d = '1';
                    break;
                }
            }
        }
        if (count == ransomNote.length()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
