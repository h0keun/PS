// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Main {	
    public String solution(String s1, String s2, int p, int q) {
        // 여기에 코드를 작성해주세요.
        String answer = "";
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
			
        for(int i=0; i<s1.length(); i++){
          int num_1 = Integer.parseInt(s1.substring(s1.length()-1-i,s1.length()-i)); 
          sum += num_1 * Math.pow(p,i);
        }
			
        for(int j=0; j<s2.length(); j++){
          int num_2 = Integer.parseInt(s2.substring(s2.length()-1-j,s2.length()-j));
          sum += num_2 * Math.pow(p,j);
        }
      
        while(sum > 0){
          list.add(sum % q);
          sum = sum / q;
        }
      
        Collections.reverse(list);
        answer = list.toString().replaceAll("[^0-9]","");
			
				return answer;
    }  

// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.	
    public static void main(String[] args) {
    	Main sol = new Main();
    	String s1 = new String("112001");
        String s2 = new String("12010");
        int p = 3;
        int q = 8;
    	String ret = sol.solution(s1, s2, p, q);
    	
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 \"" + ret + "\" 입니다.");
   }
}
