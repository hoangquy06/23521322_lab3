package com.exercise1.newsapp.data.local;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class SentimentHistoryDao_Impl implements SentimentHistoryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SentimentHistoryEntity> __insertionAdapterOfSentimentHistoryEntity;

  public SentimentHistoryDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSentimentHistoryEntity = new EntityInsertionAdapter<SentimentHistoryEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `sentiment_history` (`articleKey`,`url`,`title`,`sentiment`,`score`,`createdAt`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final SentimentHistoryEntity entity) {
        if (entity.getArticleKey() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getArticleKey());
        }
        if (entity.getUrl() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getUrl());
        }
        if (entity.getTitle() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getTitle());
        }
        if (entity.getSentiment() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getSentiment());
        }
        statement.bindDouble(5, entity.getScore());
        statement.bindLong(6, entity.getCreatedAt());
      }
    };
  }

  @Override
  public Object upsert(final SentimentHistoryEntity entity,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSentimentHistoryEntity.insert(entity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object latest(final int limit,
      final Continuation<? super List<SentimentHistoryEntity>> $completion) {
    final String _sql = "SELECT * FROM sentiment_history ORDER BY createdAt DESC LIMIT ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, limit);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<SentimentHistoryEntity>>() {
      @Override
      @NonNull
      public List<SentimentHistoryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfArticleKey = CursorUtil.getColumnIndexOrThrow(_cursor, "articleKey");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfSentiment = CursorUtil.getColumnIndexOrThrow(_cursor, "sentiment");
          final int _cursorIndexOfScore = CursorUtil.getColumnIndexOrThrow(_cursor, "score");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final List<SentimentHistoryEntity> _result = new ArrayList<SentimentHistoryEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final SentimentHistoryEntity _item;
            final String _tmpArticleKey;
            if (_cursor.isNull(_cursorIndexOfArticleKey)) {
              _tmpArticleKey = null;
            } else {
              _tmpArticleKey = _cursor.getString(_cursorIndexOfArticleKey);
            }
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpSentiment;
            if (_cursor.isNull(_cursorIndexOfSentiment)) {
              _tmpSentiment = null;
            } else {
              _tmpSentiment = _cursor.getString(_cursorIndexOfSentiment);
            }
            final float _tmpScore;
            _tmpScore = _cursor.getFloat(_cursorIndexOfScore);
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            _item = new SentimentHistoryEntity(_tmpArticleKey,_tmpUrl,_tmpTitle,_tmpSentiment,_tmpScore,_tmpCreatedAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
