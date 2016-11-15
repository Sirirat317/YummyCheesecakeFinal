package com.example.user.yummycheesecake.adepter;

        import android.content.Context;
        import android.content.Intent;
        import android.content.res.AssetManager;
        import android.graphics.drawable.Drawable;
        import android.support.annotation.NonNull;
        import android.util.Log;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.ImageButton;
        import android.widget.ImageView;
        import android.widget.ListView;
        import android.widget.TextView;

        import com.example.user.yummycheesecake.R;
        import com.example.user.yummycheesecake.listitem;
        import com.example.user.yummycheesecake.model.Contact;
        import com.example.user.yummycheesecake.showdata;

        import java.io.IOException;
        import java.io.InputStream;
        import java.util.ArrayList;

        import static android.R.id.list;

/**
 * Created by TOSHIBA on 10/11/2559.
 */
public class ContactListAdapter extends ArrayAdapter<Contact> {


    private Context mContext;
    private int mLayoutResId;
    private ArrayList<Contact> mContactList;
    private listitem list1;

    public ContactListAdapter(Context context, int resource, ArrayList<Contact> contactList) {
        super(context, resource, contactList);

        this.mContext = context;
        this.mLayoutResId = resource;
        this.mContactList = contactList;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View itemLayout = convertView;

        if (itemLayout == null) {
            itemLayout = View.inflate(mContext, mLayoutResId, null);
        }

        ImageView imageView = (ImageView) itemLayout.findViewById(R.id.image);
        TextView cakenameTextView = (TextView) itemLayout.findViewById(R.id.cake_text);
        TextView shopnameTextView = (TextView) itemLayout.findViewById(R.id.shop_text);
        final ImageButton next = (ImageButton) itemLayout.findViewById(R.id.link);///---------------


        // เข้าถึงออบเจ็ค Contact หนึ่งๆใน mContactList
        Contact contact = mContactList.get(position);

        String contactCakeName = contact.getCakeName();///-------------
        cakenameTextView.setText(contactCakeName);



        /// String contackShopName = contact.getShopName();
        /// shopnameTextView.setText(contackShopName);


        String contactImage = contact.getImage();

        AssetManager am = mContext.getAssets();
        try {
            InputStream stream = am.open(contactImage);
            Drawable imageDrawable = Drawable.createFromStream(stream, null);
            imageView.setImageDrawable(imageDrawable);
        } catch (IOException e) {
            Log.e("ContactListAdapter", "Error open image file: " + contactImage);
            e.printStackTrace();
        }

/*
        if ("android".equals(contactName)) {
            imageView.setImageResource(R.mipmap.ic_launcher);
        } else if ("ios".equals(contactName)) {
            imageView.setImageResource(R.drawable.ic_ios);
        } else if ("windows".equals(contactName)) {
            imageView.setImageResource(R.drawable.ic_windows);
        } else if ("linux".equals(contactName)) {
            imageView.setImageResource(R.drawable.ic_linux);
        }
*/

        return itemLayout;
    }





}
