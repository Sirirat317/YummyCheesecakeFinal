package com.example.user.yummycheesecake.db;

        import android.content.ContentValues;
        import android.content.Context;
        import android.database.sqlite.SQLiteDatabase;
        import android.database.sqlite.SQLiteOpenHelper;
        import android.util.Log;


public class databaseHelper extends SQLiteOpenHelper {

    private static final String TAG = databaseHelper.class.getSimpleName();

    private static final String DATABASE_NAME = "yummy.db";
    private static final int DATABASE_VERSION = 4;

    public static final String TABLE_NAME = "yummy";
    ///public static final String COL_ID = "_id";
    public static final String COL_SHOPNAME = "shopname";
    public static final String COL_CAKENAME = "cakename";
    public static final String COL_ADDRESS = "address"; ///----
    public static final String COL_TIME = "time";///----
    public  static final String COL_CLOSE = "close";///----
    public static final String COL_DETAIL = "detail";///----
    public static final String COL_IMAGE = "image";

    private static final String SQL_CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                  ///  + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COL_SHOPNAME + " TEXT,"
                    + COL_CAKENAME + " TEXT,"
                    + COL_ADDRESS + " TEXT,"
                    + COL_TIME + " TEXT,"
                    + COL_CLOSE + " TEXT,"
                    + COL_DETAIL + " TEXT,"
                    + COL_IMAGE + " TEXT"
                    + ")";

