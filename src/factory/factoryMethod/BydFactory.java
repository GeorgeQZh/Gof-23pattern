package factory.factoryMethod;

import factory.simpleFactory.Byd;
import factory.simpleFactory.Car;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package factory.factoryMethod
 * @date 2019/5/20-21:13
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public class BydFactory implements  CarFactory {
    @Override
    public Car createCar() {
        return new Byd();
    }
}