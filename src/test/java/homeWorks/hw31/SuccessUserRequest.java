package homeWorks.hw31;

public class SuccessUserRequest {

    private String job;
    private String name;

    public SuccessUserRequest(){}

        public SuccessUserRequest(String name, String job) {
            this.name = name;
            this.job = job;
        }
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }
}