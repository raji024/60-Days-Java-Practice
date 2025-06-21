import java.util.*;
public class Longest_paranthesis {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String s = sc.next();
       int f =0;
       Stack<Integer> n = new Stack<>();
       n.push(-1);
       for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                n.push(i);
            }else if(ch==')'){
               n.pop();
               if(n.isEmpty()){
                n.push(i);
               }else{
                 f = Math.max(f,i-n.peek());
               }
            }
       }
       System.out.println(f);
    }
}
