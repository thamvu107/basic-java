package src.labs.lab9.practice;

public class Tiger extends Animal {
    public static final int TIGER_MAX_SPEED = 100;

    public Tiger(TigerBuilder builder) {
        super(builder);
    }

    public static TigerBuilder builder (String name){
        return new TigerBuilder(name);
    }

    public static class TigerBuilder extends AnimalBuilder {
        public TigerBuilder(String name) {
            super(name);
            this.type = "Tiger";
            this.speed = randomSpeed(TIGER_MAX_SPEED);
        }

        @Override
        protected Animal build() {
            return new Tiger(this);
        }
    }
}
