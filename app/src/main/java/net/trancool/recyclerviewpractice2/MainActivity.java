package net.trancool.recyclerviewpractice2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private final Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView items = findViewById(R.id.items);
        ColorAdapter adapter = new ColorAdapter(getLayoutInflater());

        adapter.submitList(buildItems());
        items.setLayoutManager(new LinearLayoutManager(this));
        items.addItemDecoration
                (
                      new DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
                );
        items.setAdapter(adapter);


    }

    private List<Integer> buildItems()
    {
        ArrayList<Integer> results = new ArrayList<>(25);

        for(int i = 0; i < 25; i++)
        {
            results.add(random.nextInt());
        }
        return results;
    }
}