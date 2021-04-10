public class MainClass {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Person zhangsan = new Man("zhangsan", 7, mediator);
        Person xiaofang = new Woman("xiaofang", 7, mediator);
        zhangsan.getPartner(xiaofang);
    }
}
