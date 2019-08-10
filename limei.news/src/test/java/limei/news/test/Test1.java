package limei.news.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import limei.news.bean.NewsLink;
import limei.news.mapper.NewsLinkMapper;
import limei.news.util.CommonUtil;
import limei.news.util.DateUtil;

public class Test1 {

	@Test
	public void add(){
		String url = "http://news.cnstock.com/news,yw-2019/08/10-4413224.htm";
		String[] result = url.split("-");
		String time = result[1];
		int score = CommonUtil.getPlaceHolder(result[2], "[^0-9]");
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		NewsLinkMapper newsLinkMapper = context.getBean(NewsLinkMapper.class);
		NewsLink newsLink = new NewsLink();
		//把上面截取的值存到对象属性中
		newsLink.setScore(score);
		newsLink.setCreated(DateUtil.stringToDate(time, "yyyy/MM/dd"));
		newsLinkMapper.add(newsLink);
	}
}
