package io.pragra.learning.beanslearning.beans;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {
    private String name;
    private String address;
}
