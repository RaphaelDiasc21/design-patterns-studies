package com.builders.interfaces;

import com.builders.models.Computer;

public interface ComputerBuilder {
    public ComputerBuilder buildCPU(String cpu);
    public ComputerBuilder buildRam(String ram);
    public ComputerBuilder buildSecondaryMemory(String memory);
    public ComputerBuilder buildGpu(String gpu);
    public Computer build();
}
