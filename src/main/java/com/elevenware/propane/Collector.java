package com.elevenware.propane;

public interface Collector<T, R> {

    R doCollect(T input);

}
