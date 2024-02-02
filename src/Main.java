import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ArrayList<ArrayList<String>> list = new ArrayList<>();

    for (int i = 0; i < 9; i++) {
      String string = sc.nextLine();
      if(string.length() == 9 && string.matches("^[1-9]+$")) {
        ArrayList<String> row = new ArrayList<>();
        for(int j = 0; j < 9; j++) {
          char c = string.charAt(j);

            row.add(String.valueOf(c));

        }
        for(int n = 0; n < row.size(); n++) {
          for(int x = n + 1; x < row.size(); x++) {
            if(Objects.equals(row.get(n), row.get(x))) {
                System.out.println("같은 숫자" + row.get(n) +  "있습니다.");
                return;
            } else {
              System.out.println("같은 숫자 없음");
            }
          }
        }
        list.add(row);
      } else {
        System.out.println("1부터 9 사이의 숫자를 입력해주세요.");
        i--;
      }
    }

    sc.close();

    for (ArrayList<String> strings : list) {
      for (String string : strings) {
        System.out.print(string + " ");
      }
      System.out.println();
    }

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

//    int[] arr = {1,1,1,4,4,4,4};
//
//    for(int n = 0; n < arr.length; n++) {
//      for(int i = n + 1; i < arr.length; i++) {
//        if(n != i && arr[n] == arr[i]) {
//            System.out.println("같은 숫자" + arr[n] +  "있습니다.");
//        }
//      }
//    }

  }
}