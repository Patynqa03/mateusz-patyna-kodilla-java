package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape{

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

    public Triangle(String shapeName, int surfaceArea) {
        this.shapeName = shapeName;
        this.field = surfaceArea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (field != triangle.field) return false;
        return Objects.equals(shapeName, triangle.shapeName);
    }

    @Override
    public int hashCode() {
        int result = shapeName != null ? shapeName.hashCode() : 0;
        result = 31 * result + field;
        return result;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }
}
