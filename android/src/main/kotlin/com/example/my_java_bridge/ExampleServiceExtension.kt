package com.mycompany.proofile

import android.util.Log
import com.onesignal.notifications.INotificationReceivedEvent
import com.onesignal.notifications.INotificationServiceExtension

class ExampleServiceExtension : INotificationServiceExtension {
    override fun onNotificationReceived(event: INotificationReceivedEvent) {
        val notification = event.notification
        val data = notification.additionalData

        Log.i("OneSignalExt", "Notification received: ${notification.body}")
        Log.i("OneSignalExt", "Additional data: ${data?.toString()}")
        Log.i("OneSignalExt", "notification_mode: ${data?.optString("notification_mode")}")
    }
}
