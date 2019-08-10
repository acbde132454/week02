package limei.news.mapper;

import java.util.List;

import limei.news.bean.NewsLink;

public interface NewsLinkMapper {

	void add(NewsLink newsLink);

	List<NewsLink> list();
}
