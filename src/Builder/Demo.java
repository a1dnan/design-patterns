package Builder;

import Builder.models.IphoneProProduct;
import Builder.models.IphoneXProduct;
import Builder.services.Director;
import Builder.services.IphoneProBuilder;
import Builder.services.IphoneXBuilder;

public class Demo {
    public static void main(String[] args) {
        System.out.println("***Builder Pattern Demo***\n");
        Director director = new Director();
        IphoneXBuilder iphoneX = new IphoneXBuilder();
        IphoneProBuilder iphonePro = new IphoneProBuilder();

        System.out.println("***Construction de IphoneX***\n");
        director.construireIphoneX(iphoneX);
        IphoneXProduct ipx = iphoneX.getIphoneX();
        System.out.println(ipx);
        System.out.println("\n***Construction de Iphone Pro***\n");
        director.construireIphonePro(iphonePro);
        IphoneProProduct ippro = iphonePro.getIphonePro();
        System.out.println(ippro);
    }
}