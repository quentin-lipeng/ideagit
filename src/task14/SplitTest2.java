package task14;

import java.util.LinkedList;

public class SplitTest2 {
	public static void main(String[] args) {
		String expretions = " 12+ 2 + 9 -10 / 54  43+32   ";
		LinkedList<Character> chars = new LinkedList<>();
		LinkedList<String> words = new LinkedList<>();

		for (char c : expretions.toCharArray())
			chars.add(c);

		int flag = 0;
		StringBuilder strB = new StringBuilder(8);
		
		int $ = -2;
		int[][] rule = {
				{$ ,$ ,$ ,$ ,$ ,$ ,$ ,$ ,
				$ ,0 ,$ ,$ ,$ ,$ ,$ ,$ ,
				$ ,$ ,$ ,$ ,$ ,$ ,$ ,$ ,
				$ ,$ ,$ ,$ ,$ ,$ ,$ ,$ ,
				0 ,$ ,$ ,$ ,$ ,$ ,$ ,$ ,
				$ ,$ ,20 ,20 ,$ ,20 ,$ ,20 ,
				10 ,10 ,10 ,10 ,10 ,10 ,10 ,10 ,
				10 ,10 ,$ ,$ ,$ ,$ ,$ ,$ },
				
				{}, {}, {}, {}, {}, {}, {}, {}, {},
				
				{$ ,$ ,$ ,$ ,$ ,$ ,$ ,$ ,
				$ ,-1 ,$ ,$ ,$ ,$ ,$ ,$ ,
				$ ,$ ,$ ,$ ,$ ,$ ,$ ,$ ,
				$ ,$ ,$ ,$ ,$ ,$ ,$ ,$ ,
				-1,$ ,$ ,$ ,$ ,$ ,$ ,$ ,
				$ ,$ ,-1 ,-1 ,$ ,-1 ,$ ,-1 ,
				10 ,10 ,10 ,10 ,10 ,10 ,10 ,10 ,
				10 ,10 ,$ ,$ ,$ ,$ ,$ ,$},
				
				{}, {}, {}, {}, {}, {}, {}, {}, {},
				{$ ,$ ,$ ,$ ,$ ,$ ,$ ,$ ,
				$ ,-1 ,$ ,$ ,$ ,$ ,$ ,$ ,
				$ ,$ ,$ ,$ ,$ ,$ ,$ ,$ ,
				$ ,$ ,$ ,$ ,$ ,$ ,$ ,$ ,
				-1,$ ,$ ,$ ,$ ,$ ,$ ,$ ,
				$ ,$ ,-1 ,-1 ,$ ,-1 ,$ ,-1 ,
				-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,
				-1 ,-1 ,$ ,$ ,$ ,$ ,$ ,$ }
				};

		while (!chars.isEmpty()) {
			char c = chars.peek();
			try {
				flag = rule[flag][c];
				
				if (flag == 10 || flag == 20) {
					strB.append(c);
				} else if (flag == $) {
					throw new IndexOutOfBoundsException();
				}
			} catch (IndexOutOfBoundsException e ) {
				throw new IllegalArgumentException("无效表达式");
			}
			if (flag == -1) {
				//初始化状态为0
				flag = 0;
				//  该字段添加到words中 
				words.add(strB.toString());
				//清空字符串
				strB.setLength(0);
			} else {
				chars.remove();
			}
		}
		if (strB.length() > 0) {
			words.add(strB.toString());
		}
		words.forEach(System.out::println);
	}
}
