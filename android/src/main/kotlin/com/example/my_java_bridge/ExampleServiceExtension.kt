package com.example.my_java_bridge

import android.content.Context
import com.onesignal.notifications.INotificationServiceExtension
import com.onesignal.notifications.INotificationReceivedEvent

class ExampleServiceExtension: INotificationServiceExtension {
    
    override fun onNotificationReceived(event: INotificationReceivedEvent) {
        val notification = event.notification
        val context = event.context

        // DITO MO ILALAGAY ANG LOGIC PARA SA ALERT MODE
        // Halimbawa: Kung ang notification title ay "URGENT JOB"
        if (notification.title?.contains("URGENT", ignoreCase = true) == true) {
            // Pwede kang mag-trigger ng vibration o custom sound dito
        }

        notification.actionButtons?.forEach { button ->
            // Dito mo pwedeng i-modify ang "Accept" o "Decline" buttons ng job request
        }
    }
}