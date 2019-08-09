package zhaoxin.common;

import java.util.List;
import java.util.Map;

public class CollectionUtil {

	//方法1：判断List或Set集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	public boolean notEmpty(List<String> list){
	    //实现代码
		return list.isEmpty();
	}
	
	//方法2：判断Map集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	public boolean notEmpty(Map<String,String> map){
	    //实现代码
		return map.isEmpty();
	}
}
