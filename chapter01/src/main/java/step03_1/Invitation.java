package step03_1;

import java.time.LocalDateTime;

public class Invitation { //초대장
    private LocalDateTime when; //초대일자

    public Invitation(LocalDateTime when) {
        this.when = when;
    }

    @Override
    public String toString() {
        return "Invitation{" +
                "when=" + when +
                '}';
    }
}
