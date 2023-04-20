import java.io.*;
import java.util.*;

class Postfix_Notation{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Double> stack = new Stack<>();

        double res = 0;

        int data = Integer.parseInt(br.readLine());
        String str = br.readLine();
        double []arr = new double[26];

        for(int i=0;i<data;i++)
        {
            double num = Double.parseDouble(br.readLine());   //배열에 숫자 넣기
            arr[i] = num;
        }

        for(int i=0; i<str.length(); i++)
        {
            char c = str.charAt(i);
            if(c >= 'A' && c <= 'Z')
            {
                stack.push(arr[c-'A']);      //알파벳이면 알파벳을 A로 뺴고 push()하기 ex) c=A arr[0]
            }
            else
            {
                if(stack.size() >= 2)
                {
                    double a = stack.pop();
                    double b = stack.pop();         //스택의 크기가 2이상이면 pop()해서 사칙연산하기
                    if(str.charAt(i) == '+')
                    {
                        res = a + b;
                    }
                    else if(str.charAt(i) == '-')
                    {
                        res = b - a;
                    }
                    else if(str.charAt(i) == '/')
                    {
                        res = b / a;
                    }
                    else if(str.charAt(i) == '*')
                    {
                        res = a * b;
                    }
                    stack.push(res);
                }
            }
        }

        br.close();

        bw.write(String.format("%.2f",stack.pop()));
        bw.flush();
        bw.close();
    }   
}