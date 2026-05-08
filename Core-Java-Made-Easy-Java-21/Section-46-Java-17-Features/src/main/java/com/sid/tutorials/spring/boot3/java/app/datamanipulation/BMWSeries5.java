package com.sid.tutorials.spring.boot3.java.app.datamanipulation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kunmu On 08-05-2026
 */
@Data
@NoArgsConstructor
public sealed class BMWSeries5 extends BMWSeries permits BMWSeries5Upgrade {

}
