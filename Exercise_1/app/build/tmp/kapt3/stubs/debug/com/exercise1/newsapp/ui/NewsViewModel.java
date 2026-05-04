package com.exercise1.newsapp.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/exercise1/newsapp/ui/NewsViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/exercise1/newsapp/data/repository/NewsRepository;", "(Lcom/exercise1/newsapp/data/repository/NewsRepository;)V", "articles", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/exercise1/newsapp/data/model/Article;", "getArticles", "()Lkotlinx/coroutines/flow/Flow;", "positiveOnly", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "setPositiveOnly", "", "value", "app_debug"})
public final class NewsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.exercise1.newsapp.data.repository.NewsRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> positiveOnly = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.exercise1.newsapp.data.model.Article>> articles = null;
    
    public NewsViewModel(@org.jetbrains.annotations.NotNull()
    com.exercise1.newsapp.data.repository.NewsRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.exercise1.newsapp.data.model.Article>> getArticles() {
        return null;
    }
    
    public final void setPositiveOnly(boolean value) {
    }
}