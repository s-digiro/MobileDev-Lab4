package edu.temple.mobiledev_lab4;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class PaletteFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View retval = inflater.inflate(R.layout.activity_palette, container, false);
        final Spinner color = retval.findViewById(R.id.spinner);
        final Activity activity = this.getActivity();
        if (activity != null) {
            final ColorAdapter adapter = new ColorAdapter(this.getActivity());
            color.setAdapter(adapter);

            color.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                private int i = 0;

                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    view.setBackgroundColor(Color.WHITE);
                    if (i > 0) {
                        Fragment frag = CanvasFragment.newInstance(adapter.getColor(position));
                        FragmentTransaction transaction = PaletteFragment.this.getActivity().getSupportFragmentManager().beginTransaction();

                        transaction.replace(R.id.canvasFragment, frag);
                        transaction.addToBackStack(null);

                        transaction.commit();
                    }
                    i++;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                    parent.setBackgroundColor(Color.RED);
                }
            });
        }
        return retval;
    }
}
