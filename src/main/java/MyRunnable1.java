///**
// * @ClassName MyThread
// * @Description TODO
// * @Author laishaopeng_zz
// * @Date 2022/8/2 13:47
// **/
//public class MyRunnable {
//    public static void main(String[] args) {
//
//        for (int i = 0; i < 100; i++) {
//            System.out.println();
//        }
//
//            MyThread1 myThread = new MyThread1();
//            myThread.start();
//
//            Thread t = new Thread(new thread());
//            t.start();
//
//            //采用匿名内部类
//            Thread t1 = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    int sum = 0;
//                    for (int i = 21; i <= 30; i++) {
//                        sum = sum + i;
//                    }
//                    System.out.println("第3个线程和" + sum);
//                }
//            });
//            t1.start();
//
//    }
//}
//
//class MyThread1 extends Thread {
//    @Override
//    public void run() {
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            sum = sum + i;
//        }
//        System.out.println("第一个线程和" + sum);
//    }
//
//    @Override
//    public void run() {
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            sum = sum + i;
//        }
//        System.out.println("第一个线程和" + sum);
//    }
//}
//
//class thread implements Runnable {
//    @Override
//    public void run() {
//        int sum = 0;
//        for (int i = 11; i <= 20; i++) {
//            sum = sum + i;
//        }
//        System.out.println("第2个线程和" + sum);
//    }
//
//
//}
//
//
//
//
//
