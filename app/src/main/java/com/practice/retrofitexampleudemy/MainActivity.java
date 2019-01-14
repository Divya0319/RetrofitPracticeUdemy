package com.practice.retrofitexampleudemy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.practice.retrofitexampleudemy.R;
import com.practice.retrofitexampleudemy.http.UsersAPI;
import com.practice.retrofitexampleudemy.http.apimodel.UserModel;
import com.practice.retrofitexampleudemy.root.App;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Inject
    UsersAPI usersAPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ProgressBar progressBar = findViewById(R.id.progressBar);
        progressBar.setVisibility(View.VISIBLE);

        ((App) getApplication()).getComponent().inject(this);
        Call<List<UserModel>> call = usersAPI.getUsers();
        call.enqueue(new Callback<List<UserModel>>() {
            @Override
            public void onResponse(Call<List<UserModel>> call, Response<List<UserModel>> response) {
                progressBar.setVisibility(View.INVISIBLE);
                List<UserModel> users = response.body();

                Toast.makeText(MainActivity.this, "Response arrived", Toast.LENGTH_SHORT).show();

                for (UserModel userModel : users) {
                    TextView responseText = findViewById(R.id.response);
                    responseText.append(userModel.getNAME() + " " + userModel.getAGE() + " " + userModel.getURL());
                    System.out.println(userModel.getNAME() + " " + userModel.getAGE() + " " + userModel.getURL());
                }
            }

            @Override
            public void onFailure(Call<List<UserModel>> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }
}
