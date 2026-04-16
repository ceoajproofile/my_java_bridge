package com.mycompany.proofile;

import android.util.Log;

import com.onesignal.notifications.INotificationReceivedEvent;
import com.onesignal.notifications.INotificationServiceExtension;

public class ExampleServiceExtension implements INotificationServiceExtension {
    @Override
    public void onNotificationReceived(INotificationReceivedEvent event) {
        if (event == null || event.getNotification() == null) {
            Log.i("OneSignalExt", "Notification event or notification is null");
            return;
        }

        var notification = event.getNotification();
        var data = notification.getAdditionalData();

        Log.i("OneSignalExt", "Notification received: " + notification.getBody());
        Log.i("OneSignalExt", "Additional data: " + (data != null ? data.toString() : "null"));
        Log.i("OneSignalExt", "notification_mode: " + (data != null ? data.optString("notification_mode") : "null"));
    }
}
