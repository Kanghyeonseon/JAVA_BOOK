package Ch32;

import java.util.ArrayList;
import java.util.Scanner;

public class C02Array {
   public static void main(String[] args) {
    int num = 0;
    Scanner input = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<>();
    while(true) {
       System.out.println("========M E N U==========");
       System.out.println("1 이름 등록");
       System.out.println("2 이름 조회");
       System.out.println("3 이름 삭제");
       System.out.println("4 전체 조회");
       System.out.println("5 종료");
       System.out.println("========M E N U==========");
       System.out.print("번호 : ");
       num = input.nextInt();
       
       switch (num) {
      case 1:
         System.out.println("이름 등록 메뉴 입니다");
         String add = input.next();
         
         list.add(add);
         //이름 입력 받아서 ArrayList에 add
         break;
      case 2:
         System.out.print("조회 할 이름을 입력하세요 : ");
         String name = input.next();
         if(list.contains(name)) {
            System.out.println("등록 되어 있는 이름입니다.");
         }else{
            System.out.println("등록 되어 있지 않은 이름입니다.");
         }
         //이름 입력 받아서 조회(있다 없다) 이름이 있으명 "있다" 없으면 "없다"..
         break;
      case 3:   
         System.out.print("삭제 할 이름을 입력하세요 : ");
          String remove = input.next();
          if(list.remove(remove)) {
             System.out.println("삭제 완료");
          }else {
             System.out.println("삭제 실패");
          }
         //이름 입력 받아서 삭제.. 삭제 도ㅓㅣ었으면 삭제완료, 삭제할 이름 없으면 삭제 실패
         break;
      case 4:
         System.out.println("전체 조회 메뉴 입니다");
         
         if(list.isEmpty()) {
            System.out.println("조회할 목록이 없습니다.");
         }else {
            for (String re : list) {
               System.out.println(re);
            }
         }
          break;
      case 5: 
         System.exit(-1);
      default:
         System.out.println("다시 입력...");
      }
    } 
   }
}