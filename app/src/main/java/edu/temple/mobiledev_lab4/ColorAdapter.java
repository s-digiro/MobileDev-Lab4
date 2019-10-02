package edu.temple.mobiledev_lab4;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {

    private Context context;

    private String[] strings = {
            "White",
            "Red",
            "Yellow",
            "Blue",
            "Cyan",
            "Green",
            "Magenta",
            "Dark Gray",
            "Gray",
            "Light Gray"
    };

    private int[] colors = {
            Color.WHITE,
            Color.RED,
            Color.YELLOW,
            Color.BLUE,
            Color.CYAN,
            Color.GREEN,
            Color.MAGENTA,
            Color.DKGRAY,
            Color.GRAY,
            Color.LTGRAY
    };


    ColorAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return strings.length;
    }

    @Override
    public Object getItem(int position) {
        Object retval = null;
        if (position < strings.length && position >= 0) {
            retval = strings[position];
        }
        return retval;
    }

    int getColor(int position) {
        return colors[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView retval;

        if (convertView instanceof TextView) {
            retval = (TextView) convertView;
        } else {
            retval = new TextView(context);
        }

        retval.setText(strings[position]);
        retval.setTextSize(30);
        retval.setBackgroundColor(colors[position]);

        return retval;
    }
}
