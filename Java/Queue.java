import java.io.*;
import java.util.*;

class Main{
    public static int f = -1;
    public static int r = -1;
    public static int []arr = new int[2000001];
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int data = Integer.parseInt(br.readLine());
        int num;

        for(int i=0;i<data;i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String message = st.nextToken();

            if(message.equals("push"))
            {
                num = Integer.parseInt(st.nextToken());
                push(num);
            }
            else if(message.equals("pop"))
            {
                bw.write(String.valueOf(pop()));
                bw.newLine();
            }
            else if(message.equals("size"))
            {
                bw.write(String.valueOf(size()));
                bw.newLine();
            }
            else if(message.equals("empty"))
            {
                bw.write(String.valueOf(empty()));
                bw.newLine();
            }
            else if(message.equals("front"))
            {
                bw.write(String.valueOf(front()));
                bw.newLine();
            }
            else if(message.equals("back"))
            {
                bw.write(String.valueOf(back()));
                bw.newLine();
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }   

    public static void push(int x)
    {
        arr[++r] = x;
    }

    public static int pop()
    {
        return (f==r?-1:arr[++f]);
    }

    public static int size()
    {
        return (f==r?0:r-f);
    }

    public static int empty()
    {
        return (f==r?1:0);
    }

    public static int front()
    {
        return (f==r?-1:arr[f+1]);
    }

    public static int back()
    {
        return (f==r?-1:arr[r]);
    }
}