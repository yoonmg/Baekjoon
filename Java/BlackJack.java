import java.io.*;
import java.util.*;

public class BlackJack {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        
        int data = Integer.parseInt(st1.nextToken());  //카드의 개수
        int num = Integer.parseInt(st1.nextToken());   //넘으면 안되는 수(블랙잭같은 경우 21)

        int max = 0;
        int[] arr = new int[data];

        StringTokenizer st2 = new StringTokenizer(br.readLine());   //주어진 카드의 숫자들

        for(int a=0;a<arr.length;a++)
        {
            arr[a] = Integer.parseInt(st2.nextToken());
        }

        for(int i=0;i<data-2;i++)
        {
            for(int j=i+1;j<data-1;j++)
            {
                for(int k=j+1;k<data;k++)
                {
                    if(arr[i] + arr[j] + arr[k] <= num && arr[i] + arr[j] + arr[k] >= max)
                    {
                        max = arr[i] + arr[j] + arr[k];
                    }
                }
            }
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
        br.close();
    }
}
