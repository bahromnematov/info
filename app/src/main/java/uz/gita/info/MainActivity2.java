package uz.gita.info;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        AppCompatImageButton cPluPlus = findViewById(R.id.cPlusPlus);
        AppCompatImageButton java = findViewById(R.id.java);
        AppCompatImageButton python = findViewById(R.id.python);
        AppCompatImageButton javascript = findViewById(R.id.javaScript);
        AppCompatImageButton csharp = findViewById(R.id.cSharp);
        AppCompatImageButton kotlin = findViewById(R.id.kotlin);
        AppCompatImageButton flutter = findViewById(R.id.flutter);
        AppCompatImageButton go = findViewById(R.id.go);
        AppCompatImageButton info = findViewById(R.id.btnInfo);

        cPluPlus.setOnClickListener(v -> openInfo(1));
        java.setOnClickListener(view -> openInfo(2));
        python.setOnClickListener(view -> openInfo(3));
        javascript.setOnClickListener(view -> openInfo(4));
        csharp.setOnClickListener(view -> openInfo(5));
        kotlin.setOnClickListener(view -> openInfo(6));
        flutter.setOnClickListener(view -> openInfo(7));
        go.setOnClickListener(view -> openInfo(8));
        info.setOnClickListener(view -> openAbout());
    }

//    private void preventTwoClick(final View view) {
//        view.setEnabled(false);
//        view.postDelayed(() -> view.setEnabled(true), 300);
//    }

    private void openInfo(int number) {
        Intent intent = new Intent(this, Info.class);
        intent.putExtra("POSITION", number);
        startActivity(intent);

    }

    private void openAbout() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.activity_about);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCancelable(false);
        dialog.show();

        AppCompatButton btnBack = dialog.findViewById(R.id.btnBack);
        btnBack.setOnClickListener(view -> dialog.dismiss());
    }
}