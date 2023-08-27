package main;

public interface DataMapper<T> {
    T mapData(String line);
}
