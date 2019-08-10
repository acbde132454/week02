package limei.news.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import limei.news.bean.NewsLink;
import limei.news.mapper.NewsLinkMapper;
import limei.news.service.NewsLinkService;

@Service("newsLinkService")
public class NewsLinkServiceImpl implements NewsLinkService {
	
	@Autowired
	private NewsLinkMapper newsLinkMapper;

	@Override
	public List<NewsLink> list() {
		return newsLinkMapper.list();
	}

}
