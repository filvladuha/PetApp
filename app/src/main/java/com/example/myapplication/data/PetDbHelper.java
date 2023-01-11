package com.example.myapplication.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.myapplication.data.PetContract.PetEntry;

public class PetDbHelper extends SQLiteOpenHelper {

    public static final String LOG_TAG = PetDbHelper.class.getSimpleName();

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "pets.db";

    public PetDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /**
     * This is called when the database is created for the first time.
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_PETS_TABLE = "CREATE TABLE " + PetEntry.TABLE_NAME + " (" +
                PetEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                PetEntry.COLUMN_PET_NAME + " TEXT NOT NULL, " +
                PetEntry.COLUMN_PET_BREED + " TEXT, " +
                PetEntry.COLUMN_PET_GENDER + " INTEGER NOT NULL, " +
                PetEntry.COLUMN_PET_WEIGHT + " INTEGER NOT NULL DEFAULT 0);";

        String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + PetEntry.TABLE_NAME;

        db.execSQL(SQL_CREATE_PETS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
////         This database is only a cache for online data, so its upgrade policy is
////         to simply to discard the data and start over
//        db.execSQL();
//        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        onUpgrade(db, oldVersion, newVersion);
    }

}
