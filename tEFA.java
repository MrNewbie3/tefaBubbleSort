import java.util.ArrayList;

public class tEFA {
    public static void main(String[] args) {
        try {
            ArrayList<Integer> array10 = new ArrayList<Integer>();
            ArrayList<Integer> array25 = new ArrayList<Integer>();
            ArrayList<Integer> array50 = new ArrayList<Integer>();
            ArrayList<Integer> array100 = new ArrayList<Integer>();
            for (int i = 0; i < 10; i++) {
                double random = (Math.random() * 10 + i);
                array10.add((int) Math.round(random));
            }
            for (int i = 0; i < 25; i++) {
                double random = (Math.random() * 10 + i);
                array25.add((int) Math.round(random));
            }
            for (int i = 0; i < 50; i++) {
                double random = (Math.random() * 10 + i);
                array50.add((int) Math.round(random));
            }
            for (int i = 0; i < 100; i++) {
                double random = Math.random() * 10 + i;
                array100.add((int) Math.round(random));
            }
            System.out.println("Before Sorted: \n" + array10);
            bubbleSort(array10, array10.size());
            System.out.println("Before Sorted: \n" + array25);
            bubbleSort(array25, array25.size());
            System.out.println("Before Sorted: \n" + array50);
            bubbleSort(array50, array50.size());
            System.out.println("Before Sorted: \n" + array100);
            bubbleSort(array100, array100.size());

        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }


    static void bubbleSort(ArrayList<Integer> arr, int n) {
        int i, j, temp;
        for (i = 0; i < arr.size(); i++) {
//            notasi BIG O Yang terjadi adalah O(n)
            for (j = 0; j < arr.size() - i - 1; j++) {
//              notasi BIG O yang terjadi adalah O(n)
                if (arr.get(j) > arr.get(j + 1)) {// swap the elements
                    temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
//        dapat disimpulkan bahwa bubble sort menggunakan proses log(n2) pada kode ini
        System.out.println("Sorted Array: ");
        System.out.println(arr);
    }
}



