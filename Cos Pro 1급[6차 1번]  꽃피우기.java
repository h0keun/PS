import java.util.*;

class Solution {
    public int solution(int[][] garden) {
        int day = 0;
        int blank = 0;
        int answer = 0;
        int[][] map = new int[garden.length][garden.length];

        for(int i=0;i<garden.length;i++){
            for(int j=0;j<garden.length;j++){
                if(garden[i][j] == 0){
                    blank++;
                } else{
                    map[i][j]++;
                }
            }
        }

        while(blank > 0){
            for(int i=0;i<garden.length;i++){
                for(int j=0;j<garden.length;j++){
                    if(garden[i][j] == 1){
                        map[i][j] = 1;
                    }
                }
            }

            for(int i=0;i<garden.length;i++){
                for(int j=0;j<garden.length;j++){
                    if(map[i][j] == 1){
                        if(i-1>=0 && garden[i-1][j] == 0){
                            garden[i-1][j] = 1;
                            blank--;
                        }
                        if(i+1<garden.length && garden[i+1][j] == 0){
                            garden[i+1][j] = 1;
                            blank--;
                        }
                        if(j-1>=0 && garden[i][j-1] == 0){
                            garden[i][j-1] = 1;
                            blank--;
                        }
                        if(j+1<garden.length && garden[i][j+1] == 0){
                            garden[i][j+1] = 1;
                            blank--;
                        }
                    }
                }
            }
            day++;
        }
        return day;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] garden1 = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int ret1 = sol.solution(garden1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int[][] garden2 = {{1, 1}, {1, 1}};
        int ret2 = sol.solution(garden2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

    }    
}
