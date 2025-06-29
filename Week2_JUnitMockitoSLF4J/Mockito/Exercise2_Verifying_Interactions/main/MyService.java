package Exercise2_Verifying_Interactions;

public class MyService {
    private final ExternalApi externalApi;
    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }
    public void fetchData(){
        externalApi.getData();
    }
}
