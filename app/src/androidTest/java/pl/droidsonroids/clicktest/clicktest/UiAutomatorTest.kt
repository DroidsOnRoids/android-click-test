package pl.droidsonroids.clicktest.clicktest

import android.content.Intent
import android.support.test.InstrumentationRegistry
import android.support.test.uiautomator.By
import android.support.test.uiautomator.UiDevice
import android.support.test.uiautomator.UiSelector
import android.support.test.uiautomator.Until
import org.junit.Assert.assertTrue
import org.junit.Test

class UiAutomatorTest {
    @Test
    fun shouldNotPerformClick() {
        val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        val context = InstrumentationRegistry.getContext()
        val intent: Intent = context.packageManager.getLaunchIntentForPackage(BuildConfig.APPLICATION_ID)

        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
        context.startActivity(intent)

        device.wait(Until.hasObject(By.pkg(BuildConfig.APPLICATION_ID).depth(0)), 10000L)

        val button = device.findObject(UiSelector().descriptionContains("test"))

        assertTrue(button.waitForExists(3000L))
        assertTrue(button.click())
    }
}