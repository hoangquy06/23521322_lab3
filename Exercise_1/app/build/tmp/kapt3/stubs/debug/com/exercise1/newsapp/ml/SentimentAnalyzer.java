package com.exercise1.newsapp.ml;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u0010\u0015\u001a\u00020\bH\u0082@\u00a2\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u0014H\u0082@\u00a2\u0006\u0002\u0010\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0002R\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/exercise1/newsapp/ml/SentimentAnalyzer;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "appContext", "kotlin.jvm.PlatformType", "classifier", "Lorg/tensorflow/lite/task/text/nlclassifier/NLClassifier;", "client", "Lokhttp3/OkHttpClient;", "initMutex", "Lkotlinx/coroutines/sync/Mutex;", "analyze", "Lcom/exercise1/newsapp/ml/SentimentResult;", "text", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createClassifier", "modelFile", "Ljava/io/File;", "ensureClassifier", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ensureModelDownloaded", "Companion", "app_debug"})
public final class SentimentAnalyzer {
    private final android.content.Context appContext = null;
    @org.jetbrains.annotations.NotNull()
    private final okhttp3.OkHttpClient client = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.sync.Mutex initMutex = null;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private volatile org.tensorflow.lite.task.text.nlclassifier.NLClassifier classifier;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MODEL_URL = "https://storage.googleapis.com/download.tensorflow.org/models/tflite/text_classification/text_classification_v2.tflite";
    @org.jetbrains.annotations.NotNull()
    public static final com.exercise1.newsapp.ml.SentimentAnalyzer.Companion Companion = null;
    
    public SentimentAnalyzer(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    private final java.io.File modelFile() {
        return null;
    }
    
    private final java.lang.Object ensureModelDownloaded(kotlin.coroutines.Continuation<? super java.io.File> $completion) {
        return null;
    }
    
    private final java.lang.Object ensureClassifier(kotlin.coroutines.Continuation<? super org.tensorflow.lite.task.text.nlclassifier.NLClassifier> $completion) {
        return null;
    }
    
    private final org.tensorflow.lite.task.text.nlclassifier.NLClassifier createClassifier(java.io.File modelFile) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object analyze(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.exercise1.newsapp.ml.SentimentResult> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/exercise1/newsapp/ml/SentimentAnalyzer$Companion;", "", "()V", "MODEL_URL", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}