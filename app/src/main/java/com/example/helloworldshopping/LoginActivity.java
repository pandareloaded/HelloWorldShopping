package com.example.helloworldshopping;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends BaseActivity {
    public static final String EXTRA_MESSAGE = "com.example.helloworldshopping.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences sp = getSharedPreferences("HelloWorldShoppingPref", Context.MODE_PRIVATE);
        String username = sp.getString("username","null");

        if (!username.equals("null")) {
            Intent intent = new Intent(this, ShopActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        } else {
            setContentView(R.layout.login);
        }
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, ShopActivity.class);
        EditText editText = (EditText) findViewById(R.id.userNameTextbox);
        String username = editText.getText().toString();

        SharedPreferences sp = getSharedPreferences("HelloWorldShoppingPref", Context.MODE_PRIVATE);
        SharedPreferences.Editor spEditor = sp.edit();
        spEditor.putString("username",username);
        spEditor.commit();

        intent.putExtra(EXTRA_MESSAGE, username);
        startActivity(intent);
    }

    public void signUp(View view){
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);
    }


}
