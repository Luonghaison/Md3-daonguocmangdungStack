import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseArrayUsingStack {

    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9};
        System.out.println("Mang ban dau la:"+Arrays.toString(arr));

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i]=stack.pop();
        }
        System.out.println("Mang sau khi thay doi"+Arrays.toString(arr));

        Stack<Character> wStack = new Stack<>();
        System.out.println("Nhập chuỗi cần đảo ngược:");
        Scanner sc= new Scanner(System.in);
        String mWord = sc.nextLine();

        for (int i=0; i<mWord.length(); i++){
            wStack.push(mWord.charAt(i));
    }
        String newChuoi = "";
        while(!wStack.isEmpty()){
            newChuoi += wStack.pop();
        }
        System.out.println("Chuỗi mới là: "+newChuoi);
}



}

