package factory;

public class MisleadingTask implements Task {
    @Override
    public String getTitle() {
        return "Подвеждаща задача";
    }

    @Override
    public String getDescription() {
        return "Условието изглежда лесно, но крие няколко капана.";
    }
}
