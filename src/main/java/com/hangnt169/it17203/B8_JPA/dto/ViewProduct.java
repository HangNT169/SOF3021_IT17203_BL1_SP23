package com.hangnt169.it17203.B8_JPA.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author hangnt169
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ViewProduct {
    private String productName;
    private String productCode;

    private String categoryName;

}
