package factory;

public class ShortTask implements Task {
    @Override
    public String getTitle() {
        return "Кратка задача";
    }

    @Override
    public String getDescription() {
        return "Кратко условие, но изисква хитър подход.";
    }
}
