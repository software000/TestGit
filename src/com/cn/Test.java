package com.cn;

import lombok.Data;

@Data
public class Test {
    private String name;
    @Override
    public boolean equals(Object obj) {

        return super.equals(obj);
    }
}
