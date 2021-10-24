package com.vip.testeverything;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * @author Ryland
 */
@Data
@Builder
@ToString
public class User {

    private String name;
    private Integer age;

}
