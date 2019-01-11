import {ui} from 'tabris';

ui.contentView.append(
  <button
    centerX={0} centerY={0}
    text='Send GCM Heartbeat'
    onSelect={() => esgcmheartbeat.sendHeartbeat()} />
);
