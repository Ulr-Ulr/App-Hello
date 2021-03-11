package com.human.edu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override

    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void gotoMain(View view) {
        EditText editTextID, editTextPassword;
        editTextID = findViewById(R.id.editTextID);
        editTextPassword = findViewById(R.id.editTextPassword);
        //Toast.makeText(LoginActivity.this, "디버그"+ editTextID.getText(),Toast.LENGTH_LONG).show();
        //로그인 버튼을 onClick했을 때
        Intent mainIntent = new Intent(LoginActivity.this, MainActivity.class);
        //데이터를 입력해서 메인 액티비티화면 열기(아래)
        mainIntent.putExtra("editTextID", editTextID.getText().toString());
        mainIntent.putExtra("editTextPassword", editTextPassword.getText().toString());
        startActivity(mainIntent); //편지봉투Intent를 개봉 = 화면불러오기 실행
        finish();

    }
}