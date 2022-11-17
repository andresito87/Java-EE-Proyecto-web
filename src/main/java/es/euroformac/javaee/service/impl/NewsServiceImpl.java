package es.euroformac.javaee.service.impl;

import java.util.List;

import es.euroformac.javaee.model.News;
import es.euroformac.javaee.service.NewsService;
import launch.Main;

public class NewsServiceImpl implements NewsService {

    @Override
    public List<News> getNews() {
        return Main.NEWS_LIST;
    }

    @Override
    public News getNewsById(long id) {
        return Main.NEWS_LIST.stream().filter(news -> news.getId() == id).findAny().get();
    }
}
