package com.nilscreation.mytestapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.nilscreation.mytestapp.Models.NotesModel;

import java.util.ArrayList;

public class DBHandler extends SQLiteOpenHelper {

    private static final String DB_NAME = "MyDB";
    private static final int DB_VERSION = 2;
    private static final String TABLE_NAME = "Notes";
    private static final String COL_ID = "id";
    private static final String COL_TITLE = "title";
    private static final String COL_DESCRIPTION = "description";
    private static final String COL_TIME = "time";

    Context context;

    public DBHandler(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String query = "CREATE TABLE " + TABLE_NAME + " ("
                + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + COL_TITLE + " TEXT,"
                + COL_DESCRIPTION + " TEXT,"
                + COL_TIME + " TEXT)";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public void addData(String title, String description, String time) {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(COL_TITLE, title);
        values.put(COL_DESCRIPTION, description);
        values.put(COL_TIME, time);

        db.insert(TABLE_NAME, null, values);
        db.close();
    }

    public ArrayList<NotesModel> readData() {

        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<NotesModel> noteslist = new ArrayList<>();
//      Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME + " ORDER BY " + COL_TIME + " DESC", null);
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME, null);

        while (cursor.moveToNext()) {
            noteslist.add(new NotesModel(cursor.getString(1), cursor.getString(2), cursor.getString(3)));
        }

        cursor.close();
        return noteslist;
    }

    public void updateData(String title, String description, String time) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(COL_TITLE, title);
        values.put(COL_DESCRIPTION, description);
        values.put(COL_TIME, time);

        db.update(TABLE_NAME, values, "title= ?", new String[]{title});
        db.close();
    }

    public void deleteData(String title) {
        SQLiteDatabase db = getWritableDatabase();
        db.delete(TABLE_NAME, COL_TITLE + " = ? ", new String[]{title});
        db.close();
    }

    public void deleteandAdd(String Title, String Description, String Time) {
        SQLiteDatabase db = getWritableDatabase();
        db.delete(TABLE_NAME, COL_TITLE + " = ? ", new String[]{Title});
        addData(Title, Description, Time);
        db.close();
    }
}
