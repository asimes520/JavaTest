package asimes.pattern.decorator;

/**
 * Created by lianglab on 2016/5/27.
 * 浓缩
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "浓缩";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
