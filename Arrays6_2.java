import java.util.Arrays;

public class Arrays6_2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        System.out.println();
        // copyOf 시작지점이 첫번째로 고정되고 끝 지점을 정해서 복사 복사
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));
        int[] arr3 = Arrays.copyOf(arr, 3);
        System.out.println("Arrays.toString(arr3) = " + Arrays.toString(arr3));
        int[] arr4 = Arrays.copyOf(arr, 7); // 범위가 넘어가는 복사는 초기화값이 들어감
        System.out.println("Arrays.toString(arr4) = " + Arrays.toString(arr4));

        System.out.println();
        // copyOfRange 시작지점과 끝지점을 정해서 복사
        int[] arr5 = Arrays.copyOfRange(arr, 2, 4); // 끝지점 바로 전까지만 복사
        System.out.println("Arrays.toString(arr5) = " + Arrays.toString(arr5));
        int[] arr6 = Arrays.copyOfRange(arr, 0, 7); // 범위가 넘어가는 복사는 초기화값이 들어감
        System.out.println("Arrays.toString(arr6) = " + Arrays.toString(arr6));
    }
}
