public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public int[] swap(int[] arr, int index1, int index2){
        int waste = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = waste;
        return arr;
//        arr[1]
    }

}