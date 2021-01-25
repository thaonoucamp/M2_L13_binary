package myPackage;

public class BinarySearch {

// 1. Tao lop khai bao 1 mang so nguyen;
    static int[] list = {2,4,7,10,11,45,50,59,60,66,69,70,79};

// 2. Phuong thuc binarySearch(int[]list, int key);
    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length-1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1; // " high < low, ko tim thay key;
    }

// 3. Ham thuc thi lenh;
public static void main(String[] args) {
    System.out.println(binarySearch(list, 2));
    System.out.println(binarySearch(list, 11));
    System.out.println(binarySearch(list, 79));
    System.out.println(binarySearch(list, 1));
    System.out.println(binarySearch(list, 5));
    System.out.println(binarySearch(list, 80));
}
}
