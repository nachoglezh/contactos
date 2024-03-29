package com.example.aadpractica1.settings;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceFragmentCompat;

import com.example.aadpractica1.R;

public class SettingsActivity extends AppCompatActivity {

    private static final String TAG = "xrty";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //killer ajuste almacenamiento
        //PreferenceManager.getDefaultSharedPreferences(this).edit().remove("almacenamientoSet").commit();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.settings, new SettingsFragment())
                .commit();
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public static class SettingsFragment extends PreferenceFragmentCompat {
        @Override
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {

            setPreferencesFromResource(R.xml.root_preferences, rootKey);
            Log.v(TAG, "POR AQUI BIEN");
        }
    }
}