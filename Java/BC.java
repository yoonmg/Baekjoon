import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BC {

    public static int Factorial(int x)
    {
        if(x == 0)
        {
            return 1;
        }
        else
        {
            return x * Factorial(x - 1);
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        br.close();
        
        if(k == 0)
        {
            bw.write("1");
        }
        else if(k>n)
        {
            bw.write("0");
        }
        else
        {
            int res = Factorial(n) / (Factorial(k) * Factorial(n-k));
            bw.write(String.valueOf(res));
        }

        bw.flush();
        bw.close();
    }
}