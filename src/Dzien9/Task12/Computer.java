package Dzien9.Task12;

public class Computer {
    public Computer(Processor processor, Memory memory, ExternalPort externalPort) {
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

        public Memory(int memory, String producer, String type) {
            this.memory = memory;
            this.producer = producer;
            this.type = type;
        }
    }
    public static class ExternalPort {
        private String type;

        public ExternalPort(String type) {
            this.type = type;
        }
    }

}
