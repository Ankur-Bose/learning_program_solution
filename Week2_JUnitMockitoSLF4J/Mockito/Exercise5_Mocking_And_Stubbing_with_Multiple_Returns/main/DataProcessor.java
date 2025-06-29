package Exercise5_Mocking_And_Stubbing_with_Multiple_Returns;

public class DataProcessor {

    private ExternalApiService externalApi;

    public DataProcessor(ExternalApiService externalApi) {
        this.externalApi = externalApi;
    }

    public String processDataTwice(){
        String first = externalApi.getData();
        String second = externalApi.getData();
        return first + " & " +second;
    }
}
