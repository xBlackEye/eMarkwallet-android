package de.eMark.presenter.activities.settings;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import de.eMark.R;
import de.eMark.databinding.ActivityRestoreBinding;
import de.eMark.presenter.activities.InputWordsActivity;
import de.eMark.presenter.activities.callbacks.ActivityWipeCallback;
import de.eMark.presenter.activities.util.BRActivity;


public class WipeActivity extends BRActivity {

    private ActivityWipeCallback callback = () -> InputWordsActivity.open(WipeActivity.this,
            InputWordsActivity.Type.WIPE);

    public static void show(AppCompatActivity activity) {
        Intent intent = new Intent(activity, WipeActivity.class);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityRestoreBinding binding = DataBindingUtil.setContentView(this,
                R.layout.activity_restore);
        binding.setCallback(callback);
        setupToolbar();
        setToolbarTitle(R.string.Settings_wipe);
    }
}