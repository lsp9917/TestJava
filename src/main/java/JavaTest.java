import com.sun.org.apache.xerces.internal.xs.ItemPSVI;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
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
        int max = a > b ? a : b;
        max = max > c ? max : c;
        System.out.println("最大数" + max);
    }

    @Test
    void test1() {
        System.out.println("练习Java");
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
    void testAnnotation() throws IllegalAccessException {
        Person person = new Person();
        Class<? extends Person> personClass = person.getClass();
        Field[ ] declaredFields = personClass.getDeclaredFields();
        for (Field f: declaredFields) {
            if (f.isAnnotationPresent(ChangeValue.class)) {
                f.setAccessible(true);
                ChangeValue value = f.getAnnotation(ChangeValue.class);
                f.set(person,value.value() );
            }
        }
        System.out.println(person);
    }



}
