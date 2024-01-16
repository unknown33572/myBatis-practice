import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
//    for(int i = 0; i < 2; i++) {
//
//      String s1 = sc.nextLine();
//
//      String s2 = sc.nextLine();
//
//      String s4 = " ";
//
//      String s3 = s1 + s4 + s2;
//
//
//      System.out.println("입력하신 내용의 합은 " + s3 + " 입니다.");
//    }
//    boolean flag = false;
//
//    while (!flag) {
//      System.out.println("입력 :");
//      String s1 = sc.nextLine();
//      String s2 = sc.nextLine();
//      String s3 = sc.nextLine();
//      String s4 = sc.nextLine();
//      String s5 = sc.nextLine();
//
//      String s6 = s1 + " " + s2 + " " + s3 + " " + s4 + " " + s5;
//      System.out.println("입력 하신 내용의 합은 " + s6 + " 입니다.");
//      flag = true;
//    }

    ArrayList<String> list = new ArrayList<>();
    String string = "";

    StringBuilder answer = new StringBuilder();
    for (int i = 0; i < 9; i++) {
      string = sc.nextLine();
      answer.append(string);
      list.add(string);
    }
    System.out.println(answer);
    System.out.println(list);

  }
}