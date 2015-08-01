package net.keinesorgen.patterns.bridge.television;

/**
 * Refined abstraction
 */
public class ConcreteRemoteControl extends RemoteControl {
    
    private int currentChannel;
    
    public void nextChannel() {
        currentChannel++;
        remoteChangeChannel(currentChannel);
    }
    
    public void prevChannel() {
        currentChannel--;
        remoteChangeChannel(currentChannel);
    }
}
