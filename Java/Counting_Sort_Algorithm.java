import java.io.*;

class Counting_Sort_Algorithm{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int data = Integer.parseInt(br.readLine());

        int []arr = new int[10001];

        for(int i=0;i<data;i++)
        {
            arr[Integer.parseInt(br.readLine())]++;   //입력한 값을 배열의 인덱스로 취급하고 그 값을 1 증가
        }

        for(int j=0;j<arr.length;j++)
        {
            for(int k=0;k<arr[j];k++)
            {
                sb.append(j).append('\n');  //arr[j]의 값만큼 반복출력. 0이면 pass
            }
        }
        System.out.println(sb);
        br.close();
    }   
}