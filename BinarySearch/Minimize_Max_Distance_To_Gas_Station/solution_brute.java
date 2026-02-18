class Solution {
    /*
     * Function to minimize the maximum
     * distance between gas stations
     */
    public static double minimiseMaxDistance(int[] arr, int k) {
        int n = arr.length;

        /*
         * Array to store how many gas
         * stations are placed in each section
         */
        int[] howMany = new int[n - 1];

        // Pick and place k gas stations
        for (int gasStations = 1; gasStations <= k; gasStations++) {

            double maxSection = -1;
            int maxInd = -1;

            /*
             * Find the maximum section
             * and insert the gas station
             */
            for (int i = 0; i < n - 1; i++) {
                double diff = arr[i + 1] - arr[i];
                double sectionLength = diff / (double) (howMany[i] + 1);

                /*
                 * Update the maximum section
                 * length and its index
                 */
                if (sectionLength > maxSection) {
                    maxSection = sectionLength;
                    maxInd = i;
                }
            }
            /*
             * Insert the current gas
             * station into the section
             */
            howMany[maxInd]++;
        }

        // Find the maximum distance i.e. the answer:
        double maxAns = -1;
        for (int i = 0; i < n - 1; i++) {
            double diff = arr[i + 1] - arr[i];
            double sectionLength = diff / (double) (howMany[i] + 1);
            maxAns = Math.max(maxAns, sectionLength);
        }
        return maxAns;
    }
}