package com.first;

public class Application {
    private String description = "super-puper";
    private double salary;
    private double salary1;
    private String Desc;
    private String Desc1;
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
        //false

        ///comparison
        int varm = application1.mark - application1.mark1;
        System.out.println(varm);
        //-96
        boolean varm1 = application1.mark1 > application1.mark;
        System.out.println(varm1);
        //true
        double vars = application1.salary - application1.salary1;
        System.out.println(vars);
        //0.0
        boolean vars1 = application1.salary < application1.salary1;
        System.out.println(vars1);
        //false
        double varb = application1.bigboss1 - application1.salary;
        System.out.println(varb);
        //4.545454518181818E7
        boolean varbs = application1.bigboss1 > application1.salary;
        System.out.println(varbs);
        //true
        double varbb = application1.bigboss1 - application1.budget1;
        System.out.println(varbb);
        //-1.767676768181818E8
        long varbig = (long) (application1.bigboss1 - application1.budget1);
        System.out.println(varbig);
        //-176767676
        boolean varbig1 = (application1.bigboss1 < application1.budget1);
        System.out.println(varbig1);
        //true
        double varr = application1.bigboss1 - application1.bigboss;
        System.out.println(varr);
        //4.520201993181818E7
        float varbo = (float) (application1.bigboss1 - application1.bigboss);
        System.out.println(varbo);
        //4.520202E7
        boolean varbob = application1.bigboss1 > application1.bigboss;
        System.out.println(varbob);
        //true

        //Assign in same order [0.5,0.7,1.0,0.1] values to float and double variables and compare them.
        float var1 = 0.5f;
        double var2 = 0.5;
        float var3 = 0.7f;
        double var4 = 0.7;
        float var5 = 1.0f;
        double var6 = 1.0;
        float var7 = 0.1f;
        double var8 = 0.1;
        boolean var12 = var1 > var2;
        System.out.println(var12);
        //false
        boolean var21 = var1 < var2;
        System.out.println(var21);
        //false
        boolean var34 = var3 > var4;
        System.out.println(var34);
        //false
        boolean var43 = var3 < var4;
        System.out.println(var43);
        //true
        boolean var56 = var5 > var6;
        System.out.println(var56);
        //false
        boolean var65 = var5 < var6;
        System.out.println(var65);
        //false
        boolean var78 = var7 > var8;
        System.out.println(var78);
        //true
        boolean var87 = var7 < var8;
        System.out.println(var87);
        //false

        //Divide numeric values by zero
        float varz1 = var1 / 0;
        System.out.println(varz1);
        //Infinity
        double varz2 = var2 / 0;
        System.out.println(varz2);
        //Infinity
        float varz5 = var5 / 0;
        System.out.println(varz5);
        //Infinity
        double varz6 = var6 / 0;
        System.out.println(varz6);
        //Infinity

        //Divide values by 3 and assign result to variable
        int varm3 = application1.mark / 3;
        System.out.println(varm3);
        //1
        long varb3 = application1.budget1 / 3;
        System.out.println(varb3);
        //74074074
        float varr3 = application1.retire /3;
        System.out.println(varr3);
        //0.033333335
        double varbb3 = application1.bigboss1 / 3;
        System.out.println(varbb3);
        //1.515151506060606E7

        //Divide values by 3.0 and assign result and make round operation.
        double varr30 = application1.mark /3.0;
        double roundOff = Math.round (varr30*100.0) / 100.0;
        System.out.println(roundOff);
        //1.33
        double varb30 = application1.budget / 3.0;
        double roundOff1 = Math.round(varb30*1000.0) / 1000.0;
        System.out.println(roundOff1);
        //1.667
        double varbb30 = application1.bigboss / 3.0;
        double roundOff2 = Math.round(varbb30*10.0) / 10.0;
        System.out.println(roundOff2);
        //84175.1




    }

    public long getBudget() {
        return budget;
    }

    public void setBudget(long budget) {
        this.budget = budget;
    }
}
