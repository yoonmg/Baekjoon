import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class DP {
    private static int [][]dp = new int [31][31];
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int data = Integer.parseInt(br.readLine());

        for(int i=0;i<data;i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            
            System.out.println(combination(m,n));
        }

        br.close();
    }
    public static int combination(int x, int y)
    {
        if(y == 0 || x == y)
        {
            return 1;
        }

        if(dp[x][y]>0)
        {
            return dp[x][y];        //saving the value and reusing it 
        }
        else
        {
            dp[x][y] = combination(x-1,y-1) + combination(x-1,y);  //if there is not the previous calculated value, then recursively calculate the value
            return dp[x][y];
        }
    }
}