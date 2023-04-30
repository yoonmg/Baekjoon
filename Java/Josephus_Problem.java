import java.io.*;
import java.util.*;

class Josephus_Problem{
    public static int r = -1;
    public static int []arr = new int[1001];
    public static int []temp = new int[1001];
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for(int i=1;i<=n;i++)
        {
            push(i);
        }
        r = -1;

        for(int j=0;j<n;j++)
        {
            int a = 0;
            while(a < k)
            {
                ++r;
                if(r > arr.length - 1)
                {
                    r = 0;
                }
                if(arr[r] != 0)
                {
                    a++;
                }
            }
            temp[j] = arr[r];
            arr[r] = 0;
        }
        bw.write("<");
        for(int b=0;b<n;b++)
        {
            if(temp[b] == 0) break;
            bw.write(String.valueOf(temp[b]));
            if (b < n - 1 && temp[b + 1] != 0)
            {
                bw.write(", ");
            }
        }
        bw.write(">");
        br.close();
        bw.close();
    }   

    public static void push(int x)
    {
        arr[++r] = x;
    }
}