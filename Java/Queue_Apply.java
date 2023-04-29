import java.io.*;

class Queue_Apply{
    public static int f = -1;
    public static int r = -1;
    public static int []arr = new int[1000001];
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int data = Integer.parseInt(br.readLine());

        for(int i=1;i<=data;i++)
        {
            push(i);
        }
        if(data == 1)
        {
            bw.write(String.valueOf(arr[r]));
            bw.flush();
        }
        else
        {
            while(true)
            {
                remove();
                if(f == r) break;
                insert(pop());
            }
            bw.write(String.valueOf(arr[r]));
            bw.flush();
        }
        br.close();
        bw.close();
    }   

    public static void push(int x)
    {
        arr[++r] = x;
    }

    public static int pop()
    {
        int x = arr[++f];
        return x;
    }

    public static void insert(int x)
    {
        arr[++r] = x;
    }

    public static void remove()
    {
        ++f;
    }
}