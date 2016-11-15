package com.example.user.yummycheesecake;

        import android.content.Intent;
        import android.database.Cursor;
        import android.database.sqlite.SQLiteDatabase;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.Adapter;
        import android.widget.AdapterView;
        import android.widget.ImageButton;
        import android.widget.ListView;
        import android.widget.TextView;
        import android.widget.Toast;

        import com.example.user.yummycheesecake.adepter.ContactListAdapter;
        import com.example.user.yummycheesecake.db.databaseHelper;
        import com.example.user.yummycheesecake.model.Contact;

        import java.util.ArrayList;


public class MenuCake extends AppCompatActivity {

    private databaseHelper mHelper;
    private SQLiteDatabase mDb;

    private ArrayList<Contact> mContactList = new ArrayList<>();
    private ListView mContactListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_cake);

        mHelper = new databaseHelper(this);
        mDb = mHelper.getWritableDatabase();
        mContactListView = (ListView) findViewById(R.id.contact_list_view);

        Intent n = getIntent();
        String _name = n.getStringExtra("nameuser");

        TextView showname = (TextView)findViewById(R.id.show_name);
        showname.setText("USER : "+_name);



        /*mContactListView.setAdapter(new ContactListAdapter(this,R.layout.activity_listitem,mContactList));
        mContactListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(view.getContext(),showdata.class);
                startActivity(intent);
            }
        });*/
    }

    @Override
    protected void onResume() {
        super.onResume();

        Cursor cursor = mDb.query(databaseHelper.TABLE_NAME, null, null, null, null, null, null);

        mContactList.clear();
        while (cursor.moveToNext()) {
            String shopname = cursor.getString(cursor.getColumnIndex(databaseHelper.COL_SHOPNAME));
            String cakename = cursor.getString(cursor.getColumnIndex(databaseHelper.COL_CAKENAME));
            String address = cursor.getString(cursor.getColumnIndex(databaseHelper.COL_ADDRESS));
            String time = cursor.getString(cursor.getColumnIndex(databaseHelper.COL_TIME));
            String close = cursor.getString(cursor.getColumnIndex(databaseHelper.COL_CLOSE));
            String detail = cursor.getString(cursor.getColumnIndex(databaseHelper.COL_DETAIL));
            String image = cursor.getString(cursor.getColumnIndex(databaseHelper.COL_IMAGE));

            Contact contact = new Contact( shopname,cakename, image,address,time,close,detail);
            mContactList.add(contact);
        }

        ContactListAdapter adapter = new ContactListAdapter(
                this,
                R.layout.activity_listitem,
                mContactList
        );

        mContactListView.setAdapter(adapter);
    }



   /* @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.activity_main) {
            Intent intent = new Intent(this, MenuCake.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/
}
