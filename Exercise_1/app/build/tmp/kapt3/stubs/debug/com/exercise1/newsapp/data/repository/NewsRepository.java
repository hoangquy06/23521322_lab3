package com.exercise1.newsapp.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ2\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/exercise1/newsapp/data/repository/NewsRepository;", "", "newsApi", "Lcom/exercise1/newsapp/data/remote/NewsApiService;", "sentimentAnalyzer", "Lcom/exercise1/newsapp/ml/SentimentAnalyzer;", "sentimentHistoryDao", "Lcom/exercise1/newsapp/data/local/SentimentHistoryDao;", "(Lcom/exercise1/newsapp/data/remote/NewsApiService;Lcom/exercise1/newsapp/ml/SentimentAnalyzer;Lcom/exercise1/newsapp/data/local/SentimentHistoryDao;)V", "pagedTopHeadlines", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/exercise1/newsapp/data/model/Article;", "country", "", "query", "pageSize", "", "app_debug"})
public final class NewsRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.exercise1.newsapp.data.remote.NewsApiService newsApi = null;
    @org.jetbrains.annotations.NotNull()
    private final com.exercise1.newsapp.ml.SentimentAnalyzer sentimentAnalyzer = null;
    @org.jetbrains.annotations.NotNull()
    private final com.exercise1.newsapp.data.local.SentimentHistoryDao sentimentHistoryDao = null;
    
    public NewsRepository(@org.jetbrains.annotations.NotNull()
    com.exercise1.newsapp.data.remote.NewsApiService newsApi, @org.jetbrains.annotations.NotNull()
    com.exercise1.newsapp.ml.SentimentAnalyzer sentimentAnalyzer, @org.jetbrains.annotations.NotNull()
    com.exercise1.newsapp.data.local.SentimentHistoryDao sentimentHistoryDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.exercise1.newsapp.data.model.Article>> pagedTopHeadlines(@org.jetbrains.annotations.NotNull()
    java.lang.String country, @org.jetbrains.annotations.Nullable()
    java.lang.String query, int pageSize) {
        return null;
    }
}