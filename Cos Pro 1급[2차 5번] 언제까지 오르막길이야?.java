import java.util.*;

class Main {
    public int solution(int[] arr) {
        // 여기에 코드를 작성해주세요.
      int answer = 0;
      ArrayList<Integer> list = new ArrayList<>();
      
      for(int i=0; i<arr.length; i++){
        int start = arr[i];
        int count = 1;
        for(int j=i+1; j<arr.length-1; j++){
          int next = arr[j];
					
          if(start < next){
            count++;
            continue;
          }
          
          list.add(count);
        }
      }
      
      answer = Collections.max(list);
      return answer;
    }
	
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        int[] arr = {3, 1, 2, 4, 5, 1, 2, 2, 3, 4};
        int ret = sol.solution(arr);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}

