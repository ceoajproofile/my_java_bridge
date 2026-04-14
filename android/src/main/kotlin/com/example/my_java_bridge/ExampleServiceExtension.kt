package com.example.my_java_bridge

import android.content.Context
import android.util.Log
import com.onesignal.notifications.INotificationReceivedEvent
import com.onesignal.notifications.INotificationServiceExtension

class ExampleServiceExtension : INotificationServiceExtension {
    // In v5, the parameter type is INotificationReceivedEvent
    override fun onNotificationReceived(event: INotificationReceivedEvent) {
        val notification = event.notification
        val context = event.context

        Log.i("OneSignalExample", "Notification received: ${notification.body}")

        // In v5, notifications display by default. 
        // If you want to stop it, use event.preventDefault()
    }
}
