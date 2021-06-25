package com.builders.models;

public class Computer {
    

    private String CPU;
    private String ram;
    private String secondaryMemory;
    private String gpu;

    public Computer(String cPU, String ram, String secondaryMemory, String gpu) {
        CPU = cPU;
        this.ram = ram;
        this.secondaryMemory = secondaryMemory;
        this.gpu = gpu;
    }
    
    public String getCPU() {
        return CPU;
    }
    public void setCPU(String cPU) {
        CPU = cPU;
    }
    public String getRam() {
        return ram;
    }
    public void setRam(String ram) {
        this.ram = ram;
    }
    public String getSecondaryMemory() {
        return secondaryMemory;
    }
    public void setSecondaryMemory(String secondaryMemory) {
        this.secondaryMemory = secondaryMemory;
    }
    public String getGpu() {
        return gpu;
    }
    public void setGpu(String gpu) {
        this.gpu = gpu;
    }
}
