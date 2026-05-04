package com.exercise1.newsapp.data.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001JB\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\n\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/exercise1/newsapp/data/remote/NewsApiService;", "", "topHeadlines", "Lcom/exercise1/newsapp/data/model/NewsResponse;", "country", "", "page", "", "pageSize", "query", "apiKey", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface NewsApiService {
    
    @retrofit2.http.GET(value = "v2/top-headlines")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object topHeadlines(@retrofit2.http.Query(value = "country")
    @org.jetbrains.annotations.NotNull()
    java.lang.String country, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "pageSize")
    int pageSize, @retrofit2.http.Query(value = "q")
    @org.jetbrains.annotations.Nullable()
    java.lang.String query, @retrofit2.http.Query(value = "apiKey")
    @org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.exercise1.newsapp.data.model.NewsResponse> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}