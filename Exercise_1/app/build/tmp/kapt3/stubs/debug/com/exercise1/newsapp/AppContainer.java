package com.exercise1.newsapp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/exercise1/newsapp/AppContainer;", "", "appContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "context", "kotlin.jvm.PlatformType", "database", "Lcom/exercise1/newsapp/data/local/SentimentDatabase;", "newsRepository", "Lcom/exercise1/newsapp/data/repository/NewsRepository;", "getNewsRepository", "()Lcom/exercise1/newsapp/data/repository/NewsRepository;", "sentimentAnalyzer", "Lcom/exercise1/newsapp/ml/SentimentAnalyzer;", "app_debug"})
public final class AppContainer {
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.exercise1.newsapp.data.local.SentimentDatabase database = null;
    @org.jetbrains.annotations.NotNull()
    private final com.exercise1.newsapp.ml.SentimentAnalyzer sentimentAnalyzer = null;
    @org.jetbrains.annotations.NotNull()
    private final com.exercise1.newsapp.data.repository.NewsRepository newsRepository = null;
    
    public AppContainer(@org.jetbrains.annotations.NotNull()
    android.content.Context appContext) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.exercise1.newsapp.data.repository.NewsRepository getNewsRepository() {
        return null;
    }
}