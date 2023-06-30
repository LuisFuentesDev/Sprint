package com.example.sprint;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.example.sprint.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivitySecondBinding binding = ActivitySecondBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.buttonLinkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View buttonLinkedin) {
                String url = "https://www.linkedin.com";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        binding.buttonWhatsApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View buttonLinkedin) {
                String numeroTelefono = "+56955478512";

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + numeroTelefono));
                startActivity(intent);
            }
        });
        binding.buttonContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View buttonLinkedin) {
                String url = "https://mail.google.com";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }

}
