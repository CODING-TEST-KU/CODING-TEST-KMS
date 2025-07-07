// 실버5
// https://www.acmicpc.net/problem/11651
// 정렬

//2차원 배열 정렬 연습하기 좋은듯. Arrays.sort를 이용하여 정렬 조건이 여러개 일때 어떤 기준으로 정렬할지 직접 구현해보기 좋음.

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] coor = new int[N][2];

        for(int i = 0 ; i<N;i++){
            String[] input = br.readLine().split(" ");
            coor[i][0] = Integer.parseInt(input[0]);
            coor[i][1] = Integer.parseInt(input[1]);
        }

        Arrays.sort(coor, (e1,e2) -> {
            if(e1[1]==e2[1]){
                return e1[0]-e2[0];
            }else{
                return e1[1]-e2[1];
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<N; i++){
            sb.append(coor[i][0]);
            sb.append(" ");
            sb.append(coor[i][1]);
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

}
