package com.ron.test.boottester.model;

import lombok.Data;

/**
 * @author feikong
 * @version 2022/1/21
 */
@Data
public class Result<T> {
    private int c;
    private String m;
    private T d;

    public static <T> Result<T> ok(T d){
        Result<T> r = new Result<>();
        r.setC(200);
        r.setM("SUCCESS");
        r.setD(d);
        return r;
    }
}
