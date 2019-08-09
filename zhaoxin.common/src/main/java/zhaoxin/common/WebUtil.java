package zhaoxin.common;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class WebUtil {

	//方法1：获取url上的参数，返回字符串值类型，如果没有该参数则返回默认值
	public static String getString(HttpServletRequest request, String name, String defaultValue){
	    //实现代码request.getRequestURI()
		String requestURL = "localhost:8080/list?name=zhangsan";
		//localhost:8080/list?name=zhangsan
		String result = requestURL.substring(requestURL.lastIndexOf("=")+1);
		if(result instanceof String){
			return result;
		}
		return defaultValue;
	}
	
	//方法2：获取url上的参数，返回整数类型，如果没有该参数或该参数不是整形值，则返回默认值
	public int getInt(HttpServletRequest request,String name, int defaultValue ){
	    //实现代码
		String requestURL = "localhost:8080/list?age=100";
		String result = requestURL.substring(requestURL.lastIndexOf("=")+1);
		Integer parseInt = Integer.parseInt(result);
		if(requestURL.indexOf(name) == -1 || !(parseInt instanceof Integer)){
			return defaultValue;
		}
		return 0;
	}
	
	//方法4：获取当前请求地址，注意参数不能丢 
	public String getUrl(HttpServletRequest request){
	    //实现代码
		return request.getRequestURI();
	}
	
	//方法5：给定一个Cookie名获得取Cookie值 
	public String getCookieValue(Cookie cookie){
	    //实现代码
		return cookie.getValue();
	}
}
