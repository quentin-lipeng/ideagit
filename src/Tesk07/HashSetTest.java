package Tesk07;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		 System.out.println("Task7 "+" 黎冠鹏" + "30602190218");
		 Set<Goods> hashSet = new HashSet<>();
		 
		 hashSet.add(new Goods(Goods.Seller.AL.getSeller(),"iPhone",1000));
		 hashSet.add(new Goods(Goods.Seller.AL.getSeller(),"iPhone",1000));
		 hashSet.add(new Goods(Goods.Seller.JI.getSeller(),"iPhone",1000));
		 hashSet.add(new Goods(Goods.Seller.AL.getSeller(),"Mac",2000));
		 print(hashSet);
	}
	
	public static void print(Set<Goods> set) {
		System.out.println("商品数量: "+set.size());
		set.forEach(System.out::println);
	}

}
