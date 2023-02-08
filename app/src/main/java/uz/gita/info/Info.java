package uz.gita.info;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        loadDate();
    }

    private void loadDate() {
        TextView textView = findViewById(R.id.txtTitle);
        TextView textDescription = findViewById(R.id.txtDescription);
        ImageView imageLogo = findViewById(R.id.imgLogo);
        LinearLayout background=findViewById(R.id.liner1);

        int position = getIntent().getIntExtra("POSITION", 1);
        switch (position) {
            case 1:
                imageLogo.setImageResource(R.drawable.img_1);
                textView.setText(R.string.cplusplus);
                textDescription.setText(R.string.cplus);
                break;
            case 2:
                imageLogo.setImageResource(R.drawable.javaimg);
                textView.setText(R.string.java);
                textDescription.setText(R.string.javaInfo);
                break;
            case 3:
                imageLogo.setImageResource(R.drawable.pythonimg);
                textView.setText(R.string.python);
                textDescription.setText(R.string.pythonInfo);
                break;
            case 4:
                imageLogo.setImageResource(R.drawable.javascriptimg);
                textView.setText(R.string.javaScript);
                textDescription.setText(R.string.javaScriptInfo);
                break;
            case 5:
                imageLogo.setImageResource(R.drawable.cshharpimg);
                textView.setText(R.string.c);
                textDescription.setText(R.string.cSharpInfo);
                break;
            case 6:
                imageLogo.setImageResource(R.drawable.kotlinimg);
                textView.setText(R.string.kotlin);
                textDescription.setText(R.string.kotlinInfo);
                break;
            case 7:
                imageLogo.setImageResource(R.drawable.flutterimg);
                textView.setText(R.string.flutter);
                textDescription.setText(R.string.flutterInfo);
                break;
            case 8:
                imageLogo.setImageResource(R.drawable.goimg);
                textView.setText(R.string.go);
                textDescription.setText(R.string.goInfo);
                break;
        }
    }
}