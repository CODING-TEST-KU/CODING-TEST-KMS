import java.util.*;
import java.io.*;

class Main {
    private static String[] names;
    private static int[] powers;

    public static void main(String[] args)throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();

        for(int i=0;i<N;i++){
            set.add(br.readLine());
        }

        for(int i=0;i<M;i++){
            String[] keywords = br.readLine().split(",");

            for(int j=0;j<keywords.length;j++){
                String keyword = keywords[j];
                if(set.contains(keyword)){
                    set.remove(keyword);
                }
            }
            sb.append(set.size()+"\n");
        }

        System.out.println(sb.toString());
    }
}
