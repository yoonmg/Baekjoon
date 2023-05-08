import java.io.*;
import java.util.*;

public class Deque {
    static final int SIZE = 10001;
    public static int[] arr = new int[SIZE]; 
    public static int f = 0;
    public static int r = 0;
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

            if(message.equals("push_front"))
            {
                num = Integer.parseInt(st.nextToken());
                push_front(num);
            }
            else if(message.equals("push_back"))
            {
                num = Integer.parseInt(st.nextToken());
                push_back(num);
            }
            else if(message.equals("pop_front"))
            {
                bw.write(String.valueOf(pop_front()));
                bw.newLine();
            }
            else if(message.equals("pop_back"))
            {
                bw.write(String.valueOf(pop_back()));
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
        bw.close();
        br.close();
    }

    public static void push_front(int x)
    {
        arr[f] = x;
        f = (f - 1 + SIZE) % SIZE;
    }

    public static void push_back(int x)
    {
        r = (r + 1) % SIZE;
        arr[r] = x;
    }

    public static int pop_front()
    {
        if(f == r)
        {
            return -1;
        }
        else
        {
            f = (f + 1) % SIZE;
            return arr[f];
        }
    }

    public static int pop_back()
    {
        if(f == r)
        {
            return -1;
        }
        else
        {
            int a = r;
            r = (r - 1 + SIZE) % SIZE;
            return arr[a];
        }
    }

    public static int size()
    {
        return (r - f + SIZE) % SIZE;
    }

    public static int empty()
    {
        return (f==r?1:0);
    }

    public static int front()
    {
        return (f==r?-1:arr[(f+1)%SIZE]);
    }

    public static int back()
    {
        return (f==r?-1:arr[r]);
    }
}
