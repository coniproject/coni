package com.example.ayabeltran.coni;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;
import android.util.Log;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String dbname= "conidb.db";
    public static final String tblname= "childinformation";
    public static final String col1= "ID";
    public static final String col2= "lastname";
    public static final String col3= "firstname";
    public static final String col4= "mi";
    public static final String col5= "age";
    public static final String col6= "birthday";
    public static final String col7= "gender";
    public static final String col8= "schedule";

    public static final String tblname2= "devicerecords";
    public static final String t2col1= "ID";
    public static final String t2col2= "serialnumber";
    public static final String t2col3= "devicestatus";

    public static final String tblname3= "guardian";
    public static final String t3col1= "ID";
    public static final String t3col2= "lastname";
    public static final String t3col3= "firstname";
    public static final String t3col4= "mi";
    public static final String t3col5= "username";
    public static final String t3col6= "password";
    public static final String t3col7= "relationshiptothechild";
    public static final String t3col8= "contactnumber";
    public static final String t3col9= "emailaddress";

    public static final String tblname4= "hotlinesuggestions";
    public static final String t4col1= "ID";
    public static final String t4col2= "companyname";
    public static final String t4col3= "hotlinenumber";
    public static final String t4col4= "location";

    public static final String tblname5= "locationrecords";
    public static final String t5col1= "ID";
    public static final String t5col2= "dateandtime";
    public static final String t5col3= "lastname";
    public static final String t5col4= "firstname";
    public static final String t5col5= "mi";
    public static final String t5col6= "currentlocation";
    public static final String t5col7= "lastlocation";
    public static final String t5col8= "nearestlandmarks";


    public DatabaseHelper(@Nullable Context context) {

        super(context, dbname, null, 4);
        SQLiteDatabase db=this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+tblname+
                "( " + " "+col1+" integer primary key autoincrement, "
                +col2+" text not null, "
                +col3+" text not null, "
                +col4+" text , "
                +col5+" integer not null, "
                +col6+" text not null,"
                +col7+" text not null,"
                +col8+" text );");

        db.execSQL("create table "+tblname2+
                "( " + " "+t2col1+" integer primary key autoincrement, "
                +t2col2+" integer not null, "
                +t2col3+" text not null);");

        db.execSQL("create table "+tblname3+
                "( " + " "+t3col1+" integer primary key autoincrement, "
                +t3col2+" text not null, "
                +t3col3+" text not null, "
                +t3col4+" text , "
                +t3col5+" text not null, "
                +t3col6+" text not null,"
                +t3col7+" text not null,"
                +t3col8+" integer not null,"
                +t3col9+" text );");

        db.execSQL("create table "+tblname4+
                "( " + " "+t4col1+" integer primary key autoincrement, "
                +t4col2+" text not null, "
                +t4col3+" integer not null, "
                +t4col4+" text not null);");

        db.execSQL("create table "+tblname5+
                "( " + " "+t5col1+" integer primary key autoincrement, "
                +t5col2+" text not null, "
                +t5col3+" text not null, "
                +t5col4+" text not null, "
                +t5col5+" text , "
                +t5col6+" text not null,"
                +t5col7+" text not null,"
                +t5col8+" text );");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("drop table if exists " +tblname );
        db.execSQL("drop table if exists " +tblname2 );
        db.execSQL("drop table if exists " +tblname3 );
        db.execSQL("drop table if exists " +tblname4 );
        db.execSQL("drop table if exists " +tblname5 );
        onCreate(db);
    }

    // method that looks for matching usernames and passwords //
    public Cursor userlogin(String loginname, String loginpword, SQLiteDatabase db){
        String query = "select * from guardian where username = '"+loginname+"' and password = '"+loginpword+"'";
        Log.d("query", query);
        Cursor cursor = db.rawQuery(query, null);
        return cursor;
    }
}
