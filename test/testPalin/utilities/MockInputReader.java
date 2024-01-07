package testPalin.utilities;

import testPalin.command.InputReader;

public class MockInputReader implements InputReader {
    private final String simulatedInput;

    public MockInputReader(String simulatedInput) {
        this.simulatedInput = simulatedInput;
    }

    @Override
    public String readInput() {
        return simulatedInput;
    }
}