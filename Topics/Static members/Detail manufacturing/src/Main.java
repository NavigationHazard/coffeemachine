class ManufacturingController {
    private static int requestCount;

    public static String requestProduct(String product) {
        // write your code here

        requestCount++;
        String ct = Integer.toString(requestCount);
        return ct + ". Requested " + product;
    }

    public static int getNumberOfProducts() {
        // write your code here
        return requestCount;
    }
}
