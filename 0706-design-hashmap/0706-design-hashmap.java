class HM {
    int key;
    int value;

    public HM(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class MyHashMap {
    ArrayList<HM> ls;

    public MyHashMap() {
        ls = new ArrayList<>();
    }

    public void put(int key, int value) {
        for (HM i : ls) {
            if (i.key == key) {
                i.value = value;
                return;
            }
        }
        ls.add(new HM(key, value));
    }

    public int get(int key) {
        for (HM i : ls) {
            if (i.key == key) {
                return i.value;
            }
        }
        return -1;
    }

    public void remove(int key) {
        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i).key == key) {
                ls.remove(i);
                return;
            }
        }
    }
}