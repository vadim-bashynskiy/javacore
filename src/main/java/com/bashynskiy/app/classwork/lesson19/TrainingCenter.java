package com.bashynskiy.app.classwork.lesson19;

/**
 * Created by testu on 5/26/2017.
 */
public class TrainingCenter {
    public String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TrainingCenter)) return false;

        TrainingCenter that = (TrainingCenter) o;

        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        if (this.name.length()%2 ==0)
            return 31;
        else
            return 95;
    }

    @Override
    public String toString() {
        return "TrainingCenter{" +
                "name='" + name + '\'' +
                '}';
    }
}
