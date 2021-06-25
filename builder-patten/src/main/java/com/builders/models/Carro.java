package com.builders.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Carro {

    private int Id;
    private String modelo;
}