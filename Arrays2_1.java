public class Arrays2_1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("배열의 길이 = " + arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.println();

        // index범위를 벗어나면 에러 발생
        // 한번 컴파일 되면 배열의 크기는 바꿀 수 없음
        for (int i = 0; i < arr.length + 1; i++){
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
