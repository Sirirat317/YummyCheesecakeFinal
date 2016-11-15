package com.example.user.yummycheesecake;


        import android.content.DialogInterface;
        import android.content.Intent;
        import android.support.v7.app.AlertDialog;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ImageButton;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        Button menu = (Button) findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Intent intent = new Intent(MainActivity.this,MenuCake.class);
                final EditText name = (EditText)findViewById(R.id.editText);
                intent.putExtra("nameuser",name.getText().toString());

                final String text=name.getText().toString();

if(name.getText().toString()==null) {
    AlertDialog.Builder builder = new AlertDialog.Builder(null);
    builder.setTitle("ไม่สามารถใช้งานได้");
    builder.setMessage("กรุณาพิมพ์ชื่อของท่าน");
    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {


        }
    });
    builder.show();
}



                    startActivity(intent);

            }


        });
    }

    }
