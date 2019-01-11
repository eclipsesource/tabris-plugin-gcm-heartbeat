interface GCMHeartbeat {
  sendHeartbeat(): this;
}
declare global {
  var esgcmheartbeat: GCMHeartbeat;
}

export {};