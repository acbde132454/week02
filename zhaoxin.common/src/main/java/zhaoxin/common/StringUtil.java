package zhaoxin.common;

public class StringUtil {

	//方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 
	public boolean hasLength(String src){
	    if(!src.equals("")&& src != null){
	    	return false;
	    }
	    return true;
	}
	
	//方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值
	public boolean hasText(String src){
		 if(!src.equals(" ")&& src != null && !src.equals("")){
		    	return false;
		    }
		    return true;
	}
	
	//方法3：判断是否为手机号码
	public boolean isMobile(String src){
	    //实现代码
		String regex = "^1([38]\\d|5[0-35-9]|7[3678])\\d{8}$";
		return src.matches(regex);
	}
	
	
	//方法4：判断是否为邮箱
	public boolean isEmail(String src){
	    //实现代码
		String regex = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$";
		return src.matches(regex);
	}
	
	//方法5：反转字符串，例如参数值是“abcdefg”，则输出“gfedcba” (5分)
	public String reverse(String src){
	    return new StringBuffer(src).reverse().toString();
	}
}
