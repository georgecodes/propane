package com.elevenware.propane;

import java.util.*;

public class CollectionUtils {

    static WrappedCollection wrap(Collection<?> collection) {
        return new WrappedCollection(collection);
    }

    public static <T> Collection<T> newInstance(Collection<T> delegate) {
        if(Set.class.isAssignableFrom(delegate.getClass())) {
            return new HashSet<T>();
        }
        if(List.class.isAssignableFrom(delegate.getClass())) {
            return new ArrayList<>();
        }
        throw new RuntimeException("What sort of collection is this??");
    }
}
