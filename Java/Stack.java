import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Stack{
    public static int []arr = new int[100];
    public static int a = -1;
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        int num;
        String message;

        for(int i=0;i<input;i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            message = st.nextToken();

            if(message.equals("push"))
            {
                num = Integer.parseInt(st.nextToken());
                push(num);
                bw.flush();
            }
            else if(message.equals("pop"))
            {
                bw.write(String.valueOf(pop()));
                bw.newLine();
                bw.flush();
            }
            else if(message.equals("size"))
            {
                bw.write(String.valueOf(size()));
                bw.newLine();
                bw.flush();
            }
            else if(message.equals("empty"))
            {
                bw.write(String.valueOf(empty()));
                bw.newLine();
                bw.flush();
            }
            else if(message.equals("top"))
            {
                bw.write(String.valueOf(top()));
                bw.newLine();
                bw.flush();
            }
        }

        br.close();
        bw.close();
    }

    public static void push(int x)
    {
        arr[++a] = x;
    }

    public static int pop()
    {
        if(a == -1)
        {
            return -1;
        }
        else
        {
            return arr[a--]; 
        }
    }

    public static int size()
    {
        return a+1;
    }

    public static int empty()
    {
        if(a == -1)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static int top()
    {
        if(a == -1)
        {
            return -1;
        }
        else
        {
            return arr[a];
        }
    }
}