package net.keinesorgen.patterns.bridge.television;

/**
 * Abstraction
 */
public class RemoteControl {
    
    private Tv implementor;
    
    public void remoteOn() {
        implementor.on();
    }
    
    public void remoteOff() {
        implementor.off();
    }
    
    public void remoteChangeChannel(int channel) {
        implementor.tuneChannel(channel);
    }

    /**
     * @param implementor the implementor to set
     */
    public void setImplementor(Tv implementor) {
        this.implementor = implementor;
    }
}
