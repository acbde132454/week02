package limei.news.util;

import java.util.regex.Pattern;

public class CommonUtil {

	//判断字符串是否为数字
	public static boolean isNumber(String src){
		return Pattern.compile("\\d+").matcher(src).matches();
	}
	
	//判断源字符串是否有值，空引号(空白字符串)和空格也算没值
	public static boolean hasText(String src){
		 if(!src.equals(" ") || src != null || !src.equals("")){
		    	return true;
		    }
		    return false;
	}
	
	//根据url地址取出地址中的数字:"[^0-9]"
	public static int getPlaceHolder(String url,String regex){
		//第一种情况
		/*String result = url.substring(url.lastIndexOf("-")+1);
		String score = Pattern.compile(regex).matcher(result).replaceAll("");*/
		//第二种情况
		String score = Pattern.compile(regex).matcher(url).replaceAll("");
		return hasText(score) ? Integer.parseInt(score) : 0 ;
	}
	
}
