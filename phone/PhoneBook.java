package e_oop.phone;

import java.util.Scanner;

class Phone1 {
   private String name;
   private String tel;
   Phone1(String name, String tel) {
      this.name = name;
      this.tel = tel;
   }
   public String getName() {
      return name;
   }
   public String getTel() {
      return tel;
   }
}

public class PhoneBook {
   
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      Phone1 phone1[];
      int i;
      System.out.print("인원수 >> ");
      int num = sc.nextInt();
      phone1 = new Phone1[num];
      for(i=0; i<phone1.length; i++) {
         System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
         String name = sc.next();
         String tel = sc.next();
         phone1[i] = new Phone1(name, tel);
      }
      System.out.println("저장되었습니다...");
      while(true) {
         System.out.print("검색할 이름 >>");
         String name = sc.next();
         for(i=0; i<num; i++) {
            if(name.equals(phone1[i].getName())) {
               System.out.println(name+"의 번호는 "+phone1[i].getTel()+" 입니다.");
               i--;
               break;
            }
         }
         if(name.equals("그만")) break;
         if (i == num) System.out.println(name+"이 없습니다.");
      }
      
      sc.close();
   }

}
