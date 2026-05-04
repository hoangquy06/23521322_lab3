package com.exercise1.newsapp.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0010\u0011B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/exercise1/newsapp/ui/NewsPagingAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/exercise1/newsapp/data/model/Article;", "Lcom/exercise1/newsapp/ui/NewsPagingAdapter$ArticleViewHolder;", "onArticleClick", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ArticleViewHolder", "Companion", "app_debug"})
public final class NewsPagingAdapter extends androidx.paging.PagingDataAdapter<com.exercise1.newsapp.data.model.Article, com.exercise1.newsapp.ui.NewsPagingAdapter.ArticleViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.exercise1.newsapp.data.model.Article, kotlin.Unit> onArticleClick = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.exercise1.newsapp.data.model.Article> DIFF = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.exercise1.newsapp.ui.NewsPagingAdapter.Companion Companion = null;
    
    public NewsPagingAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.exercise1.newsapp.data.model.Article, kotlin.Unit> onArticleClick) {
        super(null, null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.exercise1.newsapp.ui.NewsPagingAdapter.ArticleViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.exercise1.newsapp.ui.NewsPagingAdapter.ArticleViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/exercise1/newsapp/ui/NewsPagingAdapter$ArticleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/exercise1/newsapp/databinding/ItemArticleBinding;", "(Lcom/exercise1/newsapp/databinding/ItemArticleBinding;)V", "defaultTitleColor", "", "bind", "", "item", "Lcom/exercise1/newsapp/data/model/Article;", "onClick", "Lkotlin/Function1;", "app_debug"})
    public static final class ArticleViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.exercise1.newsapp.databinding.ItemArticleBinding binding = null;
        private final int defaultTitleColor = 0;
        
        public ArticleViewHolder(@org.jetbrains.annotations.NotNull()
        com.exercise1.newsapp.databinding.ItemArticleBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.exercise1.newsapp.data.model.Article item, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.exercise1.newsapp.data.model.Article, kotlin.Unit> onClick) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/exercise1/newsapp/ui/NewsPagingAdapter$Companion;", "", "()V", "DIFF", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/exercise1/newsapp/data/model/Article;", "getDIFF", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.exercise1.newsapp.data.model.Article> getDIFF() {
            return null;
        }
    }
}