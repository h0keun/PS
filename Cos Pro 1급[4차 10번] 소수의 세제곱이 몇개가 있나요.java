// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Main {
    public int solution(int a, int b) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
			
        for(int i=3; i<b/2; i++){
          int num = 0;
					
          for(int j=i-1; j>1; j--){
            if(i%j == 0){
              num = 0;
              break;
            }else{
              num = i;
            }						
          }
					
          if(i == num){
            list.add(num);
          }
        }
			
        for(int k : list){
          int two = k * k;
          int three = k * k * k;
          if(a <= two && two <= b){
            answer++;
          }
          if(a <= three && three <= b){
            answer++;
          }
        }
			
        return answer;
    }
  
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args){
        Main sol = new Main();
        int a = 6;
        int b = 36;
        int ret = sol.solution(a,b);
      
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환값은 " + ret + " 입니다."):
    }
}
