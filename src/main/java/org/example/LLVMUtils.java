package org.example;

public final class LLVMUtils {
    public static String floatStrToLLVM(String floatStr) {
        System.err.println("parsign float: " + floatStr);
        if (!Character.isDigit(floatStr.charAt(0))) {
            return floatStr;
        }
        if (floatStr.endsWith("f")) {
            return floatStrToLLVM(floatStr.replace("f", ""));
        } else {
            return doubleStrToLLVM(String.format("%g", (double) Float.parseFloat(floatStr))).substring(0, 10) + "00000000";
        }
    }

    public static String doubleStrToLLVM(String doubleStr) {
        if (!Character.isDigit(doubleStr.charAt(0))){
            return doubleStr;
        }
        if (doubleStr.endsWith("d")) {
            return floatStrToLLVM(doubleStr.replace("d", ""));
        } else {
            return "0x" + toHexString(Double.doubleToRawLongBits(Double.parseDouble(doubleStr)));
        }
    }

    private static String toHexString(long l) {
        int count = (l == 0L) ? 1 : ((64 - Long.numberOfLeadingZeros(l)) + 3) / 4;
        StringBuilder buffer = new StringBuilder(count);
        long k = l;
        do {
            long t = k & 15L;
            if (t > 9) {
                t = t - 10 + 'A';
            } else {
                t += '0';
            }
            count -= 1;
            buffer.insert(0, (char) t);
            k = k >> 4;
        } while (count > 0);
        return buffer.toString();
    }
}
