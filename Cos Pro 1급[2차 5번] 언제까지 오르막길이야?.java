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

