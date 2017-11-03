/*
 * https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
 */
package com.mycom.hackerrank.algorithm.implementations;

//import com.mycom.hackerrank.algorithm.utils.ArrayUtils;
import com.mycom.hackerrank.algorithm.utils.ReadFile;

/**
 * @author hongquan.doan
 *
 */
public class ClimbingLeaderboard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String f = "./samples/climbingleaderboard.txt";
		int n = ReadFile.readFileInt(f, 0)[0];
		int[] scores = ReadFile.readFileInt(f, 1);
		int m = ReadFile.readFileInt(f, 2)[0];
		int[] alice = ReadFile.readFileInt(f, 3);
		solve(n, scores, m, alice);
	}
	
	static void solve(int n, int[] scores, int m, int[] alice) {
		// Using Java Stream range() for distinct array and binarySearch to locate the rank
//		int[] array = java.util.stream.IntStream.range(0,n).map(i -> scores[n - i - 1]).distinct().toArray();
//	    int index = 0;
//	    for(int score: alice) {
//	        index = java.util.Arrays.binarySearch(array, index<0 ? 0 : index, array.length, score);
//			if (index < 0) {
//				index = -index - 2;
//			}
//	        System.out.println(array.length - index);
//	    }
		
		// Using ArrayUtils.binarySearch() to locate the rank
//		int[] rank = new int[n];
//        rank[0] = 1;
//        for(int i = 1; i < n; i++){
//            if(scores[i] < scores[i - 1]){
//                rank[i] = rank[i - 1] + 1;
//            }else{
//                rank[i] = rank[i - 1];
//            }
//        }
//        int start = 0,end = n - 1;
//        int ind;
//        for(int i = 0; i < m; i++){
//            ind = ArrayUtils.binarySearch(scores, start, end, alice[i]);
//            if(ind == -1){
//                System.out.println(rank[n - 1] + 1);
//            }else{
//                end = ind;
//                System.out.println(rank[ind]);
//            }
//        }
        
		int[] rank = new int[n];
		rank[0] = 1;
		for (int i = 1; i < n; i++) {
			if (scores[i] < scores[i - 1]) {
				rank[i] = rank[i - 1] + 1;
			} else {
				rank[i] = rank[i - 1];
			}
		}
		int k = n - 1;
		for (int i = 0; i < m; i++) {
			while (k >= 0 && alice[i] >= scores[k]) {
				k--;
			}
			if (k >= 0) {
				System.out.println(rank[k] + 1);
			} else {
				System.out.println(1);
			}
		}
	}
	
}
