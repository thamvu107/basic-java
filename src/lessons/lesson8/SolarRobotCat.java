package src.lessons.lesson8;

public class SolarRobotCat extends RobotCat {
    @Override
    public String charge() {
        String prefix = super.charge();
        return prefix.concat(" with solar");
    }
}
