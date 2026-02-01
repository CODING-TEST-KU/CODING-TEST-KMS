import java.util.*;
import java.io.*;


class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb= new StringBuilder();

        for(int test=0;test<T;test++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            HashMap<String,Integer> map = new HashMap<>();

            int n = Integer.parseInt(st.nextToken()); //팀의 개수
            int k = Integer.parseInt(st.nextToken()); //문제의 개수
            int t = Integer.parseInt(st.nextToken()); //당신 팀의 id
            int m = Integer.parseInt(st.nextToken()); //로그 엔트리 개수

            int[] scores = new int[n+1];
            int[] counts = new int[n+1];
            int[] times = new int[n+1];

            for(int info=0;info<m;info++){
                st = new StringTokenizer(br.readLine());
                int i = Integer.parseInt(st.nextToken()); //팀 id
                int j = Integer.parseInt(st.nextToken()); //문제번호
                int s = Integer.parseInt(st.nextToken()); //획득점수

                String ij = String.valueOf(i+" " +j);
                counts[i]++;
                times[i]=info;

                // System.out.println("get : " + map.get(ij));

                if(map.containsKey(ij)){
                    if(map.get(ij)<s){
                        scores[i] = scores[i] - map.get(ij) + s;
                        map.put(ij,s);
                    }
                }else{
                    map.put(ij,s);
                    scores[i] += s;
                }
            }

            // for(int p=1;p<=n;p++){
            //   System.out.println("p : " +p+", score : " + scores[p] );
            // }


            int rank=1;
            for(int p=1;p<=n;p++){
                if(p==t) continue;
                if(scores[p]>scores[t]){
                    rank++;
                }else if(scores[p]==scores[t]){
                    // System.out.println("동점 : "+ scores[p] + ", p : " + p +" t : " + t);
                    if(counts[p]<counts[t]){
                        rank++;
                    }else if(counts[p]==counts[t]){
                        if(times[p]<times[t]){
                            rank++;
                        }
                    }
                }
            }
            sb.append(rank+"\n");

        }


        System.out.println(sb.toString());
    }

}

// 2
// 3 4 3 5
// 1 1 30


/**
 1
 3 4 3 5
 1 1 30
 2 3 30
 1 2 40
 1 2 20
 3 1 70
 **/