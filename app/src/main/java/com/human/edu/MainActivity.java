package com.human.edu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //클래스 안쪽에서 사용될 변수를 선언
    Button btnTel, btnLogout;
    TextView textViewwelcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //----------------------------------------
        //메인액티비티가 onClick으로 생성될 때 인텐트로 받은값을 출력가능
        Intent intent = new Intent(this.getIntent());
        String userid = intent.getStringExtra("editTextID");
        String userpw = intent.getStringExtra("editTextPassword");
        textViewwelcome = findViewById(R.id.textViewwelcome);
        textViewwelcome.setText(userid+"님 환영합니다.");
        //-----------------------------------------
        btnLogout = findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(loginIntent);
                finish();
            }
        });
        btnTel = findViewById(R.id.btnTel);
        btnTel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //디버그
                //Toast.makeText(MainActivity.this, "전화걸기 실행!", Toast.LENGTH_LONG).show();
                Intent telIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("tel:010-1111-1111"));
                startActivity(telIntent);
                finish();//앱이 종료되는것이 아니라 액티비티가 사라지는기능
                System.exit(0);//강제종료방법 0:정상종료, 1:비정상종료
            }
        });
    }

    public void goToNaver(View view) {
       //디버그용 Toast.makeText(getApplicationContext(),"네이버웹클릭!",Toast.LENGTH_LONG).show();
        Intent naverInent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://naver.com"));
        startActivity(naverInent);
    }
}