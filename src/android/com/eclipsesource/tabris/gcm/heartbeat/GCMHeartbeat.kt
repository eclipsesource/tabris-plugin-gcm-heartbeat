package com.eclipsesource.tabris.gcm.heartbeat

import android.app.Activity
import android.content.Intent
import com.eclipsesource.tabris.android.ActivityScope

class GCMHeartbeat(scope: ActivityScope) {

  private var activity: Activity = scope.activity

  fun sendHeartbeat() {
    activity.sendBroadcast(Intent("com.google.android.intent.action.GTALK_HEARTBEAT"));
    activity.sendBroadcast(Intent("com.google.android.intent.action.MCS_HEARTBEAT"));
  }

}
