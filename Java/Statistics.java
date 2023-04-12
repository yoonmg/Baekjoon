import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class Statistics{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int data = Integer.parseInt(br.readLine());
        int []arr = new int[data];
        for(int i=0;i<data;i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        bw.write(String.valueOf(mean(arr)));
        bw.newLine();
        bw.write(String.valueOf(median(arr)));
        bw.newLine();
        bw.write(String.valueOf(mode(arr)));
        bw.newLine();
        bw.write(String.valueOf(arr[data-1] - arr[0])); //범위
        bw.flush();
        bw.close();
        br.close();
    }

    public static int mode(int list[]) //최빈값
    {
        int []index = new int[8001];
        int max = Integer.MIN_VALUE;
        int count = 0;
        int res = 0;
        for(int i=0;i<list.length;i++)
        {
            index[list[i]+4000]++;
        }
        for(int j=0;j<index.length;j++)
        {
            if(max < index[j])
            {
                max = index[j];
            }
        }
        for(int k=0;k<index.length;k++)
        {
            if(max == index[k])
            {
                count++;
                res = k-4000;
            }
            if(count == 2)
            {
                break;
            }
        }
        return res;
    }

    public static int mean(int list[]) //평균값
    {
        int sum = 0;
        double avg = 0;
        for(int i=0;i<list.length;i++)
        {
            sum += list[i];
        }

        avg = sum / (double)list.length;

        return (int)(Math.round(avg));
    }

    public static int median(int list[]) //중앙값
    {
        return list[list.length/2];
    }
}