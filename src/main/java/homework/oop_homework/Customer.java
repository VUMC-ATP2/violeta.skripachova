package homework.oop_homework;

import lombok.ToString;
import lombok.Setter;
import lombok.Getter;

@ToString

public class Customer {
    @Getter
    private String name;
    @Getter
    @Setter
    private boolean Member;
    @Getter
    @Setter
    private String memberType;

    public Customer(String name) {
        this.name = name;
    }

    public boolean isMember() {
        return Member;
    }
}
