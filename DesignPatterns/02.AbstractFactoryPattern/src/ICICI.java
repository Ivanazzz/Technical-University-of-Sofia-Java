class ICICI implements Bank {
    private final String BNAME;

    public ICICI() {
        BNAME = "ICICI BANK";
    }

    // @override
    public String getBankName() {
        return BNAME;
    }
}
