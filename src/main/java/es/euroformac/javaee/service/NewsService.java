package es.euroformac.javaee.service;

import java.util.List;

import es.euroformac.javaee.model.News;

public interface NewsService {

    List<News> getNews();

    News getNewsById(long id);
}
