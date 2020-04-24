package com.first;

public class Application {
    private String description = "super-puper";
    private double salary;
    private float point;
    private int mark = 4;
    private int mark1 = 100;
    private long budget = 5;
    private long budget1 = 222222222;
    private boolean tickbox = true;
    private boolean tickbox1 = false;
    private float retire = 0.1f;
    private float bigboss = 252525.25f;
    private double retire1 = 0.1;
    private double bigboss1 = 45454545.181818181818;

    public static void main(String[] args) {
        Application application1 = new Application();
        System.out.println(application1.retire == application1.retire1);
        ///compare
        int difmark = application1.mark - application1.mark1;
        System.out.println(difmark);
        boolean varcomp = application1.mark1 > application1.mark;
        System.out.println(varcomp);

        int var1 = application1.mark / 3;
        System.out.println(var1);
        double var2 = application1.budget / 3.0;
        double roundOff = Math.round (var2*100.0) / 100.0;
        System.out.println(var2);
        System.out.println(roundOff);
    }

    public long getBudget() {
        return budget;
    }

    public void setBudget(long budget) {
        this.budget = budget;
    }
}
