package solution_D3_1213;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution_D3_1213_String {
	
	public static void main(String[] args) throws Exception {
		//System.setIn(new FileInputStream("1213_input.txt"));
		// bufferedReader �ӵ� ������ �������ִ� ������Ʈ��, inputSteamReader �� ��Ʈ��
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		// ����� �� ���� ����ϱ� ���� StringBuilder ���� -> �Ѱ��� ����ϸ� �ӵ����� ������ ��ħ.
		StringBuilder sb = new StringBuilder();
		
		String T;
		
		while ((T = in.readLine()) != null) {
			sb.append("#" + T + " ");
			String search = in.readLine();
			String line = in.readLine();
			line = " " + line + " ";
			String[] split = line.split(search);
			sb.append(split.length - 1).append("\n");
        }
		
		System.out.println(sb);
	}
}
