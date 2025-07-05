public class Encapsulation {
    private String job;
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public static void main (String [] args) {
        Encapsulation x = new Encapsulation();
        x.setJob("Builder");
        System.out.println("Selected job: "+x.getJob());
    }
}
