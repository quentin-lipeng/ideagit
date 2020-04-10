package Tesk08;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		System.out.println("Task08-30602190218-黎冠鹏");
		HashMap<String,Server> server1 = new HashMap<>();
		server1.put("mysql", new Server("mysql", "F:/dbServer", 3306L,"5.5"));
		server1.put("tomcat", new Server("tomcat", "F:/webServer", 8080L,"7.0"));
		server1.put("apache", new Server("apache", "F:/webServer", 8088L,"8.0"));
		server1.put("nginx", new Server("nginx", "F:/webServer", 80L,"1.1.14"));
		
		//通过get()传入键集合的key遍历
		System.out.println("服务名 - 路径  - 端口 - 版本");
		for (String s : server1.keySet())
			System.out.println(s+" = "+server1.get(s));
		
//		server1.values().forEach(System.out::println);
		
//		server1.forEach((k,v)->System.out.println(k.toString()+" = "+v));

	}
}
