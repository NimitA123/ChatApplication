package com.example.androidrecycleview4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private EditText mtvOption;
    private EditText mtvMessage;
    private ImageView mBtnSend;
    private ChatAdapter chatAdapter;
    private ArrayList<BaseModel> baseModelArrayList1= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setRecycleView();
    }

    private void setRecycleView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        chatAdapter = new ChatAdapter(baseModelArrayList1);
        recyclerView.setAdapter(chatAdapter);
    }

    private void BuildList(){
        if(mtvOption.getText().toString().equals("0")){
            baseModelArrayList1.add(new SenderModel(mtvMessage.getText().toString()));
        }
        else if(mtvOption.getText().toString().equals("1")){
            baseModelArrayList1.add(new ReceiverModel(mtvMessage.getText().toString()));
        }
        chatAdapter.notifyDataSetChanged();
    }

    private void initView() {
        recyclerView = findViewById(R.id.recycleView);
        mtvOption = findViewById(R.id.selectOption);
        mtvMessage = findViewById(R.id.sendMessage);
        mBtnSend = findViewById(R.id.ic_sendMsg);
        mBtnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BuildList();
            }
        });
    }
}