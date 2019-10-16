package edu.temple.mobiledev_lab4;


import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class CanvasFragment extends Fragment {

    private int color;

    public CanvasFragment() {
        this.color = Color.WHITE;
    }

    public CanvasFragment(int color) {
        this.color = color;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View retval = inflater.inflate(R.layout.activity_canvas, container, false);
        retval.setBackgroundColor(color);
        return retval;
    }
}
