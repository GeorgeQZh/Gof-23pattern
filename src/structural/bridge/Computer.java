package structural.bridge;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package structural.bridge
 * @date 2019/6/4-21:03
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 不使用桥接模式时，违反单一职责原则（类型和品牌），可扩展性差
 *
 */
public interface Computer {
    void sale();
}

class Desktop implements Computer{

    @Override
    public void sale() {
        System.out.println("销售台式机");
    }
}

class Pad implements Computer{

    @Override
    public void sale() {
        System.out.println("销售平板电脑");
    }
}

class Laptop implements Computer{

    @Override
    public void sale() {
        System.out.println("销售笔记本");
    }
}

class LenovoDesktop extends Desktop{

    @Override
    public void sale() {
        System.out.println("销售联想台式机");
    }
}

class LenovoLaptop extends Laptop{

    @Override
    public void sale() {
        System.out.println("销售联想笔记本");
    }
}

class LenovoPad extends Pad{

    @Override
    public void sale() {
        System.out.println("销售联想平板");
    }
}

class DellDesktop extends Desktop{

    @Override
    public void sale() {
        System.out.println("销售戴尔台式机");
    }
}

class DellLaptop extends Laptop{

    @Override
    public void sale() {
        System.out.println("销售戴尔笔记本");
    }
}

class DellPad extends Pad{

    @Override
    public void sale() {
        System.out.println("销售戴尔平板");
    }
}

class ShenzhouDesktop extends Desktop{

    @Override
    public void sale() {
        System.out.println("销售神舟台式机");
    }
}

class ShenzhouLaptop extends Laptop{

    @Override
    public void sale() {
        System.out.println("销售神舟笔记本");
    }
}

class ShenzhouPad extends Pad{

    @Override
    public void sale() {
        System.out.println("销售神舟平板");
    }
}