import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public @Data abstract class Person {
    private String name;
    private Integer contidition;
    private Mediator mediator;
    public abstract void getPartner(Person person);
}
