package com.example.mylistviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private InfomationListAdapter adapter;
    private List<Information> mInformationList;

    private LinearLayout layoutOne, layoutTwo;
    private TextView next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information_list_layout_ll);


        layoutOne = findViewById(R.id.layout_one);
        layoutTwo = findViewById(R.id.layout_two);
        next = findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (layoutOne.getVisibility() == View.VISIBLE){
                    layoutOne.setVisibility(View.GONE);
                    layoutTwo.setVisibility(View.VISIBLE);
                }else {
                    layoutOne.setVisibility(View.VISIBLE);
                    layoutTwo.setVisibility(View.GONE);
                }
            }
        });

       /* listView = (ListView) findViewById(R.id.listview);
        mInformationList = new ArrayList<>();

        mInformationList.add(new Information("1", "Mamta Mudgal", "mamtamudgal@gmail.com", "148A"));
        mInformationList.add(new Information("2", "Maya Sharma", "mayasharma@gmail.com", "348A"));
        mInformationList.add(new Information("3", "Anil Sharma", "anilsharma@gmail.com", "448A"));
        mInformationList.add(new Information("4", "Balwant sharma", "balwantsharma@gmail.com", "458A"));
        mInformationList.add(new Information("5", "Neha Sharma", "nssharm4481@gmail.com", "148A"));
        mInformationList.add(new Information("6", "Lokesh Mudgal", "lokeshmu1@gmail.com", "148A"));
        mInformationList.add(new Information("7", "Nehsh Mudgal", "nehshmudgal@gmail.com", "148A"));
        mInformationList.add(new Information("8", "Nehlo Mudgal", "nehlomudgal@gmail.com", "148A"));

        adapter = new InfomationListAdapter(getApplicationContext(), mInformationList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),  mInformationList.get(position).getName(), Toast.LENGTH_SHORT).show();

            }
        });*/

    }
}
