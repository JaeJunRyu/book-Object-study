package step01;

public class Ticket {
    private String name;
    private Long fee; //수수료

    public Ticket(Long fee) {
        this(null, fee);
    }

    public Ticket(String name) {
        this(name, 0l);
    }

    public Ticket(String name, Long fee) {
        this.name = name;
        this.fee = fee;
    }

    public Long getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "name='" + name + '\'' +
                ", fee=" + fee +
                '}';
    }
}
