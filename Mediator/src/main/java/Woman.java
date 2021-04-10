
public class Woman extends Person {

    public Woman(String name, Integer contidition, Mediator mediator) {
        super(name, contidition, mediator);
    }

    public void getPartner(Person person) {
        this.getMediator().setWoman(this);
        this.getMediator().getPartner(person);
    }
}
