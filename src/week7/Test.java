package week7;

public class Test {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);


        System.out.println(list.toString());
        list.removeFromStart();
        System.out.println(list.toString());
        list.removeFromEnd();
        System.out.println(list.toString());

    }
}
