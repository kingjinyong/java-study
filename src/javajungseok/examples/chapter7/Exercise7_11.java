package javajungseok.examples.chapter7;


class MyTv3 {
    private boolean isPowerOn;
    private int channel;
    private int prevChannel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public void gotoPrevChannel() {
        setChannel(prevChannel);
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        this.isPowerOn = powerOn;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.prevChannel = getChannel();
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}

public class Exercise7_11 {
    public static void main(String[] args) {
        MyTv3 t = new MyTv3();
        t.setChannel(10);
        System.out.println("CH: " + t.getChannel());
        t.setChannel(20);
        System.out.println("VOL: " + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("VOL: " + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("VOL: " + t.getChannel());
        t.setChannel(30);
        System.out.println("VOL: " + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("VOL: " + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("VOL: " + t.getChannel());

    }
}
