package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step2525 {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
 
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
 
        int C = Integer.parseInt(in.readLine());
 
        int min = 60 * A + B;   // 시 -> 분
        min += C;
 
        int hour = (min / 60) % 24;
        int minute = min % 60;
 
        System.out.println(hour + " " + minute);
 
    }
}


