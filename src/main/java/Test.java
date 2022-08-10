import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @ClassName Test
 * @Description TODO
 * @Author laishaopeng_zz
 * @Date 2022/8/2 15:06
 **/
public class Test {
    public static void main(String[] args) throws Exception {

        //线程开启之后需要执行里面的call方法
        MyCallable1 myCallable1 = new MyCallable1();
        //可以获取线程执行完毕后的结果，也可以作为参数传递给thread对象
        FutureTask<Integer> task1 = new FutureTask<>(myCallable1);
        //FutureTask<>实现了runnable接口，所以可以直接传递给thread的构造方法
        Thread thread1 = new Thread(task1);
        thread1.start();
        Integer s1 = task1.get();
        System.out.println("一个线程和是:" + s1);

        MyCallable2 myCallable2 = new MyCallable2();
        //可以获取线程执行完毕后的结果，也可以作为参数传递给thread对象
        FutureTask<Integer> task2 = new FutureTask<>(myCallable2);
        //FutureTask<>实现了runnable接口，所以可以直接传递给threa的构造方法
        Thread thread2 = new Thread(task2);
        thread2.start();
        Integer s2 = task2.get();
        System.out.println("一个线程和是:" + s2);

        MyCallable3 myCallable3 = new MyCallable3();
        //可以获取线程执行完毕后的结果，也可以作为参数传递给thread对象
        FutureTask<Integer> task3 = new FutureTask<>(myCallable3);
        //FutureTask<>实现了runnable接口，所以可以直接传递给threa的构造方法
        Thread thread3 = new Thread(task3);
        thread3.start();
        Integer s3 = task3.get();
        System.out.println("一个线程和是:" + s3);

        System.out.println(s1+s2+s3);
   }
}


class MyCallable1 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
class MyCallable2 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 11; i <= 20; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
class MyCallable3 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 21; i <= 30; i++) {
            sum = sum + i;
        }
        return sum;
    }
}

