package StringManipulation;

public class StringManiEx1 {
    public static void main(String[] args) {
        // 1. Raw input (The "Immutability" stage)
        String rawData = "  prOd-123, prOd-456, prOd-789  ";

        // 2. String Manipulation (Cleaning)
        // We use String methods because these are simple, one-off transformations
        String cleanData = rawData.trim().toUpperCase();
        String[] codes = cleanData.split(", ");

        // 3. StringBuilder (The "Efficiency" stage)
        // We use this to build a report locally because it's fast
        StringBuilder report = new StringBuilder();
        report.append("--- PRODUCT REPORT ---\n");

        for (int i = 0; i < codes.length; i++) {
            report.append("Item ").append(i + 1).append(": ").append(codes[i]).append("\n");
        }

        // 4. StringBuffer (The "Thread-Safe" stage)
        // Imagine we have a shared log that multiple threads write to
        StringBuffer sharedLog = new StringBuffer();
        sharedLog.append("[LOG] Report generated for: ").append(codes.length).append(" items.");

        // Printing results
        System.out.println(report.toString());
        System.out.println(sharedLog.toString());
    }
}
