package com.example.my_java_bridge

import android.util.Log
import com.onesignal.notifications.INotificationReceivedEvent
import com.onesignal.notifications.INotificationServiceExtension

class ExampleServiceExtension : INotificationServiceExtension {

    override fun onNotificationReceived(event: INotificationReceivedEvent) {
        val notification = event.notification

        Log.i("OneSignalExt", "Notification received: ${notification.body}")

        // DO NOTHING FOR NOW (STAGE 2 = TEST ONLY)
    }
}
