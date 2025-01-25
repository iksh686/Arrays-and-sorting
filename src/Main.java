public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] test_array = {142134123,-24123,123341,31443,1234,655676,-8473814, -0,0};
//        test_array = swap(test_array,0,2);

        test_array = sort(test_array);

        for (int i : test_array) {
            System.out.println(i);
        }

    }

    public static int[] swap(int[] arr, int index1, int index2){
        int waste = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = waste;
        return arr;
    }
    public static int[] sort(int[] arr){
        for(int i = 0; i< arr.length; i++){
            if(i == arr.length -1){
                continue;
            }

            int pos1 = arr[i];
            int pos2 = arr[i+1];

            if(pos1 > pos2){
                arr = swap(arr, i, i+1);
                i=-1;
            }

        }
        return arr;
    }
}