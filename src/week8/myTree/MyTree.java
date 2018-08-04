package week8.myTree;

public class MyTree<K extends Comparable<K>, V> {

    private TreeNode<K, V> root;
    private int size;


    public V put(K key, V value) {
        if(size == 0) {
            TreeNode<K, V> node = new TreeNode<>(key, value, null, null, null);
            root = node;
            size++;
            return null;
        }

        return putValue(root, key, value);
    }

    public void remove(K key) {
        TreeNode<K, V> x = root, y = null;
        while (x != null) {
            int cmp = key.compareTo(x.key);
            if (cmp == 0) {
                break;
            } else {
                y = x;
                if (cmp < 0) {
                    x = x.left;
                } else {
                    x = x.right;
                }
            }
        }
        if (x == null) {
            return;
        }
        if (x.right == null) {
            if (y == null) {
                root = x.left;
            } else {
                if (x == y.left) {
                    y.left = x.left;
                } else {
                    y.right = x.left;
                }
            }
        } else {
            TreeNode<K, V> leftMost = x.right;
            y = null;
            while (leftMost.left != null) {
                y = leftMost;
                leftMost = leftMost.left;
            }
            if (y != null) {
                y.left = leftMost.right;
            } else {
                x.right = leftMost.right;
            }
            x.key = leftMost.key;
            x.value = leftMost.value;
        }
    }



    public V get(K key) {
        TreeNode<K, V> x = root;
        while (x != null) {
            int cmp = key.compareTo(x.key);
            if (cmp == 0) {
                return x.value;
            }
            if (cmp < 0) {
                x = x.left;
            } else {
                x = x.right;
            }
        }
        return null;
    }

    private V putValue(TreeNode<K, V> currentRoot, K key, V value) {
        Comparable<K> currentKey = currentRoot.key;
        int compare = currentKey.compareTo(key);
        if(compare > 0) {
            if(currentRoot.left != null) {
                return putValue(currentRoot.left, key, value);
            }
            TreeNode<K, V> node = new TreeNode<>(key, value, currentRoot, null, null);
            currentRoot.left = node;
            return null;

        } else if(compare < 0) {
            if(currentRoot.right != null) {
                return putValue(currentRoot.right, key, value);
            }
            TreeNode<K, V> node = new TreeNode<>(key, value, currentRoot, null, null);
            currentRoot.right = node;
            return null;
        }

        V toReturn = currentRoot.value;
        currentRoot.value = value;
        return toReturn;
    }

    public String toString(){
        String s = "[";
        return s + getString(root) + "]";
    }

    private String getString(TreeNode<K, V> root) {
        return root == null ? "" : getString(root.left) + " " + root.value + " " + getString(root.right);
    }

    private static class TreeNode<K, V> {

        K key;
        V value;

        TreeNode<K, V> root;
        TreeNode<K, V> right;
        TreeNode<K, V> left;

        public TreeNode(K key, V value, TreeNode<K, V> root, TreeNode<K, V> right, TreeNode<K, V> left) {
            this.key = key;
            this.value = value;
            this.root = root;
            this.right = right;
            this.left = left;
        }
    }

}
