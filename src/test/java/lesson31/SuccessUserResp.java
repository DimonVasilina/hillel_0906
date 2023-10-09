package lesson31;

public class SuccessUserResp {

    private Integer id;
    private String token;
    private String job;
    private String name;

    public SuccessUserResp(){}

//    public SuccessUserResp(Integer id, String token) {
//        this.id = id;
//        this.token = token;
//    }
    public SuccessUserResp(String name, String job){
        this.name = name;
        this.job = job;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
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
    public void setFirst_name() {
        this.name = name;
    }
}