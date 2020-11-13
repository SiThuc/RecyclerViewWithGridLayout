package com.example.recyclerviewwithgridlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewwithgridlayout.Adapter.UserAdapter;
import com.example.recyclerviewwithgridlayout.Model.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    UserAdapter userAdapter;
    List<User> userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_user);
        userAdapter = new UserAdapter(this);
        initData();
        userAdapter.setData(userList);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 4);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(userAdapter);

    }

    private void initData() {
        userList = new ArrayList<>();

        userList.add(new User(R.drawable.phone1, "username1"));
        userList.add(new User(R.drawable.phone2, "username2"));
        userList.add(new User(R.drawable.phone3, "username3"));
        userList.add(new User(R.drawable.phone4, "username4"));

        userList.add(new User(R.drawable.phone1, "username1"));
        userList.add(new User(R.drawable.phone2, "username2"));
        userList.add(new User(R.drawable.phone3, "username3"));
        userList.add(new User(R.drawable.phone4, "username4"));

        userList.add(new User(R.drawable.phone1, "username1"));
        userList.add(new User(R.drawable.phone2, "username2"));
        userList.add(new User(R.drawable.phone3, "username3"));
        userList.add(new User(R.drawable.phone4, "username4"));
    }
}