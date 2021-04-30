package de.neuefische.orderingsystem.models;

import java.util.Objects;

public interface Product {

    public String getName();

    public void setName(String name);

    public String getId();

    public void setId(String id);

    @Override
    public boolean equals(Object o);

    @Override
    public int hashCode();

    @Override
    public String toString();
}
