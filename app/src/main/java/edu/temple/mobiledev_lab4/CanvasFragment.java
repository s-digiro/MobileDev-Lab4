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
    private static final String COLOR = "color";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View retval = inflater.inflate(R.layout.activity_canvas, container, false);
        Integer color = null;
        Bundle bundle = this.getArguments();

        if (bundle != null) {
            color = bundle.getInt("color");
        }
        if (color == null) {
            color = Color.WHITE;
        }
        retval.setBackgroundColor(color);

        return retval;
    }

    static CanvasFragment newInstance(int color) {
        CanvasFragment fragment = new CanvasFragment();
        Bundle args = new Bundle();
        args.putInt(CanvasFragment.COLOR, color);
        fragment.setArguments(args);

        return fragment;
    }
}
