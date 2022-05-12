package com.chainsys.collections;

import java.io.Serializable;

public class Emp implements Serializable {
    private final int Id;
    public String Name;

    public Emp(int v1) {
        Id = v1;
    }

    public int getId() {
        return Id;
    }

    @Override
    public boolean equals(Object obj) {
        Class c1 = obj.getClass();
        boolean flag = false;
        if (c1 == this.getClass()) {
            Emp other = (Emp) obj;
            if (this.hashCode() == other.hashCode())
                flag = true;
        }
        return flag;
    }
    @Override
    public int hashCode()
    {
        return this.Id;
    }

}

