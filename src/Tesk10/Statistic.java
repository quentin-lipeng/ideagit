package Tesk10;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.HashSet;

import Tesk06.Student;

public class Statistic {
	public static void main(String[] args) {
		HashSet<Student> students = new HashSet<>(110);
		init(students);
		HashMap<String, Integer> fnames = new HashMap<>();
//		
		String fname;
		for (Student s : students) {
			fname = s.getName().substring(0, 1);
			if (fnames.containsKey(fname)) {
				int count = fnames.get(fname);
				count ++;
				fnames.put(fname, count);
			} else {
				fnames.put(fname, 1);
			}
		}
		fnames.forEach((k,v)->System.out.println(k.toString()+"="+v));

	}

	public static void init(HashSet<Student> stu) {
		stu.add(new Student(1001L, "卢俊义", null, null));
		stu.add(new Student(1002L, "吴用", null, null));
		stu.add(new Student(1003L, "公孙胜", null, null));
		stu.add(new Student(1004L, "关胜", null, null));
		stu.add(new Student(1005L, "林冲", null, null));
		stu.add(new Student(1006L, "秦明", null, null));
		stu.add(new Student(1007L, "呼延灼", null, null));
		stu.add(new Student(1008L, "花荣", null, null));
		stu.add(new Student(1009L, "柴进", null, null));
		stu.add(new Student(1010L, "李应", null, null));
		stu.add(new Student(1011L, "朱仝", null, null));
		stu.add(new Student(1012L, "鲁智深", null, null));
		stu.add(new Student(1013L, "武松", null, null));
		stu.add(new Student(1014L, "董平", null, null));
		stu.add(new Student(1015L, "张清", null, null));
		stu.add(new Student(1016L, "杨志", null, null));
		stu.add(new Student(1017L, "徐宁", null, null));
		stu.add(new Student(1018L, "索超", null, null));
		stu.add(new Student(1019L, "戴宗", null, null));
		stu.add(new Student(1020L, "刘唐", null, null));
		stu.add(new Student(1021L, "李逵", null, null));
		stu.add(new Student(1022L, "史进", null, null));
		stu.add(new Student(1023L, "穆弘", null, null));
		stu.add(new Student(1024L, "雷横", null, null));
		stu.add(new Student(1025L, "李俊", null, null));
		stu.add(new Student(1026L, "阮小二", null, null));
		stu.add(new Student(1027L, "张横", null, null));
		stu.add(new Student(1028L, "阮小五", null, null));
		stu.add(new Student(1029L, "张顺", null, null));
		stu.add(new Student(1030L, "阮小七", null, null));
		stu.add(new Student(1031L, "杨雄", null, null));
		stu.add(new Student(1032L, "石秀", null, null));
		stu.add(new Student(1033L, "解珍", null, null));
		stu.add(new Student(1034L, "解宝", null, null));
		stu.add(new Student(1035L, "燕青", null, null));
		stu.add(new Student(1036L, "朱武", null, null));
		stu.add(new Student(1037L, "黄信", null, null));
		stu.add(new Student(1038L, "孙立", null, null));
		stu.add(new Student(1039L, "宣赞", null, null));
		stu.add(new Student(1040L, "郝思文", null, null));
		stu.add(new Student(1041L, "韩滔", null, null));
		stu.add(new Student(1042L, "彭玘", null, null));
		stu.add(new Student(1043L, "单廷珪", null, null));
		stu.add(new Student(1044L, "魏定国", null, null));
		stu.add(new Student(1045L, "萧让", null, null));
		stu.add(new Student(1046L, "裴宣", null, null));
		stu.add(new Student(1047L, "欧鹏", null, null));
		stu.add(new Student(1048L, "邓飞", null, null));
		stu.add(new Student(1049L, "燕顺", null, null));
		stu.add(new Student(1050L, "杨林", null, null));
		stu.add(new Student(1051L, "凌振", null, null));
		stu.add(new Student(1052L, "蒋敬", null, null));
		stu.add(new Student(1053L, "吕方", null, null));
		stu.add(new Student(1054L, "郭盛", null, null));
		stu.add(new Student(1055L, "安道全", null, null));
		stu.add(new Student(1056L, "皇甫端", null, null));
		stu.add(new Student(1057L, "王英", null, null));
		stu.add(new Student(1058L, "扈三娘", null, null));
		stu.add(new Student(1059L, "鲍旭", null, null));
		stu.add(new Student(1060L, "樊瑞", null, null));
		stu.add(new Student(1061L, "孔明", null, null));
		stu.add(new Student(1062L, "孔亮", null, null));
		stu.add(new Student(1063L, "项充", null, null));
		stu.add(new Student(1064L, "李衮", null, null));
		stu.add(new Student(1065L, "金大坚", null, null));
		stu.add(new Student(1066L, "马麟", null, null));
		stu.add(new Student(1067L, "童威", null, null));
		stu.add(new Student(1068L, "童猛", null, null));
		stu.add(new Student(1069L, "孟康", null, null));
		stu.add(new Student(1070L, "侯健", null, null));
		stu.add(new Student(1071L, "陈达", null, null));
		stu.add(new Student(1072L, "杨春", null, null));
		stu.add(new Student(1073L, "郑天寿", null, null));
		stu.add(new Student(1074L, "陶宗旺", null, null));
		stu.add(new Student(1075L, "宋清", null, null));
		stu.add(new Student(1076L, "乐和", null, null));
		stu.add(new Student(1077L, "龚旺", null, null));
		stu.add(new Student(1078L, "丁得孙", null, null));
		stu.add(new Student(1079L, "穆春", null, null));
		stu.add(new Student(1080L, "曹正", null, null));
		stu.add(new Student(1081L, "宋万", null, null));
		stu.add(new Student(1082L, "杜迁", null, null));
		stu.add(new Student(1083L, "薛永", null, null));
		stu.add(new Student(1084L, "施恩", null, null));
		stu.add(new Student(1085L, "李忠", null, null));
		stu.add(new Student(1086L, "周通", null, null));
		stu.add(new Student(1087L, "汤隆", null, null));
		stu.add(new Student(1088L, "杜兴", null, null));
		stu.add(new Student(1089L, "邹渊", null, null));
		stu.add(new Student(1090L, "邹润", null, null));
		stu.add(new Student(1091L, "朱贵", null, null));
		stu.add(new Student(1092L, "朱富", null, null));
		stu.add(new Student(1093L, "蔡福", null, null));
		stu.add(new Student(1094L, "蔡庆", null, null));
		stu.add(new Student(1095L, "李立", null, null));
		stu.add(new Student(1096L, "李云", null, null));
		stu.add(new Student(1097L, "焦挺", null, null));
		stu.add(new Student(1098L, "石勇", null, null));
		stu.add(new Student(1099L, "孙新", null, null));
		stu.add(new Student(1100L, "顾大嫂", null, null));
		stu.add(new Student(1101L, "张青", null, null));
		stu.add(new Student(1102L, "孙二娘", null, null));
		stu.add(new Student(1103L, "王定六", null, null));
		stu.add(new Student(1104L, "郁保四", null, null));
		stu.add(new Student(1105L, "白胜", null, null));
		stu.add(new Student(1106L, "时迁", null, null));
		stu.add(new Student(1107L, "段景住", null, null));
		stu.add(new Student(1108L, "松江", null, null));
	}
}
