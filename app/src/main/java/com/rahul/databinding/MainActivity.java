 package com.rahul.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.rahul.databinding.Adapter.RecyclerAdapter;
import com.rahul.databinding.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

 public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.recyclerview.setLayoutManager(new LinearLayoutManager(this));
        activityMainBinding.recyclerview.setHasFixedSize(true);
        adapter = new RecyclerAdapter(this,preparePlayers());
        activityMainBinding.recyclerview.setAdapter(adapter);

    }

    private List<Player> preparePlayers(){
        List<String> names = Arrays.asList(getResources().getStringArray(R.array.names));
        List<String> email = Arrays.asList(getResources().getStringArray(R.array.email_id));
         int[] imageId = {R.drawable.ms_dhoni,R.drawable.kholi,R.drawable.rohit,R.drawable.jasprit,R.drawable.jadeja,R.drawable.kl_rahul,
                            R.drawable.rishabh_pant,R.drawable.hardik_pandey,R.drawable.chahal};

         List<Player> Names = new ArrayList<>();
         int count=0;

         for(String name :names){
             Names.add(new Player(name,email.get(count),imageId[count]));
             count++;
         }
         return Names;
    }
}
