import java.io.*;
import java.util.*;

class Stack_Apply{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int data = Integer.parseInt(br.readLine());
        Stack<Character>stack = new Stack<>();

        for(int i=0;i<data;i++)
        {
            String str = br.readLine();
            for(int j=0;j<str.length();j++)
            {
                char ch = str.charAt(j);
                if(ch == ')' && !stack.isEmpty() && stack.peek() == '(')   //스택에 '('가 있고 이후에 ')'가 들어오면 '(' pop()으로 삭제
                {
                    stack.pop();
                }
                else  //그렇지 않으면 push()로 데이터 입력
                {
                    stack.push(ch);
                }
            }
            if(stack.isEmpty())
            {
                bw.write("YES");
                bw.newLine();
                bw.flush();
            }
            else
            {
                bw.write("NO");
                bw.newLine();
                bw.flush();
            }
            stack.clear();  //스택 초기화 필수!!
        }
        bw.close();
        br.close();
    }   
}
