package com.os.showhighlightedtext;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvName1 = findViewById(R.id.tvName1);
        TextView tvName2 = findViewById(R.id.tvName2);
        TextView tvName3 = findViewById(R.id.tvName3);

        tvName1.setText(Html.fromHtml("<plaintext>" + tvName1.getText().toString().substring(0, 11) + "</plaintext>" + "<font color=\"#AAAAAA\">" + tvName1.getText().toString().substring(tvName1.getText().toString().lastIndexOf("d")+1) + "</font>"));
        tvName2.setText(Html.fromHtml("<plaintext>" + tvName2.getText().toString().substring(0, 11) + "</plaintext>" + "<font color=\"#AAAAAA\">" + tvName2.getText().toString().substring(tvName2.getText().toString().lastIndexOf("d")+1) + "</font>"));
        tvName3.setText(Html.fromHtml("<plaintext>" + tvName3.getText().toString().substring(0, 11) + "</plaintext>" + "<font color=\"#AAAAAA\">" + tvName3.getText().toString().substring(tvName3.getText().toString().lastIndexOf("d")+1) + "</font>"));


        tvName1.setOnClickListener(view -> {
            highlightAndUnHighlight(tvName1, tvName2, tvName3);
        });

        tvName2.setOnClickListener(view -> {
            highlightAndUnHighlight(tvName2, tvName3, tvName1);
        });

        tvName3.setOnClickListener(view -> {
            highlightAndUnHighlight(tvName3, tvName2, tvName1);
        });

    }

    public void highlightAndUnHighlight(TextView tv1, TextView tv2, TextView tv3){
        tv1.setText(Html.fromHtml("<b>" + tv1.getText().toString().substring(0, 11) + "</b>" + "<font color=\"#AAAAAA\">" + tv1.getText().toString().substring(tv1.getText().toString().lastIndexOf("d")+1) + "</font>"));

        tv2.setText(Html.fromHtml("<plaintext>" + tv2.getText().toString().substring(0, 11) + "</plaintext>" + "<font color=\"#AAAAAA\">" + tv2.getText().toString().substring(tv2.getText().toString().lastIndexOf("d")+1) + "</font>"));
        tv3.setText(Html.fromHtml("<plaintext>" + tv3.getText().toString().substring(0, 11) + "</plaintext>" + "<font color=\"#AAAAAA\">" + tv3.getText().toString().substring(tv3.getText().toString().lastIndexOf("d")+1) + "</font>"));

    }
}