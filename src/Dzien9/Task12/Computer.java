package Dzien9.Task12;

public class Computer {
    public Computer() {
    }

    public class Processor{
        private int core;
        private String producer;

        public Processor(int core, String producer) {
            this.core = core;
            this.producer = producer;
        }
    }
    public class Memory{
        private int memory;
        private String producer;
        private String type;
    }
    public static class ExternalPort {
        private String type;
    }

}
