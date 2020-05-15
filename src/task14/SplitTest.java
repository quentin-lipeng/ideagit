package task14;

import java.util.LinkedList;

public class SplitTest {
	public static void main(String[] args) {
		String expretions = "12+ 2 + 9 -10 / 54  43+32   ";
		LinkedList<Character> chars = new LinkedList<>();
		LinkedList<String> words = new LinkedList<>();

		for (char c : expretions.toCharArray())
			chars.add(c);

		int flag = 0;
		StringBuilder strB = new StringBuilder(8);

		while (!chars.isEmpty()) {
			char c = chars.peek();

			if (flag == 0 && (c == ' ' || c == '\t')) {
				//遇到空白 即初始状态 0
				flag = 0;
			} else if (flag == 0 && (c >= '0' && c <= '9')) {
				//遇到数字 状态为10
				flag = 10;
				strB.append(c);
			} else if (flag == 0 && (c == '+' || c == '-' || c == '*' || c == '/')) {
				//遇到运算符 状态为 20
				flag = 20;
				strB.append(c);
			} else if (flag == 10 && (c == ' ' || c == '\t')) {
				//数遇到空白 为终止状态 -1
				flag = -1;
			} else if (flag == 10 && (c >= '0' && c <= '9')) {
				//数遇到数还为 数状态 10
				flag = 10;
				strB.append(c);
			} else if (flag == 10 && (c == '+' || c == '-' || c == '*' || c == '/')) {
				//数遇到数值为终止状态-1
				flag = -1;
			} else if (flag == 20) {
				//运算符遇到任何符号 终止状态-1
				flag = -1;
			} else {
				throw new IllegalArgumentException("无效表达式");
			}
			//-1代表该字段结束  
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
