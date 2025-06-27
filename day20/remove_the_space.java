package day20;
import java.util.*;
public class remove_the_space {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        StringBuilder n = new StringBuilder();
        String b[] = a.split("\\s+");
        for(int i=0;i<b.length;i++){
            String r = b[i];
            String p ="";
            for(int j=0;j<r.length();j++){
                char ch = r.charAt(j);
                if(j==0){
                    ch =(char)(ch-32);
                }
                p+=ch;

            }
            n.append(p);


        }
        System.out.println(n.toString());


    }
}
