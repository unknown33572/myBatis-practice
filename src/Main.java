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

    for (int i = 0; i < 3; i++) {
      String string = sc.nextLine();
      if(string.length() == 3 && string.matches("^[1-9]+$")) {
        ArrayList<String> row = new ArrayList<>();
        for(int j = 0; j < 3; j++) {
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
    for(int i = 0; i < 3; i++) {
      System.out.println(i + "번째" + "Loop");
      for(int j = i + 1; j < 3; j++) {
        if(list.get(i).get(0).equals(list.get(j).get(0))) {
          System.out.println("같은 숫자" + list.get(i).get(0) + "있습니다.");
          return;
        } else {
          System.out.println("같은 숫자 없음");
        }
//        System.out.println(j + "LooP" + "첫번째");
//        System.out.println(list.get(i).get(0));
//        System.out.println(list.get(j).get(0));
//        System.out.println(j + "Loop" + "두번째");
//        System.out.println(list.get(i).get(1));
//        System.out.println(list.get(j).get(1));
//        System.out.println(j + "Loop" + "세번째");
//        System.out.println(list.get(i).get(2));
//        System.out.println(list.get(j).get(2));
      }
    }
  }
}