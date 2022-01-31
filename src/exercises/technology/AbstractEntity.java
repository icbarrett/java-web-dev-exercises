package exercises.technology;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public abstract class AbstractEntity {
    private int Id;
    public AbstractEntity() {
        this.Id = ThreadLocalRandom.current().nextInt(0,100 +1);

    }

}
