package com.example.my_java_bridge

import android.content.Context
import android.util.Log
import com.onesignal.OSNotificationReceivedEvent
import com.onesignal.OneSignal.OSNotificationServiceExtension

class ExampleServiceExtension : OSNotificationServiceExtension {
    override fun onNotificationReceived(notificationReceivedEvent: OSNotificationReceivedEvent) {
        val notification = notificationReceivedEvent.notification
        val context = notificationReceivedEvent.context

        Log.i("OneSignalExample", "Notification received: ${notification.body}")

        // Dito papasok yung logic para sa ProoFile Alert Mode
        // Halimbawa: notificationReceivedEvent.complete(notification)
        
        notificationReceivedEvent.complete(notification)
    }
}
