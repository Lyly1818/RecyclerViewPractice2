package net.trancool.recyclerviewpractice2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

public class ColorAdapter extends ListAdapter<Integer, ColorViewHolder>
{

    private final LayoutInflater inflater;


    protected ColorAdapter( LayoutInflater inflater)
    {
        super(DIFF_CALLBACK);//utility instance from ListApdater.
        // It helps keep track of changes in the list of items
        this.inflater = inflater;//make visible

    }

    @NonNull
    @Override
    public ColorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View row = inflater.inflate(R.layout.row, parent, false);//make the row
        //list of item visible

        return new ColorViewHolder(row);//pass row to the VieHolder.
    }

    @Override
    public void onBindViewHolder(@NonNull ColorViewHolder holder, int position)
    {

        holder.bindTo(getItem(position));


    }


    private static final DiffUtil.ItemCallback<Integer> DIFF_CALLBACK = new DiffUtil.ItemCallback<Integer>()
    {
        @Override
        public boolean areItemsTheSame(@NonNull Integer oldColor, @NonNull Integer newColor) {
            return oldColor.equals(newColor);
        }

        @Override
        public boolean areContentsTheSame(@NonNull Integer oldColor, @NonNull Integer newCOlor) {
            return areItemsTheSame(oldColor, newCOlor);
        }
    };










}
