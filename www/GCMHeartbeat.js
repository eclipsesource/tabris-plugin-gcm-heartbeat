var GCMHeartbeat = tabris.NativeObject.extend('com.eclipsesource.tabris.gcm.heartbeat.GCMHeartbeat');

GCMHeartbeat.prototype.sendHeartbeat = function() {
  this._nativeCall('sendHeartbeat');
  return this;
};

module.exports = new GCMHeartbeat();
