package pl.droidsonroids.clicktest.clicktest

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isClickable
import android.support.test.espresso.matcher.ViewMatchers.withContentDescription
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class EspressoTest {
    @get:Rule
    public val rule = ActivityTestRule<MainActivity>(MainActivity::class.java, true, true)

    @Test
    fun shouldNotPerformClick() {
        onView(withContentDescription("test")).perform(click()).check(matches(isClickable()))
    }
}
