package week8.myTree;

import week8.myTree.MyTree;

public class Test {

    public static void main(String[] args) {

        MyTree<Integer, String> tree = new MyTree<>();

        tree.put(10, "10");
        tree.put(5, "5");
        tree.put(15, "15");
        tree.put(7, "7");
        tree.put(12, "12");
        tree.put(3, "3");
        tree.get(10);
        tree.remove(15);

        System.out.println(tree);
        System.out.printf(tree.get(10));


    }

}
