public class DataSet {
    private double[] data;
    private int dataSize;
    private double sum;
    public DataSet() {
        data = new double[100];
        dataSize = 0;
        sum = 0;
    }
    public void add(double value) {
        data[dataSize] = value;
        dataSize++;
        sum += value;
    }

    public double getAverage() {
        if (dataSize == 0) {
            return 0;
        } else {
            return sum / dataSize;
        }
    }

    public double getStandardDeviation() {
        if (dataSize == 0) {
            return 0;
        }
        double mean = sum / dataSize;
        double varianceSum = 0;
        for (int i = 0; i < dataSize; i++) {
            varianceSum += Math.pow(data[i] - mean, 2);
        }
        return Math.sqrt(varianceSum / dataSize);
    }

    public static double calculateAverage(DataSet[] dataSets) {
        double totalAverage = 0;
        for (DataSet dataSet : dataSets) {
            totalAverage += dataSet.getAverage();
        }
        return totalAverage / dataSets.length;
    }

    @Override
    public String toString() {
        return "DataSet{" +
                "dataSize=" + dataSize +
                ", sum=" + sum +
                '}';
    }

    public static void main(String[] args) {
        DataSet ds1 = new DataSet();
        ds1.add(1.0);
        ds1.add(2.0);
        ds1.add(3.0);
        DataSet ds2 = new DataSet();
        ds2.add(4.0);
        ds2.add(5.0);
        ds2.add(6.0);
        DataSet ds3 = new DataSet();
        ds3.add(7.0);
        ds3.add(8.0);
        ds3.add(9.0);
        DataSet[] dataSets = { ds1, ds2, ds3 };
        double averageOfAverages = DataSet.calculateAverage(dataSets);
        System.out.println("Average of averages: " + averageOfAverages);
        System.out.println("Standard deviation of ds1: " + ds1.getStandardDeviation());
        System.out.println("Standard deviation of ds2: " + ds2.getStandardDeviation());
        System.out.println("Standard deviation of ds3: " + ds3.getStandardDeviation());
        System.out.println(ds1);
        System.out.println(ds2);
        System.out.println(ds3);
    }
}
