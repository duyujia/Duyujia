package com.extend1.exercise;

public class Computer {
        private String cpu;
        private int memory;
        private int disk;

        public Computer(String cpu,int memory,int disk) {
            this.cpu = cpu;
            this.memory = memory;
            this.disk = disk;
        }

        //返回Computer信息
    public String getDetails()  {
            return "cpu=" +cpu + "memory=" + memory + "disk=" + disk;
    }
    }
