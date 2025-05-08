class monitor {
    public void connect(vga connector) {
        System.out.println("Monitor should be VGA Cable");
        connector.connectvga();
        System.out.println("Monitor has displayed");
    }
}