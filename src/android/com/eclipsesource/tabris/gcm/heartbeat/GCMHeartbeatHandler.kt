package com.eclipsesource.tabris.gcm.heartbeat

import com.eclipsesource.tabris.android.ActivityScope
import com.eclipsesource.tabris.android.ObjectHandler
import com.eclipsesource.v8.V8Object

class GCMHeartbeatHandler(private val scope: ActivityScope)
    : ObjectHandler<GCMHeartbeat> {

    override val type = "com.eclipsesource.tabris.gcm.heartbeat.GCMHeartbeat"

    override fun create(id: String, properties: V8Object) = GCMHeartbeat(scope)

    override fun call(gcmHeartbeat: GCMHeartbeat, method: String, properties: V8Object) = when (method) {
        "sendHeartbeat" -> gcmHeartbeat.sendHeartbeat()
        else -> null
    }

}