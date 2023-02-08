package uz.gita.info;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;

import android.content.Intent;
import android.os.Bundle;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        AppCompatImageButton back = findViewById(R.id.btnBack);
        back.setOnClickListener(view -> openMenu());

    }

    private void openMenu() {
        startActivity(new Intent(this, MainActivity2.class));
        finish();
    }
}