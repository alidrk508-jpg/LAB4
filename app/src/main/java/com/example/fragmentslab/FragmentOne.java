package com.example.fragmentslab;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Ali Darkaoui
 * First fragment showcasing simple UI interaction.
 */
public class FragmentOne extends Fragment {

    // UI Components
    private TextView welcomeText;
    private Button helloBtn;

    /**
     * Constructor providing the layout resource ID.
     */
    public FragmentOne() {
        super(R.layout.fragment_one);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Binding UI elements from the layout
        welcomeText = view.findViewById(R.id.textOne);
        helloBtn = view.findViewById(R.id.btnHello);

        // Click listener to update text when the button is pressed
        helloBtn.setOnClickListener(v -> {
            welcomeText.setText("Hello from ALI DARKAOUI.");
        });
    }
}
