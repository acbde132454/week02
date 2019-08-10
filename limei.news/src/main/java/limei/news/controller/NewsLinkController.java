package limei.news.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import limei.news.bean.NewsLink;
import limei.news.service.NewsLinkService;
import limei.news.util.PageHelpUtil;

@Controller
public class NewsLinkController {

	@Autowired
	private NewsLinkService newsLinkService;
	
	private int pageSize = 3;
	@RequestMapping("list")
	public String list(Model model,@RequestParam(defaultValue="1")
	int page,String name){
		PageHelper.startPage(page,pageSize);
		List<NewsLink> list = newsLinkService.list();
		PageInfo<NewsLink> pageInfo = new PageInfo<>(list);
		model.addAttribute("list", list);
		
		Map<String,Object> params = new HashMap<>();
		params.put("name", name);
		//分页页码信息
		String pInfo = PageHelpUtil.page("list", pageInfo, params);
		model.addAttribute("pInfo", pInfo);
		return "index";
	}
}
