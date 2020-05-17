package task14;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class SplitTest3 {
	public static void main(String[] args) {
		String expretions = " 12+ 2 + 9 -10 / 5* 4  43+32   ";
		LinkedList<Character> chars = new LinkedList<>();//未处理字符
		LinkedList<String> words = new LinkedList<>();//分词后的字符串列表

		Integer flag = 0;//每次的标记 10代表数字	
		StringBuilder strB = new StringBuilder(8);//存储分词后的单个字符串

		for (char c : expretions.toCharArray())
			chars.add(c);

		Map<Integer, Map<Character, Integer>> ruleMap = new HashMap<>();//存入所有规则 0,10,20

		Map<Character, Integer> inputMap0 = new HashMap<>();//规则0
		inputMap0.put('\t', 0);
		inputMap0.put(' ', 0);
		inputMap0.put('+', 20);
		inputMap0.put('-', 20);
		inputMap0.put('*', 20);
		inputMap0.put('/', 20);
		for (char c = '0'; c <= '9'; c++)
			inputMap0.put(c, 10);
		ruleMap.put(0 , inputMap0);

		Map<Character, Integer> inputMap10 = new HashMap<>();//规则10

		inputMap10.put('\t', -1);
		inputMap10.put(' ', -1);
		inputMap10.put('+', -1);
		inputMap10.put('-', -1);
		inputMap10.put('*', -1);
		inputMap10.put('/', -1);

		for (char c = '0'; c <= '9'; c++)
			inputMap10.put(c, 10);
		
		ruleMap.put(10,inputMap10);
		
		Map<Character, Integer> inputMap20 = new HashMap<>();//规则20

		inputMap20.put('\t', -1);
		inputMap20.put(' ', -1);
		inputMap20.put('+', -1);
		inputMap20.put('-', -1);
		inputMap20.put('*', -1);
		inputMap20.put('/', -1);

		for (char c = '0'; c <= '9'; c++)
			inputMap20.put(c, -1);

		ruleMap.put(20, inputMap20);
		
		while (!chars.isEmpty()) {
			char c = chars.peek();
			try {
				Map<Character ,Integer> inputMap = ruleMap.get(flag);//规则总表中获取相应规则
				
				flag = inputMap.get(c);//获取相应规则中的相应规则代码
				if (flag == null) {
					throw new IndexOutOfBoundsException();
				} else if (flag == 10 ||flag == 20) {
					strB.append(c);//追加每次获取的单个字符属性
				}
			} catch (IndexOutOfBoundsException e) {
				throw new IllegalArgumentException("无效表达式");
			}
			if (flag == -1) {	//-1表示此字段结束 
				flag = 0;	// 初始化状态为0
				words.add(strB.toString());	// 该字段添加到words中
				strB.setLength(0);	// 清空字符串
			} else 
				chars.remove();
		}
		if (strB.length() > 0) 
			words.add(strB.toString());//分词后的字符串添加到字符串列表
		words.forEach(System.out::println);
	}
}
