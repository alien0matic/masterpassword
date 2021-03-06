package de.devland.masterpassword.ui.preferences;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.preference.Preference;
import android.support.v7.app.ActionBarActivity;
import android.util.AttributeSet;

import de.devland.masterpassword.R;
import lombok.Setter;

/**
 * Created by David Kunzler on 26.11.2014.
 */
public class InputStickPreference extends Preference {

    @Setter
    protected ActionBarActivity settingsActivity;

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public InputStickPreference(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public InputStickPreference(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public InputStickPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public InputStickPreference(Context context) {
        super(context);
    }

    @Override
    protected void onClick() {
        super.onClick();
        settingsActivity.getFragmentManager().
                beginTransaction().
                replace(R.id.container, new InputStickSettingsFragment()).
                addToBackStack("inputstick").
                commit();
    }
}
