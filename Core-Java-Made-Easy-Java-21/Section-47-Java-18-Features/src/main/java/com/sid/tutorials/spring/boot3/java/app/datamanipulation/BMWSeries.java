package com.sid.tutorials.spring.boot3.java.app.datamanipulation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kunmu On 08-05-2026
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public sealed class BMWSeries permits BMWSeries3, BMWSeries5, BMWSeries7 {
    private String model;
    private int year;
}