    public databaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_TABLE);
        insertInitialData(db);
    }

    private void insertInitialData(SQLiteDatabase db) {
        ContentValues cv = new ContentValues();
        cv.put(COL_SHOPNAME, "Kannonya");
        cv.put(COL_CAKENAME, "Denmark Cheesecake");
        cv.put(COL_ADDRESS, "3 Chome-9-23 Motomachidōri, Chūō-ku, Kōbe-shi, Hyōgo-ken");
        cv.put(COL_TIME, "จันทร์-ศุกร์ 11:00～22:00 เสาร์-อาทิตย์และวันหยุดนักขัตฤกษ์ 11:00～22:00");
        cv.put(COL_CLOSE, "ไม่มี");
        cv.put(COL_DETAIL, "นี่คือชีสเค้กเดนมาร์กที่นำไปอุ่นให้ร้อนก่อนทานค่ะ ดูครีมชีสเยิ้มๆ นั่นสิ");
        cv.put(COL_IMAGE, "kannonya.png");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_SHOPNAME, "Karan");
        cv.put(COL_CAKENAME, "Nishigamo Cheesecake");
        cv.put(COL_ADDRESS, "15 Nishigamo Bōnoushirochō, Kita-ku, Kyōto-shi, Kyōto-fu");
        cv.put(COL_TIME, "10:00～19:00");
        cv.put(COL_CLOSE, "วันอังคาร (มีวันหยุดที่ไม่กำหนดด้วย)");
        cv.put(COL_DETAIL, "ชีสเค้กสไตล์ซูเฟล่ชิ้นน้อยๆ ที่กินหมดได้ใน 2-3 คำ เพียงแค่เข้าปากเท่านั้นก็จะรู้สึกได้ถึงความนุ่มละมุนที่พร้อมจะละลายในปากได้ทันที รสชาติก็ไม่หวานจนเกินไป");
        cv.put(COL_IMAGE, "karan.png");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_SHOPNAME, "LeTAO");
        cv.put(COL_CAKENAME, "Double Fromage");
        cv.put(COL_ADDRESS, "7−16 Sakaimachi, Otaru-shi, Hokkaidō");
        cv.put(COL_TIME, "9:00～18:00 (คาเฟ่ปิดก่อน 30 นาที) *เวลาทำการอาจเปลี่ยนไปตามฤดูกาล");
        cv.put(COL_CLOSE, "ไม่มี");
        cv.put(COL_DETAIL, "ชีสเค้กรสแพงที่ถึงจะเข้มข้นแต่กินเท่าไหร่ก็ไม่รู้สึกเลี่ยนเลย ถ้าไปร้านที่โอตารุจะได้กินชีสเค้กแบบที่ทำเสร็จใหม่ๆ ด้วย ฉะนั้นถ้ามีโอกาสได้ไปเที่ยวโอตารุแล้วล่ะก็อย่าพลาดนะคะ");
        cv.put(COL_IMAGE, "letao.png");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_SHOPNAME, "Littleangels");
        cv.put(COL_CAKENAME, "Cheesecake");
        cv.put(COL_ADDRESS, "5-36 Yorozuyamachi, Nagasaki-shi, Nagasaki-ken");
        cv.put(COL_TIME, "10:30～19:30");
        cv.put(COL_CLOSE, "ไม่มี");
        cv.put(COL_DETAIL, "ชีสเค้กที่ใช้ส่วนผสมที่คัดสรรมาแล้วอย่างดี นำไปอบด้วยความร้อนที่พอเหมาะจนได้ออกมาเป็นชีสเค้กน่าตาน่าทานนี้ รสสัมผัสเนียนนุ่มของครีมชีสที่มีรสเปรี้ยวอ่อนๆ นี้เข้ากันกับแป้งทาร์ตได้ดีจริงๆ");
        cv.put(COL_IMAGE, "Littleangels.png");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_SHOPNAME, "Maison de Petit Four");
        cv.put(COL_CAKENAME, "Vash");
        cv.put(COL_ADDRESS, "2 Chome-27-17 Nakaikegami, Ōta-ku, Tōkyō-to");
        cv.put(COL_TIME, "9:30～18:30");
        cv.put(COL_CLOSE, "วันพุธ ");
        cv.put(COL_DETAIL, "ชีสเค้กที่ใช้ชีส 2 ชนิด ชั้นบนเป็นมูสครีมชีส fromage blanc เนื้อเบาที่มีรสเปรี้ยวนิดๆ ชั้นล่างเป็นครีสชีสเนื้อแน่นรสเข้มข้น ทานพร้อมกันกับแป้งทาร์ตที่ฐานเค้กเป็นอะไรที่เข้าได้ดี");
        cv.put(COL_IMAGE, "maison.png");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_SHOPNAME, " Moriyama Napoli");
        cv.put(COL_CAKENAME, "Cheesecake Carameliser");
        cv.put(COL_ADDRESS, "1 Chome-2-1 Moriyama, Kanazawa-shi, Ishikawa-ken");
        cv.put(COL_TIME, "11:00～16:00");
        cv.put(COL_CLOSE, "วันอาทิตย์");
        cv.put(COL_DETAIL, "ชีสเค้กของร้านนี้ประกอบด้วยครีมชีส 2 ชนิดที่ผสมกันอย่างลงตัว กับกลิ่นอ่อนๆ ของเลม่อนและคาราเมลรสขมนิดๆ ที่ราดด้านบนเนื้อเค้กจนได้รสกลมกล่อม");
        cv.put(COL_IMAGE, "moriyama.png");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_SHOPNAME, "Rabelais");
        cv.put(COL_CAKENAME, "Original Cheesecake");
        cv.put(COL_ADDRESS, "1 Chome-30-13 Ebisunishi, Shibuya-ku, Tōkyō-to");
        cv.put(COL_TIME, "กลางวัน 12:00～15:00 / เย็น 18:00～22:00");
        cv.put(COL_CLOSE, "วันพุธ");
        cv.put(COL_DETAIL, "ชีสเค้กของร้านอาหารฝรั่งเศสในย่านไดคังยามะ ใช้ครีมชีสจาก Brittany ประเทศฝรั่งเศส ผสมเข้ากับเนยหมักและเกลือในปริมาณกำลังดี ได้เป็นเนื้อครีมชีสความเข้มข้นสูงที่แทบจะละลายในปากได้เลยทีเดียว");
        cv.put(COL_IMAGE, "rabelais.png");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_SHOPNAME, "Thinker Bell");
        cv.put(COL_CAKENAME, "Cheese Bake");
        cv.put(COL_ADDRESS, "9 Chome-1-3 Kōei Nishimachi, Kitami-shi, Hokkaidō");
        cv.put(COL_TIME, "10:00～19:30 [วันอาทิตย์และวันหยุดนักขัตฤกษ์] 10:00～19:00");
        cv.put(COL_CLOSE, "วันจันทร์ และ วันอังคารที่สามของเดือน");
        cv.put(COL_DETAIL, "ชีสเค้กของที่นี่ใช้แป้งพายทำเป็นฐานเค้ก เมื่อกินเข้าไปแล้วจึงได้ทั้งความกรุบกรอบของแป้งพายที่อบได้ที่ กับความนุ่มนวลของครีสชีสไปพร้อมๆ กัน ");
        cv.put(COL_IMAGE, "thinker.png");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_SHOPNAME, "Тро́йка");
        cv.put(COL_CAKENAME, "Baked Cheesecake");
        cv.put(COL_ADDRESS, "18-120-1 Machibun, Kitakami-shi, Iwate-ken");
        cv.put(COL_TIME, "11:00～20:00");
        cv.put(COL_CLOSE, "วันพุธ");
        cv.put(COL_DETAIL, "ถึงจะอบออกมาแล้ว แต่เนื้อครีมชีสยังฉ่ำๆ เหมือนกับแรร์ชีสเค้กไม่มีผิด รสสัมผัสแบบนี้ขอบอกเลยว่านุ่มลิ้นมาก");
        cv.put(COL_IMAGE, "tpon.png");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_SHOPNAME, "Yamada Farm");
        cv.put(COL_CAKENAME, "Zeitaku Cheesecake");
        cv.put(COL_ADDRESS, "2077 Shigarakicho, Koyama, Koka, Shiga");
        cv.put(COL_TIME, "10:00～18:00");
        cv.put(COL_CLOSE, "ไม่มี");
        cv.put(COL_DETAIL, "จัดเต็มความฟินด้วยครีมสดกว่า 46% ของส่วนผสมทั้งหมดของตัวเค้ก รับรองว่าหาชีสเค้กแบบนี้จากที่อื่นไม่ได้ง่ายๆ แน่นอน");
        cv.put(COL_IMAGE, "yamada.png");
        db.insert(TABLE_NAME, null, cv);

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.i(TAG, "onUpgrade(): oldVersion = " + oldVersion + ", newVersion = " + newVersion);

        db.execSQL("DROP TABLE " + TABLE_NAME);
        db.execSQL(SQL_CREATE_TABLE);
        insertInitialData(db);
    }
}
