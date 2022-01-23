package enumpackage;

public enum EnumByte {
    A, B, C;

    private byte m_EnumValue;

    private EnumByte()
    {
    }

    private EnumByte(byte value)
    {
        this.m_EnumValue = value;
    }

    public byte GetData()
    {
        return m_EnumValue;
    }

}
