package com.edu.project1.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import com.edu.project1.Dao.UserDao;
import com.edu.project1.Models.User;
import com.edu.project1.R;
import com.google.android.material.textfield.TextInputEditText;

public class RegisterActivity extends AppCompatActivity {

    private TextInputEditText edUsername,edName,edEmail,edKhoHang,edPassword;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        getSupportActionBar().hide();
        setContentView(R.layout.register_activity);

        edUsername=findViewById(R.id.edRegisterUsername);
        edName=findViewById(R.id.edRegisterHoTen);
        edEmail=findViewById(R.id.edRegisterEmail);
        edKhoHang=findViewById(R.id.edRegisterKhoHang);
        edPassword=findViewById(R.id.edRegisterPass);

        findViewById(R.id.tvLogin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
            }
        });

        findViewById(R.id.btnRegister).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkRegister();

            }
        });


    }

    private void checkRegister(){
        String user=edUsername.getText().toString();
        String name=edName.getText().toString();
        String email=edEmail.getText().toString();
        String tenKho=edKhoHang.getText().toString();
        String pass=edPassword.getText().toString();
        UserDao dao=new UserDao(RegisterActivity.this);
        User list=new User();
        list.setUsername(user);
        list.setHoTen(name);
        list.setEmail(email);
        list.setTenKhoHang(tenKho);
        list.setPassword(pass);

        if(user.isEmpty() || name.isEmpty() || email.isEmpty() || tenKho.isEmpty() || pass.isEmpty()){
            Toast.makeText(RegisterActivity.this,"Phải điền đầy đủ thông tin",Toast.LENGTH_SHORT).show();
        }else{
            boolean check=dao.checkUsername(user);
            if(check==false){
                try {


                    dao.insert(list);
                    Toast.makeText(RegisterActivity.this, "Đăng ký thành công", Toast.LENGTH_SHORT).show();
                }catch (Exception e){
                    e.printStackTrace();
                    System.out.println("Lỗi"+e);
                    Toast.makeText(RegisterActivity.this, "Lỗi", Toast.LENGTH_SHORT).show();

                }
            }else{
                Toast.makeText(RegisterActivity.this,"Tên đăng nhập đã tồn tại!!!",Toast.LENGTH_SHORT).show();

            }
        }
    }
}