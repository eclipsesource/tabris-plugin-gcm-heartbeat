package com.eclipsesource.tabris.gcm.heartbeat

import android.app.Activity
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class GCMHeartbeat(activity: Activity) {

  private var activity: Activity = activity

  fun sendHeartbeat() {
    activity.sendBroadcast(Intent("com.google.android.intent.action.GTALK_HEARTBEAT"));
    activity.sendBroadcast(Intent("com.google.android.intent.action.MCS_HEARTBEAT"));
  }

}
