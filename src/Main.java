import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//
//    ArrayList<ArrayList<String>> list = new ArrayList<>();
//
//    for (int i = 0; i < 9; i++) {
//      String string = sc.nextLine();
//      if(string.length() == 9 && string.matches("^[1-9.]+$")) {
//        ArrayList<String> row = new ArrayList<>();
//        for(int j = 0; j < 9; j++) {
//          char c = string.charAt(j);
//          if(c == '.') {
//            row.add("0");
//          } else {
//            row.add(String.valueOf(c));
//          }
//        }
//        list.add(row);
//      } else {
//        System.out.println("1부터 9 사이의 숫자를 입력해주세요.");
//        i--;
//      }
//    }
//
//    sc.close();
//
//    // 리스트 출력
//    System.out.println(list.get(0).get(0));

//    int[][] arr = {{1,2,1},{2,3,3},{5,5,5}};

//    for(int i = 0; i < arr.length; i++) {
//      for(int j = 0; j < arr[i].length; j++) {
//        for(int k = 1; k < arr[i].length; k++) {
//          if(arr[i][j] == arr[i][k]) {
//            System.out.println("같은 숫자" + arr[i][j] +  "있습니다.");
//          }
//        }
//        System.out.println();
//      }
//    }

    int[] arr = {1,1,2,3,4,5,6,7,8};

    for(int n = 0; n < 9; n++) {
      for(int i = 1; i < arr.length; i++) {
        if(arr[n] == arr[i]) {
          System.out.println("숫자 n은" + i + "번째 인덱스에 있습니다.");
        }
        System.out.println();
      }
    }

  }
}