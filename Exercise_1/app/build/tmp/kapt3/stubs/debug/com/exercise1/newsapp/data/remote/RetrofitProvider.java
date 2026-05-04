package com.exercise1.newsapp.data.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/exercise1/newsapp/data/remote/RetrofitProvider;", "", "()V", "BASE_URL", "", "client", "Lokhttp3/OkHttpClient;", "moshi", "Lcom/squareup/moshi/Moshi;", "newsApi", "Lcom/exercise1/newsapp/data/remote/NewsApiService;", "getNewsApi", "()Lcom/exercise1/newsapp/data/remote/NewsApiService;", "retrofit", "Lretrofit2/Retrofit;", "app_debug"})
public final class RetrofitProvider {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String BASE_URL = "https://newsapi.org/";
    @org.jetbrains.annotations.NotNull()
    private static final com.squareup.moshi.Moshi moshi = null;
    @org.jetbrains.annotations.NotNull()
    private static final okhttp3.OkHttpClient client = null;
    @org.jetbrains.annotations.NotNull()
    private static final retrofit2.Retrofit retrofit = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.exercise1.newsapp.data.remote.NewsApiService newsApi = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.exercise1.newsapp.data.remote.RetrofitProvider INSTANCE = null;
    
    private RetrofitProvider() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.exercise1.newsapp.data.remote.NewsApiService getNewsApi() {
        return null;
    }
}