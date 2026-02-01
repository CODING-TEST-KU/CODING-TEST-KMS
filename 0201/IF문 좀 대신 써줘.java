import java.util.*;
import java.io.*;

class Main {
    private static String[] names;
    private static int[] powers;

    public static void main(String[] args)throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        names = new String[N];
        powers = new int[N];


        for(int i=0;i<N;i++){
            st= new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int power = Integer.parseInt(st.nextToken());

            names[i] = name;
            powers[i] = power;
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<M;i++){
            int power = Integer.parseInt(br.readLine());

            int index = binarySearch(power);
            sb.append(names[index]+"\n");
        }

        System.out.println(sb.toString());
    }

    private static int binarySearch(int power){
        int start =0;
        int end = names.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(powers[mid]>=power){
                end  = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return start;
    }


}
