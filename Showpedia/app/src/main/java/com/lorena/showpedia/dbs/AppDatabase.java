package com.lorena.showpedia.dbs;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.lorena.showpedia.dbs.dao.FavoriteDao;
import com.lorena.showpedia.dbs.table.FavoriteMovie;
import com.lorena.showpedia.dbs.table.FavoriteTv;

@Database(entities = {FavoriteMovie.class, FavoriteTv.class}, version = 2, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract FavoriteDao favoriteDao();

    private static AppDatabase instance;

    public synchronized static AppDatabase getInstance(Context context){
        if(instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "Source Database").allowMainThreadQueries().fallbackToDestructiveMigration().build();
        }
        return instance;
    }
}
