import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Man extends Person{

    public Man(String name, Integer contidition, Mediator mediator) {
        super(name, contidition, mediator);
    }

    public void getPartner(Person person) {
        this.getMediator().setMan(this);
        this.getMediator().getPartner(person);
    }
}
