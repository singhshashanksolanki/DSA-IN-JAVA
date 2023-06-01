package arrayList;

class ArrayListImplementation {
    static class ArrayList {
        String array[];
        int size;

        ArrayList() {
            array = new String[10];
            size = 0;
        }

        // Function add an Element in a arrayList
        public void add(String item) {
            array[size] = item;
            size++;
            if (size == array.length) {
                String newArray[] = new String[array.length * 2];
                for (int i = 0; i < array.length; i++) {
                    newArray[i] = array[i];
                }
                array = newArray;
            }
        }

        // Removing the element on the specified element
        public void remove(int index) {
            if (index >= 0 && index < size) {
                for (int i = index; i < size - 1; i++) {
                    array[i] = array[i + 1];
                }
                size--;
            }
        }

        // Remove the element without index;
        public void remove(String item) {
            int index = -1;
            for (int i = 0; i < size; i++) {
                if (item.equals(array[i])) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                remove(index);
            }

        }

        // Get the size of the list
        public int size() {
            return size;
        }

        // Get the element on the specified index
        public String get(int index) {
            if (index >= 0 && index < size) {
                return array[index];
            } else {
                return "Element not found";
            }
        }
    }

    public static void main(String args[]) {
        ArrayList list = new ArrayList();
        list.add("hello");
        list.add("hi");
        list.add("hey");
        System.out.println(list.size());
        list.remove(2);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.remove("hi");
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}