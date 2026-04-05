package com.example.fragmentslab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

/**
 * Created by Ali Darkaoui
 * Main Activity managing fragment transactions.
 */
public class MainActivity extends AppCompatActivity {

    // UI Components
    private Button firstFragmentButton, secondFragmentButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI components by their IDs
        firstFragmentButton = findViewById(R.id.btnFragment1);
        secondFragmentButton = findViewById(R.id.btnFragment2);

        // Display the first fragment by default on initial launch
        if (savedInstanceState == null) {
            displayFragment(new FragmentOne(), false);
        }

        // Set click listener for Fragment One button
        firstFragmentButton.setOnClickListener(v -> displayFragment(new FragmentOne(), true));
        
        // Set click listener for Fragment Two button
        secondFragmentButton.setOnClickListener(v -> displayFragment(new FragmentTwo(), true));
    }

    /**
     * Generic method to replace fragments in the container.
     * @param fragmentToDisplay The new fragment to display.
     * @param shouldAddToStack Whether to add this transaction to the back stack.
     */
    private void displayFragment(Fragment fragmentToDisplay, boolean shouldAddToStack) {
        FragmentManager fragManager = getSupportFragmentManager();
        FragmentTransaction fragTransaction = fragManager.beginTransaction()
                .setReorderingAllowed(true)
                .replace(R.id.fragment_container, fragmentToDisplay);

        // If true, user can navigate back to the previous fragment using the system back button
        if (shouldAddToStack) {
            fragTransaction.addToBackStack(null);
        }

        // Finalize the transaction
        fragTransaction.commit();
    }
}
