package decorator;

import models.StudentType;

public abstract class SuperpowerDecorator implements Student {
    protected Student wrapper;

    public SuperpowerDecorator(Student student) {
        this.wrapper = student;
    }

    @Override public String getName() { return wrapper.getName(); }
    @Override public StudentType getType() { return wrapper.getType(); }
}
