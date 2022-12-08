package emu.grasscutter.net.packet;


public class PacketOpcodes {
    public int value;
    public int type; // 1 new, 2 old


    public PacketOpcodes(int value, int type) {
        this.value = value;
        this.type = type;
    }

    // Empty
    public static final int NONE = 0;
    // Opcodes

    public static class newOpcodes{
        public static final int AbilityChangeNotify = 1127;
    }

    public static class oldOpcodes{
        public static final int AbilityChangeNotify = 1127;
    }
}