import java.util.Arrays;
public class main {
    public static void main(String[] args) {
        class Solution {
            public int[][] solution(int[] num_list, int n) {

                int[][] answer = new int[num_list.length/n][n];
                int index = 0;

                for(int i = 0; i < answer.length; i++) {
                    answer[i] = Arrays.copyOfRange(num_list,index,index+n);
                    index += n;
                }

                return answer;
            }
        }
    }
}
