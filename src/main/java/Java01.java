/**
 * @ClassName Java01
 * @Description TODO
 * @Author laishaopeng_zz
 * @Date 2022/8/3 8:48
 **/

class ListNode {
    //节点值
    int val;
    //下一节点指针
    ListNode next;

    //无参构造
    public ListNode() {
    }

    //有一个参数的构造器
    public ListNode(int val) {
        this.val = val;
    }

    //两个参数的构造器
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}

public class Java01 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode p = head;
        int number = 0;
        while (p != null) {
            number++;
            p = p.next;
        }

        ListNode a = head;
        for (int y = 0; y < number / 2; y++) {
            a = a.next;
        }
        while (a != null) {
            System.out.println(a.val);
            a = a.next;
        }

    }

}



