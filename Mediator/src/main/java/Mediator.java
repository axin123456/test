import lombok.Data;

public @Data class Mediator {
    private Man man;
    private Woman woman;

    public void getPartner(Person person) {
        if (person instanceof Man) {
            this.setMan((Man)person);
        } else {
            this.setWoman((Woman)person);
        }

        if (man == null || woman == null) {
            System.out.println("汗， 我不是同性恋");
        } else {
            if (man.getContidition() == woman.getContidition()) {
                System.out.println(man.getName() + "和" + woman.getName() + "是绝配");
            } else {
                System.out.println(man.getName() + "和" + woman.getName() + "不相配");
            }
        }
    }
}
