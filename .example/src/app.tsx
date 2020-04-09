import {contentView, Button} from 'tabris';

contentView.append(
  <Button
    centerX={0} centerY={0}
    text='Send GCM Heartbeat'
    onSelect={() => esgcmheartbeat.sendHeartbeat()} />
);
