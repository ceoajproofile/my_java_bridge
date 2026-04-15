package com.example.my_java_bridge

import android.util.Log
import com.onesignal.notifications.INotificationReceivedEvent
import com.onesignal.notifications.INotificationServiceExtension

class ExampleServiceExtension : INotificationServiceExtension {

    override fun onNotificationReceived(event: INotificationReceivedEvent) {

        // Get notification data
        val notification = event.notification

        // Log for debugging
        Log.i(
            "OneSignalExt",
            "Notification received: ${notification.title} - ${notification.body}"
        )

        // OPTIONAL: modify notification data here later

        // IMPORTANT:
        // By default, OneSignal will still show notification automatically.
        // So we are NOT blocking it yet.
    }
}
