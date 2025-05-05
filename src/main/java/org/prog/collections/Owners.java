package org.prog.collections;

public class Owners {

    public String name;

    public Owners(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;  // Возвращаем только имя владельца
    }

}
