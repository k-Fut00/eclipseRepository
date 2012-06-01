package sample;

import org.seasar.framework.container.SingletonS2Container;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;



public class sample1 {
    public Kyoto kyoto;

    private void food() {
        kyoto.deliciousFood();
    }

    public static void main(String[] args) {
        SingletonS2ContainerFactory.init();
        sample1 sample = SingletonS2Container.getComponent("sample1");
        sample.food();
        SingletonS2ContainerFactory.destroy();

    }
}
