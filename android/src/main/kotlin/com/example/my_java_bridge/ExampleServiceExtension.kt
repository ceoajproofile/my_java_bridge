package com.example.my_java_bridge

import android.util.Log
import com.onesignal.INotificationReceivedEvent
import com.onesignal.INotificationServiceExtension

class ExampleServiceExtension : INotificationServiceExtension {
    override fun onNotificationReceived(event: INotificationReceivedEvent) {
        val notification = event.notification
        val context = event.context

        Log.i("OneSignalExample", "Notification received: ${notification.body}")

        // Example:
        // event.preventDefault()
        // Do custom work here
        // notification.display()

        // Let the notification continue displaying normally
    }
}
