class Trie {
    Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        root.insert(word, 0);
    }

    public boolean search(String word) {
        return root.search(word, 0);
    }

    public boolean startsWith(String prefix) {
        return root.startsWith(prefix, 0);
    }
}

class Node {
    Node[] nodes;
    boolean flag;

    Node() {
        nodes = new Node[26];
        flag = false;
    }

    void insert(String word, int index) {
        if (index >= word.length())
            return;

        int i = word.charAt(index) - 'a';

        if (nodes[i] == null) {
            nodes[i] = new Node();
        }

        if (index == word.length() - 1) {
            nodes[i].flag = true;
        }

        nodes[i].insert(word, index + 1);
    }

    boolean search(String word, int index) {
        if (index >= word.length())
            return true;

        Node node = nodes[word.charAt(index) - 'a'];

        if (node == null)
            return false;

        if (index == word.length() - 1) {
            return node.flag;
        }

        return node.search(word, index + 1);
    }

    boolean startsWith(String word, int index) {
        if (index >= word.length())
            return true;

        Node node = nodes[word.charAt(index) - 'a'];

        if (node == null)
            return false;

        if (index == word.length() - 1)
            return true;

        return node.startsWith(word, index + 1);
    }
}