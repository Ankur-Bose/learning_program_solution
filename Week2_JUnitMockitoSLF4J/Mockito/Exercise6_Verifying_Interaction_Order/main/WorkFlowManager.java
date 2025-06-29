package Exercise6_Verifying_Interaction_Order;

public class WorkFlowManager {
    private ServiceA service;

    public WorkFlowManager(ServiceA service){
        this.service=service;
    }

    public void runWorkFlow(){
        service.stepOne();
        service.stepTwo();
    }
}
