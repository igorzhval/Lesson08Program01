class Burger {
    private String bun;
    private String meat;
    private String cheese;
    private String greens;
    private String sauce;
    public Burger(String bun, String meat, String cheese, String greens, String sauce) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.sauce = sauce;
    }
    public Burger(String bun, String meat, String cheese, String greens) {
        this(bun, meat, cheese, greens, "майонез");
    }
    public Burger(String bun, String meat, String cheese, String greens, boolean doubleMeat) {
        this(bun, meat, cheese, greens);
        if(doubleMeat) {
            this.meat += " x2";
        }
    }
    public void display() {
        System.out.println("Склад бургера: " + bun + ", " + meat + ", " + cheese + ", " + greens + ", " + sauce);
    }
}


