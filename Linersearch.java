package package1;

public class Linersearch {
    public static <T> T isLinearSearch(T[] arr, T element) {
        for (T t : arr) {
            if (t.equals(element)) {
                return t; 
            }
        }
        return null; 
    }

    public static void main(String[] args) {
        Integer[] arr = {11, 22, 33, 55, 44, 88, 66};
        Integer result = isLinearSearch(arr, 88);

        if (result != null) {
            System.out.println("Element found: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
