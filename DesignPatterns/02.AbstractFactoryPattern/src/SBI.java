class SBI implements Bank {
    private final String BNAME;

    public SBI() {
        BNAME = "HDFC BANK";
    }

    // @override
    public String getBankName() {
        return BNAME;
    }
}
