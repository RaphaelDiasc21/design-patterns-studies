package com.builders;

import com.builders.builds.ComputerBuilds;
import com.builders.models.Carro;
import com.builders.models.Computer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Computer c2 = new ComputerBuilds.Builder()
                    .buildCPU("i9 7gn")
                    .buildRam("16GB")
                    .buildSecondaryMemory("SSD 600 GB")
                    .build();

        System.out.println(c2.getRam());
    }
}
