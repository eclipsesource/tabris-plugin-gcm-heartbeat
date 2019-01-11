# Tabris.js GCM Heartbeat Plugin

Refresh the connection with the GCM service to ensure timely arrival of push notifications.

Based on andQlimax' implementation of [Push Notifications Fixer](https://play.google.com/store/apps/details?id=com.andqlimax.pushfixer.noroot). See https://forum.xda-developers.com/showpost.php?p=47292713&postcount=6 for more information.

## Supported platforms

Android

## API documentation

### `esgcmheartbeat`

#### Methods

##### `sendHeartbeat()`

* Request sending a heartbeat refreshing GCM connection for push notifications.