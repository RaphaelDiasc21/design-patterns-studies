package com.builders.builds;

import com.builders.interfaces.ComputerBuilder;
import com.builders.models.Computer;

public class ComputerBuilds{
    public static class Builder implements ComputerBuilder{
        private String CPU;
        private String ram;
        private String secondaryMemory;
        private String gpu;

        @Override
        public ComputerBuilder buildCPU(String cpu) {
            // TODO Auto-generated method stub
            CPU = cpu;
            return this;
        }
    
        @Override
        public ComputerBuilder buildRam(String ram) {
            // TODO Auto-generated method stub
            this.ram = ram;
            return this;
        }
    
        @Override
        public ComputerBuilder buildSecondaryMemory(String memory) {
            // TODO Auto-generated method stub
            this.secondaryMemory = memory;
            return this;
        }
    
        @Override
        public ComputerBuilder buildGpu(String gpu) {
            // TODO Auto-generated method stub
            this.gpu = gpu;
            return this;
        }
    
        public Computer build(){
            return new Computer(CPU, ram, secondaryMemory, gpu);
        }
    }
}
