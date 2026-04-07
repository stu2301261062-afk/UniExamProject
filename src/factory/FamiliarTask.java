package factory;

public class FamiliarTask implements Task {
    @Override
    public String getTitle() {
        return "Позната задача";
    }

    @Override
    public String getDescription() {
        return "Задача, подобна на такава от минали години.";
    }
}