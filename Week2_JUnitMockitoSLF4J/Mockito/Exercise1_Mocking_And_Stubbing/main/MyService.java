package Exercise1_Mocking_And_Stubbing;

public class MyService {

    private final ExternalApi externalApi;
    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public String fetchData() {
        return externalApi.getData();
    }
}