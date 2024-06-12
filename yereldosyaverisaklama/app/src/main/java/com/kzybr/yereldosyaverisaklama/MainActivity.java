package com.kzybr.yereldosyaverisaklama;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText isimText;
    TextView gelenText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        isimText=findViewById(R.id.isimText);
        gelenText=findViewById(R.id.gelenText);
        SharedPreferences veriGetir=this.getPreferences(Context.MODE_PRIVATE);
        String gelenveri=veriGetir.getString("ad","");
        if(!gelenveri.isEmpty()){
            gelenText.setText(gelenveri);
        }


}
public void kaydet(View view) {
        SharedPreferences veriKaydet=this.getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=veriKaydet.edit();
        editor.putString("ad", isimText.getText().toString());
        editor.apply();
    SharedPreferences veriGetir=this.getPreferences(Context.MODE_PRIVATE);
    String gelenveri=veriGetir.getString("ad","");
    if(!gelenveri.isEmpty()){
        gelenText.setText(gelenveri);
    }
}
}
