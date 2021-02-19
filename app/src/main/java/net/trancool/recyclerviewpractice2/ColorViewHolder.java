package net.trancool.recyclerviewpractice2;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ColorViewHolder extends RecyclerView.ViewHolder
{
    private final View swatch;
    private final TextView label;



    //passing the view to the viewholter through the construction
    public ColorViewHolder(@NonNull View row)
    {
        super(row);//evoque super class constructotg

        swatch = row.findViewById(R.id.swatch);//adding ui element to the view holder item(row)
        label = row.findViewById(R.id.label);

        row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(label.getContext(), label.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }



    //what this function does?
    //this function take an Integer which represent the color 6 digit code
    void bindTo(Integer color)
    {
        label.setText(label.getContext().getString(R.string.label_template, color));//set the label to corresponding color code
        swatch.setBackgroundColor(color);// set te swatch with the color representing the code
    }

    //making the row cliclable




}
