package jforde.mynanodegreeapps;

import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk=21)
public class MainActivityTest {
    private MainActivity mainActivity;

    @Test
    public void activityShouldNotBeNull() throws Exception {
        MainActivity mainActivity = Robolectric.setupActivity(MainActivity.class);
        assertNotNull(mainActivity);
    }

    @Test
    public void shouldHaveMyNanodegreeAppsText() throws Exception{
        TextView myNanoDegreeTxt = (TextView) mainActivity.findViewById(R.id.my_nanodegree_apps);
        assertEquals(myNanoDegreeTxt.getText().toString(), equals(R.id.my_nanodegree_apps));
    }
}