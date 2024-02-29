import java.util.Arrays;

public class Arrays3_1 {
    public static void main(String[] args) {
        int[] arr = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        System.out.println("arr = " + arr); // 배열을 가리키는 참조 변수 arr 출력

        char[] chArr = {'a', 'b', 'c', 'd'};
        System.out.println(chArr); //문자형 배열 chArr을 String형으로 인식함(?)

        //배열의 요소 하나씩 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        //배열의 모든 요소를 문자열로 만들어서 반환
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
