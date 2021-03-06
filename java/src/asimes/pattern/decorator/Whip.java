package asimes.pattern.decorator;

/**
 * Created by lianglab on 2016/5/27.
 *鲜奶油
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", 鲜奶油";
    }

    @Override
    public double cost() {
        return 0.25 + beverage.cost();
    }
}
