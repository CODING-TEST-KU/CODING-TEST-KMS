import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int countZero = 0;
        int countOne = 0;
        ArrayList<String> list= new ArrayList<>();

        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(c=='0'){
                list.add("0");
                countZero++;
            }else{
                list.add("1");
                countOne++;
            }
        }

        for(int i=0;i<countOne/2;i++){
            for(int j=0;j<list.size();j++){
                if(list.get(j)=="1"){
                    list.remove(j);
                    break;
                }
            }
            // System.out.println("결과");
            // for(int k=0;k<list.size();k++){
            //   System.out.print(list.get(k));
            // }
            // System.out.println();
        }

        for(int i=0;i<countZero/2;i++){
            for(int j=list.size()-1;j>=0;j--){
                if(list.get(j)=="0"){
                    list.remove(j);
                    break;
                }
            }


        }

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }



    }
}
