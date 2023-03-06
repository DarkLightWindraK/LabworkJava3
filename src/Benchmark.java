public class Benchmark {
    public static long measure(IOperation operation) {
        var start = System.currentTimeMillis();
        operation.run();
        return System.currentTimeMillis() - start;
    }
}
