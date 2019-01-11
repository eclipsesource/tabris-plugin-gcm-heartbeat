package com.eclipsesource.tabris.gcm.heartbeat

import android.app.Activity
import com.eclipsesource.tabris.android.AbstractOperator
import com.eclipsesource.tabris.android.Properties
import com.eclipsesource.tabris.android.TabrisContext

private const val TYPE = "com.eclipsesource.tabris.gcm.heartbeat.GCMHeartbeat"

class GCMHeartbeatOperator(private val activity: Activity, tabrisContext: TabrisContext)
    : AbstractOperator<GCMHeartbeat>() {
    override fun getType() = TYPE
    override fun create(id: String, properties: Properties) = GCMHeartbeat(activity)
    override fun call(gcmHeartbeat: GCMHeartbeat, method: String, properties: Properties) = when (method) {
        "sendHeartbeat" -> gcmHeartbeat.sendHeartbeat()
        else -> null
    }

}