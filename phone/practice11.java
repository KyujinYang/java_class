package e_oop.phone;

import e_oop.N7_ScanUtil;

public class practice11 {

   public static void main(String[] args) {
      //그림 맞추기 게임
      
      System.out.println("플레이어 수 입력> ");
      int player = N7_ScanUtil.nextInt();
      
      String[] playerName = new String[player];
      for(int i = 0; i < player; i++){
         System.out.println("플레이어" + (i + 1) + "이름 입력> "/*"의 이름을 영어로 입력>*/ );
         playerName[i] = N7_ScanUtil.nextLine();
      }
      
      System.out.println();
      
      for(int i = 0; i < player ; i++){
         System.out.println("플레이어" + (i + 1) + " = " + playerName[i]);
      }
      
      System.out.println();
      System.out.println(playerName[(int)(Math.random() * player)] + "부터 순서대로 시작!!");
      
      System.out.println();
      System.out.println("1. 그림 그리기\t2. 그림 맞추기");
      System.out.println("게임 모드를 선택해주세요> ");
      int input = N7_ScanUtil.nextInt();
      
      int number = 0;
      int turn = 0;
      String[] picture = new String[100];
      String question; //그림 계속 그릴지 응답 받을 변수 (Y/N)
      String[] answer = new String[100];   //그림의 정답 입력받을 변수
      
      do{
      
      switch(input){
      
      case 1:
         do{
            System.out.println("그림을 그려주세요> ");
            picture[number] = N7_ScanUtil.nextLine();
            number++;
            
            System.out.println("그림을 그만 그릴까요?(y/n)");
            question = N7_ScanUtil.nextLine();
            
            if(question.equals("y")){
               break;
            }
            
            
         }
         while(true);
         
         
         System.out.println("그림의 정답을 입력해주세요. >");
         answer[turn] = N7_ScanUtil.nextLine();
         
         
         for(int i = 0; i < number ; i++){
            System.out.println(picture[i]);
         }

         String pictureA; //그림에 대한 답
         do{
         System.out.println("정답을 입력해주세요. > ");
         pictureA = N7_ScanUtil.nextLine();
         if(answer[turn].equals(pictureA)){
            System.out.println("정답입니다.");
            break;
         }
         }
         while(true);
         
         turn++;
      
      case 2:
         //2는 그림 퀴즈 배열에 집어넣고 
         //랜덤으로 출력되게 만들어서 정답 맞출 수 있도록
         String[][] Quiz = {{"＼😆へ　 へ😁ヘ　 く😎/", "ヘ / 　　　 ( ヘ　　 　( ヘ","　 >　 　 <　　　　く", "사람"}
         ,{"｡ ﾟ ﾟ･｡･ﾟ ﾟ 。", "ﾟ。　 　｡ﾟ", "　ﾟ･｡･ﾟ", "하트"}
         ,{  "Δ~~~Δ",
            "ξ ･ェ･ ξ",
            "ξ　~　ξ",
            "ξ　　 ξ",
            "ξ　　 “~～~～O",
            "ξ　　　　　　 ξ",
            "ξ ξ ξ~～~ξ ξ",
            "ξ_ξ_ξ　ξ_ξ_ξ", "알파카"},
         
         {".　　　＿＿＿_",
         "　　／＿＿＿_＼",
         "　 / /⊂ニ⊃   ⊂ﾆ⊃",
         "　｜｜　　　　　L",
         "　i⌒　 ￣　 ￣　ヽ",
         "　ヽ_　　　　　　 |",
         "（ヽ ＞､_＿＿０＿ノ",
         "　|Ｖ /　　　 ヽﾚ<ヲ",
         "　|＿/|　　　　|／",
         "　　　|――――|",
         "　　　|＿＿Ｌ＿|", "짱구"}

};
         
         int random = (int)(Math.random() * 3);
         System.out.println("Quiz");
         System.out.println(random);
         for(int i = 0; i < (Quiz[random].length-1) ; i++)
         {
            System.out.println(Quiz[random][i]);
         }         
         
         String quizAnswer;
         
         
      do{
            System.out.println("정답을 입력해주세요. > ");
            quizAnswer = N7_ScanUtil.nextLine();
            if(Quiz[random][(Quiz[random].length)-1].equals(quizAnswer)){
               System.out.println("정답입니다.");
               break;
            }
            else
               {
                  System.out.println("오답입니다.");
                  continue;
               }
            }
            while(true);
            break;
            
    //while문 잘못 설정한 것 같다 / 
//            게임 정답 맞추면 게임 종료할 건지 물어보고 종료하지 않겠다고 하면
//            다시 처음 메뉴를 출력하도록 설정하고 종료하겠다고 하면 프로그램을 종료하기
      
//      System.out.println();
//      System.out.println("게임을 종료하시겠습니까?(y/n)");
//      String exit = ScanUtil.nextLine();
//      if(exit.equals("y"));
//      {
//         System.out.println("게임이 종료되었습니다.");
//         System.exit(0);
//      }
//      if(exit.equals("n"))
//      {
//         continue;
//      }
         
      }
      

      
   } while(true);

      
   }

}