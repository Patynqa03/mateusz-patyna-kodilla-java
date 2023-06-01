package com.kodilla.testing.shape;


import java.util.Objects;

public class Cyrcle implements Shape {

    private String shapeName;
    private int field;


    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public int getField() {
        return field;
    }

    public Cyrcle(String shapeName, int field) {
        this.shapeName = shapeName;
        this.field = field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cyrcle cyrcle = (Cyrcle) o;

        if (field != cyrcle.field) return false;
        return Objects.equals(shapeName, cyrcle.shapeName);
    }

    @Override
    public int hashCode() {
        int result = shapeName != null ? shapeName.hashCode() : 0;
        result = 31 * result + field;
        return result;
    }

    @Override
    public String toString() {
        return "Cyrcle{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }
}
